package NasruPracticeforDSA.LogicFirst;

public class bsTree {
    Node root;
    class Node{
        int key;
        Node left,right;
        Node(int val){
            key= val;
            left=right= null;
        }
    }
    bsTree(int val){

        root = new Node(val);
    }
    public Node insert(int val){
        return insert(root, val);
    }


    public Node insert(Node root,int val) {
        if(root==null){
            return new Node(val);
        }
        if(val<root.key){
            root.left= insert(root.left,val);
        } else if (val>root.key) {
            root.right=insert(root.right, val);
        }
        return root;
    }
 public void inOrder(Node root ){
        if(root!=null) {
            inOrder(root.left);
            System.out.print(root.key + " ");
            inOrder(root.right);
        }
 }
    public void postOrder(Node root ){
        if(root!=null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key + " ");

        }
    }
    public void delete(int val){
        root= delete(root,val);
    }

 public Node delete(Node root,int val){
        if(root==null){
            return root;
        }
        if(val<root.key){
           root.left= delete(root.left, val);
        } else if (val>root.key) {
         root.right=delete(root.right, val);
        }
        else{
            if(root.left== null){
                return root.right;
            } else if (root.right==null) {
                return root.left;
            }else{
                root.key=min(root.right);
                root.right=delete(root.right, root.key);
            }
        }
return root;
 }
 public int min(Node root){
        int minVal= root.key;
        while(root.left!=null){
            minVal=root.left.key;
            root=root.left;
        }
        return minVal;
 }


    public static void main(String[] args) {
        bsTree tree= new bsTree(10);
        tree.insert(8);
        tree.insert(19);

        tree.insert(9);

        tree.delete(9);
        tree.delete(10);
        tree.delete(8);
        tree.delete(19);
    tree.inOrder(tree.root);

    }


}

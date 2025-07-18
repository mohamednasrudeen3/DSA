package NasruPracticeforDSA;

public class btree {
    Node root;
    class Node{
        Node left,right;
        int key;
        Node(int val){
            key=val;
            left=null;
            right=null;
        }
    }
    btree(int val){
        root= new Node(val);
    }

    public Node insert(int val){
       return insert(root,val);
    }
    public Node insert(Node node, int val){
        if(node==null){
            return new Node(val);
        }
        if(node.key>val){
            node.left=insert(node.left,val);
        } else if (node.key<val) {
            node.right=insert(node.right,val);
        }
        return node;
    }

    public void inOrder(Node node){
        if(node!=null) {
            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);
        }
    }
    public Node delete(int val){
        return delete(root,val);
    }
    public Node delete(Node node, int val){
        if(node.key>val){
            node.left=delete(node.left,val);
        } else if(node.key<val) {
            node.right=delete(node.right,val);
        }{
            if(node.left==null){
                return node.right;
            } else if (node.right==null) {
                return node.left;
            }else{
                node.key=min(node.right);
               node.right=delete(root.right, root.key);
            }
        }

return node;
    }
    public int min(Node node){
        int minValue=node.key;
        while(node.left!=null){
            minValue= node.key;
            node=node.left;
        }
        return minValue;
    }




    public static void main(String[] args) {
        btree tree= new btree(10);
        tree.insert(12);
        tree.insert(5);
        tree.delete(5);
        tree.insert(15);
        tree.insert(20);
        tree.insert(25);
        tree.insert(30);
     tree.delete(20);
        tree.inOrder(tree.root);
    }
}

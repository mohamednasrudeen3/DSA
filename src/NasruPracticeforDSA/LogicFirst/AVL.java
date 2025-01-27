package NasruPracticeforDSA.LogicFirst;

public class AVL {
    Node root;
    class Node{
        int key;
        Node left,right;


        //Track the height of Each Node
        int height;
        Node(int val) {
            key = val;
            left = right = null;
            height=0;
        }

}
    AVL(int val){
root=new Node(val);
    }

    AVL(){
        root=null;
    }

    public int getHeight(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

    public int max(int a,int b){
        return a>b?a:b;
    }

    public Node insert(Node node, int val){
        if(node==null){
            return new Node(val);
        }
        if(val<node.key){
            node.left=insert(node.left,val);
        }else if(val>node.key){
            node.right=insert(node.right,val);
        }else {
            return node;
        }

        node.height =1+max(getHeight(node.left),getHeight(node.right));

    int balFactor=getBalanceFactor(node);

//    LL case
        if(balFactor>1 && val<node.left.key){
            return rightRotate(node);
        }
//     LR case
        if(balFactor>1 && val>node.left.key){
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
//   RR case
        if(balFactor<-1 && val>node.right.key){
            return leftRotate(node);
        }
//   RL case
        if(balFactor<-1 && val<node.right.key){
            node.right=rightRotate(node.right);
            return leftRotate(node);

        }
return node;
    }

    private Node leftRotate(Node z) {
        Node y =z.right;
        Node t3=y.left;
        y.left=z;
        z.right=t3;
        z.height = 1+ max(getHeight(z.left),getHeight(z.right));
        y.height = 1+ max(getHeight(y.left),getHeight(y.right));

        return y;
    }

    private Node rightRotate(Node z) {
        Node y = z.left;
        Node t2= y.right;

        y.right=z;
        z.left=t2;


        z.height=1+max(getHeight(z.left),getHeight(z.right));
        y.height=1+max(getHeight(y.left),getHeight(y.right));

        return y;

    }


    private int getBalanceFactor(Node node) {
        if(node==null){
            return 0;
        }
        return getHeight(node.left)-getHeight(node.right);
    }


    public void insert(int val){
      root= insert(root,val);

    }


    public Node delete(Node root,int val){
        if(root == null){
            return root;
        }
        if(val<root.key){
         root.left=delete(root.left,val);
        }else if(val>root.key) {
            root.right=delete(root.right,val);
        }else{
            if(root.left==null){
                return root.right;
            } else if (root.right==null) {
                return root.left;

            }else{
                root.key=min(root.right);
                root.right=delete(root.right,root.key);
            }
        }
            return root;
    }

public void delete(int val){
        root=delete(root,val);
}

    public int min(Node root){
        int minValue=root.key;
        while(root.left!=null){
            minValue=root.left.key;
            root=root.left;
        }
        return minValue;
    }



    public void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.println("Root key value"+root.key+ ": "+"THE ROOT HEIGHT"+ root.height);
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        AVL tree=new AVL();
//        tree.insert(50);
//        tree.insert(20);
//        tree.insert(60);
//        tree.insert(10);
//        tree.insert(30);
//        tree.insert(40);
        tree.insert(50);
        tree.insert(30);
        tree.insert(10);
        tree.insert(20);
        tree.insert(70);
        tree.inOrder(tree.root);
    }
}
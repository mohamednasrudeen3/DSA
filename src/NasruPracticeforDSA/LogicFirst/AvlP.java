package NasruPracticeforDSA.LogicFirst;

public class AvlP {
    Node root;
    class Node{
        int key;
        Node left,right;
        int height;
        Node(int val){
            key=val;
            left=right=null;
            height=0;
        }
    }


    AvlP(int val){
        root=new Node(val);
    }
    AvlP(){
      }

    public void insert(int val){
        root=insert(root,val);
    }



    public Node insert(Node node,int val){
        if(node==null){
            return new Node(val);
        }
        if(val<node.key){
            node.left=insert(node.left,val);
        }else if(val>node.key) {
            node.right=insert(node.right,val);
        }else
            return node;

        node.height=1+max(getHeight(node.left),getHeight(node.right));
        int balFactor=getBalFactor(node);

//        LL Case
        if(balFactor>1 && val<node.left.key){
           return rightRotate(node);
        }
//       LR Case
        if(balFactor>1 && val>node.right.key){
            node.left=leftRotate(node.left);
            return rightRotate(node);
        }
//        RRCase
        if(balFactor<-1&& val>node.right.key){
            return leftRotate(node);
        }
//        RLCase
        if(balFactor<-1 && val>node.right.key){
            node.right=rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    private Node leftRotate(Node z) {
        Node y= z.right;
        Node t3=y.left;
        y.left=z;
        z.right=t3;
        z.height=1+max(getHeight(root.left),getHeight(root.right));
        y.height=1+max(getHeight(root.left),getHeight(root.right));
        return y;
    }

    private Node rightRotate(Node z) {
          Node y= z.left;
          Node t2=y.right;
          y.right=z;
          z.left=t2;
          z.height=1+max(getHeight(root.left),getHeight(root.right));
          y.height=1+max(getHeight(root.left),getHeight(root.right));
          return y;
    }


    public int max(int a,int b){
        return a>b?a:b;
}
public int getBalFactor(Node node){
        if(node==null){
            return 0;
        }
       return getHeight(node.left)-getHeight(node.right);
}

    public int getHeight(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }


    public void delete(int val) {
        root=delete(root,val);
    }

    public Node delete(Node node,int val) {
        if (node == null) {
            return node;
        }
        if (val < node.key) {
                node.left = delete(node.left, val);
            } else if (val > node.key) {
                node.right = delete(node.right, val);
            } else {
                if (node.left == null) {
                    return node.right;
                } else if (node.right == null) {
                    return node.left;
                } else {
                    node.key = min(node.right);
                    node.right = delete(node.right, node.key);
                }
            }

        return node;
    }


    public int min(Node node){
        int minValue=node.key;
        while(node.left!=null){
            minValue=node.left.key;
            node=node.left;
        }
        return minValue;
    }
    public void inOrder(Node node){
        if(node!=null){
            inOrder(node.left);
            System.out.println("key:"+node.key+" : "+"height:"+node.height);
            inOrder(node.right);
        }
    }
    public static void main(String[] args) {
        AvlP tree=new AvlP();
        tree.insert(50);
        tree.insert(30);
        tree.insert(10);
        tree.insert(20);
        tree.insert(70);
        tree.inOrder(tree.root);
    }
}


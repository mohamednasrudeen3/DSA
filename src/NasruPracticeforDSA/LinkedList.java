package NasruPracticeforDSA;

public class LinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next =null;
        }
    }
    LinkedList(){
        head= null;
    }
    public void insertAtBegin(int val){
     Node newNode = new Node(val);
     if (head==null){
         head= newNode;
     }else {
         newNode.next=head;
         head= newNode;
     }

    }
    public void display(){
        Node temp = head;
        while( temp!= null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
   }
    public void deleteAtPos(int pos){


        if(head== null){
            throw new IndexOutOfBoundsException("list is Empty");
        }
        Node temp= head;
        Node prev =null;
        for(int i=1;i<pos+1;i++){
            prev= temp;
            temp=temp.next;
        }
        prev.next=temp.next;

    }
public void insertAtPos(int pos,int val){
        if(pos==0){
            insertAtBegin(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<pos;i++){
            temp= temp.next;
        }
        if(temp==null){
            throw new IndexOutOfBoundsException("Invalid Position"+pos);
        }
        Node newNode= new Node(val);
        newNode.next=temp.next;
        temp.next= newNode;
}
    public void deleteAtBeg(){
        if(head==null){
            throw new IndexOutOfBoundsException("Empty List ");
        }
        head=head.next;
    }
    public void reverse(){
        Node prev=null;
        Node current=head;
        Node next=head.next;
        while(current!=null){
            next= current.next;
            current.next=prev;
            prev=current;
            current= next;
        }
        head=prev;
    }


    public Node findMiddleElement(){
        if(head.next==null){
            return head;
        }
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;
        }
        return slow;
    }


    public static void main(String[] args) {
        LinkedList list= new LinkedList();
        list.insertAtBegin(1);
        list.insertAtBegin(2);
        list.insertAtBegin(3);
        list.insertAtBegin(4);
        list.display();
//        list.insertAtPos(1,5);
//        list.display();
//        list.deleteAtPos(1);
//        list.display();
//        list.deleteAtBeg();
//        list.display();
//        list.reverse();
//        list.display();
        Node midElement = list.findMiddleElement();

        System.out.println(midElement.data);
    }
}

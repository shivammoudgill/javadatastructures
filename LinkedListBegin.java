import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
class LinkedListBegin{
    static Node head=null;
    public void insertAtBegin(int data){
        Node node=new Node(data);
        if(head!=null){
            Node next = head;
            head=node;
        }
        else{
            head=node;
        }
    }
    public void display(){
        if(head!=null){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data);
                temp=temp.next;
            }
        }
        else{
            System.out.println("List is Empty");
        }
    }
    public static void main(String[] args) {
        LinkedListExample l1 = new LinkedListExample();
        l1.insertAtBegin(10);
        l1.insertAtBegin(20);
        l1.insertAtBegin(30);
        l1.display();
    }
}
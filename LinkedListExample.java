import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
class LinkedListExample{

    static Node head=null;


    //Function to insert data at end of the list
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head!=null){
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        else{
            head=newNode;
        }
    }

    //Function to insert data at Beginning of the list
    public void insertAtBegin(int data){
        Node node=new Node(data);
        if(head!=null){
            node.next = head;
            
            head=node;
        }
        else{
            head=node;
        }
    }

    //Function to insert data at any index of the list
    public void insertAtIndex(int index,int data,LinkedListExample obj){
        int size=0;
        Node newNode = new Node(data);
        size=obj.sizeOfList();
        if(head!=null && index==0){
            obj.insertAtBegin(data);
        }
        else if(head!=null && index>size){
            obj.insertAtEnd(data);
        }
        else if(head!=null && index<=size){
            Node temp=head;
            int i=0;
            while(i!=index-1){
                temp=temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }  
    }

    //Function to know size of the list
    public int sizeOfList(){
        int count=0;
        if(head!=null){
            Node temp = head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
        }
        return count;
    }

    //Function to display data of the list
    public void display(){
        if(head!=null){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        else{
            System.out.println("List is Empty");
        }
    }


    public static void main(String[] args) {
        LinkedListExample l1 = new LinkedListExample();
        l1.insertAtEnd(10);
        l1.insertAtEnd(20);
        l1.insertAtEnd(30);
        l1.display();
        l1.insertAtBegin(40);
        l1.display();
        l1.insertAtIndex(1, 50, l1);
        l1.display();
    }
}
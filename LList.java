import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
class LList{
    static Node head = null;
    public void insert(int d){
        Node node=new Node(d);
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next = node;
        }
    }
    public void insertAtBegin(int d){
        Node node = new Node(d);
        if(head==null){
            head=node;
        }
        else{
            node.next=head;
            head=node;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            head = new Node(sc.nextInt());
            Node temp = head;
            for(int i=1;i<n;i++){
                temp.next = new Node(sc.nextInt());
                temp = temp.next;
            }
        }
        LList list = new LList();
        list.insert(10);
        list.insertAtBegin(20);
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
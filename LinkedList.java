import java.util.*;
public class LinkedList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next =null;
        }
    }
    Node head;
    //adding node at the front of the list
    void insertFront(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //adding node at the last of the list
    void insertLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    //getting the length of the list
    int getLength(){
        int len = 0;
        Node temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        return len;
    }
    //insert at any position in the list
    void insertMiddle(int data, int position){
        if(position < 0 || position > getLength()){
            System.out.println("Invalid Legth");
            return;
        }
        Node temp = head;
        int flag = 0;
        while(flag < position){
            flag++;
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }
    //print the list
    void printList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        System.out.println("The List is : ");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    //delete node from front of the list
    void deleteFront(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }
    //delete node from the end of the list
    void deleteLast(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
    //main to test the functions
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 To insert at Front");
        System.out.println("Enter 2 To insert at Last");
        System.out.println("Enter 3 To insert at Middle");
        System.out.println("Enter 4 To delete from Front");
        System.out.println("Enter 5 To delete from Last");
        System.out.println("Enter 6 To Print List");
        while(true){
            System.out.println("Enter Choice");
            int n = in.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter Data");
                    list.insertFront(in.nextInt());
                    break;
                case 2:
                    System.out.println("Enter Data");
                    list.insertLast(in.nextInt());
                    break;
                case 3:
                    System.out.println("Enter Data and Position");
                    list.insertMiddle(in.nextInt(), in.nextInt());
                    break;
                case 4:
                    list.deleteFront();
                    break;
                case 5:
                    list.deleteLast();
                    break;
                case 6:
                    list.printList();
                    break;
                default:
                    if(n == -1){
                        System.out.println("ThankYou!");
                        System.exit(0);
                    }
                    System.out.println("Invalid Choice");
            }
        }
    }
}
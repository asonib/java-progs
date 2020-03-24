import java.util.*;
class DoubleList{
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }
    Node head;
    void insertFront(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
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
        newNode.prev = temp;
    }
    int listSize(){
        Node temp = head;
        int c=0;
        while(temp != null){
            c++;
            temp = temp.next;
        }
        return c;
    }
    void insertMiddle(int data, int position){
        if(position <= 1 || position >= listSize()){
            System.out.println("Invalid Position");
            return;
        }
        Node newNode = new Node(data);
        int flag = 0;
        Node temp = head;
        while(flag < position){
            flag++;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
    }
    void printList(){
        Node temp = head;
        Node last = null;
        System.out.println("Print List in Forward Direction");
        while(temp != null){
            System.out.print(temp.data+" -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Print List in Backward Direction");
        while(last != null){
            System.out.print(last.data+" -> ");
            last = last.prev;
        }
        System.out.println();
    }
    public static void main(String args[]){
        DoubleList list = new DoubleList();
        list.insertFront(10);
        list.insertFront(20);
        list.insertFront(30);
        list.insertFront(40);
        list.printList();
        list.insertMiddle(35, 2);
        list.printList();
        
    }
}
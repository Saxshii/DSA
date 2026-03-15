public class intro{

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // print using recursion
    public static void display(Node head){
        if(head == null) return;
        System.out.print(head.data + " ");
        display(head.next);
    }

    public static void main(String[] args){
        Node a = new Node(1); //make node a with data: 1
        Node b = new Node(2);
        Node c = new Node(3);
        //connecting node a and b
        a.next = b; 
        b.next = c;

        print(a);
        display(a);




        
    }
}
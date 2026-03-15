
public class Implementation {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {

        Node head = null;
        Node tail = null;
        int length = 0;

        // insert element at the begining
        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            length++;
        }

        // insrt element at the end
        void insertAtStart(int data) {
            Node temp = new Node(data);
            if (head == null) {      // empty list
                head = tail = temp;
            } else {
                temp.next = head;  // new node points to old head
                head = temp;       // head becomes new node
            }
            length++;
        }

        // insert element at the any index
        void insertAt(int indx, int data){
            if(indx <0 || indx > length){
                System.out.println("wrong index");
            }
            if(indx == length){
                insertAtEnd(data);
                return;
            }else if(indx == 0){
                insertAtStart(data);
                return;
            }

            Node t = new Node(data);
            Node temp = head;

            for(int i = 1; i<= indx -1; i++){
                temp = temp.next;
            } 
            t.next = temp.next;
            temp.next = t;
            
            length++;
        }

        // delete element
        @SuppressWarnings("unused")
        void deleteAt(int indx){
            Node temp = head;
            for(int i=1; i<indx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            length--;
        }

        // get element at indx
        @SuppressWarnings("unused")
        int getAt(int indx){
            if(indx < 0 || indx > length){
                System.out.println("wrong index");
                return -1;
            }
            Node temp = head;
            for(int i = 1; i<= indx; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.insertAtEnd(1);
        a.insertAtEnd(3);
        a.insertAtEnd(5);

        // a.display(); //print
        // System.out.println("Length: " + a.length() ); //length of linked list
        LinkedList b = new LinkedList();
        b.insertAtStart(5);
        b.insertAtStart(10);
        b.insertAtEnd(15);

        b.display();
    }
}

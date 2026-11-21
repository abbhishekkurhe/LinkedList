class Node {
    int data;
    Node next;

    // Constructor 
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head;

    // Insert at beginning
    void insert_at_start(int data) {
        //creating object
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Display linked list
    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert_at_start(10);
        list.insert_at_start(20);
        list.insert_at_start(30);

        list.display();
    }
}
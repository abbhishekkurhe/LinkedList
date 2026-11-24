    class Node {
    int data;
    Node next;

    Node(int data)
    {
        this.data= data;
        this.next = null;
    }
}
public class SinglyLinkedList {
    Node head;

    void insertatstart(int data)
    {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;

    }
    void insertatend(int data)
    {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            System.out.println("list was empty");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    void insertatpos(int data ,int pos)
    {
        Node newnode = new Node(data);
        if(pos==1)
        {
            insertatstart(data);
            return;
        }
        Node temp = head;
        for(int i=1;i<pos-1;i++)
        {
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertatstart(30);
        list.insertatstart(20);
        list.insertatstart(10);
        System.out.println("Linked List after inserting at start:");
        list.display();
        list.insertatend(40);
        System.out.println("Linked List after inserting at end:");
        list.display();
         list.insertatpos(35, 3);
         System.out.println("Linked List after inserting at position 3:");
        list.display();
    }
}
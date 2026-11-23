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

    void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertatstart(30);
        list.insertatstart(20);
        list.insertatstart(10);

        list.display();
    }
}
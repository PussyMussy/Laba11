package Ex51;
class Main1
{
    public static void printList(Node head)
    {
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }

        System.out.println("null");
    }
    public static Node constructList()
    {
        Node head = new Node(1, new Node(2, new Node(3, null)));
        return head;
    }

    public static void main(String[] args)
    {
        Node head = constructList();
        printList(head);
    }
}

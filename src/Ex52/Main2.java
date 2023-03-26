package Ex52;
class Main2
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
    public static Node push(Node head, int data)
    {
        Node newNode = new Node();
        newNode.data = data;

        newNode.next = head;
        return newNode;
    }
    public static Node constructList(int[] keys)
    {
        Node head = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            head = push(head, keys[i]);
        }

        return head;
    }
    public static void main(String[] args)
    {
        int[] keys = { 1, 2, 3, 4 };
        Node head = constructList(keys);
        printList(head);
    }
}
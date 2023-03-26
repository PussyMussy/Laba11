package Ex5;

class Main1
{
    // Вспомогательная функция для печати заданного связанного списка
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

    // Наивная функция для реализации связанного списка, содержащего три узла
    public static Node constructList()
    {
        Node head = new Node(1, new Node(2, new Node(3, null)));
        return head;
    }

    public static void main(String[] args)
    {
        // `head` указывает на головной узел связанного списка
        Node head = constructList();

        // распечатать связанный список
        printList(head);
    }
}

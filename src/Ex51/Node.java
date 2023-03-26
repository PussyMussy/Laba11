package Ex5;


    // Узел связанного списка
    class Node
    {
        int data;
        Node next;

        Node(int data, Node next_node)
        {
            // Установить данные
            this.data = data;

            // устанавливаем следующее поле так, чтобы оно указывало на заданный узел списка
            this.next = next_node;
        }
    }


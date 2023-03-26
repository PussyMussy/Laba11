package Ex4;

public class Test {

    public static void main(String[] args) {
        Node nodeO = new Node(  8,  null);
        Node node1 = new Node(  1, null);
        Node node2 = new Node(  2, null);
        Node node3 = new Node( 3, null);

        nodeO.next = node1;
        node1.next = node2;
        node2.next = node3;
        Node ref = nodeO;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;

}}}
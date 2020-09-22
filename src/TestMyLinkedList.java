public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("TESTING");
        MyLinkedList mll= new MyLinkedList(10);
        mll.addFirst(11);
        mll.addFirst(12);
        mll.addFirst(13);

        mll.add(4,9);
        mll.add(4,9);
        mll.printList();
    }
}

public class LLImplementation {
    public static void main(String[] args) {
        CustomLL LL = new CustomLL();
        LL.InsertFirst(0);
        LL.InsertFirst(45);
        LL.InsertFirst(32);
        LL.InsertFirst(23);
        LL.display();
        LL.insertionAtMiddle(4, 67);
        System.out.println();
        LL.display();
        LL.insertionAtLast(23);
        System.out.println();
        LL.display();
        LL.deleteFirst();
        System.out.println();
        LL.display();
        System.out.println();
        LL.deleteLast();
        LL.display();
        LL.delete(2);
        System.out.println();
        LL.display();
        LL.insertRec(25, 2);
        System.out.println();
        LL.display();
    }
}

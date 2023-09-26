public class CustomLL {

    private Node head;
    private Node tail;

    private int size;

    public CustomLL() {
        this.size = 0;
    }

    // Printing the LL
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    // Insertion in LL
    public void InsertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertionAtMiddle(int index, int val) {
        if (index == 0) {
            InsertFirst(val);
            return;
        }
        if (index == size) {
            insertionAtLast(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size += 1;
        if (node.next == null) {
            tail = node;
        }
        if (temp.next == null) {
            insertionAtLast(val);
        }
    }

    public void insertionAtLast(int val) {
        if (tail == null) {
            InsertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    // Deletion in LL
    public void deleteFirst() {
        head = head.next;
        // if LL size is 1
        if (head == null) {
            tail = null;
        }
    }

    public void delete(int index) {
        Node temp = getIndex(index);
        temp.next = temp.next.next;
        size--;
    }

    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
            return;
        }

        Node secondLast = getIndex(size - 2);
        tail = secondLast;
        tail.next = null;
        size--;
    }

    // Getting the node for particular index
    public Node getIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Recursive Insertion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index < 0) {
            throw new IllegalArgumentException("Index cannot be negative");
        }
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}

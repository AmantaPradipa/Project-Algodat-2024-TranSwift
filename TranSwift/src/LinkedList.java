class LinkedList {
    Node head;

    public void add(String vertex, int weight) {
        Node newNode = new Node(vertex, weight);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public Node getHead() {
        return head;
    }
}
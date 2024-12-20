class LinkedList {
    Tempat head;

    public void add(String namaTempat, int weight) {
        Tempat newTempat = new Tempat(namaTempat, weight);
        if (head == null) {
            head = newTempat;
        } else {
            Tempat temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newTempat;
        }
    }

    public Tempat getHead() {
        return head;
    }
}
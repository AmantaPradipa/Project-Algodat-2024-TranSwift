class Tempat {
    String namaTempat;
    Jalur jalurhead;
    double jarak;
    boolean visited;
    Tempat next;
    Tempat prev;

    public Tempat(String namaTempat) {
        this.namaTempat = namaTempat;
        this.jalurhead = null;
        this.jarak = Double.POSITIVE_INFINITY;
        this.visited = false;
        this.next = null;
        this.prev = null;
    }
}
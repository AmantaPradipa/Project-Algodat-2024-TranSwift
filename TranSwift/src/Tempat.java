class Tempat {
    String namaTempat;
    double jarak;
    boolean visited;
    Tempat next;
    Tempat prev;

    public Tempat(String namaTempat) {
        this.namaTempat = namaTempat;
        this.jarak = Double.POSITIVE_INFINITY;
        this.visited = false;
        this.next = null;
        this.prev = null;
    }
}
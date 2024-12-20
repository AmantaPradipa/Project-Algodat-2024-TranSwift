class Tempat {
    String namaTempat;
    int weight;
    Tempat next;

    public Tempat(String namaTempat,int weight) {
        this.namaTempat = namaTempat;
        this.next = null;
        this.weight = weight;
    }
}
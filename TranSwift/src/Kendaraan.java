class Kendaraan {
    String jenis;
    boolean isDirected;
    int kapasitasPenumpang;
    double kapasitasBarang;
    Kendaraan next;

    public Kendaraan(String jenis, boolean isDirected, int kapasitasPenumpang, double kapasitasBarang) {
        this.jenis = jenis;
        this.isDirected = isDirected;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.kapasitasBarang = kapasitasBarang;
        this.next = null;
    }
}
class Barang {
    String namaBarang;
    double beratBarang;
    Barang next;

    public Barang(String namaBarang, double beratBarang) {
        this.namaBarang = namaBarang;
        this.beratBarang = beratBarang;
        this.next = null;
    }
}
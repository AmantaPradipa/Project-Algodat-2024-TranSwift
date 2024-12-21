class Kendaraan {
    String jenis;
    boolean isDirected;
    int kapasitasPenumpang;
    double kapasitasBarang;
    int jumlahPenumpang;
    double beratBarang;
    Kendaraan next;

    public Kendaraan(String jenis, boolean isDirected, int kapasitasPenumpang, double kapasitasBarang) {
        this.jenis = jenis;
        this.isDirected = isDirected;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.kapasitasBarang = kapasitasBarang;
        this.jumlahPenumpang = 0;
        this.beratBarang = 0;
        this.next = null;
    }

    public boolean tambahPenumpang() {
        if (this.jumlahPenumpang < this.kapasitasPenumpang) {
            this.jumlahPenumpang++;
            return true;
        }
        return false;
    }

    public boolean tambahBarang(double beratBarang) {
        if (this.beratBarang + beratBarang <= this.kapasitasBarang) {
            this.beratBarang += beratBarang;
            return true;
        }
        return false;
    }
}

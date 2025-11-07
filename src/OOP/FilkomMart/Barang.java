

public class Barang {
    
    private String namaBarang;
    private int hargaBarang;
    private int jumlahBarang;
    private int totalBarang;
    
    public Barang(String namaBarang, int hargaBarang, int jumlahBarang, int totalBarang) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
    }

    public int getTotalBarang() {
        return totalBarang;
    }

    public void setTotalBarang(int totalBarang) {
        this.totalBarang = totalBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

}

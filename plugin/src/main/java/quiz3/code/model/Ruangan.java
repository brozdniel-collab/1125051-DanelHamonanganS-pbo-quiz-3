package quiz3.code.model;

public class Ruangan {
    private String id;
    private String nama;
    private int LokasiLantai;
    private int kapasitas;

    public Ruangan(int LokasiLantai, String id, int kapasitas, String nama) {
        this.LokasiLantai = LokasiLantai;
        this.id = id;
        this.kapasitas = kapasitas;
        this.nama = nama;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getLokasiLantai() {
        return LokasiLantai;
    }

    public void setLokasiLantai(int LokasiLantai) {
        this.LokasiLantai = LokasiLantai;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
}

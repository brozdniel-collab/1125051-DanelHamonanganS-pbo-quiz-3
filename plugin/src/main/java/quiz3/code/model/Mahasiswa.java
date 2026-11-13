package quiz3.code.model;

public class Mahasiswa {
    private String Nim;
    private String nama;
    private String email;
    private int Umur;

    public Mahasiswa(String name, String NIm , String mail , int umr){
        this.Nim = NIm;
        this.nama = name;
        this.email = mail;
        this.Umur = umr;
    }
    public String getNim() {
        return Nim;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public int getUmur() {
        return Umur;
    } 

    public void setNim(String Nim) {
        this.Nim = Nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUmur(int Umur) {
        this.Umur = Umur;
    }
}

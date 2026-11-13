package quiz3.code.view;

import quiz3.code.controller.FileControl;

public class Main {
    public static void main(String[] args){
        lakukan();
    }
}
public void lakukan(){
    FileControl mulai = new FileControl();
     boolean jalan = true;
    
    while(jalan){
        System.out.println("==== PILIH ENTITAS ====");
        int pil = mulai.showEntitas();

        System.out.println("=== Pilih Aksi ===");
        System.out.println("Tampilkan Semua Data");
        System.out.println("Cari Satu Data");
        System.out.println("Ubah Data");
        System.out.println("Delete Data");
    }
}
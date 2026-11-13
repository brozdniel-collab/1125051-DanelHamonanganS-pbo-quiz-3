package quiz3.code.view;

import quiz3.code.controller.FileControl;

public class Main {
    public static void main(String[] args){
        System.out.println("==== PILIH ENTITAS ====");
        FileControl mulai = new FileControl();

        int pil = mulai.showEntitas();

        boolean jalan = true;

        while(jalan){
            System.out.println("=== Pilih Aksi ===");
            System.out.println("Tampilkan Semua Data");
            System.out.println("Cari Satu Data");
            System.out.println("Ubah Data");
            System.out.println("Delete Data");
        }

    }
}

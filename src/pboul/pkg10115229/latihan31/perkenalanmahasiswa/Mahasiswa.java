/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan31.perkenalanmahasiswa;

/**
 *
 * @author Lukman
 * NIM      : 10115229
 * Nama     : Muhammad Lukman Hakim
 * Kelas    : PBO ULANG
 */
public class Mahasiswa {
    String nim;
    String nama;

    public String getNim() {
        return nim;
        
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

     public void perkenalkanDiri(){
        System.out.println("" +nim);
        System.out.println("" +nama);

     }
}



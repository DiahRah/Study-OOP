/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statikaplikasi;
import java.io.*;
/**
 *
 * @author ASUS
 */
public class Menu {
    protected Menu() throws IOException{
        Session.cekStatusLogin();
        tampil();
    }
    
    protected void tampil() throws IOException{
        Session.pembatas();
        System.out.println("Hello (" +Session.getUsername()+") "+Session.getNama());
        System.out.println("Pilih salah satu : " + 
                "\n1 Menghitung Luas Bujur Sangkar" +
                "\n2 Logout and Exit");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pilih;
        System.out.print("Pilihan Anda : ");
                pilih = Integer.parseInt(br.readLine());
                switch(pilih){
                    case 1 : new BujurSangkar();
                    case 2 : Session.Logout();
                    default : Session.pembatas();
                        System.out.println("Masukkan Pilihan Menu dengan Benar!");
                        tampil();
                }
                br = null;
    }
}

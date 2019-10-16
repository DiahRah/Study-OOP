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
public class BujurSangkar {
    private int sisi, luasBujurSangkar;

    protected BujurSangkar()throws IOException{
        Session.cekStatusLogin();
        tampil();
    }
    
    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getLuasBujurSangkar() {
        return luasBujurSangkar;
    }

    public void setLuasBujurSangkar() {
        luasBujurSangkar = sisi*sisi;    
    }
    
    protected void tampil() throws IOException{
        Session.pembatas();
        System.out.println("Hello (" +Session.getUsername()+") "+Session.getNama());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sisi;
        System.out.println("menghitung Luas Bujur Sangkar");
        System.out.print("Sisi = ");
        sisi = Integer.parseInt(br.readLine());
        setSisi(sisi);
        setLuasBujurSangkar();
        System.out.println("Luas Bujur Sangkar = "+getLuasBujurSangkar());
        
        new Menu();
        br = null;
        
    }
    
    
}

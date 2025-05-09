/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan701;

/**
 *
 * @author Ayu Ratna
 * TGL 09 Maret 2025
 */
public class Salam {
    private String tx="Ohayouuu Gaesss";
    
    public void tulisPesan(){
        System.out.println(this.tx);     
    }
    public void tulisPesan(String txt1){   
        System.out.println(txt1); 
    }
    public void tulisPesan(String nim, String nama){
        System.out.println("Mahasiswa dengan NIM: "+nim+", bernama "+nama);
    }
}

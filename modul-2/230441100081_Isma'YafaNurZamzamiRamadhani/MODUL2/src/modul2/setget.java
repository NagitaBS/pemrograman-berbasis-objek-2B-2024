/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author HP VICTUS
 */
public class setget {
    static String Universitas;
    static String NIM;
    static String Nama;
    
    public static String getUniversitas(){
        return Universitas;
    }
    
    public static void setUniversitas(String universitas){
        setget.Universitas = universitas;
    }
    
    public static String getNim(){
        return NIM;
    }
    
    public static void setNim(String nim){
        setget.NIM = nim;
    }
    
    public static String getNama(){
        return Nama;
    }
    
    public static void setNama(String nama){
        setget.Nama = nama;
    }
}

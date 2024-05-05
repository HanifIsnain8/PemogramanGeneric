package PG;


import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hanif
 */
public class latihan {
    
    
    public static void main(String[] args) {
        List<Mahasiswa> Listv = new ArrayList();
        for (int i = 1; i <= 100; i++){
        Mahasiswa m = new Mahasiswa();
        m.setNama(" muhammad hanif isnain" + i);
        m.setNim(22090122);
        m.setEmail("hanif@gmail.com");
        Listv.add(m);    
        }
        
        for (Mahasiswa mhs : Listv){
            var nim = mhs.getNim();
            var nama = mhs.getNama();
            var email = mhs.getEmail();
            System.out.println("nim"+nim);
            System.out.println("nama"+nama);
            System.out.println("email"+email);
            System.out.println("=============");
        }
        
    }
}

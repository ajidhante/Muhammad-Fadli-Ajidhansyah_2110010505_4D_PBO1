package PBO;
import java.util.Scanner;
public class PerusahaanBeraksi {
    public static void main(String[] args) {
        //objek
        //DataPerusahaan perusahaan = new DataPerusahaan("2110010505","Fadli");
        
        //System.out.println(perusahaan.displayInfo());
        //System.out.println(perusahaan.displayInfo("perusahaan"));
        
        //error headling
        try{
        //io sederhana
        Scanner scanner = new Scanner(System.in);
        
        //array
       PerusahaanDetail[] perusahaan= new PerusahaanDetail[2];
        
        //perulangan
        for(int i =0; i<perusahaan.length;i++){  
        System.out.print(" Masukkan NOMOR "+(i+1)+" = ");
        String nomor = scanner.nextLine();
        System.out.print(" Masukkan Nama Perusahaan  "+(i+1)+" = ");
        String namaperusahaan = scanner.nextLine();
        
        //objek
        perusahaan[i] = new PerusahaanDetail(nomor,namaperusahaan);
        }
        
        //perulangan
        for(PerusahaanDetail data : perusahaan) {
            System.out.println("====================");
            System.out.println("Data Perusahaan : ");
            System.out.println(data.displayInfo());
        }
    }   catch(NumberFormatException e ) {
            System.out.println("Kesalahan Format Nomor "+e.getMessage());
    }   catch(StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format NOMOR "+e.getMessage());
    }
        catch (Exception e){
        System.out.println("Kesalahan Umum"+e.getMessage());
    }
  }    
}
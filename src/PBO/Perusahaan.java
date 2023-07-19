package PBO;
//class
public class Perusahaan {
    //atribut dan encapsulation
    private String nomor;
    private String namaperusahaan;
    

    //constructor
    public Perusahaan(String nomor, String namaperusahaan) {
        this.nomor = nomor;
        this.namaperusahaan = namaperusahaan;
    }

 
    //getter
    public String getNomor() {
        return nomor;
    }
    public String getNamaPerusahaan() {
        return namaperusahaan;
    }
    
    
    //setter
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }   
    public void setNama(String namaperusahaan) {
        this.namaperusahaan = namaperusahaan;
    }
    
    
    public String displayInfo() {
        return "NOMOR = "+getNomor()+ "\nNama Perusahaan = "+getNamaPerusahaan();
    }
    
    //polymortisme(overloding)
    public String displayInfo(String alamat){
        return displayInfo()+"\nAlamat = "+alamat;
    }
}

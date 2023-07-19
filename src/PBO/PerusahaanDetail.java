package PBO;
//inheritance
public class PerusahaanDetail extends Perusahaan{
     //overriding
    public PerusahaanDetail(String nomor, String namaperusahaan) {
        super(nomor, namaperusahaan);
    }
    
    public String getTempatPerusahaan(){
        String kodePerusahaan = getNomor().substring(0, 4);
        //seleksi switch
        return switch (kodePerusahaan) {
            case "0001" -> "Martapura";
            case "0002" -> "Banjarbaru";
            case "0003" -> "Banjarmasin";
            default -> "Perusahaan Daerah Lain";
        };
    }
    
    public int getNoAntrian(){
          return Integer.parseInt(getNomor().substring(4,12));   
    }
    
    public String getKategori(){
        String urutankategori = getNomor().substring(12,14);
        //seleksi switch
        return switch (urutankategori) {
            case "001" -> "Administrasi";
            case "002" -> "Logistik";
            case "003" -> "Akuntansi";
            case "004" -> "Manajer Proyek";
            default -> "Dan Seterusnya";
        };
    }
   //polymortisme(override)
    @Override
    public String displayInfo(){
            return super.displayInfo()+
            "\nTempat = "+getTempatPerusahaan()+
            "\nNo Antrian = "+getNoAntrian()+
            "\nUrutan Kategori = "+getKategori();
        }
    }
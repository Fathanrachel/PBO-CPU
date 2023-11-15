package Laptop;
import java.text.NumberFormat;
import java.util.Locale;


public class CPU {
    private double harga;
    private String merek;

    public CPU(double harga, String merek){
        this.harga = harga;
        this.merek = merek;
    }

    public class Processor{
        int cores;
        String manufacture;
        String Name;

        Processor(int cores, String manufacture, String Name){
            this.cores = cores;
            this.manufacture = manufacture;
            this.Name = Name;
        }
        public void getProcessorInfo(){
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacture);
            System.out.println("Processor: " + this.Name);
        }
    }

    public class RAM {
        int jumlahRAM;
        String manufacture;

        RAM(int jumlahRAM, String manufacture){
            this.jumlahRAM = jumlahRAM;
            this.manufacture = manufacture;
        }

        public void getInfoRAM(){
            System.out.println("Jumlah RAM: " + this.jumlahRAM);
            System.out.println("Pabrik: " + this.manufacture);
        }
    }

    public class Harddisk{
        int capasity;
        String manafucture;

        Harddisk(int capasity, String manafucture){
            this.capasity = capasity;
            this.manafucture = manafucture;
        }

        public void getHarddiskInfo(){
            System.out.println("Kapasitas Harddisk: " + this.capasity);
            System.out.println("Pabrtik: " + this.manafucture);
        }
    }

    public class Motherboard{
        String model;
        String manufacture;

        Motherboard(String model, String manufacture){
            this.model = model;
            this.manufacture = manufacture;
        }

        public void getMotherboardInfo(){
            System.out.println("Model Motherboard: " + this.model);
            System.out.println("Pabrik: " + this.manufacture);
        }
    }

    public class Powersuplly{
        String type;
        String manufacture;

        Powersuplly(String type, String manufacture){
            this.type = type;
            this.manufacture = manufacture;
        }

        public void getPowersupplyInfo(){
            System.out.println("Tipe Power Supply: " + this.type);
            System.out.println("Pabrik: " + this.manufacture);
        }
    }

    public class VGA{
        String model;
        String manufacture;

        VGA(String model, String manufacture){
            this.model = model;
            this.manufacture = manufacture;
        }

        public void getVGAInfo(){
            System.out.println("Model VGA: " + this.model);
            System.out.println("Pabrik: " + this.manufacture);
        }
    }



    public void getCPUInfo() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("Komputer Merek: " + this.merek);

        // menuliskan harga yang double ke dalam format rupiah
        System.out.println("Harga: " + formatRupiah.format(this.harga));
    }


}

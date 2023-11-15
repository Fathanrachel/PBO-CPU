package Laptop;

public class Main {
    public static void main(String[] args) {
        // buat object CPU
        CPU myKomputer = new CPU(15000000, "Lenovo");

        CPU.Processor AMD = myKomputer.new Processor(16, "AMD", "Ryzen 9");

        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");

        CPU.Harddisk hd2 = myKomputer.new Harddisk(2000, "Seagate");

        CPU.Motherboard MB = myKomputer.new Motherboard("ATX-8900", "ASUS ROG");

        CPU.Powersuplly PS = myKomputer.new Powersuplly("750W", "Corsair");

        CPU.VGA vga = myKomputer.new VGA("RTX 4090", "NVIDIA");

        myKomputer.getCPUInfo();
        AMD.getProcessorInfo();
        rs32GB.getInfoRAM();
        hd2.getHarddiskInfo();
        MB.getMotherboardInfo();
        PS.getPowersupplyInfo();
        vga.getVGAInfo();
    }
}
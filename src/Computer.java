import java.util.Random;

public class Computer {
    String processor;
    int ram;
    int hdd;
    int resource;

    public Computer(String processor, int ram, int hdd, int resource) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
    }

    public void Info() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " Gb");
        System.out.println("HDD: " + hdd + " Tb");
        System.out.println("Resource: " + resource + " cycles");
    }
}

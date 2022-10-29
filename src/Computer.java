import java.util.Random;

public class Computer {
    String processor;
    int ram;
    int hdd;
    int resource;
    int number;

    public Computer(String processor, int ram, int hdd, int resource, int number) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
        this.number = number;
    }

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

    public void turnOn() {
        Random random = new Random();
        int chance = random.nextInt(2);
        if (number == chance && resource > 0) {
            System.out.println("Компьютер включился");
        } else {
            System.out.println("Компьютер сгорел");
        }
    }
}

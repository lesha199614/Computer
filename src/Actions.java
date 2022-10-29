import java.util.Random;

public class Actions {
    public static void main(String[] args) {
        Random random = new Random();
        String processor = "Intel";
        int ram = random.nextInt(32) + 1;
        int hdd = random.nextInt(5) + 1;
        int resource = random.nextInt(50) + 1;
        Computer myComputer = new Computer(processor,ram,hdd,resource);
        myComputer.Info();

    }

}

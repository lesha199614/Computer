import java.util.Random;
import java.util.Scanner;

public class Actions {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String processor = "Intel";
        int ram = random.nextInt(32) + 1;
        int hdd = random.nextInt(5) + 1;
        int resource = random.nextInt(5);
        boolean isTurnedOn = false;
        boolean isBurnedOut = false;
        Computer myComputer = new Computer(processor,ram,hdd,resource,isTurnedOn,isBurnedOut);
        myComputer.Info();
        myComputer.turnOn();
        myComputer.turnOff();
    }

}

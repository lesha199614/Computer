import java.util.Random;
import java.util.Scanner;

public class Actions {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int number = 0;
        String processor = "Intel";
        int ram = random.nextInt(32) + 1;
        int hdd = random.nextInt(5) + 1;
        int resource = random.nextInt(5);
        Computer myComputer = new Computer(processor,ram,hdd,resource,number);
        myComputer.Info();
        System.out.println("Введи число от 0 до 1 чтобы включить");
        number = sc.nextInt();
        myComputer.turnOn();
    }

}

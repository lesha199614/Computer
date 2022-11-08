package Computer;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    String processor;
    private int ram;
    private int hdd;
    private int resource;
    private boolean isTurnedOn;
    private boolean isBurnedOut;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public Computer(String processor, int ram, int hdd, int resource, boolean isTurnedOn, boolean isBurnedOut) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
        this.isTurnedOn = isTurnedOn;
        this.isBurnedOut = isBurnedOut;
    }

    private void Info() {
        System.out.println("System info:");
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " Gb");
        System.out.println("HDD: " + hdd + " Tb");
        System.out.println("Resource: " + resource + " cycles");
        System.out.println("=============================");
    }
    public void printInfo(){
        Info();
    }

    private void turnOn() {

        int randomValue = random.nextInt(2);
        System.out.println("Введи число от 0 до 1");
        int scannerValue = scanner.nextInt();
        if (isBurnedOut) {
            System.out.println("Компьютер уже сгорел");
            System.out.println("================");
        } else if (isTurnedOn) {
            System.out.println("Компьютер уже включен");
            System.out.println("================");
        } else if (randomValue == scannerValue && resource > 0) {
            System.out.println("Компьютер включился");
            System.out.println("================");
            isTurnedOn = true;
        } else if (resource < 1) {
            System.out.println("Компьютер сгорел, так как закончился ресурс");
            System.out.println("================");
            isBurnedOut = true;
        } else {
            System.out.println("Компьютер сгорел, так как ты не угадал число");
            System.out.println(scannerValue + "!=" + randomValue);
            System.out.println("================");
            isBurnedOut = true;
        }
    }
    public void resultTurnOn(){
        turnOn();
    }

    private void turnOff() {
        int randomValue = random.nextInt(2);
        System.out.println("Введи число от 0 до 1");
        int scannerValue = scanner.nextInt();
        if (isBurnedOut) {
            System.out.println("Компьютер уже сгорел");
            System.out.println("================");
        } else if (!isTurnedOn) {
            System.out.println("Компьютер уже выключен");
            System.out.println("================");
        } else if (randomValue == scannerValue && resource > 0) {
            System.out.println("Компьютер выключился");
            System.out.println("================");
            isTurnedOn = false;
            resource--;
        } else {
            System.out.println("Компьютер сгорел так как ты не угадал число");
            System.out.println(scannerValue + "!=" + randomValue);
            System.out.println("================");
            isBurnedOut = true;
        }
    }
    public void resultTurnOff(){
        turnOff();
    }
}

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = in.nextLine();
        System.out.printf("Hello, %s!", name);
        in.close();
    }
}

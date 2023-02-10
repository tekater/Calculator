import java.util.Scanner;

public class Buffer implements Calculator{
    Scanner scanner = new Scanner(System.in);
    @Override
    public int Plus() {
        System.out.print("Введите ваше первое число I = ");
        int i = scanner.nextInt();
        System.out.print("Введите ваше второе число J = ");
        int j = scanner.nextInt();
        System.out.print(i + " + " + j + " = ");
        System.out.print(i + j);
        return i + j;
    }

    @Override
    public int Minus() {
        System.out.print("Введите ваше первое число I = ");
        int i = scanner.nextInt();
        System.out.print("Введите ваше второе число J = ");
        int j = scanner.nextInt();
        System.out.print(i + " - " + j + " = ");
        System.out.print(i - j);
        return i - j;
    }

    @Override
    public int Division() {
        System.out.print("Введите ваше первое число I = ");
        int i = scanner.nextInt();
        System.out.print("Введите ваше второе число J = ");
        int j = scanner.nextInt();
        System.out.print(i + " / " + j + " = ");
        System.out.print(i / j);
        return i / j;
    }

    @Override
    public int Multiplication() {
        System.out.print("Введите ваше первое число I = ");
        int i = scanner.nextInt();
        System.out.print("Введите ваше второе число J = ");
        int j = scanner.nextInt();
        System.out.print(i + " * " + j + " = ");
        System.out.print(i * j);
        return i / j;
    }
}

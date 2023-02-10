
public class Main {
    public static void main(String[] args) {
        Buffer base = new Buffer();
        System.out.println("Введите ваш подходящий пример: \nplus или + \nminus или - \ndivision или / \nmultiplication или *");
        String action = new java.util.Scanner(System.in).nextLine();
        switch (action) {
            case "plus":
                base.Plus();
                break;
            case "minus":
                base.Minus();
                break;
            case "division":
                base.Division();
                break;
            case "multiplication":
                base.Multiplication();
                break;
            case "+":
                base.Plus();
                break;
            case "-":
                base.Minus();
                break;
            case "/":
                base.Division();
                break;
            case "*":
                base.Multiplication();
                break;
            default:
                System.out.println("Такой пример на данный момент невозможен или система вас не поняла!");
                System.out.println("Пишите как на примере!!!");
        }
    }
}
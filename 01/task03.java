import java.util.Scanner;


/**
 * Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)
 */
public class task03 {

    public static void main(String[] args) {
        task3();
    }
    static void task3(){

        System.out.println("Введи первое число ");
        Scanner ascanner = new Scanner(System.in);
        int a = ascanner.nextInt();

        System.out.println("Введи действие '-' '+' '*' '/' ");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();

        System.out.println("Введи второе число ");
        Scanner bscanner = new Scanner(System.in);
        int b = bscanner.nextInt();

        if (action == "-") {
            System.out.println("Ответ =" +(a-b));
        }
        if (action == "+") {
            System.out.println("Ответ =" +(a+b));
        }
        if (action == "*") {
            System.out.println("Ответ =" +(a*b));
        }
        if (action == "/") {
            System.out.println("Ответ =" +(a/b)); 
        }   
        else {
            System.out.println("Надо было ввести актуальное действие");
        }
    }
}
import java.util.Scanner;

/**
 * Вычислить n! (произведение чисел от 1 до n)
 */
public class task02 {

    public static void main(String[] args) {
        task2();
    }
    static void task2(){
        System.out.println("Введи число для получения факториала: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factorial = 1;
        while (number <= 10) {
            factorial *= number;
            number += 1;
        System.out.println("Факториал равен = " +factorial);
        } 
    }
}
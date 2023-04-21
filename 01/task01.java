import java.util.Scanner;

/**
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n)
 */
public class task01 {

    public static void main(String[] args) {
        task1();
    }
    static void task1(){
        System.out.println("Введи число для получения тругольного числа: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Треугольное чило = " +(a * (a + 1)) / 2);   
    }
}
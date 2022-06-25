package ostatok_dva;

import java.util.Scanner;

/*
Напишите программу для вывода суммы, умножения, вычитания, деления и остатка двух чисел 
 */
public class Test {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("a: ");
        int a = in.nextInt();

        System.out.print("b: ");
        int b = in.nextInt();

        System.out.println("Enter operation would you like: + - * / %");
        String operation = in.next();

        switch (operation) {
            case "+" -> System.out.println("a + b = " + (a + b));
            case "-" -> System.out.println("a - b = " + (a - b));
            case "*" -> System.out.println("a * b = " + (a * b));
            case "/" -> System.out.println("a / b = " + (a / b));
            case "%" -> System.out.println("a % b = " + (a % b));
        }
    }
}

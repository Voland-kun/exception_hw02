package hw02;

import java.util.Scanner;
public class hw02 {
    public static void main(String[] args) {
        System.out.println(floatInput());
    }

    public static String emptyString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дробное число:");
        String userString = sc.nextLine();
        if (userString.isEmpty()) {
            throw new IllegalArgumentException("Нельзя вводить пустые строки");
        } else {
            return userString;
        }
    }

    public static float floatInput() {
        while (true) {
            String str = "";
            try {
                str = emptyString();
                try {
                    float userNumber = Float.parseFloat(str);
                    return userNumber;
                } catch (NumberFormatException e) {
                    System.out.println("Некорректное значение.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Нельзя вводить пустые строки");
            }

        }
    }
}

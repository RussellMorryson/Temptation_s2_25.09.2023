/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению 
приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        userInput();        
    }

    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        float number = 0.0f;
        System.out.println("Input fractional number: ");
        String inWord = scanner.nextLine(); 
        try {
            number = Float.parseFloat(inWord);
            System.out.println(number);
            scanner.close();
        } catch (NumberFormatException e) {
            userInput();
        }
    }
}
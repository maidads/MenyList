import java.util.Scanner;

public class meny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuePlaying;
        do {
        System.out.println("Welcome! What do you want to do? Pick one number.");
        System.out.println("1. Add two numbers");
        System.out.println("2. Count letters in a string");
        System.out.println("3. Mirror a string");
        System.out.println("4. Sum all numbers in a string");
        // System.out.println("e. Game Over.");

        int chosenNumber = sc.nextInt();

        if (chosenNumber == 1){
            System.out.println("Chose the first number to add:");
            int a = sc.nextInt();
            System.out.println("Chose the second number to add:");
            int b = sc.nextInt();
            int c = a + b;
            System.out.println("The sum of your chosen numbers are: " + c);
        } else if (chosenNumber == 2) {
            System.out.println("Give me a string:");
            String chosenString = sc.next();
            System.out.println("What letter do you want to count?");
            char letter = sc.next().charAt(0);
            int count = 0;
            for (int i = 0; i < chosenString.length(); i++) {
                if (chosenString.charAt(i) == letter) {
                    count++;
                }
            }
            System.out.println("There are " + count + " " + letter);
        } else if (chosenNumber == 3) {
            System.out.println("Give me a string:");
            String reverseString = sc.next();
            StringBuilder sb = new StringBuilder(reverseString);
            sb.reverse();
            System.out.println(sb);
        } else if (chosenNumber == 4) {
            System.out.println("Give me a string of numbers:");
            String numbers = sc.next();
            int sum = 0;
            for (char c : numbers.toCharArray()) {
                if (Character.isDigit(c)) {
                    sum += Character.getNumericValue(c);
                }
            }
            System.out.println("The sum of the numbers in your string is: " + sum);
        }
            System.out.println("Do you want to continue? (y/n)");
            continuePlaying = sc.next();
        } while (continuePlaying.equalsIgnoreCase("y"));
    }
}

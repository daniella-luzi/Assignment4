import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Welcome to the Word Reverser 3000!");
        System.out.println("Please input a word that you would like to be reversed: ");

        String originalWord = scanner.nextLine();
        String reversedWord = "";

        for(int i = originalWord.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + originalWord.charAt(i);
            
        }
            System.out.println("Your word is: " + originalWord); 
            System.out.println("Reversed it is: " + reversedWord);
        
        scanner.close();
    }
}


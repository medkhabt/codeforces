import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        int nWords = Integer.parseInt(scanner.nextLine()); 
        String word; 
        int wordLength; 
        for (int i = 0 ; i < nWords ; i++) { 
            word = scanner.nextLine(); 
            if(word != null) { 
                if(word.length() > 10 ) { 
                    wordLength = word.length(); 
                    word = word.charAt(0) + String.valueOf(wordLength - 2 ) + word.charAt(wordLength - 1); 
                    System.out.println(word);
                }
                else { 
                    System.out.println(word);
                }
            }
        }

        scanner.close();
    }
}

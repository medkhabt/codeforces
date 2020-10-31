import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        String word = scanner.nextLine().toLowerCase();
        boolean consonant = true ; 
        String output = "" ; 
        char[] vowels = {'a', 'o', 'y', 'e', 'u', 'i'}; 
        for(int i = 0 ; i < word.length(); i++) { 
            // re-init consonant. 
            consonant = true; 
            for ( char v : vowels) { 
                if ( word.charAt(i) == v) { 
                    consonant = false; 
                    break; 
                }
                
            }
            if(consonant) {
                output += "." + word.charAt(i);
            }
        }
        System.out.println(output);
        
    }
}

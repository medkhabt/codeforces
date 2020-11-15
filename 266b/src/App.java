import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // It feels like cheating.. String.replace() does the job lmao. 
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();  // for the n , with don't use it.
        int t = scanner.nextInt(); 
        scanner.nextLine(); // for the (/n) character. 
        String queue = scanner.nextLine();

        for( int i = 0 ; i < t ; ++i ) { 
            queue = queue.replace("BG", "GB"); 
        }
        System.out.println(queue);
        
        scanner.close();
    }
}

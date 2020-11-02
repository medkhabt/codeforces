import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // It feels like cheating.. String.replace() does the job lmao. 
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt(); 
        int t = scanner.nextInt(); 
        scanner.nextLine();
        String queue = scanner.nextLine();

        for( int i = 0 ; i < t ; ++i ) { 
            queue = queue.replace("BG", "GB"); 
        }
        System.out.println(queue);
        
        scanner.close();
    }
}

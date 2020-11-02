import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt(); 
        int N = scanner.nextInt(); 

        // if M is even than "(M/2) * N" is fine, if not we need to add a E[N/2], which is
        // the same as N/2 in int. 
        int output = (M/2) * N + ((M%2 == 0) ? 0: N/2); 

        System.out.println(output);

        scanner.close(); 
    }
}

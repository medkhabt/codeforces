import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int x = 0; 
        for( int i = 0 ; i < n ; i ++ ) { 
            if ( scanner.nextLine().charAt(1) == '+' ) {
                ++x; 
            }
            else {
                --x; 
            }
        } 
        System.out.println(x);

        scanner.close();
    }
}

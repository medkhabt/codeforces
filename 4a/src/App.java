import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        if ( w % 2 == 0 && w / 2 > 1 ) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}

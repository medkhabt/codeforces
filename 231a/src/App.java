import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        int nProblems = Integer.valueOf(scanner.nextLine());
        int peyta,vasya,tonya, nSureSolutions = 0;

        for (int i = 0 ; i < nProblems ; i++) { 
            peyta = scanner.nextInt(); 
            vasya = scanner.nextInt(); 
            tonya = scanner.nextInt();
            nSureSolutions += (peyta + vasya + tonya > 1 )? 1: 0;
        } 

        System.out.println(nSureSolutions);


        scanner.close(); 
    }
}

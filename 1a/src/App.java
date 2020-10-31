import java.math.BigInteger;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        BigInteger n = scanner.nextBigInteger();
        BigInteger m = scanner.nextBigInteger();
        BigInteger a = scanner.nextBigInteger();

        BigInteger na = n.divide(a); 
        BigInteger ma = m.divide(a); 

        na = (n.remainder(a) == BigInteger.ZERO) ? na : na.add(BigInteger.valueOf(1)); 
        ma = (m.remainder(a) == BigInteger.ZERO) ? ma : ma.add(BigInteger.valueOf(1));
        
        System.out.println(na.multiply(ma));




        scanner.close();
    }
}

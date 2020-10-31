import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        int n = scanner.nextInt(); 
        int k = scanner.nextInt(); 
        List<Integer> scores = new ArrayList<>(); 
        int nAdvancers = 0; 
        // this can be optimized, there is no need for the list scores. We only need score-k. 
        for ( int i = 0 ; i < n ; i ++ ) { 
            int temp = scanner.nextInt(); 
            if(temp == 0 && i < k) {
                // if it didn't reach k-score, and the score is positive. Than we should stop.
                break; 
            }
            else if (i >= k) {
                // if it get passed the k-score, and the score is less than the k-score. Than we should stop.
                if(temp < scores.get(k - 1) ){
                    // i wrote it here so i won't have issues with "scores.get(k-1)" as it doesn't existed before i < k - 1 
                    break;
                }    
            }
            
            nAdvancers ++;
            scores.add(temp); 
        }

        System.out.println(nAdvancers);
    

        scanner.close(); 
    }
}

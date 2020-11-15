import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.namespace.QName;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        boolean noneStable = true ; 
        int d = scanner.nextInt(); 
        int sumTime = scanner.nextInt(); 
        int sum = 0 ; 
        List<Integer> dTime = new ArrayList<>(); 
        List<Integer> min = new ArrayList<>(); 
        // List<Integer> minCompare = new ArrayList<>(); // man a lot of variables, this needs optimization. 
        List<Integer> max = new ArrayList<>(); 

        // filling up the lists

        for( int i = 0 ; i < d ; ++i ) { 
            min.add(scanner.nextInt() + 1); 
            // minCompare.add(min.get(0) + 1)
            max.add(scanner.nextInt());
            dTime.add(max.get(i));
            sum += dTime.get(i);  
            if(max.get(i) < min.get(i)) { 
                min.set(i, max.get(i));
            }
        }
        // if it's already equal
        if( sum == sumTime ) {
            System.out.println("YES");
            for(Integer time: dTime) { 
                System.out.print(time);
            }
            System.out.println();
        }
        // if it's lesser than the sumtime with the max values, than there is no hope for the lil man. 
        else if( sum < sumTime ) {
            System.out.println("NO");
        }
        // here, i need to make adjustments. (if it is greater than the sumtime )
        else { 
            while ( sum > sumTime && !min.equals(dTime) ) {
                for( int i = 0 ; i < d ; ++i){
                    if( dTime.get(i) > min.get(i)) { 
                       dTime.set(i, dTime.get(i) - 1); 
                       --sum;
                       break; 
                    }
                    else {
                       continue;
                    }
                }
            }
            if( sum == sumTime ){
                System.out.println("YES");
                for( Integer time: dTime ) { 
                    System.out.print(time + " ");
                }
                System.out.println("");
            }
            else if ( min.equals(dTime) ) {
                System.out.println("NO");
            }
            else if( sum < sumTime) {
                while( sum != sumTime && noneStable){
                    noneStable = false; 
                    for( int i = 0 ; i < d ; ++i ) { 
                        if( dTime.get(i) < max.get(i) && (dTime.get(i) + 1 + sum <= sumTime) ){
                            dTime.set(i, dTime.get(i) + 1); 
                            noneStable = true; 
                        }
                    }
                }
                if( noneStable ){
                    System.out.println("YES");
                    for( Integer time: dTime ) { 
                        System.out.print(time);
                    }
                    System.out.println();
                }
                else { 
                    System.out.println("NO");
                }
            }
             
            
            
        }

        scanner.close(); 
        
    }
}

// UPDATE 5 NOV 2020
// i don't know where the problems is , i think i'm gonna play a bit with the older
// min array (without + 1 ). 
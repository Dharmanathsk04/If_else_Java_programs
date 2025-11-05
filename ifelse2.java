package ApnaCollage_2025;

import java.util.*;

public class ifelse2 {
    

    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);

        System.out.println("enter the num 1");
        int a = sc.nextInt();

        System.out.println("enter the num 2");
        int b = sc.nextInt();


        if(a == b) {

            System.out.println("they are equal");
        }

        else{

            if(a > b) {

                System.out.println("a is greter than b");
            }

            else{

                System.out.println("a is less than b");
            }
        }


        sc.close();
        
        
    }
}

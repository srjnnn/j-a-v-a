package rationalOperators;

import java.util.Scanner;

public class LogicalOperators {
    static void main(String[] args) {
//        And or not gate
        Scanner input = new Scanner(System.in);

        boolean isMale = true;
        boolean isVeg = true;
        boolean isAdult = false;

//        AND gate
        if(isMale && isVeg){
            System.out.println("Both conditions are true");
        }else if(isMale && isAdult){ //true false
            System.out.println("Nah this is not gonna run");
        }

//        OR Gate works if either condition are true
        if(isMale || isAdult){
            System.out.println("Either conditions are true");
        }
    }


//    Not gate

}

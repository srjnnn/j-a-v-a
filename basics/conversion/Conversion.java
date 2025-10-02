package conversion;

public class Conversion {
    static void main(String[] args) {
//    implicit (small --> big)
        float myFloat = 5;
        System.out.println(myFloat);

//        explicit (big --> small)
        int variable = (int) 5.4; //it will round up to the nearest units
        System.out.println(variable);
    }
}

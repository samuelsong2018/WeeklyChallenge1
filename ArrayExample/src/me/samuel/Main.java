package me.samuel;

import java.util.Arrays;

public class Main {

//    public static void main(String[] args) {
//        String[] elements = new String [5];
//        elements[0] = "First String";
//        elements[1] = "Second String";
//        elements[2] = "Third String";
//        elements[3] = "Fourth String";
//        elements[4] = "Fifth String";
//
//        //Will sort in alphabetical order
//        Arrays.sort(elements);
//        for(int index=0; index<elements.length; index++){
//            //The index of element1 is index0.
//            System.out.printf("\nThe value of element %d is %s", index, elements[index]);
//        }
//    }
//}






//    public static void main(String[] args) {
//        double[] elements = new double [5];
//        elements[0] = 3.142;
//        elements[1] = 1.115;
//        elements[2] = 3.248;
//        elements[3] = 5.258;
//        elements[4] = 5.000;
//
//        //Will sort in alphabetical order
//        Arrays.sort(elements);
//        for(int index=0; index<elements.length; index++){
//            //The index of element1 is index0.
//            System.out.printf("\nThe value of element %d is %f", index, elements[index]);
//        }
//    }
//}






//    public static void main(String[] args) {
//        int[] elements = new int [5];
//        elements[0] = 1582;
//        elements[1] = 2854;
//        elements[2] = 4;
//        elements[3] = 6;
//        elements[4] = 8;
//
//        //Will sort in alphabetical order
//        Arrays.sort(elements);
//        for(int index=0; index<elements.length; index++){
//            //The index of element1 is index0.
//            System.out.printf("\nThe value of element %d is %d", index, elements[index]);
//        }
//    }
//}






    public static void main(String[] args) {
        String[] elements = new String [11];
        elements[6] = "Bush";
        elements[8] = "Bush";
        elements[4] = "Carter";
        elements[7] = "Clinton";
        elements[3] = "Ford";
        elements[1] = "Johnson";
        elements[0] = "Kennedy";
        elements[2] = "Nixon";
        elements[9] = "Obama";
        elements[5] = "Reagan";
        elements[10] = "Trump";

        for(int index=0; index<elements.length; index++){
            //The index of element1 is index0.
            System.out.printf("\nThe value of element %d is %s", index, elements[index]);
        }
    }
}
package me.samuel;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	String[] anotherList = new String[10];
        System.out.printf("The size of this array is %d",anotherList.length);

    for(int i=0; i<anotherList.length; i++){
        System.out.println("The value of the item here is: " +anotherList[i]);
    }

	ArrayList myList = new ArrayList<>();
	myList.add("This is an object");
	Integer anInteger = 3;
	myList.add(anInteger);
	int anotherInteger = 6;
	myList.add(anotherInteger);
	Scanner sc = new Scanner(System.in);
	myList.add(sc);
	myList.add("This is an object");

	for(Object eachElement: myList){
        System.out.println(eachElement);
    }
//	for(int i=0; i<myList.size(); i++){
//        System.out.println(myList.get(i));
//    }

    ArrayList<Integer> myIntegers = new ArrayList<>();
	myIntegers.add(3);

	HashMap<Integer,String> aMap = new HashMap<>();

	HashSet aSet = new HashSet<>();
    }
}
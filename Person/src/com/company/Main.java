package me.samuel;

public class Main {
    private int myVariable;

    public static void main(String[] args) {

        Person jj = new Person();
        jj.setMyName("Josemy");
        jj.setAge(100);

        System.out.println("Hello my name is" + jj.getMyName() + " and I am" + jj.getAge);

    }
}

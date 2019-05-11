package OtherEx;

import java.util.HashSet;

public class HashCodeEqualsStdTwo  {



    public static  void  main(String[] args) {

        HashCodeEqualsStdOne hcsOne = new HashCodeEqualsStdOne(1, "Sushant");
        HashCodeEqualsStdOne hcsTwo = new HashCodeEqualsStdOne(1, "Sushant");

        System.out.println("Hashing of objects which returns unique integer value " + hcsOne.hashCode());
        System.out.println("Hashing of objects which returns unique integer value " + hcsTwo.hashCode());

        System.out.println("Equals to compare objects,  two objects are equal if and only if they are stored in the same memory address.");


        System.out.println("Returns boolean value : " + hcsOne.equals(hcsTwo));
        //without equals method in HashCodeEqualsStdOne --> false,   with equls method -->True


   /*     System.out.println(" TO UNDERSTAND HASCODE() method   ");

        HashCodeEqualsStdOne alex1 = new HashCodeEqualsStdOne(1, "Alex");
        HashCodeEqualsStdOne alex2 = new HashCodeEqualsStdOne(1, "Alex");
        HashSet < HashCodeEqualsStdOne > students = new HashSet< HashCodeEqualsStdOne >();
        students.add(alex1);
        students.add(alex2);
        System.out.println("HashSet size = " + students.size());
        System.out.println("HashSet contains Alex = " + students.contains(new HashCodeEqualsStdOne(1, "Alex")));
    } */

    }
}

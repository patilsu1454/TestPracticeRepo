package ConstructorsEx;

import java.sql.SQLOutput;

public class ConstructorTest {

    int no;
    String name;

    ConstructorTest(int n, String m){

        this.no=n;
        this.name=m;
        System.out.println(" no is :"+no + " and name is :"+name);
    }

    public void nonConstructor(){
        System.out.println("Other method ");
    }

    public static void main(String args[]){
        ConstructorTest ct1=new ConstructorTest(5, "Sushant");
      //ConstructorTest ct=new ConstructorTest();  // not allowed
        ct1.nonConstructor();

    }

}

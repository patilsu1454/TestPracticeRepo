package InterfacesEx;

import java.util.ArrayList;
import java.util.Collections;

public class OrderByStdntNameOrIdMain {

    public static  void  main(String[] args){

    OrderByStdntClass student1=new OrderByStdntClass(33,"Sushant Patil","Bangalore-560043");
    OrderByStdntClass student2=new OrderByStdntClass(44,"Suprit Patil","Katkol-591114");
    OrderByStdntClass student3=new OrderByStdntClass(22,"Ashini Patil","Gangtok-791114");

        ArrayList<OrderByStdntClass> arlist=new ArrayList<OrderByStdntClass>();
        arlist.add(student1);
        arlist.add(student2);
        arlist.add(student3);

        System.out.println("Before Sorting");
        System.out.println(arlist);
        System.out.println("Before Sorting by id");
        Collections.sort(arlist,new OrderByStdntId());
        System.out.println(arlist);
        System.out.println("**************************************");
        System.out.println("After Sorting by Name");
        Collections.sort(arlist,new OrderByStdntName());
        System.out.println(arlist);

    }
}

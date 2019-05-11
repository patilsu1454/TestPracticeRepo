package InterfacesEx;

import java.util.Comparator;

public class OrderByStdntName implements Comparator<OrderByStdntClass> {

    public int compare(OrderByStdntClass objA, OrderByStdntClass objB){
        return objA.name.compareTo(objB.name);
    }


}

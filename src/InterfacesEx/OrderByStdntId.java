package InterfacesEx;

import java.util.Comparator;

public class OrderByStdntId implements Comparator<OrderByStdntClass> {

    public int compare (OrderByStdntClass objA, OrderByStdntClass objB)
    {
        return objA.id-objB.id;
    }


}

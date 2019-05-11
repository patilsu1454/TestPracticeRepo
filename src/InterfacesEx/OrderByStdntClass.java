package InterfacesEx;

public class OrderByStdntClass {  // About Comparator<OrderByStdntClass> interface
    String name;
    int id;
    String address;
    OrderByStdntClass(int id ,String name, String address ){
        this.name=name;
        this.id=id;
        this.address=address;
    }

    //Read about toString method from StringEx package or -->  https://www.javatpoint.com/understanding-toString()-method
    //The toString() method returns the string representation of the object.
    public String toString(){

        return this.id+"->"+this.name+"->"+this.address+"\n";
    }

}

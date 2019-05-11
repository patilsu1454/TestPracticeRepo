package InterfacesEx;


public class BlankImplClass implements BlankInterface {
    int i;

    public  static  void  main(String args[]){
        BlankImplClass bic= new BlankImplClass();
        System.out.println(bic.i);  //0
        bic.i=11;
        System.out.println(bic.j); //20
      //  bic.j=21; // Not allowed as it's member of interface and which are by default public static final
        System.out.println(bic.j);

    }
}

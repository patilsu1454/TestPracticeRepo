package StringsEx;

import java.util.Arrays;
import java.util.List;

public class ConvStrArrayToArrList {

    public  static  void main(String args[]){

        String arr[]={"Sush","Sup","Ashu","Teju"};
        List<String> arrList= Arrays.asList(arr);
        System.out.println(arrList);

    }
}

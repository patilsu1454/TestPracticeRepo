package CollectionEx;

import java.util.ArrayList;
import java.util.Collections;

public class SecondLargest {

    //without using Collections.sort
    public int secLargest(ArrayList<Integer> arList){
        int firstLargest=0,secondLargest=0;

        for(int i=0; i<arList.size();i++){
            if(arList.get(i)>firstLargest){
                secondLargest=firstLargest;
                firstLargest=arList.get(i);
            }if(arList.get(i)>secondLargest && arList.get(i)<firstLargest){
                secondLargest=arList.get(i);
            }
        }

        return  secondLargest;
    }

    //Using Collections.sort
    public int secLargSort(ArrayList<Integer> arList){

        int secLargest;
        Collections.sort(arList); //ascending order
        int secLarIndex=arList.size();
        secLargest=arList.get(secLarIndex-2);
        return  secLargest;
    }


    public static void main(String[] args){
        SecondLargest sl=new SecondLargest();
        ArrayList<Integer> arrList=new ArrayList<>();
        arrList.add(22);
        arrList.add(12);
        arrList.add(20);
        arrList.add(10);
        arrList.add(2);
        arrList.add(2);
        arrList.add(122);
        arrList.add(100);
        arrList.add(12);
        int secondLargestInArrayList=sl.secLargest(arrList);
        System.out.println("secondLargestInArrayList :" +secondLargestInArrayList);
        System.out.println("secondLargestInArrayList using Collections.sort :" +sl.secLargSort(arrList));
    }
}

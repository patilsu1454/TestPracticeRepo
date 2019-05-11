package StringsEx;

public class NoOfOccOfCharInStr {

    public int numberOfOccOfCharInStr(char c ,String str){
       int count=0;
       for(int i=0;i<str.length();i++){   // str.length()---> String method
           if(str.charAt(i)==c){    // str.charAt(int i) --->String method
               count++;
           }
       }
        return count;
    }

    public static void main (String[] args){
        NoOfOccOfCharInStr nObj=new NoOfOccOfCharInStr();
        String address="Katkol ramdurg belagavi";
        int numberofOcc=nObj.numberOfOccOfCharInStr('a',address);
        System.out.println("Number of Occrance of this chanracter 'a' : "+numberofOcc);
    }
}

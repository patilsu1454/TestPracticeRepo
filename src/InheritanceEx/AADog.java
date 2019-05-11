package InheritanceEx;

public class AADog extends AAAnimal {

    public void walk() {
        System.out.println("AADog walks From SubClass: AADog");
    }

    public void bark() {
        System.out.println("AADog barks From subclass: AADog");
    }


    public static void main(String[] args) {

       AAAnimal an1=new AAAnimal();
       an1.walk();
       System.out.println("**********************************");
       AAAnimal an2=new AADog();
       an2.walk();
       // an2.bark();  not possible
       System.out.println("**********************************");
       AADog dog1=new AADog();
       dog1.walk();
       dog1.bark();

        // AADog tc2=new AAAnimal();  // Incompatible, compile time error when try to assign subclass reference to Superclass object

        //https://dzone.com/articles/working-with-hashcode-and-equals-in-java
        int i= dog1.hashCode();
        System.out.println("HASH CODE- read here  : https://www.journaldev.com/21095/java-equals-hashcode "+i);
        System.out.println("Equals -reference : https://www.journaldev.com/21095/java-equals-hashcode :"+dog1.equals(an2));
        System.out.println("Equals -reference : https://www.journaldev.com/21095/java-equals-hashcode :"+dog1.equals(dog1));



    }

}

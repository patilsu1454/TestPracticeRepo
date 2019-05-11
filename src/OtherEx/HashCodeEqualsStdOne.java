package OtherEx;

public class HashCodeEqualsStdOne {

    /*hashcode(): a method provided by java.lang.Object that returns an integer representation of the object memory address.
    By default, this method returns a random integer that is unique for each instance.
    This integer might change between several executions of the application and won't stay the same.

    https://dzone.com/articles/working-with-hashcode-and-equals-in-java
     */

    private int id;
    private String name;
    public HashCodeEqualsStdOne(int id, String name) {
        this.name = name;
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

     public boolean equals(HashCodeEqualsStdOne obj) {
        if (obj == null) return false;
        if (!(obj instanceof HashCodeEqualsStdOne))
            return false;
        if (obj == this)
            return true;
        return this.getId() ==  obj.getId();
    }

                  /*
                  we consider that two students are equal if they have the same ID, so we override the equals() method
                   */

        /*
          public int hashcode(){
              return  id;
          }
          */

                  /*overriding hashcode(),
                  so let's override it in Student and set it to be equal to the ID
                  so that students who have the same ID are stored in the same bucket:
                   */

}

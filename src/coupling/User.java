package coupling;

public class User {

    // Fields(attributes)
    public String name;

    /*
     Constructor : that gets called when we create a new instance  of a class
     coupling , when we add a new parameter to the constructor we have to change the code in the main class
     public User(String name, int age)
    */

    /* We want minimum dependency between classes*/
    public User(String name) {
        this.name = name;
    }

    // Methods
    public void sayHello() {
        System.out.println("Hello, my name is " + this.name);
    }

}

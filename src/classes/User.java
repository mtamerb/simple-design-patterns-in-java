package classes;

public class User {

    // Fields(attributes)
    public String name;


    // Constructor : that gets called when we create a new instance  of a class

    public User(String name){
        this.name = name;
    }

    // Methods
    public void sayHello(){
        System.out.println("Hello, my name is " + this.name);
    }

}

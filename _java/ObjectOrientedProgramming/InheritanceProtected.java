package _java.ObjectOrientedProgramming;

class ProtectedAnimal {
    // private String name; //! Error: name has private access in ProtectedAnimal
    protected String name;

    protected void display() {
        System.out.println("I am an animal.");
    }
}

class ProtectedDog extends ProtectedAnimal {

    public void getInfo() {
        System.out.println("My name is " + name);
    }
}

class InheritanceProtected {
    public static void main(String[] args) {

        // create an object of the subclass
        ProtectedDog labrador = new ProtectedDog();

        // access protected field and method
        // using the object of subclass
        labrador.name = "Rocky";
        labrador.display();

        labrador.getInfo();
    }
}
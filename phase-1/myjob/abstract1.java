package myjob;
//abstract:it actually don't allow its own implementation, instead it allows its childrens implementation
//abstract has mainly two things to remember: abstract class and abstract method
abstract class parent {
    String name;
    int age;

    parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println("if this shows then you didn't have overwritten");
    }

    // as this is abstract method you have to declare drink method in child class
    // this is not neccessary but it make compulsory for child classes to ad
    // declared method
    abstract void drink();

}

class child1 extends parent {

    child1(String name,int age) {
        super(name, age);
    }

    void drink() {
        System.out.println("child drink");
    }

}

public class abstract1 {

    public static void main(String[] args) {
        child1 child = new child1("alila", 10);
        child.eat();
        child.drink();
        System.out.println(child.name);
        System.out.println(child.age);
    }

}

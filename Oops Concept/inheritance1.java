public class inheritance1 {
public static void main(String[] args) {
    Fish shark = new Fish();
    shark.eat();
}

}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breaths");
    }
}

//Derived class
class Fish extends Animal{
    int fins;
    
    void swim(){
        System.out.println("Swims in water");
    }
}

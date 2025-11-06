class Cat implements Animal {
    public void name(String name){
        System.out.println("Cat");
    }
    public void sound(String sound){
        System.out.println("Meow Meow");
    }
    public void food(String food){
        System.out.println("Fish");
    }
    public String Cleanliness(){
        return "Cats are very clean animals.";
    }
}

class Dog implements Animal {
    public void name(String name){
        System.out.println("Dog");
    }
    public void sound(String sound){
        System.out.println("Bark Bark");
    }
    public void food(String food){
        System.out.println("Bone");
    }
    public String Cleanliness(){
        return "Dogs are not clean animals.";
    }
}

interface Animal{
    void name(String name);
    void sound(String sound);
    void food(String food);
}

public class Interface{
    public static void main(String[] args){
        Animal cat = new Cat();
        cat.name("Cat");
        cat.sound("Meow Meow");
        cat.food("Fish");
        Animal dog = new Dog();
        dog.name("Dog");
        dog.sound("Bark Bark");
        dog.food("Bone");

        //cat.cleanliness(); // This will give error as cleanliness method is not in Animal interface

        Cat c = new Cat();
        System.out.println(c.Cleanliness());
        Dog d = new Dog();
        System.out.println(d.Cleanliness());
    }
}

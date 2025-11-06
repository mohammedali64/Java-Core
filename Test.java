import java.util.HashMap;

public class Test {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        Person p1 = Person.createPerson("ali");
        Person p2 = Person.createPerson("ali");
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }
}

class Person {
    private String name;
    private Person(String name){
        this.name = name;
    }
    private static final HashMap<String,Person> CACHE = new HashMap<>();
    public static Person createPerson(String name){
        if(CACHE.containsKey(name)){
            return CACHE.get(name);
        }else{
            Person p = new Person(name);
            CACHE.put(name,p);
            return p;
        }
    }
    public String getName(){
        return name;
    }
}

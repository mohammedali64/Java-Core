import java.util.HashMap;

// Static factory method pattern implementation
//This implementation is preferred over constructors for object creation in certain scenarios

public class StaticFactoriesMethod {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        Person p1 = Person.createPerson("Ali");
        Person p2 = Person.createPerson("Ali");
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.getPersonName());
        System.out.println(p2.getPersonName());
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
    public String getPersonName(){
        return name;
    }
}


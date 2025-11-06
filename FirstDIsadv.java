/*The main limitation of providing only static factory methods is that
classes without public or protected constructors cannot be subclassed.*/

class Person {
    private Person(String name) { } // private constructor only

    public static Person of(String name) {
        return new Person(name);
    }
}
class Employee extends Person {  // ❌ ERROR
    public Employee(String name) {
        super(name);  // ❌ Cannot access private constructor
    }
}
// To fix this, Person class should have a protected or public constructor

package PassBy;

public class Person {
    String name;
    Person(String name) { this.name = name; }
    @Override
    public String toString() { return "Person{name='" + name + "'}"; }
}

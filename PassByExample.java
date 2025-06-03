package PassBy;

public class PassByExample {
    static void modifyInt(int x) { x = 10; }
    static void modifyObject(Person p) { p.name = "Bob"; }
    static void reassignObject(Person p) { p = new Person("Charlie"); }
    static int modifyint(int x){
        return x+10;
    }
    public static void main(String[] args) {
        int value = 5;
        System.out.println("Value before: " + value);
        modifyInt(value);
        System.out.println("Value after: " + value);
        value = modifyint(5);
        System.out.println(value);
        Person person = new Person("Alice");
        System.out.println("Object before modify: " + person);
        modifyObject(person);
        System.out.println("Object after modify: " + person);
        reassignObject(person);
        System.out.println("Object after reassign: " + person);
    }
}

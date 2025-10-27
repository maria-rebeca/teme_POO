public class Person {
    private String name;
    public Person(String name) { this.name = name; }
    public String getName() { return this.name; }
    public void setName(String newName) { this.name = newName; }
    public static void modify1(Person p) {
        p = new Person("Modified Name");
        System.out.print(p.getName());
    }
    public static void modify2(Person p) {
        p.setName("Modified Name");
        System.out.print(p.getName());
    }
    public static void main(String[] args) {
        Person p = new Person("Initial Person");
        modify1(p);
        System.out.println("Method modify1(Person p):" + p.getName());
        modify2(p);
        System.out.println("Method modify2(Person p):" + p.getName());
    }
}

//modify1 modifica copia locala, nu afecteaza main
//modify2 foloseste copia referintei ca sa modifice date din obiectul initial, afecteaza main

//4.1.2

//class Dog {
//    static int dogCount = 0;
//    public Dog() {
//        dogCount += 1;
//    }
//    public static void main(String[] args) {
//        new Dog();
//        new Dog();
//        new Dog();
//        System.out.println("Dog count is now " + dogCount);
//    }
//}

//daca dogCount ar fi instanta atunci ar fi afisat 1
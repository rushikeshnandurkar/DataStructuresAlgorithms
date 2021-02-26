package doubly_linked_list;

public class Dog {
    private String dogName;
    private int age;

    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "I am " + this.dogName + " and my age is " + this.age + " weeks";
    }

    public String getDogName() {
        return dogName;
    }
}
interface Animal {
    void sound();
}
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog bhaooo");
    }
}
class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meowwwao");
    }
}
class Bird implements Animal {
    public void sound() {
        System.out.println("Bird chi chi chiii");
    }
}
public class Three{
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Bird();

        a1.sound();
        a2.sound();
        a3.sound();
    }
}

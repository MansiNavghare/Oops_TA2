class Student {
    int id;
    String name;

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(); 
        s1.id = 1;
        s1.name = "John";
        s1.display();
    }
}

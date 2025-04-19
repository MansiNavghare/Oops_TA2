class Student {
    String name;

    // Constructor
    Student(String n) {
        name = n;
        System.out.println("Constructor called for " + name);
    }

    // Overloaded Constructor
    Student() {
        name = "Default Name";
        System.out.println("Default Constructor called");
    }

    protected void finalize() {
        System.out.println("Destructor called for " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student();
        s1 = null; 
        s2 = null;
        System.gc(); // Request garbage collection
    }
}

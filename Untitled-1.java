class Box<T> {
    T value;

    Box(T val) {
        value = val;
    }

    void display() {
        System.out.println("Value: " + value);
    }

    <U> void print(U anotherVal) {
        System.out.println("Generic Method Value: " + anotherVal);
    }
}

public class Main {
    public static void main(String[] args) {
        Box<Integer> b = new Box<>(100);
        b.display();
        b.print("Hello");
    }
}

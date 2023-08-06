package Other;

public class oops {
    public static void main(String[] args) {

        Students Akash = new Students(12, "Akash Mishra", 56.5f);
        Students Rahul = new Students(45, "Rahul Sharma", 67.4f);
        Students Default = new Students();
        Students Random = new Students(Akash);
        Students Random2 = new Students();

        // Default
        System.out.println(Default.name);
        System.out.println(Default.marks);
        System.out.println(Default.rollNo);
        // Akash
        System.out.println(Akash.rollNo);
        System.out.println(Akash.name);
        System.out.println(Akash.marks);
        Akash.Greeting();
        // Rahul
        System.out.println(Rahul.marks);
        System.out.println(Rahul.name);
        System.out.println(Rahul.rollNo);
        // Random
        System.out.println(Random.marks);
        System.out.println(Random.rollNo);
        System.out.println(Random.name);
        // Random2
        System.out.println(Random2.marks);
        System.out.println(Random2.rollNo);
        System.out.println(Random2.name);
    }

}

class Students {
    int rollNo;
    String name;
    float marks;

    void Greeting() {
        System.out.println("Hello my name is " + this.name);
    }

    // This function is called when we dont pass any values to the Students function
    // parameter i.e. Default for every object initialized without passing the
    // values For Ex: Default

    // In constructor overloading, a class can have multiple constructors with
    // different parameter lists. This means that different constructors can take
    // different sets of arguments, allowing the programmer to create objects in
    // different ways depending on the needs of the application.

    // Constructor Function
    // For default
    // Students() {
    // this.rollNo = 65;
    // this.marks = 88.f;
    // this.name = "The God";
    // }

    // This function is called when we pass the values at the time of creation of
    // the constructor For Ex: Akash,Rahul
    Students(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Creating a constructor which takes values from the other Students object
    Students(Students other) {
        this.name = other.name;
        this.marks = other.marks;
        this.rollNo = other.rollNo;
    }

    // We can also call a constructor from another constructor
    Students() {
        this(23, "Random Person", 99f);
    }
}

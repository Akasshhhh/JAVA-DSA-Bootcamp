package Methods;

public class classes {
    public static void main(String[] args) {
        String name = "John";
        String test = greet(name);
        System.out.println(test);
        System.out.println(name);
    }

    static String greet(String name) {
        name = "Akash Mishra";
        return "Hello " + name;
    }
}

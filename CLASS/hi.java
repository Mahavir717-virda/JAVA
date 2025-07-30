class class1 {
    static int a;
    static int b;

    static {
        a = 10;
        System.out.println("Value of a is : " + a);
        System.out.println("Static block is called.");
    }
    {
        b=10;
        System.out.println("Valu of B is : "+ b);
        System.out.println("Instance block is called.");
    }
    class1() {
        System.out.println("Constrctor called.");
        System.out.println("Value of a is : " + a);
    }
}

public class hi {
    public static void main(String args[]) {
        class1 c = new class1();
        // c.method();
    }
}
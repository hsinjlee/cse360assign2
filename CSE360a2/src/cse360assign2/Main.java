package cse360assign2;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.add(3);
        c.subtract(1);
        c.multiply(2);
        c.divide(3);
        c.divide(0);
        c.add(1);
        c.multiply(3);
        c.divide(2);
        c.divide(-2);
        c.divide(0);
        c.divide(20);
        c.add(100);
        c.subtract(-101);
        c.subtract(202);
        c.multiply(5);
        c.divide(-4);
        c.divide(0);
        System.out.println(c.getTotal());
        System.out.println(c.getHistory());

    }
}

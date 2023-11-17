public class Main {
    public static void main(String[] args) {
        Consumer<Integer> printer = x-> System.out.printf("%d долларов \n", x);
        printer.accept(600);
    }
}
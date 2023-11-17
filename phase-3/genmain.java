public class genmain {
    public static void main(String[] args) {
        genericTest<Integer> hello = new genericTest<Integer>(23);

        hello.print();
    }
}

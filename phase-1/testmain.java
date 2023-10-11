public class testmain {
    public static void main(String[] args) {

        objectref o1 = new objectref("jhon", 20);
        objectref o2;
        o2 = o1;
        o2.changeDetails("roc", 40);
        System.out.println(o1);
    }
}
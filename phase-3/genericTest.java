public class genericTest<T> {
    T var;

    public genericTest(T i) { 
        this.var = i; 
    }
    public void print(){
        System.out.println(var);
    }
}

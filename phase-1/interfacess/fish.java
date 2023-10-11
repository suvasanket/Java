package interfacess;
public class fish implements prey, predator {

    @Override
    public void flee() {
        System.out.println("fish is fleeing from big fish");

    }

    @Override
    public void hunt() {
        System.out.println("fish is hunting smaller fish");
    }

}

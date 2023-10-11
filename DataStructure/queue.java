import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        //offer = enqueue
        //poll = dequeue
        //queue class is subclass of collection class
        Queue<String> qu = new LinkedList<String>();
        System.out.println(qu.isEmpty());
        
        qu.offer("karen");
        qu.offer("chad");
        qu.offer("steve");
        qu.offer("harold");

        System.out.println(qu.isEmpty());
        System.out.println(qu.peek());//first element entered
        qu.poll();
        System.out.println(qu.contains("chad"));
    

        System.out.println(qu);
    }
}

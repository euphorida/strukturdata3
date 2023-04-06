package modul3;

import java.util.LinkedList;
import java.util.Queue;

public class contoh2 {
    public void queSample(){
        Queue<String> que = new LinkedList<>();
        que.add("Java");
        que.add("DotNet");
        que.offer("PHP");
        que.offer("HTML");
        System.out.println("remove: "+que.remove());
        System.out.println("element: "+que.element());
        System.out.println("poll: "+que.poll());
        System.out.println("peek: "+que.peek());
    }

    public static void main(String[] args) {
        new contoh2().queSample();
    }

}
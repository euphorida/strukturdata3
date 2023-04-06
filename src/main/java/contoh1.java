package modul3;
import java.util.Stack;

public class contoh1 {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        s.push("Aku");
        s.push("Anak");
        s.push("Indonesia");

        System.out.println("Next : "+s.peek());
        s.push("Raya");
        System.out.println(s.pop());
        s.push("!");

        int count = s.search("Aku");
        while (count != -1 && count > 1) {
            s.pop();
            count--;
        }

        System.out.println(s.pop());
        System.out.println(s.empty());
    }
}
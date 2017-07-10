import java.util.Stack;

/**
 * Created by fhani on 7/6/2017.
 */
public class StackDemo {
    public static void main(String[] args) {
        // Stacks are LIFO - last in first out

        Stack<String> st = new Stack<>();

        st.push("bottom");
        printStack(st);
        st.push("second");
        printStack(st);
        st.push("third");
        printStack(st);

        System.out.println();
        System.out.println(st);

        // remove some items
        String popped = st.pop();
        printStack(st);
        st.pop();
        printStack(st);

    }

    public static void printStack(Stack<String> stacks) { //name of parameter doesn't have to be same (st vs. stacks)
        //void b/c just want to print something to screen
        if (stacks.isEmpty()) {
            System.out.println("Stack is empty");
        }
        else {
            System.out.println(stacks + " TOP");
        }
    }
}

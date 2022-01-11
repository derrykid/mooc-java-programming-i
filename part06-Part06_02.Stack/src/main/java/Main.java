import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

		Stack stack = new Stack();
		System.out.println(stack);
		System.out.println(stack.isEmpty());
		System.out.println(stack.getClass());
		System.out.println(stack.values());
		stack.add("playstack");
		System.out.println(stack.isEmpty());
		System.out.println(stack.values());
		stack.add("musicstack");
		System.out.println(stack.values());

		ArrayList<Integer> number = new ArrayList<>();
		number.add(1);
		number.add(2);
		number.add(6);
		System.out.println(number);

    }
}

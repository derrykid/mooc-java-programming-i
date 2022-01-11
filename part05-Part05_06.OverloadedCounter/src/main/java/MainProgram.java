
public class MainProgram {

    public static void main(String[] args) {
        Counter count = new Counter(3);
		count.increase();
		
		System.out.println(count);
		count.increase(4);
		count.decrease(2);
		count.increase(-1);
		System.out.println(count);
    }
}

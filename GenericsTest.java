public class GenericsTest {
	static Pair1<String, Double> bid;


    public static void main(String[] args) {


    bid = new Pair1<>("GGSS", 2.32);

// Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World, yee haw - " + bid.getFirst()+ " - " + bid.getSecond());

    }


public static class Pair1<A,B> {
    	A first;
    	B second;

    	public Pair1(A a, B b) {
    		first = a;
    		second = b;
    	}

    	public A getFirst() { return first; }
    	public B getSecond() { return second; }
    }
}

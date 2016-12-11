public class DLLTest {
	static DoublyLinkedList<String> dlist;

	public static void main(String[] args) {

		dlist = new DoublyLinkedList<>();

		System.out.println("List Size: " + dlist.size());
		dlist.addFirst("Hello");
		dlist.addLast("World");

		System.out.println("List Element: " + dlist.first() + " " + dlist.last());

		System.out.println("List Size: " + dlist.size());
		
	}

}
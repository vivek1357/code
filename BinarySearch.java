
// Printing Arrays - http://javadevnotes.com/java-print-array-examples

public class BinarySearch{

	static int[] a = {10,20,30,40,50,60,70,80,100};  // integer array
	static char[] b = {'a','b','c','d','e','f'};   // character array

	public static void main(String args[]) {
		
		printArray(a);
		printArray(b);
		System.out.println("search(a,20): " + searchArray(a, 20));
		System.out.println("search(b,f): " + searchArray(b, 'f'));
	}

	static int searchArray( int[] a, int x){

		int lo = 0;
		int hi = a.length;

		while ( lo < hi ){
			int i = (lo+hi)/2;

			if (a[i] == x) {
				return i;
			} else if ( a[i] < x) {
				lo = i+1;
			} else {
				hi = i;
			}
		}
	return -1;

	}

static int searchArray( char[] a, char x){

		int lo = 0;
		int hi = a.length;

		while ( lo < hi ){
			int i = (lo+hi)/2;

			if (a[i] == x) {
				return i;
			} else if ( a[i] < x) {
				lo = i+1;
			} else {
				hi = i;
			}
		}
	return -1;

	}
	static void printArray( int[] a ) {

		for (int i = 0; i < a.length; i++) {
         if (i > 0) {
            System.out.print(", ");
         }
         System.out.print(a[i]);
     }
     System.out.println(" ");
	}

static void printArray( char[] a ) {

		for (int i = 0; i < a.length; i++) {
         if (i > 0) {
            System.out.print(", ");
         }
         System.out.print(a[i]);
     }
     System.out.println(" ");
	}
}
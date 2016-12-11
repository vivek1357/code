import java.io.*;

public class diskUsage {

public static void main(String[] args) {
	File path = new File("/Users/asthanav/code");

	diskUse(path);

}


private static long diskUse(File root) {
	long total = root.length();

	if(root.isDirectory()) {
		for (String childname: root.list()) {
			File child = new File(root, childname);
			total += diskUse(child);
		}
		
	}
	System.out.println(total + "\t" + root);
	return total;
}


}

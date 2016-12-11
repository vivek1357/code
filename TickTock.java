//  Chapter-5 Java All in One Book.  Does not compile yet.
//

import java.awt.event.*;
import javax.swing.*;

public class TickTock {

	public static void main( String[] args){

		static ticker  tt = new Ticker();

		Timer t = new Timer(1000, tt);
		t.start();

		JOptionPane.showMessageDialog(null, "Click OK to exit program");
	}

	class Ticker implements ActionListener {

		private boolean tick = true;
		public void actionPerformaned(ActionEvent event) {

			if (tick) {
				System.out.println("Tick...");
			}
			else {
				System.out.println("Tock...");
			}

			tick = !tick;
		}
	}
}
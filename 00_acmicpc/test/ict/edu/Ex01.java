package test.ict.edu;

import java.awt.*;
import java.awt.event.*;


public class Ex01{
	public static void main(String[] args) {
		//Ex01 e1 = new Ex01();
		
		Frame f = new Frame();
		
		f.setTitle("Frame Test");
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
			}
		});
		f.setSize(300, 300);
		f.setVisible(true);
		

	}
	
	

}
/*
class SampleWindowListener extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
*/
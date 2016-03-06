package net.keshen.test;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import net.keshen.base.surface.MainSurface;

public class Test extends JFrame{

	
	public static void main(String[] args) throws Exception {
		Test t = new Test();
		Dimension size = new Dimension(800, 480);
		t.setSize(size);
		t.setUndecorated(true);
		t.setDefaultCloseOperation(EXIT_ON_CLOSE);
		t.setLocationRelativeTo(null);
		Container cp = t.getContentPane();
		//((JPanel)cp).setOpaque(false);
		MainSurface surface = new MainSurface();
		t.setContentPane(surface);
		t.setVisible(true);
		surface.action();
	}
}

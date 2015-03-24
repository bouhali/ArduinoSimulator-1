package it.arduinoproject.gcomponent;

import it.arduinoproject.ecomponent.EComponent;

import java.awt.Graphics;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public abstract class GComponent extends JComponent {

	EComponent comp;

	public GComponent() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		comp.paint(g);
	}

}

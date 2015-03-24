package it.arduinoproject.board.arduino;

import it.arduinoproject.board.AbstractBoard;
import it.arduinoproject.board.AnalogPin;
import it.arduinoproject.board.DigitalPin;
import it.arduinoproject.board.GndPin;
import it.arduinoproject.board.VccPin;

import java.awt.Graphics;

public class Arduino extends AbstractBoard {

	public Arduino(String name) {
		super(name);
		pins.add(new GndPin());
		pins.add(new VccPin(5.0F));
		pins.add(new VccPin(3.3F));
		for (int i = 0; i < 14; i++)
			pins.add(new DigitalPin());
		for (int i = 0; i < 5; i++)
			pins.add(new AnalogPin());
	}

	public void paint(Graphics g) {
		g.drawRect(0, 0, 260, 189);
		g.drawString(name, 130, 95);
	}
}

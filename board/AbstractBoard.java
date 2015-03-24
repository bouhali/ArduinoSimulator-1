package it.arduinoproject.board;

import it.arduinoproject.ecomponent.EComponent;

import java.util.ArrayList;

public class AbstractBoard extends EComponent implements Board {

	protected String name;
	protected Integer status;
	protected ArrayList<AbstractPin> pins;

	public AbstractBoard(String name) {
		this.name = name;
		status = 0;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Integer getNPins() {
		return pins.size();

	}

	@Override
	public Integer getStatus() {
		return this.status;
	}

	@Override
	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public void startProgram() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPin(Integer index, PinMode mode) {
		if (index < pins.size())
			pins.get(index).setMode(mode);

	}

	@Override
	public AbstractPin getPin(Integer index) {
		if (index >= pins.size())
			return null;
		return pins.get(index);
	}
}

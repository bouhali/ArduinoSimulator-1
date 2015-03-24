package it.arduinoproject.board;

public class AnalogPin extends AbstractPin {

	private Integer value;

	public AnalogPin() {
		type = PinType.ANALOGIC;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

}

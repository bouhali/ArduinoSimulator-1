package it.arduinoproject.board;

public class VccPin extends AbstractPin {

	private Float voltage;

	public VccPin(Float voltage) {
		this.type = PinType.VCC;
		this.setVoltage(voltage);
	}

	public Float getVoltage() {
		return voltage;
	}

	public void setVoltage(Float voltage) {
		this.voltage = voltage;
	}

}

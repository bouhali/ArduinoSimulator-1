package it.arduinoproject.board;

public interface Board {
	public String getName();

	public Integer getNPins();

	public Integer getStatus();

	public void setPin(Integer index, PinMode mode);

	public AbstractPin getPin(Integer index);

	public void setStatus(Integer status);

	public void startProgram();
}

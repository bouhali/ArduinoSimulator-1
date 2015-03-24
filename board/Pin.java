package it.arduinoproject.board;

public interface Pin {
	public PinType getType();

	public PinMode getMode();

	public void setMode(PinMode mode);

	public Integer getStatus();

	public void setStatus(Integer status);
}

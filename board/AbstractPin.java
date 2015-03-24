package it.arduinoproject.board;

public abstract class AbstractPin implements Pin {

	protected PinType type;
	protected PinMode mode;
	protected Integer status;

	public AbstractPin() {
		super();
		status = 0;
	}

	@Override
	public PinType getType() {
		return type;
	}

	@Override
	public PinMode getMode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMode(PinMode mode) {
		this.mode = mode;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}

package entities;

import entities.enums.Color;

public abstract class Formas {
	private Color color;

	public Formas() {

	}

	public Formas(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract double area();

}

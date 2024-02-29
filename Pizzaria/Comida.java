package Pizzaria;

public abstract class Comida {
	private double preço;

	public Comida(double preço) {
		super();
		this.preço = preço;
	}
	
	public Comida() {};

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	@Override
	public String toString() {
		return "R$" + String.format("%.2f", this.preço) + "\n";
	}
	
	
}

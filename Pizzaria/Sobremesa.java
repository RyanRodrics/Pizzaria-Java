package Pizzaria;

public class Sobremesa extends Comida{
	String tipo;
	String sabor;
	
	public Sobremesa(String tipo, String sabor) {
		this.tipo = tipo;
		this.sabor = sabor;
		setPreço(this.calculaPreço(tipo, sabor));	
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	public double calculaPreço(String tipo, String sab) {
		double preço=0;
		
		switch(tipo) {
        case "BOLO":
        	preço = 7;
        	break;
        case "TORTA":
        	preço = 8;
        	break;
        case "PICOLÉ":
        	preço = 4;
        	break;
        case "SORVETE":
        	preço = 10;
        	break;
        case "MOUSSE":
        	preço = 6;
        	break;
        case "BROWNE":
        	preço = 5;
        	break;	
        case "PUDIM":
        	preço = 7;
        	break;
        case "PETIT GATEAU":
        	preço = 15;
        	break;
        }
		return preço;
	}

	@Override
	public String toString() {
		return "--------------------------\n" +
				"SOBREMESA " + "\n"+
				"| - " + this.getTipo() + "\n"+
				"| - " + this.getSabor() + "\n" +
				super.toString() + 
				"--------------------------";
	}
	
	
}

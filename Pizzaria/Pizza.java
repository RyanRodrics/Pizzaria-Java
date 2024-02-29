package Pizzaria;

public class Pizza extends Comida {
	private String sabor;
	private String tamanho;
	private String borda;
	
	public Pizza(String sabor, String tamanho, String borda) {
		this.sabor = sabor;
		this.tamanho = tamanho;
		this.borda = borda;
		setPreço(this.calculaPreço(sabor,tamanho,borda));
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getBorda() {
		return borda;
	}

	public void setBorda(String borda) {
		this.borda = borda;
	}
	
	public double calculaPreço(String sabor, String tam, String borda) {
		double preço=0;
		
		switch(sabor) {
        case "CALABRESA":
        	preço = 32;
        	break;
        case "FRANGO C/ CATUPIRI":
        	preço = 43;
        	break;
        case "PORTUGUESA":
        	preço = 39;
        	break;
        case "BAIANA":
        	preço = 41;
        	break;	
        case "CARNE DO SOL":
        	preço = 47;
        	break;
        case "MARGUERITA":
        	preço = 33;
        	break;
        case "FRUTOS DO MAR":
        	preço = 53;
        	break;
        case "BANANA C/ CANELA":
        	preço = 31;
        	break;
        case "CHOCOLATE":
        	preço = 41;
        	break;
        }
		
		switch(tam) {
        case "PEQUENO":
        	preço = (1*preço);
        	break;
        case "MÉDIO":
        	preço = ((1.1)*preço);
        	break;
        case "GRANDE":
        	preço = ((1.3)*preço);
        	break;
        case "FAMILIA":
        	preço = ((1.8)*preço);
        	break;
        }
		
		switch(borda) {
        case "SEM BORDA":
        	break;
        case "CATUPIRI":
        	preço = preço + 2.50;
        	break;
        case "CHEEDAR":
        	preço = preço + 3.75;
        	break;
        }
		
		return preço;
	}

	@Override
	public String toString() {
		return  "--------------------------\n" +
				"PIZZA "+ "\n"+
				"| - " + this.getSabor() + "\n"+
				"| - " + this.getTamanho() + "\n"+
				"| - BORDA: " + this.getBorda() + "\n"+
				super.toString() + 
				"--------------------------";
	}
	
	
}

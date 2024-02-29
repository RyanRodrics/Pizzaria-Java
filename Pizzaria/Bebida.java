package Pizzaria;

public class Bebida extends Comida{
	private String tipo;
	private String tamanho;
	
	public Bebida(String tipo, String tamanho) {
		this.tipo = tipo;
		this.tamanho = tamanho;
		setPreço(this.calculaPreço(tipo,tamanho));
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public double calculaPreço(String tipo, String tam) {
		double preço=0;
		
		switch(tipo) {
		
        case "ÁGUA":
        	preço = 2;
        	break;
        
        case "LARANJA":
        	preço = 10;
        	break;
        case "UVA":
        	preço = 6;
        	break;
        case "MARACUJÁ":
        	preço = 10;
        	break;	
        case "CAJA":
        	preço = 9;
        	break;
        case "LIMONADA":
        	preço = 7;
        	break;
        case "ABACAXI C/ HORTELÃ":
        	preço = 9;
        	break;
        case "ACEROLA":
        	preço = 9.5;
        	break;
        case "GOIABA":
        	preço = 7.9;
        	break;
        case "CAJÚ":
        	preço = 9;
        	break;
        
        case "COCA-COLA":
        	preço = 6.5;
        	break;
        case "PEPSI":
        	preço = 6;
        	break;
        case "GUARANÁ ANTARTICA":
        	preço = 6;
        	break;
        case "FANTA LARANJA":
        	preço = 6;
        	break;	
        case "FANTA UVA":
        	preço = 6;
        	break;
        case "FANTA MARACUJÁ":
        	preço = 6;
        	break;
        case "LIPTON":
        	preço = 5;
        	break;
        case "SPRITE":
        	preço = 7;
        	break;
        case "GUARANÁ JESUS":
        	preço = 7;
        	break;
        
        case "HEINEKEN":
        	preço = 9;
        	break;
        case "SKOL":
        	preço = 6.5;
        	break;
        case "PETRA":
        	preço = 7;
        	break;
        case "ITAIPAVA":
        	preço = 6;
        	break;	
        case "STELLA ARTOIS":
        	preço = 8.9;
        	break;
        case "AMSTEL":
        	preço = 7.5;
        	break;
        case "BUDWEISER":
        	preço = 9;
        	break;
        case "BRAHMA":
        	preço = 8;
        	break;
        case "KAISER":
        	preço = 7.5;
        	break;
        }
		
		switch(tam) {
        case "350ML":
        	preço =  (1*preço);
        	break;
        case "500ML":
        	preço =  ((1.2)*preço);
        	break;
        case "1 LITRO":
        	preço =  ((2)*preço);
        	break;
        case "LATINHA":
        	preço =  (1*preço);
        	break;
        case "COPO":
        	preço =  (1*preço);
        	break;
        case "JARRA":
        	preço =  (1.5*preço);
        	break;
        case "1.5 LITROS":
        	preço =  (2.2*preço);
        	break;
        case "2 LITROS":
        	preço = (2.5*preço);
        	break;
        }
		
		
		return preço ;
	}

	@Override
	public String toString() {
		return "--------------------------\n" +
				"BEBIDA " + "\n"+
				"| - " + this.getTipo() + "\n"+
				"| - " + this.getTamanho() + "\n" +
				super.toString() + 
				"--------------------------";
	}
	
}

package Pizzaria;

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Pedido {

    public Pizza lePizza (){
    	String menu = "";
        String entrada;
        String tamanho ="";
        int opc1, opc2,opc3;
        String sabor ="";
        String borda = "";
        do {
            menu = "SABORES\n" +
                    "Opções:\n" +
                    "1. Calabresa\n" +
                    "2. Frango c/ Catupiri\n" +
                    "3. Portuguesa\n" +
                    "4. Baiana\n" +
                    "5. Carne do Sol\n" +
                    "6. Marguerita\n" +
                    "7. Frutos do Mar\n" +
                    "8. Banana c/ canela\n" +
                    "9. Chocolate\n" ;
            entrada = JOptionPane.showInputDialog (menu + "\n\n");
            
            while (!numeroInteiroValido(entrada)) {
                entrada = JOptionPane.showInputDialog(null, menu +
                        "\n\nEntrada inválida! Digite um número inteiro.");
            }
            opc1 = Integer.parseInt(entrada);
            
            switch(opc1) {
            case 1:
            	sabor = "CALABRESA";
            	break;
            case 2:
            	sabor = "FRANGO C/ CATUPIRI";
            	break;
            case 3:
            	sabor = "PORTUGUESA";
            	break;
            case 4:
            	sabor = "BAIANA";
            	break;	
            case 5:
            	sabor = "CARNE DO SOL";
            	break;
            case 6:
            	sabor = "MARGUERITA";
            	break;
            case 7:
            	sabor = "FRUTOS DO MAR";
            	break;
            case 8:
            	sabor = "BANANA C/ CANELA";
            	break;
            case 9:
            	sabor = "CHOCOLATE";
            	break;
            }
        } while (opc1 > 9 || opc1<1 );
        do {
        menu = "TAMANHOS\n" +
                    "Opções:\n" +
                    "1. Pequeno(individual)\n" +
                    "2. Médio(2 Pessoas)\n" +
                    "3. Grande(4 Pessoas)\n" +
                    "4. Familia(6 Pessoas)\n" ;
            entrada = JOptionPane.showInputDialog (menu + "\n\n");

            while (!numeroInteiroValido(entrada)) {
                entrada = JOptionPane.showInputDialog(null, menu +
                        "\n\nEntrada inválida! Digite um número inteiro.");
            }
            opc2 = Integer.parseInt(entrada);
            
            
            switch(opc2) {
            case 1:
            	tamanho = "PEQUENO";
            	break;
            case 2:
            	tamanho = "MÉDIO";
            	break;
            case 3:
            	tamanho = "GRANDE";
            	break;
            case 4:
            	tamanho = "FAMILIA";
            	break;
            }
        }while(opc2 > 4 || opc2 < 1);
        do {
            menu = "BORDAS\n" +
                        "Opções:\n" +
                        "1. Sem Borda\n" +
                        "2. Catupiri\n" +
                        "3. Cheedar\n" ;
                entrada = JOptionPane.showInputDialog (menu + "\n\n");

                while (!numeroInteiroValido(entrada)) {
                    entrada = JOptionPane.showInputDialog(null, menu +
                            "\n\nEntrada inválida! Digite um número inteiro.");
                }
                opc3 = Integer.parseInt(entrada);
                switch(opc3) {
                case 1:
                	borda = "SEM BORDA";
                	break;
                case 2:
                	borda = "CATUPIRI";
                	break;
                case 3:
                	borda = "CHEEDAR";
                	break;
                }
            }while(opc3 > 3 || opc3 < 1);
        Pizza atlPiz = new Pizza (sabor,tamanho,borda);
        return atlPiz;
    }

    public Bebida leBebida (){
    	String menu = "";
        String entrada;
        int opc1, opc2,opc3;
        String tipo ="";
        String tamanho = "";
    	
    	do {
            menu = "BEBIDAS\n" +
                        "Opções:\n" +
                        "1. Água\n" +
                        "2. Suco\n" +
                        "3. Refrigerante\n"+
                        "4. Cerveja\n";
                entrada = JOptionPane.showInputDialog (menu + "\n\n");

                while (!numeroInteiroValido(entrada)) {
                    entrada = JOptionPane.showInputDialog(null, menu +
                            "\n\nEntrada inválida! Digite um número inteiro.");
                }
                opc3 = Integer.parseInt(entrada);
                switch(opc3) {
                case 1:
                	do {
                	menu = "ÁGUA\n" +
                            "Tamanho:\n" +
                            "1. 350 ml\n" +
                            "2. 500 ml\n" +
                            "3. 1 Litro\n";
                	tipo = "ÁGUA";
                	entrada = JOptionPane.showInputDialog (menu + "\n\n");

                     while (!numeroInteiroValido(entrada)) {
                         entrada = JOptionPane.showInputDialog(null, menu +
                                 "\n\nEntrada inválida! Digite um número inteiro.");
                     }
                     opc2 = Integer.parseInt(entrada);
                     switch(opc2) {
                     case 1:
                    	 tamanho = "350ML";
                    	 break;
                     
                	case 2:
                		tamanho = "500ML";
                		break;
                	case 3:
                		tamanho = "1L";
                		break;
                    }
                	}while(opc2>3 || opc2 <1);
                	break;
                case 2:
                	do {
                	menu = "SUCOS\n" +
                            "Sabores:\n" +
                            "1. Laranja\n" +
                            "2. Uva\n" +
                            "3. Maracujá\n"+
                            "4. Cajá\n" +
                            "5. Limonada\n" +
                            "6. Abacaxi c/ hortelã\n"+
                            "7. Acerola\n" +
                            "8. Goiaba\n" +
                            "9. Cajú\n";
                	entrada = JOptionPane.showInputDialog (menu + "\n\n");

                     while (!numeroInteiroValido(entrada)) {
                         entrada = JOptionPane.showInputDialog(null, menu +
                                 "\n\nEntrada inválida! Digite um número inteiro.");
                     }
                     opc1 = Integer.parseInt(entrada);
                     switch(opc1) {
                     case 1:
                     	tipo = "LARANJA";
                     	break;
                     case 2:
                     	tipo = "UVA";
                     	break;
                     case 3:
                     	tipo = "MARACUJÁ";
                     	break;
                     case 4:
                     	tipo = "CAJA";
                     	break;	
                     case 5:
                     	tipo = "LIMONADA";
                     	break;
                     case 6:
                     	tipo = "ABACAXI C/ HORTELÃ";
                     	break;
                     case 7:
                     	tipo = "ACEROLA";
                     	break;
                     case 8:
                     	tipo = "GOIABA";
                     	break;
                     case 9:
                     	tipo = "CAJÚ";
                     	break;
                     }
                 } while (opc1 > 9 || opc1<1 );
                	do {
                    	menu = "SUCO DE " + tipo+"\n" +
                                "Tamanho:\n" +
                                "1. Copo\n" +
                                "2. Jarra\n" ;
                    	entrada = JOptionPane.showInputDialog (menu + "\n\n");

                         while (!numeroInteiroValido(entrada)) {
                             entrada = JOptionPane.showInputDialog(null, menu +
                                     "\n\nEntrada inválida! Digite um número inteiro.");
                         }
                         opc2 = Integer.parseInt(entrada);
                         switch(opc2) {
                         case 1:
                        	 tamanho = "COPO";
                        	 break;
                         
                    	case 2:
                    		tamanho = "JARRA";
                    		break;
                    	
                        }
                    	}while(opc2>2 || opc2 <1);
                	break;
                case 3:
                	do {
                    	menu = "REFRIGERANTES\n" +
                                "Sabores:\n" +
                                "1. Coca-cola\n" +
                                "2. Pepsi\n" +
                                "3. Guaraná Antartica\n"+
                                "4. Fanta Laranja\n" +
                                "5. Fanta Uva\n" +
                                "6. Fanta Maracujá\n"+
                                "7. Lipton\n" +
                                "8. Sprite\n" +
                                "9. Guaraná Jesus\n";
                    	entrada = JOptionPane.showInputDialog (menu + "\n\n");

                         while (!numeroInteiroValido(entrada)) {
                             entrada = JOptionPane.showInputDialog(null, menu +
                                     "\n\nEntrada inválida! Digite um número inteiro.");
                         }
                         opc1 = Integer.parseInt(entrada);
                         switch(opc1) {
                         case 1:
                         	tipo = "COCA-COLA";
                         	break;
                         case 2:
                         	tipo = "PEPSI";
                         	break;
                         case 3:
                         	tipo = "GUARANÁ ANTARTICA";
                         	break;
                         case 4:
                         	tipo = "FANTA LARANJA";
                         	break;	
                         case 5:
                         	tipo = "FANTA UVA";
                         	break;
                         case 6:
                         	tipo = "FANTA MARACUJÁ";
                         	break;
                         case 7:
                         	tipo = "LIPTON";
                         	break;
                         case 8:
                         	tipo = "SPRITE";
                         	break;
                         case 9:
                         	tipo = "GUARANÁ JESUS";
                         	break;
                         }
                     } while (opc1 > 9 || opc1<1 );
                    	do {
                        	menu = tipo+"\n" +
                                    "Tamanho:\n" +
                                    "1. Latinha(350 ml)\n" +
                                    "2. 1 Litro\n" +
                                    "3. 1.5 Litros\n"+
                                    "4. 2 Litros\n";
                        	entrada = JOptionPane.showInputDialog (menu + "\n\n");

                             while (!numeroInteiroValido(entrada)) {
                                 entrada = JOptionPane.showInputDialog(null, menu +
                                         "\n\nEntrada inválida! Digite um número inteiro.");
                             }
                             opc2 = Integer.parseInt(entrada);
                             switch(opc2) {
                             case 1:
                            	 tamanho = "LATINHA";
                            	 break;
                             
                        	case 2:
                        		tamanho = "1 LITRO";
                        		break;
                        	case 3:
                        		tamanho = "1.5 LITROS";
                        		break;
                        	case 4:
                        		tamanho = "2 LITROS";
                        		break;
                            }
                        	}while(opc2>4 || opc2 <1);
                	break;
                case 4:
                	do {
                    	menu = "CERVEJAS\n" +
                                "Sabores:\n" +
                                "1. Heineken\n" +
                                "2. Skol\n" +
                                "3. Petra\n"+
                                "4. Itaipava\n" +
                                "5. Stella Artois\n" +
                                "6. Amstel\n"+
                                "7. Budweiser\n" +
                                "8. Brahma\n" +
                                "9. Kaiser\n";
                    	entrada = JOptionPane.showInputDialog (menu + "\n\n");

                         while (!numeroInteiroValido(entrada)) {
                             entrada = JOptionPane.showInputDialog(null, menu +
                                     "\n\nEntrada inválida! Digite um número inteiro.");
                         }
                         opc1 = Integer.parseInt(entrada);
                         switch(opc1) {
                         case 1:
                         	tipo = "HEINEKEN";
                         	break;
                         case 2:
                         	tipo = "SKOL";
                         	break;
                         case 3:
                         	tipo = "PETRA";
                         	break;
                         case 4:
                         	tipo = "ITAIPAVA";
                         	break;	
                         case 5:
                         	tipo = "STELLA ARTOIS";
                         	break;
                         case 6:
                         	tipo = "AMSTEL";
                         	break;
                         case 7:
                         	tipo = "BUDWEISER";
                         	break;
                         case 8:
                         	tipo = "BRAHMA";
                         	break;
                         case 9:
                         	tipo = "KAISER";
                         	break;
                         }
                     } while (opc1 > 9 || opc1<1 );
                    	do {
                        	menu = tipo+"\n" +
                                    "Tamanho:\n" +
                                    "1. Latinha(350 ml)\n" +
                                    "2. 1 Litro\n";
                        	entrada = JOptionPane.showInputDialog (menu + "\n\n");

                             while (!numeroInteiroValido(entrada)) {
                                 entrada = JOptionPane.showInputDialog(null, menu +
                                         "\n\nEntrada inválida! Digite um número inteiro.");
                             }
                             opc2 = Integer.parseInt(entrada);
                             switch(opc2) {
                             case 1:
                            	 tamanho = "LATINHA";
                            	 break;
                             
                        	case 2:
                        		tamanho = "1 LITRO";
                        		break;
                       
                            }
                        	}while(opc2>2 || opc2 <1);
                	break;
                }
            }while(opc3 > 4 || opc3 < 1);

        Bebida atlBeb = new Bebida (tipo,tamanho);
        return atlBeb;
    }

    public Sobremesa leSobremesa (){
    	String menu = "";
        String entrada;
        int opc1;
        String tipo = "";
        String sabor = "";

        do {
            menu = "TIPO\n" +
                    "Opções:\n" +
                    "1. Bolo\n" +
                    "2. Torta\n" +
                    "3. Picolé\n" +
                    "4. Sorvete\n" +
                    "5. Mousse\n" +
                    "6. Browne\n" +
                    "7. Pudim\n" +
                    "8. Petit Gateau\n";
            entrada = JOptionPane.showInputDialog (menu + "\n\n");
            
            while (!numeroInteiroValido(entrada)) {
                entrada = JOptionPane.showInputDialog(null, menu +
                        "\n\nEntrada inválida! Digite um número inteiro.");
            }
            opc1 = Integer.parseInt(entrada);
            switch(opc1) {
            case 1:
            	tipo = "BOLO";
            	break;
            case 2:
            	tipo = "TORTA";
            	break;
            case 3:
            	tipo = "PICOLÉ";
            	break;
            case 4:
            	tipo = "SORVETE";
            	break;	
            case 5:
            	tipo = "MOUSSE";
            	break;
            case 6:
            	tipo = "BROWNE";
            	break;
            case 7:
            	tipo = "PUDIM";
            	break;
            case 8:
            	tipo = "PETIT GATEAU";
            	break;
            }
        } while (opc1 > 8 || opc1<1 );
            
        if (tipo == "BOLO" || tipo == "TORTA" || tipo == "PICOLÉ" || tipo == "MOUSSE" || tipo == "SORVETE") {
        	do {
            	menu = "SABORES\n" +
                        "Opções:\n" +
                        "1. Chocolate\n" +
                        "2. Morango\n" +
                        "3. Limão\n";
            	entrada = JOptionPane.showInputDialog (menu + "\n\n");

                 while (!numeroInteiroValido(entrada)) {
                     entrada = JOptionPane.showInputDialog(null, menu +
                             "\n\nEntrada inválida! Digite um número inteiro.");
                 }
                 opc1 = Integer.parseInt(entrada);
                 switch(opc1) {
                 case 1:
                 	sabor = "CHOCOLATE";
                 	break;
                 case 2:
                 	sabor = "MORANGO";
                 	break;
                 case 3:
                 	sabor = "LIMÃO";
                 	break;
                 }
             } while (opc1 > 3 || opc1<1 );
        }
    
        else {
        		sabor = "TRADICIONAL";
        }

        Sobremesa atlSob = new Sobremesa (tipo, sabor);
        return atlSob;
    }

    public void mostraPedido (String dados){
        JOptionPane.showMessageDialog(null,"PEDIDO\n-------\n +" + dados);
    }
    
    public String mostrarPreçoTotal(ArrayList<Comida> comidas) {
    	double preçoTotal = 0;
    	for(Comida comida : comidas) {
    		preçoTotal = preçoTotal + comida.getPreço();
    	}
    	return "--------------------------\n" +"Preço Total: "+
    	String.format("%.2f", preçoTotal)+
    	"\n--------------------------\n";
    }
    
    public void gerarComanda(ArrayList<Comida> comidas, String nome) {
    	Path path = Path.of("C:\\\\Users\\\\Ryan\\\\eclipse-workspace\\\\javaprojects\\\\TrabTest01\\\\src\\\\Pizzaria\\\\Comanda.txt");
    	
    	try {
    	  	if(Files.notExists(path)) {
        		Files.createFile(path);
        	}
    	  	String texto = "--------------------------\n" + "CLIENTE: " + nome + "\n--------------------------\n";
      		for (Comida comida : comidas) {
      			texto = texto + "\n" + comida.toString();
        	}
      		texto = texto + "\n" + mostrarPreçoTotal(comidas);
       		byte[] bytes = texto.getBytes();
    		Files.write(path, bytes); 		
    	} catch (IOException ex) {
            ex.printStackTrace();
        } 
    }

    
    public void menuPedido (){

        ArrayList<Comida> comidas = new ArrayList<Comida>();
        
        String nome;
        String menu = "";
        String entrada;
        int opc1, opc2;

        do {
            menu = "Controle de Comanda\n" +
                    "Opções:\n" +
                    "1. Adicionar ao Pedido\n" +
                    "2. Exibir Pedido\n" +
                    "3. Limpar Pedido\n" +
                    "4. Gravar Pedido\n" +
                    "9. Sair";
            entrada = JOptionPane.showInputDialog (menu + "\n\n");

            while (!numeroInteiroValido(entrada)) {
                entrada = JOptionPane.showInputDialog(null, menu +
                        "\n\nEntrada inválida! Digite um número inteiro.");
            }
            opc1 = Integer.parseInt(entrada);

            switch (opc1) {
                case 1:// Entrar dados
                    menu = "Entrada de Pedido\n" +
                            "Opções:\n" +
                            "1. Pizza\n" +
                            "2. Bebida\n"+
                            "3. Sobremesa\n";

                    entrada = JOptionPane.showInputDialog (menu + "\n\n");
                    while (!numeroInteiroValido(entrada)) {
                        entrada = JOptionPane.showInputDialog(null, menu +
                                "\n\nEntrada inválida! Digite um número inteiro.");
                    }
                    opc2 = Integer.parseInt(entrada);

                    switch (opc2){
                        case 1: comidas.add((Comida) lePizza());
                            break;
                        case 2: comidas.add((Comida) leBebida());
                            break;
                        case 3: comidas.add((Comida) leSobremesa());
                        	break;
                        default:
                            JOptionPane.showMessageDialog(null,"Item para entrada NÃO escolhido!");
                    }

                    break;
                case 2: // Exibir dados
                    if (comidas.size() == 0) {
                        JOptionPane.showMessageDialog(null,"Entre com itens primeiramente");
                        break;
                    }
                    String dados = "";
                    for (int i=0; i < comidas.size(); i++)	{
                        dados += comidas.get(i).toString() + "\n";
                    }
                    dados += mostrarPreçoTotal(comidas);
                    JOptionPane.showMessageDialog(null,dados);
                    break;
                case 3: // Limpar Dados
                    if (comidas.size() == 0) {
                        JOptionPane.showMessageDialog(null,"Entre com itens primeiramente");
                        break;
                    }
                    comidas.clear();
                    JOptionPane.showMessageDialog(null,"Dados LIMPOS com sucesso!");
                    break;
                case 4: // Grava Dados
                    if (comidas.size() == 0) {
                        JOptionPane.showMessageDialog(null,"Entre com itens primeiramente");
                        break;
                    } 
                    nome = JOptionPane.showInputDialog ("Nome do Cliente:\n\n");
                    gerarComanda(comidas, nome);
                    JOptionPane.showMessageDialog(null,"Dados SALVOS com sucesso!");
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null,"Fim do aplicativo PEDIDOS");
                    break;
            }
        } while (opc1 != 9);
    }

    private boolean numeroInteiroValido(String s) {
        boolean resultado;
        try {
            Integer.parseInt(s);
            resultado = true;
        } catch (NumberFormatException e) {
            resultado = false;
        }
        return resultado;
    }

    public static void main (String [] args){
        Pedido del = new Pedido ();
        del.menuPedido();
        
    }
    
}
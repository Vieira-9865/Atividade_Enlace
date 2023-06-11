package Pacotes;

import java.util.Scanner;

public class Main {


	    public static void main(String[] args) {

	        Roteador roteador1 = new Roteador("Roteador 1");
	        Roteador roteador2 = new Roteador("Roteador 2");
	        Roteador roteador3 = new Roteador("Roteador 3");
	        Roteador roteador4 = new Roteador("Roteador 4");
	        Roteador roteador5 = new Roteador("Roteador 5");


	        roteador1.adicionarEnlace(roteador2, 2);
	        roteador1.adicionarEnlace(roteador3, 4);
	        roteador4.adicionarEnlace(roteador1, 1);
	        roteador2.adicionarEnlace(roteador3, 1);
	        roteador2.adicionarEnlace(roteador4, 5);
	        roteador3.adicionarEnlace(roteador4, 3);
	        roteador4.adicionarEnlace(roteador5, 2);


	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite o nome do roteador de origem: ");
	        String nomeOrigem = scanner.nextLine();
	        System.out.print("Digite o nome do roteador de destino: ");
	        String nomeDestino = scanner.nextLine();


	        Roteador roteadorOrigem = null;
	        Roteador roteadorDestino = null;

	        if (roteador1.getNome().equalsIgnoreCase(nomeOrigem)) {
	            roteadorOrigem = roteador1;
	        } else if (roteador2.getNome().equalsIgnoreCase(nomeOrigem)) {
	            roteadorOrigem = roteador2;
	        } else if (roteador3.getNome().equalsIgnoreCase(nomeOrigem)) {
	            roteadorOrigem = roteador3;
	        } else if (roteador4.getNome().equalsIgnoreCase(nomeOrigem)) {
	            roteadorOrigem = roteador4;
	        } else if (roteador5.getNome().equalsIgnoreCase(nomeOrigem)) {
	            roteadorOrigem = roteador5;
	        }

	        if (roteador1.getNome().equalsIgnoreCase(nomeDestino)) {
	            roteadorDestino = roteador1;
	        } else if (roteador2.getNome().equalsIgnoreCase(nomeDestino)) {
	            roteadorDestino = roteador2;
	        } else if (roteador3.getNome().equalsIgnoreCase(nomeDestino)) {
	            roteadorDestino = roteador3;
	        } else if (roteador4.getNome().equalsIgnoreCase(nomeDestino)) {
	            roteadorDestino = roteador4;
	        } else if (roteador5.getNome().equalsIgnoreCase(nomeDestino)) {
	            roteadorDestino = roteador5;
	        }


	        if (roteadorOrigem != null && roteadorDestino != null) {
	            System.out.println("Enviando pacote de " + roteadorOrigem.getNome() + " para " + roteadorDestino.getNome());
	            roteadorOrigem.enviarPacote(roteadorDestino);
	        } else {
	            System.out.println("Roteadores de origem ou destino não encontrados.");
	        }
	    }

}

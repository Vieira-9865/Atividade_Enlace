package Pacotes;

import java.util.HashMap;
	import java.util.Map;

public class Roteador {

	    private String nome;
	    private Map<Roteador, Integer> enlaces;

	    public Roteador(String nome) {
	        this.nome = nome;
	        this.enlaces = new HashMap<>();
	    }

	    public void adicionarEnlace(Roteador roteadorDestino, int peso) {

			enlaces.put(roteadorDestino, peso);
	    }

	    public void enviarPacote(Roteador roteadorDestino) {
	        if (roteadorDestino == this) {
	            System.out.println("Pacote chegou ao destino: " + nome);
	        } else {
	            int pesoMenor = Integer.MAX_VALUE;
	            Roteador proximoRoteador = null;

	            for (Map.Entry<Roteador, Integer> enlace : enlaces.entrySet()) {
	                if (enlace.getValue() < pesoMenor) {
	                    pesoMenor = enlace.getValue();
	                    proximoRoteador = enlace.getKey();
	                }
	            }

	            if (proximoRoteador != null) {
	                System.out.println("Enviando pacote de " + nome + " para " + proximoRoteador.getNome());
	                proximoRoteador.enviarPacote(roteadorDestino);
	            } else {
	                System.out.println("Não foi possível enviar o pacote para " + roteadorDestino.getNome());
	            }
	        }
	    }

	    public String getNome() {

			return nome;
	    }
}

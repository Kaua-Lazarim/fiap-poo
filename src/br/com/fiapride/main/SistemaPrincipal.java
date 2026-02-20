package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Martelo;

public class SistemaPrincipal {

    public static void main(String[] args) {
    	// Dentro do main...// Fabriquei a primeira (Instância 1)
		Martelo meuMartelo = new Martelo();
    	meuMartelo.modelo = "Bola";
    	meuMartelo.material = "Borracha";
    	meuMartelo.peso = 1.00;
    	// Fabriquei a segunda (Instância 2)
		Martelo marteloDoProfessor = new Martelo();
    	marteloDoProfessor.modelo = "Unha";
    	marteloDoProfessor.material = "Alumínio";
    	marteloDoProfessor.peso = 1.50;
    	System.out.println("Meu martelo é de: " + meuMartelo.material);
    	System.out.println("Modelo do meu martelo: " + meuMartelo.modelo);
    	System.out.println("Peso do meu martelo: " + meuMartelo.peso);
    	System.out.println();
    	System.out.println("O do professor é de: " + marteloDoProfessor.material);
    	System.out.println("Modelo do Professor: " + marteloDoProfessor.modelo);
    	System.out.println("Peso do martelo do professor: " + marteloDoProfessor.peso);
    }
}
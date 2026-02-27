package br.com.fiapride.model;
public class Martelo { // <-- Use o nome do SEU objeto    
    // As características que você pensou    
    public String material;
    public double peso;
    public String modelo;
    
    
    public Martelo(String material, String modelo) {
        this.material = material;
        this.modelo = modelo; // Novo Atributo
        this.peso = 0.0;
    }
    
    public void tirarPrego(String modelo) {
        // Regra de negócio: O valor da recarga deve ser positivo
        if (modelo == "Unha") {
            System.out.println("Seu martelo tira prego");
            return; // Interrompe a execução do método
        }
        else {
        	System.out.println("Seu martelo não tira prego");
            return; // Interrompe a execução do método
        }
    }
    
    public void desempenarVidro(String material) {
        // Regra de negócio: O valor da recarga deve ser positivo
        if (material == "Borracha") {
            System.out.println("Seu martelo n quebra vidro");
            return; // Interrompe a execução do método
        }
        else {
        	System.out.println("Seu martelo quebra vidro");
            return; // Interrompe a execução do método
        }
    }
}


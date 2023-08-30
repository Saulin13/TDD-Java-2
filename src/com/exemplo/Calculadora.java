package com.exemplo;

public class Calculadora {
	
	 public double soma(double a, double b) {
			
	        return a + b;
	    }
	 
	 public double subtracao(double a, double b) {
	        return a - b;
	    }

	 public double divisao(double a, double b) {
	        if (b == 0) {
	            System.out.println("Erro: Divisão por zero.");
	            return 0.0;
	        }
	        return a / b;
	    }
  
	public static double multiplicacao(double a, double b) {
	        return a * b;
	    }

	public double porcentagem(double valor, double porcentagem) {
		if (porcentagem < 0 || porcentagem > 100) {
            System.out.println("A porcentagem deve estar entre 0 e 100.");
            return 0;
        }
        
        return (valor * porcentagem) / 100.0;
    }
	    
	}



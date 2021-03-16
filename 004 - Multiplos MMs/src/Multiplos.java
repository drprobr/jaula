import java.util.Scanner;

class Multiplos {

    public static void main (String args[]){
    	
    	Scanner ler = new Scanner(System.in);
    	
    	int num = 0;
    	
    	while(num < 1 || num > 10) {
        	System.out.print("Número: ");
        	num = ler.nextInt();    		
    	}
    	
    	for(int i=num;i<101;i++){

    		if(i%15==0) {
    			System.out.println("M15");
    		}else {
        		if(i%10==0) {
        			System.out.println("M10");
        		}else {
            		if(i%5==0) {
            			System.out.println("M5");
            		}else {
            			System.out.println(i);
            		}
        		}
    		}
    		
    	}
    	
    	ler.close();
    
    }
}

/*
[ok] Elabore um programa que receba um número entre 1 e 10.

[ok] Imprima na tela todos os números do número informado até 100.

Múltiplos de 5 imprimir na tela apenas M5 
Múltiplos de 10 imprimir na tela apenas M10 
Múltiplos de 15 imprimir na tela apenas M15 
   
9 
M10 
11 
12 
13 
14
M15
16
17
18
19
M10
21
22
... 
98
99
M10





Elabore um programa que receba um número entre 1 e 10, e imprima na tela todos os números do número informado até 100,  caso seja uma das situaçõess abaixo, apenas seus múltiplos (M): 
  
Múltiplos de 5 imprimir na tela apenas M5 
Múltiplos de 10 imprimir na tela apenas M10 
Múltiplos de 15 imprimir na tela apenas M15 
  
Caso o número (ex: 30) seja múltiplo de 5, 10 e 15, deverá ser impresso o maior múltiplo, no caso, M15. 
 
9 
M10 
11 
12 
13 
14
M15
16
17
18
19
M10
21
22
... 
98
99
M10 
*/
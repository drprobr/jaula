import java.util.Scanner;

class Multiplos {

    public static void main (String args[]){
    	int num = 0;
    	
    	Scanner ler = new Scanner(System.in);
    	
    	while(num<1 || num>10){
        	System.out.print("Informe um número: ");
        	num = ler.nextInt();    		
    	}
    	
    	System.out.println("Número informado: " +num);
    	
    	for(int i=num;i<101;i++) {
    		
    		if(i%15==0){
    			System.out.println("M15");
    		}else{
        		if(i%10==0){
        			System.out.println("M10");
        		}else{
            		if(i%5==0){
            			System.out.println("M5");
            		}else{
            			System.out.println(i);
            		}
        		}
    		}
    	}
    	ler.close();
    }
}

























/*

@@ Verificarei às 10:20hs 
 
Elabore um programa que receba um número entre 1 e 10.

Imprima na tela todos os números, a partir do número informado acima até 100.

Na contagem realizada acima, considere:

Múltiplos de 5 imprimir na tela apenas M5 
Múltiplos de 10 imprimir na tela apenas M10 
Múltiplos de 15 imprimir na tela apenas M15 

Caso o número seja múltiplo de M10 e M5 por exemplo, 
deverá ser impresso apenas o maior caso, o mesmo se aplica ao M15.

Ex: Suponha que o usuário informou o número 9:

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
package expoente;

import java.util.Scanner;

public class Expoente {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Calculo de Potencia");
		System.out.println();
		System.out.print("Digite a Base>" );
		float base = entrada.nextFloat();
		System.out.print("Digite o Expoente> ");
		float expoente = entrada.nextFloat();
		float result=1;
		if(base == 0 && expoente < 0) {
			System.out.print("Infinito");
		}else {	
			if(expoente > 0) {
				for (int i=0;i<expoente;i++){
				result = result * base;
				}
			}else{
				for (int i=0;i>expoente;i--){
				result = result / base;
				}
			}
			if(result>=0 && base < 0 && expoente < 0) {
			System.out.print(-result);
			}else{
				if(result==(int)result) {
				System.out.print((int)result);
				}else {
				System.out.print(result);	
				}
			}
			
		}
		
	}

}

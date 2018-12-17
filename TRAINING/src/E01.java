import java.util.Scanner;

public class E01 {
	public static void main(String[] args) {		
		System.out.println("Digite o número:");
		int numero=new Scanner(System.in).nextInt();
		if(numero%3==0 && numero%7==0)System.out.println("O número digitado é multiplo de 3 e 7");
		else System.out.println("O número digitado não é multiplo de 3 e 7");
	}
}

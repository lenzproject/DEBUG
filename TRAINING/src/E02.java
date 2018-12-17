import java.util.Scanner;
public class E02 {

	public static void main(String[] args) {
		
		System.out.println("Digite 1-Área ou 2-Perímetro:");
		double input=new Scanner(System.in).nextDouble();
		switch((int)input)
		{
			case 1:
				System.out.println("Escolha entre 1-Circulo, 2-Quadrado ou 3-Retângulo");
				input=new Scanner(System.in).nextDouble();
				switch((int)input)
				{
					case 1:
						System.out.println("Digite o raio:");
						input=new Scanner(System.in).nextDouble();
						System.out.print("A área do circulo é igual a: "+(3.14*Math.pow(input,2)));
						break;
					case 2:
						System.out.println("Digite o lado:");
						input=new Scanner(System.in).nextDouble();
						System.out.println("A área do quadrado é igual a: "+Math.pow(input,2));
						break;
					case 3:
						System.out.println("Digite o 1º lado:");
						input=new Scanner(System.in).nextDouble();
						System.out.println("Digite o 2º lado:");
						input*=new Scanner(System.in).nextDouble();
						System.out.println("A  área do retângulo é igual a: "+input);
						break;			
				}
				break;
			case 2:
				System.out.println("Escolha entre 1-Circulo, 2-Quadrado ou 3-Retângulo");
				input=new Scanner(System.in).nextDouble();
				switch((int)input)
				{
					case 1:
						System.out.println("Digite o raio:");
						input=new Scanner(System.in).nextDouble();
						System.out.println("O perímetro do circulo é igual a: "+(3.14*2 *input));
						break;
					case 2:
						System.out.println("Digite o lado:");
						input=new Scanner(System.in).nextDouble();
						System.out.println("O perímetro do quadrado é igual a: "+(input*4));
						break;
					case 3:
						System.out.println("Digite o 1º lado:");
						input=new Scanner(System.in).nextDouble()*2;
						System.out.println("Digite o 2º lado:");
						input+=new Scanner(System.in).nextDouble()*2;
						System.out.println("O perímetro retângulo é igual a: "+input);
						break;			
				}
				break;
		}

	}

}

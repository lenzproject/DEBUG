import java.util.Scanner;
public class E02 {

	public static void main(String[] args) {
		
		System.out.println("Digite 1-�rea ou 2-Per�metro:");
		double input=new Scanner(System.in).nextDouble();
		switch((int)input)
		{
			case 1:
				System.out.println("Escolha entre 1-Circulo, 2-Quadrado ou 3-Ret�ngulo");
				input=new Scanner(System.in).nextDouble();
				switch((int)input)
				{
					case 1:
						System.out.println("Digite o raio:");
						input=new Scanner(System.in).nextDouble();
						System.out.print("A �rea do circulo � igual a: "+(3.14*Math.pow(input,2)));
						break;
					case 2:
						System.out.println("Digite o lado:");
						input=new Scanner(System.in).nextDouble();
						System.out.println("A �rea do quadrado � igual a: "+Math.pow(input,2));
						break;
					case 3:
						System.out.println("Digite o 1� lado:");
						input=new Scanner(System.in).nextDouble();
						System.out.println("Digite o 2� lado:");
						input*=new Scanner(System.in).nextDouble();
						System.out.println("A  �rea do ret�ngulo � igual a: "+input);
						break;			
				}
				break;
			case 2:
				System.out.println("Escolha entre 1-Circulo, 2-Quadrado ou 3-Ret�ngulo");
				input=new Scanner(System.in).nextDouble();
				switch((int)input)
				{
					case 1:
						System.out.println("Digite o raio:");
						input=new Scanner(System.in).nextDouble();
						System.out.println("O per�metro do circulo � igual a: "+(3.14*2 *input));
						break;
					case 2:
						System.out.println("Digite o lado:");
						input=new Scanner(System.in).nextDouble();
						System.out.println("O per�metro do quadrado � igual a: "+(input*4));
						break;
					case 3:
						System.out.println("Digite o 1� lado:");
						input=new Scanner(System.in).nextDouble()*2;
						System.out.println("Digite o 2� lado:");
						input+=new Scanner(System.in).nextDouble()*2;
						System.out.println("O per�metro ret�ngulo � igual a: "+input);
						break;			
				}
				break;
		}

	}

}

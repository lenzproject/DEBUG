import java.util.Scanner;
public class E06 {

	public static void main(String[] args) {
		double triangule[]=new double[3];
		System.out.println("Digite o lado A:");
		triangule[0]=new Scanner(System.in).nextDouble();
		System.out.println("Digite o lado B:");
		triangule[1]=new Scanner(System.in).nextDouble();
		System.out.println("Digite o lado C:");
		triangule[2]=new Scanner(System.in).nextDouble();
		if(triangule[0]==0||triangule[1]==0||triangule[2]==0)
			System.out.println("N�o forma um tri�ngulo.");
		else
		{
			if(triangule[2]>=triangule[0]+triangule[1] || triangule[1]>=triangule[0]+triangule[2] || triangule[0]>=triangule[1]+triangule[2])
				System.out.println("N�o forma um tri�ngulo.");
			else
			{
				if(triangule[0]==triangule[1]&&triangule[0]==triangule[2])
					System.out.println("Tri�ngule equil�tero.");
				else if(triangule[0]==triangule[1]||triangule[0]==triangule[2]||triangule[1]==triangule[2])
					System.out.println("Tri�ngulo is�sceles.");
				else
					System.out.println("Tri�ngulo escaleno.");
			}
		}
		

	}

}

import java.util.Scanner;
public class E07 {

	public static void main(String[] args) {
		
		int check[]=new int[10];
		int checked[]=check.clone();
		for(int i=0;i<check.length;i++)
		{
			System.out.println("Digite o "+(i+1)+"º valor:");
			check[i]=new Scanner(System.in).nextInt();
			if(check[i]%2==0)checked[i]=check[i]*5;
			else checked[i]=check[i]+5;
		}
		System.out.printf("%s\n", "Resultado:");
		for(int i=0;i<check.length;i++)
		{
			System.out.printf("%s%d%s%d\n","check[",i,"] = ",check[i]);
			System.out.printf("%10s%d%s%d\n","checked[",i,"] = ",checked[i]);
		}
	}

}

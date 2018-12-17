import java.util.Scanner;
public class E03 {

	public static void main(String[] args) {
		
		double pack[]=new double[7],sum=0,avg;
		for(int i=0;i<7;i++)
		{
			System.out.println("Digite o valor do "+(i+1)+"º dia:");
			pack[i]=new Scanner(System.in).nextDouble();
			sum+=pack[i];
		}
		avg=sum/pack.length;
		int less,greater,equal;
		less=greater=equal=0;
		for(int i=0;i<7;i++)
		{
			if(pack[i]<avg)
			{
				less++;
				System.out.println("O "+(i+1)+"º dia  fechou abaixo da média. Seu valor foi de: "+pack[i]);
				continue;
			}
			else if(pack[i]>avg)
			{
				greater++;
				System.out.println("O "+(i+1)+"º dia  fechou acima da média. Seu valor foi de: "+pack[i]);
				continue;	
			}
			else
			{
				equal++;
				System.out.println("O "+(i+1)+"º dia  fechou na média. Seu valor foi de: "+pack[i]);
				continue;
			}
			
		}
		System.out.println(less+" caixa(s) fecharam abaxo da média, "+equal+" na média e "+greater+" acima.");
	}

}

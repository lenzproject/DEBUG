import java.util.Scanner;
public class E04 {

	public static void main(String[] args) {
		
		int interval[]=new int[3];
		String condition;
		for(int i=0;i<interval.length-1;i++)
		{
			if(i==0)condition="inicial";
			else condition="final";
			System.out.println("Digite a hora "+condition);
			interval[i]+=new Scanner(System.in).nextInt()*3600;
			System.out.println("Digite o minuto "+condition);
			interval[i]+=new Scanner(System.in).nextInt()*60;
			System.out.println("Digite o minuto "+condition);
			interval[i]+=new Scanner(System.in).nextInt();
			interval[interval.length-1]=interval[i]-interval[interval.length-1];
		}
		for(int i=0,j=3600;i<interval.length-1;i++,j/=60)
		{
			interval[i]=interval[interval.length-1]/j;
			interval[interval.length-1]-=interval[i]*j;
		}
		System.out.println("O intervalo foi de "+interval[0]+" hora(s) , "+interval[1]+" minuto(s) e "+interval[interval.length-1]+" segundo(s).");
	}

}

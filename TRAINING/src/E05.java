import java.util.Scanner;
public class E05 {

	public static void main(String[] args) {
		int ProdSeller[][]=new int[4][4];
		ProdSeller [0][0]=50;
		ProdSeller [0][1]=10;
		ProdSeller [0][2]=8;
		ProdSeller [0][3]=28;

		ProdSeller [1][0]=5;
		ProdSeller [1][1]=15;
		ProdSeller [1][2]=15;
        ProdSeller [1][3]=45;

        ProdSeller [2][0]=18;
        ProdSeller [2][1]=25;
        ProdSeller [2][2]=30;
        ProdSeller [2][3]=10;

        ProdSeller [3][0]=28;
        ProdSeller [3][1]=20;
        ProdSeller [3][2]=23;
        ProdSeller [3][3]=9;
        
        System.out.println("Digite a opção de total: 1-Vendedor, 2-Produto ou 3-Geral");
        int input=new Scanner(System.in).nextInt();
        int t=0;
        switch(input)
        {        
        	case 1:
        		System.out.println("Digite o número do vendedor: (Entre 1 e 4)");
        		input=new Scanner(System.in).nextInt();
        		for(int i=0; i<ProdSeller[1].length;i++)
        			t+=ProdSeller[input-1][i];
        		System.out.println(String.format("O total do vendedor %d é de: %d",input,t));
        		break;
        	case 2:
        		System.out.println("Digite o número do produto: (Entre 1 e 4)");
        		input=new Scanner(System.in).nextInt();
        		for(int i=0; i<ProdSeller[0].length;i++)
        			t+=ProdSeller[i][input-1];
        		System.out.println(String.format("O total do produto %d é de: %d",input,t));
        		break;
        	case 3:
        		
        		for(int i=0;i<ProdSeller[0].length;i++)
        			for(int j=0;j<ProdSeller[1].length;j++)
        				t+=ProdSeller[i][j];
        		System.out.println("O total é de: "+t);
        		break;
        }

	}

}

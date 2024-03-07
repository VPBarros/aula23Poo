import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // {POO revisão vetor 1 } Programa p/ ler um numero inteiro N e altura de N pessoas Armazene as N alturas
		//em um vetor.Em seguida, mostrar a altura media das pessoas.
		//(1ª quantidade de casas 2ª preencher com as alturas Enter)
        
Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantidade stack : ");//stack = pilhas
		int n =sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		double sum = 0.0;
		   for(int i=0; i<n; i++) {
			   sum += vect[i];
		   }
			double avg = sum / n;
		 System.out.printf("Average Height: %.2f%n ", avg);//altura media
		 
     sc.close();

    }
}

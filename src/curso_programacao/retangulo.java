package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base, altura, area, perim, diag;
		
		System.out.print("Base do Retangulo = ");
		base = sc.nextDouble();
		System.out.print("Altura do Retangulo = ");
		altura = sc.nextDouble();
		
		area = base * altura;
		perim = (2*base) + (2*altura);
		diag = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
		
		System.out.println("Area = " + String.format("%.4f", area));
		System.out.println("Perimetro = " + String.format("%.4f", perim));
		System.out.println("Diagonal = " + String.format("%.4f", diag));
		
		sc.close();

	}

}

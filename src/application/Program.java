package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Formas;
import entities.Retangulo;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Formas> list = new ArrayList<>();

		System.out.println("Digite o número de formas: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Forma #" + i);
			System.out.print("Qual formas circulo ou retangulo c/r?: ");
			char type = sc.next().charAt(0);
			System.out.println("Qual cor: BLACK/BLUE/RED: ");
			Color color = Color.valueOf(sc.next());

			if (type == 'r') {
				System.out.println("Digite a Width: ");
				double width = sc.nextDouble();
				System.out.println("Digite a Heigth: ");
				double heigth = sc.nextDouble();
				list.add(new Retangulo(color, width, heigth));
			} else {
				System.out.println("Digite a Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circulo(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("FORMA DA AREA:");
		for(Formas form : list) {
			System.out.println(String.format("%.2f",form.area()));
		}

		sc.close();

	}

}

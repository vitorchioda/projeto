package program;

import java.util.Scanner;

import entities.Anao;
import entities.Elfo;

public class program {

	public static void main(String[] args) throws java.lang.Exception {
		String racae;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva a raça desejada");
		racae = sc.nextLine();

		if (racae.equals("anao")) {

			Anao acaoAnao = new Anao();
			acaoAnao.showAnao();

		}else if(racae.equals("elfo")) {
			Elfo acaoElfo=new Elfo();
			acaoElfo.showElfo();
		}
		sc.close();
	}



	

}

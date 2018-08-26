package entities;

import java.util.Scanner;

public class Elfo extends Raça {
	Scanner sc = new Scanner(System.in);
	VisaoNoturna visaoNoturna = new VisaoNoturna();
	Deslocamento deslocamento = new Deslocamento();
	Idiomas idioma = new Idiomas();
	public int visaoElfo = visaoNoturna.v9;
	public double deslocamentoElfo = deslocamento.deslocamento7_5;
	public String idiomaElfo = idioma.idiomaComum + " e " + idioma.idiomaElfo;
	public int escolhaElfo = 0;

	public void showElfo() {

		System.out.println("Os elfos tem Aumento de valor de Habilidade de +2 des");
		System.out.println("Raça Elfo\nAtributos basicos");
		System.out.println("Tem visao noturna de alcance de " + this.visaoElfo + "m");
		System.out.println("Seu deslocamento é de " + this.deslocamentoElfo + "m");
		System.out.println("Sabe os seguintes idiomas :: " + this.idiomaElfo);
		System.out.println("Os elfos possuem sentido aguçado(aumenta perecia percepção)");
		System.out.println("Todos os elfos possuem um ancestral feerico");
		System.out.println("Os elfos possuem a habilidaed de entrar em transe");
		System.out.println("Escolha uma sub-raça\n1- Alto elfo , 2 - Elfo da floresta e 3 - Elfo negro");
		escolhaElfo = sc.nextInt();

		if (escolhaElfo == 1) {
			System.out.println("Os Alto elfos tem como atributo");
			System.out.println("Os Alto elfos tem Aumento de valor de Habilidade de +1 int");
			System.out.println("Eles tem treinamento com armas");
			System.out.println("Podem aprender truques");
			System.out.println("Os alto elfos podem aprender um idioma adicional");
		} else if(escolhaElfo==2) {
			System.out.println("Os elfos da floresta tem como atributo");
			System.out.println("Os elfos da floresta tem Aumento de valor de Habilidade de +1 int");
			System.out.println("Eles tem treinamento com armas");
			System.out.println("Eles possuem a habilidade de pés ligeiros");
			System.out.println("Eles podem usar a habilidae de mascara de natureza");
		}else {
			System.out.println("Os Elfos Negros tem como atributo");
			System.out.println("Os Elfos Negros tem Aumento de valor de Habilidade de +1 con");
			System.out.println("Eles possuem visao noturna supeiror(" +visaoNoturna.v18+"m)");
			System.out.println("Eles tem sensibilidade a luz solar");
			System.out.println("Eles podem usar magia drow");
		}
	}
}

package entities;

import java.util.Scanner;

public class Anao extends Raça {
	Scanner sc = new Scanner(System.in);
	VisaoNoturna visaoNoturna = new VisaoNoturna();
	Deslocamento deslocamento = new Deslocamento();
	Idiomas idioma = new Idiomas();
	public int visaoAnao = visaoNoturna.v9;
	public double deslocamentoAnao = deslocamento.deslocamento7_5;
	public String idiomaAnao = idioma.idiomaComum + " e " + idioma.idiomaAnao;
	public int escolhaAnao = 0;

	public void showAnao() {

		System.out.println("Os anoes tem Aumento de valor de Habilidade de +2 con");
		System.out.println("Raça Anao\nAtributos basicos");
		System.out.println("Tem visao noturna de alcance de " + this.visaoAnao + "m");
		System.out.println("Seu deslocamento é de " + this.deslocamentoAnao + "m");
		System.out.println("Sabe os seguintes idiomas :: " + this.idiomaAnao);
		System.out.println("Os anoes tem resistencia maior ao veneno");
		System.out.println("Os anoes conseguem usar armas curtas e pequenas");
		System.out.println("Os anoes possuem especialização em rochas");
		System.out.println("Escolha uma sub-raça\n1- Anao da colina e 2 - Anao da montanha");
		escolhaAnao=sc.nextInt();
		if(escolhaAnao==1) {
			System.out.println("Os anoes da colina tem como atributo");
			System.out.println("Os anoes da colina tem Aumento de valor de Habilidade de +1 Sab");
			System.out.println("Eles recebem +1 de hp e +1 hp por nivel");
		}else {
			System.out.println("Os anoes da montanha tem como atributo");
			System.out.println("Os anoes da montanha tem Aumento de valor de Habilidade de +1 For");
			System.out.println("Os anoes da montanha tem treinamento com armaduras");
		}
	}

}

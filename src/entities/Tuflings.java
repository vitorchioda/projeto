package entities;


public class Tuflings extends Ra�a {
	VisaoNoturna visaoNoturna = new VisaoNoturna();
	Deslocamento deslocamento = new Deslocamento();
	Idiomas idioma = new Idiomas();
	public int visaoTufling = visaoNoturna.v18;
	public double deslocamentoElfo = deslocamento.deslocamento7_5;
	public String idiomaElfo = idioma.idiomaComum + " e " + idioma.idiomaElfo;
	public int escolhaElfo = 0;

	public void showElfo() {

		System.out.println("Os Tufling tem Aumento de valor de Habilidade de +2 con e +1 int");
		System.out.println("Ra�a Anao\nAtributos basicos");
		System.out.println("Tem visao noturna de alcance de " + this.visaoElfo + "m");
		System.out.println("Seu deslocamento � de " + this.deslocamentoElfo + "m");
		System.out.println("Sabe os seguintes idiomas :: " + this.idiomaElfo);
		System.out.println("Os elfos possuem sentido agu�ado(aumenta perecia percep��o)");
		System.out.println("Todos os elfos possuem um ancestral feerico");
		System.out.println("Os elfos possuem a habilidaed de entrar em transe");
		System.out.println("Escolha uma sub-ra�a\n1- Alto elfo , 2 - Elfo da floresta e 3 - Elfo negro");
	

		
	}
}

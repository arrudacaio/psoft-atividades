import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Publicar publicar = new Publicar();
		TipoFormatacao tipoForm;
		String text;
		System.out.println("----Insira seu texto aqui----");
		text = sc.nextLine();
		System.out.println("---Selecione a Formatação: NEGRITO, ITALICO, MAIUSCULO OU MINUSCULO---");
		tipoForm = TipoFormatacao.valueOf(sc.nextLine());
		System.out.println(publicar.fazPublicacao(text, tipoForm.getFormatacao()));

	}

}

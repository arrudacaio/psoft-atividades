
public class Italico implements Formatacao {

	@Override
	public String textFormat(String text) {
		return "\033[1m" +text +"\033[1m";
	}

}

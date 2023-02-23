public class Main {
	public static void main(String[] args) {
		String string1 = "United Kingdom";
		String string2 = "Germany";
		//trovo l'indice dello spazio
		int spaceIndex = string1.indexOf(" ");
		//dichiaro entrambe le stringhe e le assegno
		String sub1 = string1.substring(0, spaceIndex);
		String sub2 = string1.substring(spaceIndex+1);
		//dichiaro e assegno il charArray
		char[] charArray = (sub1 + " " + string2 + " " + sub2).toUpperCase().toCharArray();

		System.out.println(charArray);
	}
}
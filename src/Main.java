public class Main {
	public static void main(String[] args) {
		String string1 = "United Kingdom";
		String string2 = "Germany";

		int spaceIndex = string1.indexOf(" ");
		String sub1 = string1.substring(0, spaceIndex);
		String sub2 = string1.substring(spaceIndex+1);

		char[] charArray = (sub1 + " " + string2 + " " + sub2).toUpperCase().toCharArray();

		// Print the char array
		System.out.println(charArray);
	}
}
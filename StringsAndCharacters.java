import acm.program.ConsoleProgram;

public class StringsAndCharacters extends ConsoleProgram{

	public void run() {
		demonstration();
	}
	
	public void demonstration() {
		String greentea = "greentea";
		String bottlecap = "bottlecap";
		
		println(removeDoubleChars(greentea));
		println(removeDoubleChars(bottlecap));
		
	}
	
	public String removeDoubleChars(String string) {
		char aChar = ' ';
		String newString = "";
		
		for(int i = 0; i < string.length(); i++) {
			aChar = string.charAt(i);
			
			if(i == 0 || aChar != string.charAt(i - 1)) {
				newString = newString + aChar;
			}
		}
		
		return newString;
	}
}
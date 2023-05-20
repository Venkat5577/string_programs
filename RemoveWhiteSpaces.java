package strings;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String s=" Ve nk ata ra  m an ana ";
		String trimString=s.trim();
		System.out.println(trimString);
//trim() method will remove white spaces at start and end 
//of the string if we want remove all spaces in String we have to use
//replaceAll("String","String") method
		String removeSpace=s.replaceAll(" ","");
		System.out.println(removeSpace);
	}

}

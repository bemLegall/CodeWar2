
public class AbbreviateTwoWords {
	
	public static String abbrevName(String name) {
		int idx = name.indexOf(" ");
	    String formatado = name.substring(0,1).toUpperCase()+"."+name.substring(idx+1, idx+2).toUpperCase();
	    return formatado;
	  }

}

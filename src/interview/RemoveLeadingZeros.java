package interview;

import org.apache.commons.lang3.StringUtils;

public class RemoveLeadingZeros {

	public static void main(String[] args) {
		
		removeUsingRegularExpressions();
		removeUsingRegularExpressionReplaceAll();
		removeByParsingToANumberType();
		removeUsingApacheCommonsLangLibrary();
	}
	
	public static void removeUsingRegularExpressions() {
		String str = "0001230-abc0";
		str = str.replaceFirst("^0+", "");
		System.out.println(str);//1230-abc0
	}
	
	public static void removeUsingRegularExpressionReplaceAll() {
		String str = "000123000-00abc00";
		String str2 = "000123000-00abc00";
		str = str.replaceAll("^0+", "");
		String result2 = str2.replaceAll("^0+(?!$)", ""); 
		System.out.println(str);//123000-00abc00
		System.out.println(result2);//123000-00abc00
	}
	
	public static void removeByParsingToANumberType() {
		//It works if String contains all numbers
		//String str = "000123000-00abc00";
		String str = "0000819780";
		System.out.println("1 String: "+str);
		long strLong = Long.parseLong(str);
		System.out.println("2 Long: "+strLong);
		str = String.valueOf(strLong);
		System.out.println("3 Final String: "+str);
		
/*		Output:
			1 String: 0000819780
			2 Long: 819780
			3 Final String: 819780
			*/
	}
	
	public static void removeUsingApacheCommonsLangLibrary() {
		String str = "000123";
		
		// Removes any leading '0' characters
		String result = StringUtils.stripStart(str, "0"); 
		System.out.println(result); // Output: 123
	}
}

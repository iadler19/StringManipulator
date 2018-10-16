
public class StringManipulator {

	
public String noVowels(String str)
{
	String string = "";
	for(int i = 0; i < str.length(); i++)
	{
		if(str.charAt(i) == 'a' || str.charAt(i) == 'A' ||str.charAt(i) == 'e' || str.charAt(i) == 'E' || str.charAt(i) == 'i'||str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O' || str.charAt(i) == 'u' ||str.charAt(i) == 'U' )
		{
		 string += '*';	
		}
		else {
			string += string.charAt(i) ;
		}
	}

	return string;
}
}


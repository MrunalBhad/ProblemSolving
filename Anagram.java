import java.util.*;

class Anagram
{
	public static boolean print(String s1,String s2)
    {
    	s1 = s1.toLowerCase();
    	s2 = s2.toLowerCase();

    	if(s1.length() != s2.length())
    	{
    		return false;
    	}

    	char[] charArray1 = s1.toCharArray();
    	char[] charArray2 = s2.toCharArray();
  
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1,charArray2);

    }

	public static void main(String[] args) 
	{
		String s1 = "Listen";
		String s2 = "Silent";

		System.out.println(print(s1,s2));
	}
}
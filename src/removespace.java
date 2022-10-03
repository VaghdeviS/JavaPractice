import java.util.Scanner;

public class removespace {
	
	public static void main(String[] args) 
    {
      /*  Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter input string to be cleaned from white spaces...!");
         
        String inputString = sc.nextLine();
         
        String stringWithoutSpaces = inputString.replaceAll("\\s+","");
         
        System.out.println("Input String : "+inputString);
         
        System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
         
        sc.close();*/
		
		
		String input="one two three";
		
		char[] chararray=input.toCharArray();
		
		String output="";
		
		for(int i=0;i<chararray.length;i++)
		{
			if((chararray[i]!=' ')&& (chararray[i]!='\t'))
				output = output+chararray[i];
		}
		
		System.out.println(output);
		
		
		
    }

}

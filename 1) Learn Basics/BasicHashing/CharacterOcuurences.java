import java.util.*;
public class CharacterOcuurences 
{
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    String str=sc.nextLine();

    int hash[]=new int[256];

  //Precompute 

    for(int i=0;i<str.length();i++)
    {
        hash[str.charAt(i)]++;
    }
    System.out.println("Enter the character for checking occurences");
    char ch = sc.next().charAt(0);

    //Fetch
    
    System.out.println("Occurences of a character are " +hash[ch]);
}
}

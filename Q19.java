import java.util.Scanner;
public class Q19
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String str = sc.nextLine();
        str = str.toLowerCase();//will convert the String to lowercase        
        String newstr = "";
        for(int i=0;i<str.length();i++)
        {
            int ch=(int)str.charAt(i);
            if((ch==97)||(ch==101)||(ch==105)||(ch==111)||(ch==117))
            {
                ch++;//will replace the vowel with a consonant next to it
                newstr+=(char)ch;
            }
            else
            {
                newstr+= (char)ch;
            }
        }
        System.out.println("New String: "+newstr);
    }
}




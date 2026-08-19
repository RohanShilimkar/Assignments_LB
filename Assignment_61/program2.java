import java.util.Scanner;

class program2 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int Max = 0;
        String ch = null;

        System.out.println("Enter String");
        String str = sobj.nextLine();

        str =str.trim();
        str = str.replaceAll("\\s+"," ");

        String Tokens[] = str.split(" ");

        for(int i=0;i<Tokens.length;i++)
        {
            if(Tokens[i].length() > Max)
            {
                Max = Tokens[i].length();
                ch = Tokens[i];
            }
        }

        System.out.println(ch);

        sobj.close();
        
    }
    
}

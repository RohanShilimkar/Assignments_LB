import java.util.Scanner;

class program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");

        String Tokens[] = str.split(" ");

        StringBuffer sb = null;
        StringBuffer fstr = new StringBuffer("");

        for(int i=0;i<Tokens.length;i++)
        {
            sb = new StringBuffer(Tokens[i]);
            sb.reverse();
            fstr = fstr.append(sb);
            fstr = fstr.append(" ");
        }

         
        String Output = new String(fstr);

        Output = Output.trim();
        
        System.out.print(Output);

        sobj.close();
    }
}
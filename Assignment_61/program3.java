import java.util.Scanner;

class program3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sobj.nextLine();

        str =str.trim();
        str = str.replaceAll("\\s+"," ");

        char arr[] = str.toCharArray();
        char brr[] = new char[arr.length];
        int i=0;
        int j=0;

        for(i = 0; i < arr.length; i++)
        {
            boolean flag = false;

            for(j = 0; j < i; j++)
            {
                if(arr[i] == arr[j])
                {
                    flag = true;
                    break;
                }
            }

            if(flag == false)
            {
                brr[i] = arr[i];
            }
        }

        for(i = 0; i < brr.length; i++)
        {
            if(brr[i] != '\0')
            {
                System.out.print(brr[i]);
            }
        }

        sobj.close();
    }
}
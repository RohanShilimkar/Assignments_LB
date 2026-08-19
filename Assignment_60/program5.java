import java.util.Scanner;

class program5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");        
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        str = str.toLowerCase();
    
        char arr[] = str.toCharArray();
        int freq[] = new int[26];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] >= 'a' && arr[i] <= 'z')
            {
                freq[(int)arr[i]-97]++;

            }
        }

        System.err.println("Frequency of letter is: ");
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>0)
            {
                System.out.println((char)(i+97)+" : "+freq[i]);
            }
           
        }



        sobj.close();
    }
    
}

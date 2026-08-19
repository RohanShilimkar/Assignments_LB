import java.util.Scanner;

class program4 
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");        
        String str = sobj.nextLine();

        str = str.trim();
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

        int index=0;
        for(int j=0;j<arr.length;j++)
        {
            index = arr[j] - 'a';
            if(freq[index] > 1)
            {
                System.out.println(arr[j]);

                freq[index] = 0;
            }
        }









        sobj.close();

    }
    
}

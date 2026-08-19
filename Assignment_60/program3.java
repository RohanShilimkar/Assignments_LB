import java.util.Scanner;

class program3
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        boolean bFlag = true;

        System.out.println("Enter a String");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+", " ");

       char arr[] = str.toCharArray();

       int freq[] = new int[26];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>= 'a' && arr[i] <= 'z')
            {
                freq[(int)arr[i]-97]++;
            }
        }

        for(int i=0;i<freq.length;i++)
        {
           if(freq[i] == 0)
           {
             bFlag = false;
             break;
           }
        }
        
        if(bFlag == true)
        {

            System.out.println("It is a Panagram");
        }
        else
        {
            System.out.println("It is Not a Panagram");
        }


        sobj.close();
        
    }
}
import java.util.Scanner;

class program2
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int freq1[] = null;
        int freq2[] = null;
        boolean bFlag = true;

        System.out.println("Enter a String");
        String str1 = sobj.nextLine();

        System.out.println("Enter a String");
        String str2 = sobj.nextLine();

        str1 = str1.trim();
        str1.replaceAll("\\s+"," ");
        str1 = str1.toLowerCase();
        char arr[] = str1.toCharArray();
        freq1 = new int[26];


        str2 = str2.trim();
        str2.replaceAll("\\s+"," ");
        str2 = str2.toLowerCase();
        char brr[] = str2.toCharArray();
        freq2 = new int[26];


        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>= 'a' &&  arr[i] <= 'z')
            {
                freq1[(int)arr[i]-97]++;
            
            }
        }


        for(int i=0;i<brr.length;i++)
        {
            if(brr[i]>= 'a' &&  brr[i] <= 'z')
            {
                freq2[(int)brr[i]-97]++;
            
            }
        }

     
        for(int i=0;i<freq1.length;i++)
        {
            if(freq1[i] != freq2[i])
            {
                bFlag = false; 
                break;
            }
        }

        if(bFlag == true)
        {

            System.out.println("It is a Anagram");
        }
        else
        {
            System.out.println("It is Not a Anagram");
        }



        sobj.close();
    }
}
import java.util.Scanner;

class program4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sobj.nextLine();


        
        str =str.trim();
        str = str.replaceAll("\\s+"," ");
        str = str.toLowerCase();
        char arr[] = str.toCharArray();

        int CountVovwel = 0;
        int CountConstant = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'e' )
            {
                CountVovwel++;
            }
            else
            {
                CountConstant++;
            }
        }

        System.out.println("Vowels: "+CountVovwel);
        System.out.println("Constant: "+CountConstant);











        sobj.close();
        
    }
}
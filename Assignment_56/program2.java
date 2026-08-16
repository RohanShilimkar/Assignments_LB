import java.util.Scanner;
import java.util.random.*;


class program2
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        int voterId[] = null;
        int no= 0;
        int Duplicates=0;

        System.out.println("Enter Number of Votes: ");
        no = sobj.nextInt();

        voterId = new int[no];
        System.out.println("Enter:");
        
        for(int i=0;i<voterId.length;i++)
        {
            voterId[i] = sobj.nextInt();
        }
        for(int i=0;i<voterId.length;i++)
        {
             
            for(int j=0;j<i;j++)
            {
                if(voterId[j] == voterId[i])
                {
                    Duplicates++;
                    break;
                    
                }
            }
        }
        int ValidVotes = no - Duplicates;

        System.out.println("Valid Votes: "+ValidVotes);
        System.out.println("Rejected Duplicate Votes: "+Duplicates);

    }
}
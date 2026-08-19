import java.util.Scanner;

class program1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int iCol=0;
        int iRow=0;
        int Score[][] = null;
        int TotalMarks=0;
        int Topper=0;
        int Max=0;
        double Avg=0.0;
        int j = 0;
        int i = 0;

        System.out.println("Enter Number of Students:");
        iRow = sobj.nextInt();

        System.out.println("Enter how many subjects:");
        iCol = sobj.nextInt();

        if(iRow < 0 || iCol < 0)
        {
            System.out.println("Invalid Input");
            sobj.close();
            return;
        }

        Score = new int[iRow][iCol];

        System.out.println("Enter Marks of Students");
        
        for( i=0;i<iRow;i++)
        {
            for(j=0;j<iCol;j++)
            {
                Score[i][j] = sobj.nextInt();
                if(Score[i][j] < 0  || Score[i][j] > 100)
                {
                    System.out.println("Invalid Input");
                    sobj.close();
                    return;
                }
            }
        }

         for(i=0;i<iRow;i++)
        {
            for(j=0;j<iCol;j++)
            {
                System.out.print(Score[i][j]+"\t");
                
            }
            System.out.println();
        }

        System.out.println("Student Totals:");
        for(i=0;i<iRow;i++)
        {
            for(j=0;j<iCol;j++)
            {
                TotalMarks = TotalMarks + Score[i][j];
            }
            System.out.println("Student: "+(i+1)+" : "+TotalMarks);

            if(TotalMarks > Max)
            {
                Max = TotalMarks;
                Topper++;
            }
            
            TotalMarks = 0;
        }
        
        System.out.println("\nTopper Student is: "+Topper);

        System.out.println("\nSubject Averages:");
        for(j=0;j<iCol;j++)
        {
            TotalMarks = 0;    
            for(i=0;i<iRow;i++)
            {
                TotalMarks = TotalMarks + Score[i][j];
            }

            Avg =(double)TotalMarks/iRow;
            
            System.out.println("Subject: "+(j+1)+" : "+Avg);

        }

        for(i=0;i<iRow;i++)
        {
            for(j=0;j<iCol;j++)
            {
                if(Score[i][j] < 35)
                {
                    System.out.println("\nStudents Failed: "+(i+1));
                    break;
                }
            }
        }

        sobj.close();
        
    }
}
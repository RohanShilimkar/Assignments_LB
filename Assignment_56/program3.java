import java.util.Scanner;

class program3 
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        int no=7;
        int steps[] = null;
        int days= 0;

        int goal = 8000;

        System.out.println("Enter steps:");
        steps = new int[no];
        for(int i=0;i<steps.length;i++)
        {
            steps[i] = sobj.nextInt();
        }

        int max = 0;
        for(int j=0;j<steps.length;j++)
        {
            if(steps[j] >= goal)
            {
                days++;
            }

            if(steps[j] > max)
            {
                max = steps[j];
            }
        }

        System.out.println("Goal achied days :"+days);
        System.out.println("Maximum steps in week:"+max);

    }
    
}

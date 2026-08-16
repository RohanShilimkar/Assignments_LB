import java.util.Scanner;

class Program4
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int units = 0;
        int weeksLate = 0;
        int billAmount = 0;
        int penalty = 0;

        System.out.println("Enter units:");
        units = sobj.nextInt();

        System.out.println("Enter weeks late:");
        weeksLate = sobj.nextInt();

        billAmount = 100;

        if(units <= 100)
        {
            billAmount = billAmount + (units * 5);
        }
        else if(units <= 200)
        {
            billAmount = billAmount + (100 * 5);
            billAmount = billAmount + ((units - 100) * 7);
        }
        else
        {
            billAmount = billAmount + (100 * 5);
            billAmount = billAmount + (100 * 7);
            billAmount = billAmount + ((units - 200) * 10);
        }

        if(weeksLate > 0)
        {
            penalty = weeksLate * 2;

            if(penalty > 10)
            {
                penalty = 10;
            }

            billAmount = billAmount + (billAmount * penalty / 100);
        }

        System.out.println("Bill Amount: " + billAmount);

        sobj.close();
    }
}
import java.util.Scanner;

class Program3
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int mins = 0;
        int sms = 0;
        int gb = 0;

        int cost1=0;
        int cost2 = 0;
        int cost3 = 0;
        int cost4 = 0;
        int minCost = 0;
        String recommendedPlan = null;

        System.out.println("Enter call minutes:");
        mins = sobj.nextInt();

        System.out.println("Enter data in GB:");
        gb = sobj.nextInt();

        System.out.println("Enter SMS count:");
        sms = sobj.nextInt();

        cost1 = 300;
        if(mins > 1000)
        {
            cost1 = cost1 + (mins - 1000) * 1;
        }

        if(gb > 10)
        {
            cost1 = cost1 + (gb - 10) * 20;
        }

        if(sms > 100)
        {
            cost1 = cost1 + (sms - 100) * 1;
        }

        cost2 = 400;
        if(mins > 1500)
        {
            cost2 = cost2 + (mins - 1500) * 1;
        }

        if(gb > 15)
        {
            cost2 = cost2 + (gb - 15) * 20;
        }

        if(sms > 200)
        {
            cost2 = cost2 + (sms - 200) * 1;
        }


        cost3 = 500;
        if(mins > 2000)
        {
            cost3 = cost3 + (mins - 2000) * 1;
        }

        if(gb > 20)
        {
            cost3 = cost3 + (gb - 20) * 20;
        }

        if(sms > 300)
        {
            cost3 = cost3 + (sms - 300) * 1;
        }


        cost4 = 600;
        if(mins > 3000)
        {
            cost4 = cost4 + (mins - 3000) * 1;
        }

        if(gb > 30)
        {
            cost4 = cost4 + (gb - 30) * 20;
        }

        if(sms > 500)
        {
            cost4 = cost4 + (sms - 500) * 1;
        }


        minCost = cost1;
        recommendedPlan = "Plan 1";

        if(cost2 < minCost)
        {
            minCost = cost2;
            recommendedPlan = "Plan 2";
        }

        if(cost3 < minCost)
        {
            minCost = cost3;
            recommendedPlan = "Plan 3";
        }

        if(cost4 < minCost)
        {
            minCost = cost4;
            recommendedPlan = "Plan 4";
        }


        System.out.println("Recommended Plan: " + recommendedPlan);
        System.out.println("Total Cost: " + minCost);

        sobj.close();
    }
}
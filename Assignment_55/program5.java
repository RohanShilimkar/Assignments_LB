import java.util.Scanner;

class Program5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int rows, cols;
        int bookedCount, requestedCount;
        int found = 0;

        System.out.println("Enter rows:");
        rows = sobj.nextInt();

        System.out.println("Enter columns:");
        cols = sobj.nextInt();

        System.out.println("Enter number of booked seats:");
        bookedCount = sobj.nextInt();

        int[] bookedSeats = new int[bookedCount];

        System.out.println("Enter booked seats:");

        for(int i = 0; i < bookedCount; i++)
        {
            bookedSeats[i] = sobj.nextInt();
        }

        System.out.println("Enter number of requested seats:");
        requestedCount = sobj.nextInt();

        int[] requestedSeats = new int[requestedCount];

        System.out.println("Enter requested seats:");

        for(int i = 0; i < requestedCount; i++)
        {
            requestedSeats[i] = sobj.nextInt();
        }

        for(int i = 0; i < requestedCount; i++)
        {
            for(int j = 0; j < bookedCount; j++)
            {
                if(requestedSeats[i] == bookedSeats[j])
                {
                    found = 1;
                    break;
                }
            }

            if(found == 1)
            {
                break;
            }
        }


        if(found == 1)
        {
            System.out.println("Booking Failed");
            System.out.println("One or more seats are already booked");
        }
        else
        {
            int totalCost = 0;

            for(int i = 0; i < requestedCount; i++)
            {
                int seat = requestedSeats[i];

                int row = (seat - 1) / cols + 1;

                if(row == 1)
                {
                    totalCost = totalCost + 100;
                }
                else if(row == 2)
                {
                    totalCost = totalCost + 150;
                }
                else
                {
                    totalCost = totalCost + 200;
                }
            }

            if(requestedCount >= 6)
            {
                totalCost = totalCost - (totalCost * 10 / 100);
            }

            int totalSeats = rows * cols;

            int remainingSeats = totalSeats - bookedCount - requestedCount;

            System.out.println("Booking Successful");
            System.out.println("Total Cost: "+totalCost);
            System.out.println("Remaining Seats: "+remainingSeats);

            sobj.close();
        }
    }
}
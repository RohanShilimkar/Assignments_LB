import java.util.Scanner;

class program3
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        int weight = 0;
        int charge=0;

        System.out.println("Enter Parcel weight:");
        weight = sobj.nextInt();

        if(weight<0)
        {
            System.out.println("Weight must be greater than Zero");
            sobj.close();
            return;
        }

        if(weight <= 1)
        {
            charge = charge + 50;
            System.out.println("Parcel weight: "+weight);
            System.out.println("Courier Charge: "+charge);
        }
        else if(weight <= 5 )
        {
            charge = 50 + ((weight-1) * 20);
            System.out.println("Parcel weight: "+weight);
            System.out.println("Courier Charge: "+charge);
        }
        else if(weight > 5 )
        {
            charge = 150 + (weight - 5) * 30; 
            System.out.println("Parcel weight: "+weight);
            System.out.println("Courier Charge: "+charge);
        }

        sobj.close();
    }
}
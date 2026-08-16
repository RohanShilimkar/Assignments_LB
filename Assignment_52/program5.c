#include<stdio.h>
#include<string.h>

void Discount(int amt,char mtype[])
{
    int Discount=0;

    if(amt > 2000 && amt <= 5000)
    {
        Discount = (amt/100) * 10;

        if(strcmp(mtype,"Premium")==0)
        {
            Discount = Discount + ((amt-Discount)/100) * 5;
        }
    }
    else if(amt > 5000)
    {
        Discount = (amt/100) * 20;

        if(strcmp(mtype,"Premium")==0)
        {
            Discount = Discount + ((amt-Discount)/100) * 5;
        }
    }


    printf("Original Amount: %d",amt);
    printf("\nTotal Discount: %d",Discount);
    printf("\nAmount to pay: %d",amt-Discount);

}

int main()
{
    int amount=0;
    char Membershiptype[10] ={'\0'};

    printf("Enter your Purchase Amount:");
    scanf("%d",&amount);
    
    printf("Enter Membership type:");
    scanf("%s",Membershiptype);

    Discount(amount,Membershiptype);
    

    return 0;

}
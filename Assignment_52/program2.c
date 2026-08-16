
/*
    A Bank Atm safety to avoid fraud and ensure security 
    the atm approves request based on that do the opeartions
    Withdrawal must multiples of 100
    Minimum Withdrawal per transaction is ₹25000 
    After Withdrawal balance must be at least ₹1000
*/

#include<stdio.h>

int Transaction(int bal,int withd)
{
    int max = 25000;
    if(bal < 0 || withd <= 0 )
    {
        return -1;
    }

    if(withd> bal)
    {
        printf("Insufficent balance\n");
        return -1;
    }
    if(withd > max)
    {
        printf("Transcation Exceeded\n");
        return -1;
    }
    if((withd % 100) == 0)
    {
        if(bal - withd >= 1000)
        {
            bal = bal - withd;
        }
        else
        {
            printf("Minimum balance reqired 1000\n");
            return -1;
        }
    }
    else
    {
        printf("Enter multiples of 100!\n");
        return -1;
    }

    return bal;
}

int main()
{
    int balance=0;
    int withdraw=0,iRet=0;
    printf("Enter Current Your Balance:");
    scanf("%d",&balance);
    
    printf("Enter Amount to withdraw:");
    scanf("%d",&withdraw);

    iRet = Transaction(balance,withdraw);

    if(iRet == -1)
    {
        printf("Transaction failed\n");
    }
    else
    {
        printf("Transaction Successful\n");
        printf("Remaining balance is: %d",iRet);
    }


    return 0;
}
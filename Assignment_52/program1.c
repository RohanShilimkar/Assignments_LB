/*
    Automatic Fine Calculator for Library
    
    if a student borrowed book upto 7 days => No fine
    else if total days are from 8 to 12 => 5₹ per day
    else if total days are greater than 12 => 10₹ per day
*/

#include<stdio.h>

int CalculateFine(int days)
{
    int fine=0,i=0;

    if(days<0)
    {
        return -1;
    }

    if(days <= 7)
    {
        return 0;
    }
    else if(days > 7 && days <= 12)
    {
        for(i=8;i<=days;i++)
        {
            fine = fine + 5;
        }
    }
    else if(days > 12)
    {
        for(i=13;i<=days;i++)
        {
            fine = fine + 10;
        }
    }
    return fine;
}

int main()
{
    int days = 0,iRet=0 ;

    printf("How many days Student kept book:");
    scanf("%d",&days);
    
    iRet = CalculateFine(days);

    if(iRet == -1)
    {
        printf("Invalid Input");
    }
    else if(iRet == 0)
    {
        printf("No fine!");   
    }
    else
    {
        printf("\nTotal fine to be paid: %d\n",iRet);
    }   
    
    return 0;
    
}
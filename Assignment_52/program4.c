#include<stdio.h>

int CountUnits(int unit)
{
    int TotalUnit = 0;

    if(unit<0)
    {
        return 0;
    }

    if(unit < 100)
    {
        for(int i=1;i<=unit;i++)
        {
            TotalUnit = i* 5;
        }
    }
    else if(unit>100 && unit<=200)
    {
        for(int i=1;i<=unit;i++)
        {
            TotalUnit = i * 7;
        }
    }
    else if(unit>200)
    {
        for(int i=0;i<=unit;i++)
        {
            TotalUnit = i * 10;
        }
    }

    return TotalUnit;
}

int main()
{
    int iValue =0;
    int iRet = 0;

    printf("Enter Units Consumed:");
    scanf("%d",&iValue);

    iRet = CountUnits(iValue);

    printf("Total units Consumed: %d",iValue);
    printf("\nTotal Electricity Bill: %d",iRet);

    return 0;

}
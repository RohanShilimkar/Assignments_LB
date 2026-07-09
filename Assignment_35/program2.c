#include<stdio.h>
typedef unsigned int UINT;
typedef int BOOL;

#define TRUE 1
#define FALSE 0

// Postion 5th & 18th
BOOL ChkBit(UINT iNo)
{
    UINT iMask = 0x20010;
    //0x40010;
    UINT Ans = 0;

    Ans = iNo & iMask; 

    if(Ans == iMask)
    {
        return TRUE;
    }

    return FALSE;
}

int main()
{
    UINT iValue = 0;
    BOOL bRet= FALSE;

    printf("Enter a Number:");
    scanf("%u",&iValue);

    bRet = ChkBit(iValue);

    if(bRet == TRUE)
    {
        printf("Bit is ON");
    }
    else
    {
        printf("Bit is OFF");
    }

    return 0;
}
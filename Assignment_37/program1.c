#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef unsigned int UINT;
typedef int BOOL;

//Check Bit is On OR Off
BOOL CheckBit(UINT iNo,UINT iPos)
{
    UINT iAns = 0;
    UINT iMask = 1;

    iMask = iMask << (iPos - 1);

    iAns = iNo & iMask;

    if(iAns == iMask)
    {
        return TRUE;
    }
}

int main()
{
    UINT iValue = 0;
    UINT iPos = 0;
    BOOL bRet = 0;

    printf("\nEnter a Number:");
    scanf("%d",&iValue);

    printf("\nEnter the Position:");
    scanf("%d",&iPos);



    bRet = CheckBit(iValue,iPos);

    if(bRet == TRUE)
    {
        printf("TRUE");
    }
    else
    {
        printf("False");
    }
    return 0 ;
}
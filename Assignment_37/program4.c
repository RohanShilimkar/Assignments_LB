#include<stdio.h>

typedef unsigned int UINT;

//Toggle the Bit
UINT ToggleBit(UINT iNo,UINT iPos)
{
    UINT iAns = 0;
    UINT iMask = 1;

    iMask = iMask << (iPos - 1);

    iAns = iNo ^ iMask;

    return iAns;    
}

int main()
{
    UINT iValue = 0;
    UINT iPos = 0;
    UINT iRet = 0;

    printf("\nEnter a Number:");
    scanf("%d",&iValue);

    printf("\nEnter the Position:");
    scanf("%d",&iPos);

    iRet = ToggleBit(iValue,iPos);

    printf("%d ",iRet);
    return 0 ;
}
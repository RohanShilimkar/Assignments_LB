#include<stdio.h>

typedef unsigned int UINT;

//Off the Bit
UINT OffBit(UINT iNo,UINT iPos)
{
    UINT iAns = 0;
    UINT iMask = 1;

    iMask = iMask << (iPos - 1);
    iMask = ~iMask;

    iAns = iNo & iMask;

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

    iRet = OffBit(iValue,iPos);

    printf("%d ",iRet);
    return 0 ;
}
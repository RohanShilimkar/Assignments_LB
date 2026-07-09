#include<stdio.h>

typedef unsigned int UINT;

//Off 7th Bit
UINT OffBit(UINT iNo)
{
    UINT iMask = 0xFFFFFFBF;
    UINT iAns = 0;

    iAns = iNo & iMask;

    return iAns;


}

int main ()
{
    UINT iValue = 0;
    UINT iRet = 0;

    printf("Enter a Number:");
    scanf("%d",&iValue);

    iRet = OffBit(iValue);

    printf("%d",iRet);

    return 0;

}
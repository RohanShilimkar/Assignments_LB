#include<stdio.h>

typedef unsigned int UINT;

//On the First 4 bits of Number

UINT ONBit(UINT iNo)
{
    UINT iMask = 0xF;
    UINT iAns = 0;

    iAns = iNo | iMask;

    return iAns;


}

int main ()
{
    UINT iValue = 0;
    UINT iRet = 0;

    printf("Enter a Number:");
    scanf("%d",&iValue);

    iRet = ONBit(iValue);

    printf("%d",iRet);

    return 0;

}
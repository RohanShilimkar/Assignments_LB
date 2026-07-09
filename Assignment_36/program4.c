#include<stdio.h>

typedef unsigned int UINT;

//Toggle 7th Bit
UINT ToogleBit(UINT iNo)
{
    UINT iMask = 0x240;
    UINT iAns = 0;

    iAns = iNo ^ iMask;

    return iAns;


}

int main ()
{
    UINT iValue = 0;
    UINT iRet = 0;

    printf("Enter a Number:");
    scanf("%d",&iValue);

    iRet = ToggleBit(iValue);

    printf("%d",iRet);

    return 0;

}
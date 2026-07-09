#include<stdio.h>

typedef unsigned int UINT;

//Toggle the First And Last Bit
UINT ToggleBit(UINT iNo)
{
   UINT iAns = 0;
   UINT iMask = 0xF000000F;
   
   iAns = iNo ^ iMask;

   return iAns;
}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;

    printf("\nEnter a Number:");
    scanf("%d",&iValue);


    iRet = ToggleBit(iValue);

    printf("%d ",iRet);
    // printf("%u ",iRet);
    return 0 ;
}
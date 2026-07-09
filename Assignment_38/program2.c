#include<stdio.h>

typedef unsigned int UINT;

//Display the Common On Bits of 2 Numbers
void CommonBit(UINT iNo1,UINT iNo2)
{
    UINT iMask = 1;
    UINT iAns = 0;
    int iPos = 1;

    iAns = iNo1 & iNo2;

    while(iMask != 0)
    {
        if((iAns & iMask) != 0)
        {
            printf("%d ",iPos);
        }
        iMask = iMask << 1;
        iPos++;
    }
}

int main()
{
    UINT iValue1 = 0;
    UINT iValue2 = 0;

    printf("\nEnter a Number:");
    scanf("%d",&iValue1);

    printf("\nEnter a Number:");
    scanf("%d",&iValue2);

    CommonBit(iValue1,iValue2);

   
    return 0 ;
}
#include<stdio.h>

typedef unsigned int UINT;

//Count Number of 1s
UINT CountOne(UINT iNo)
{
    UINT iCount = 0;
    UINT iMask  = 1;

    /*while(iNo !=0)
    { 
        if((iNo & iMask ) == 1)
        {
            iCount++;
        }
        iNo = iNo >> 1;
        
    }*/

    while(iNo != 0)
    {
        iCount = iCount + (iNo & 1);
        iNo = iNo >> 1;
    }

   /*
    while(iNo != 0)
    {
        iDigit = iNo % 2;
        iCount = iCount + iDigit;
        iNo = iNo / 2 ;
        }

    */ 
    return iCount;

}

int main()
{
    UINT iValue = 0;
    UINT iRet =0;
    
    printf("\nEnter a Numner:");
    scanf("%d",&iValue);

    iRet = CountOne(iValue);

    printf("%d",iRet);

    return 0;

}
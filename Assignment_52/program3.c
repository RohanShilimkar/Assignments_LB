#include<stdio.h>


int Result(int sub1,int sub2,int sub3,int sub4,int sub5)
{
    int avg = 0;

    if(sub1<35 || sub2<35 || sub3<35 || sub4<35 || sub5<35)
    {
        return avg;
    }

    avg = (sub1 + sub2 + sub3 + sub4 + sub5)/5;
    
    return avg;
}

int main()
{
    int m1=0,m2=0,m3=0,m4=0,m5=0;
    int iRet = 0;

    printf("Enter marks of Student:");
    scanf("%d%d%d%d%d",&m1,&m2,&m3,&m4,&m5);

    iRet = Result(m1,m2,m3,m4,m5);
    
    if(iRet == 0)
    {
        printf("Failed\n");
    }
    if(iRet >= 75)
    {
        printf("Avg Marks: %d",iRet);
        printf("\nDistinction");
    }
    else if(iRet >= 60)
    {
        printf("Avg Marks: %d",iRet);
        printf("\nFirst class");
    }
    else if(iRet >=50)
    {
        printf("Avg Marks: %d",iRet);
        printf("\nSecond Class");
    }
    else
    {
        printf("Avg Marks: %d",iRet);
        printf("\nPass");
    }

    return 0;
}
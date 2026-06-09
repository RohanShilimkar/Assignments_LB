//Program to find Sum of Digits of Number

class Logic
{
    void SumOfDigits(int num)
    {
        int iCnt=0;
        int iDigit=0;
        int iSum=0;

        // for(;num>0;)
        // {
        //     iDigit = num % 10;
        //     iSum = iSum + iDigit;
        //     num = num/10;
        // }

        while(num>0)
        {
            iDigit = num % 10;
            iSum = iSum + iDigit;
            num = num/10;
        }

        System.out.println("Sum of Digit is:"+iSum);
    }
}

class program1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumOfDigits(1234);

    }
}
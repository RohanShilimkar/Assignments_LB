class Logic
{
    void PrintEvenNumbers(int num)
    {
        int iCnt=0;
        int iEvenSum=0,iOddSum=0;

        for(iCnt=0;iCnt<num;iCnt++)
        {
            int iDigit=0;

            iDigit = num %10;

            if(iDigit % 2 == 0)
            {
                iEvenSum = iEvenSum + iDigit;
            }
            else
            {
                iOddSum = iOddSum + iDigit;
            }

            num = num / 10;

        }

        System.out.println("Sum of Even  "+iEvenSum);
        System.out.println("Sum of Odd  "+iOddSum);
      
    }


}

class program4
{
    public static void main(String a[])
    {
        Logic lobj = new Logic();
        lobj.PrintEvenNumbers(123456);
    }
}
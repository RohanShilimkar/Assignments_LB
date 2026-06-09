class Logic 
{
    void PrintDigits(int num)
    {
        int iCnt =0,iDigit=0;

        for(iCnt=0;iCnt<num;iCnt++)
        {
            iDigit = num % 10;
            System.out.println(iDigit);
            num = num/10;
        }
    }


}

class program4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintDigits(9876);
    }
}
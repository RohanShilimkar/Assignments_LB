class Logic 
{
    void ProductOfDigit(int num)
    {
        int iCnt=0,iDigit=0,iSum=1;

        while(num!=0)
        {
            iDigit = num % 10;
            iSum = iSum * iDigit;
            num = num / 10;
        }

        System.out.println(iSum);
    }

}

class program1
{
    public static void main(String a[])
    {
        Logic lobj = new Logic ();
        lobj.ProductOfDigit(234);
    }
}
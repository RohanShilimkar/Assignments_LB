class Logic
{
    void CheckPrime(int num)
    {
        int iCnt=0;
        boolean isPrime=false;

        for(iCnt=2;iCnt<num/2;iCnt++)
        {
            if(num % iCnt == 0)
            {
                isPrime = true;
                break;
            }
        }

        if(isPrime == true)
        {
            System.out.println(num+" Number is not Prime");
        }
        else
        {
            System.out.println(num+" Number is Prime");

        }

    }

}

class program1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPrime(11);

    }
}
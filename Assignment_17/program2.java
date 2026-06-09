
class Logic
{
    void checkPalindrome(int num)
    {
        int iCnt=0,iRev=0,iDigit=0;
        int iTemp=num;

        while(num!=0)
        {
            iDigit = num % 10;
            iRev = (iRev*10) + iDigit;
            num = num/10;
        }

        if(iTemp==iRev)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");

        }
    }

} 


class program2
{
    public static void main(String a[])
    {
        Logic lobj = new Logic();
        lobj.checkPalindrome(121);
    }
}
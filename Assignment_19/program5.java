class Logic 
{
    void CalculatePower(int base , int exp)
    {
        int iResult=1;
        
        for(int iCnt=0;iCnt<exp;iCnt++)
        {
            iResult = iResult * base;
        }

        System.out.println(iResult);
    }

}

class program5
{
    public static void main(String a[])
    {
        Logic lobj = new Logic();
        lobj.CalculatePower(2,5);
    }
}
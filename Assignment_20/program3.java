class Logic 
{
    void CheckPerfect(int num)
    {
        int iCnt=0,iSum=0;
        for(iCnt=0;iCnt<num;iCnt++)
        {
            if(iCnt%2==0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == num)
        {
            System.out.println("Number is perfect");
        }
        else
        {
            System.out.println("Number is not perfect");
        }
    }

}

class program3
{
    public static void main(String args[])
    {
        Logic lobj = new Logic();
        lobj.CheckPerfect(6);
    }
}
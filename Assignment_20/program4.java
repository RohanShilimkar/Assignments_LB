class Logic 
{
    void FindLargestDigit(int num)
    {
        int iDigit = 0,iMax=0;
        while(num>0)
        {
            iDigit = num %10;

            if(iDigit > iMax)
            {
                iMax = iDigit;
            }
            num = num / 10;
        }

        System.out.println(iMax);
    }

}

class program4
{
    public static void main(String args[])
    {
        Logic lobj = new Logic();
        lobj.FindLargestDigit(83429);
    }
}
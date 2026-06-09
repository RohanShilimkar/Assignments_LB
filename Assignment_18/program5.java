class Logic
{
    void CheckSign(int num)
    {
        if(num<0)
        {
            System.out.println("Number is Negative");
        }
        else if(num == 0)
        {
            System.out.println("Number is Zero");
        }
        else{
            System.out.println("Number is Positive");

        }
    }

}

class program5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckSign(-8);
    }
}
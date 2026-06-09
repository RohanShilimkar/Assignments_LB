
class Logic
{
    void FindMinimum(int a,int b,int c)
    {
        if(a>b && a>c)
        {
            System.out.println(a+" is Greater");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+" is Greater");
        }
        else{
            System.out.println(c+" is Greater");

        }
    }
}

class program4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindMinimum(3,7,2);
    }
}
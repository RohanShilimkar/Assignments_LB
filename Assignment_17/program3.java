
class Logic
{
    void FindMax(int a,int b)
    {
        if(a>b)
        {
            System.out.println(a+" is Greater than "+b);
        }
        else if(b>a)
        {
            System.out.println(b+" is Greater than "+a);
            
        }
        else if(a==b)
        {
            System.out.println(a+ " Number is Equal to "+b);
        }
    }

}

class program3
{
    public static void main(String a[])
    {
        Logic lobj = new Logic();
        lobj.FindMax(20,15);

    }
}
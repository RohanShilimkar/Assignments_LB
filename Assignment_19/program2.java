class Logic
{
    void DisplayGrade(int marks)
    {
        if(marks < 35)
        {
            System.out.println("Failed");
        }
        else if(marks > 35 && marks < 60)
        {
            System.out.println("D Grade");
        }
        else if(marks > 60 && marks < 75)
        {
            System.out.println("C Grade");
        }
        else if(marks > 75 && marks < 90)
        {
            System.out.println("B Grade");
        }
        else
        {
            System.out.println("A Grade"); 
        }
    }

}

class program2
{
    public static void main(String a[])
    {
        Logic lobj = new Logic();
        lobj.DisplayGrade(82);
    }
}
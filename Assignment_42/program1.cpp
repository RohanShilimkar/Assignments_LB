#include<iostream>
using namespace std;

template<class T>
void Display(T Value,int iSize)
{
    for(int i=1;i<=iSize;i++)
    {
        cout<<Value;
    }

}

int main()
{
    Display('M',7);
    cout<<endl;
    Display(11,3);
    cout<<endl;
    Display(3.7,6);
    cout<<endl;

    return 0;

}
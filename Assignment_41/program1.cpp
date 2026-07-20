#include<iostream>
using namespace std;

template<class T>
T Multiply(T No1,T No2)
{
    T ans;
    ans = No1 * No2;
    return ans;

}

int main()
{
    int iRet = 0;
    iRet = Multiply(10,20);

    cout<<iRet<<endl;
    
    float fRet = 0.0f;
    fRet = Multiply(10.5f,20.4f);
    
    cout<<fRet<<endl;

    return 0;

}
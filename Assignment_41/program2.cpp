#include<iostream>

using namespace std;

template<class T>
T Max(T No1,T No2,T No3)
{
   T ans;

   if(No1>No2 && No1>No3)
   {
        ans = No1;
   }
   else if(No2>No1 && No2>No3)
   {
        ans = No2;
   }
   else{
    ans = No3;
   }
    
    return ans;

}

int main()
{
    int iRet = 0;
    iRet = Max(10,20,100);

    // printf("%d",iRet);
    cout<<iRet<<endl;
    
    float fRet = 0.0f;
    fRet = Max(10.5f,20.4f,45.1f);
    
    // printf("%f",fRet);
    cout<<fRet<<endl;

    return 0;

}
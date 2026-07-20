#include<iostream>
using namespace std;

template<class T>
T Min(T *arr,int iSize)
{
    int i = 0;
    T Min = arr[i];

    for(i=0;i<iSize;i++)
    {
        if(Min > arr[i])
        {
            Min = arr[i];
        }
    }

    return Min;

}

int main()
{
    int arr[] = {10,20,30,40,50};
    float brr[] = {10.4f,3.7f,9.8f,8.7f};

    int iRet = Min(arr,5);

    cout<<iRet<<endl;

    float fRet = Min(brr,4);
    cout<<fRet<<endl;
    
    return 0;

}

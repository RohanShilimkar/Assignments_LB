#include<iostream>
using namespace std;

template<class T>
T Add(T *arr,int iSize)
{
    T Sum =0;
    int i = 0;

    for(i=0;i<iSize;i++)
    {
        Sum = Sum + arr[i];
    }

    return Sum;

}

int main()
{
    int arr[] = {10,20,30,40,50};
    float brr[] = {10.0f,3.7f,9.8f,8.7f};

    int iSum = Add(arr,5);

    cout<<iSum<<endl;

    float fSum = Add(brr,4);
    cout<<fSum<<endl;
    
    return 0;

}

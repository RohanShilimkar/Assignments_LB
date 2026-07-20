#include<iostream>
using namespace std;

template<class T>
int SearchLast(T *arr,int iSize,T No)
{
    int i=0;

    for(i=iSize-1;i>0;i--)
    {
        if(arr[i] == No)
        {
            i++;
            break;
        }
    }

    return i;

}

int main()
{
    int arr[] = {10,20,30,10,30,40,10,40,10};

    int iRet = SearchLast(arr,9,40);
    cout<<"Last Occurence is: "<<iRet<<endl;

    return 0;

}
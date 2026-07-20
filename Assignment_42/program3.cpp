#include<iostream>
using namespace std;

template<class T>
int SearchFirst(T *arr,int iSize,T No)
{
    int i=0;

    for(i=1;i<iSize;i++)
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

    int iRet = SearchFirst(arr,9,40);
    cout<<"First Occurence is: "<<iRet<<endl;

    return 0;

}
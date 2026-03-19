#include<iostream>
using namespace std;
int main()
{
    int arr[5];
    int rev=0;
    int n=5;

    cout<<"Enter numbers :";

    for(int i=0 ; i<5 ; i++)
    {
        cin>>arr[i];
    } 
    for(int i=4 ; i>=0 ; i--){

        cout<<arr[i];
    }
}

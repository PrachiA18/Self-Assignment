#include<iostream>
using namespace std;

int main(){
    int num, i=2;
    cout << "enter number ";
    cin >> num;
    while(i< num){
        if(num % i == 0)
            break;
        i++;
    }
        if(i==num)
            cout<<"prime";
        else
            cout<< " not prime";
}
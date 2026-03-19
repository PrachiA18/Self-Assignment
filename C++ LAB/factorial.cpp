#include<iostream>
using namespace std;

int main(){
    int num = 3;
    int fact;
    for(int i = 3;i<=10;i++){
        fact = 1;
        for(int j=1; j<i; j++){
            fact = fact * j;
        }
    }
    cout<<fact;
}
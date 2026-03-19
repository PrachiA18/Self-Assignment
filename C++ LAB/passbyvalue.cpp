#include<iostream>
using namespace std;

int swap1(int,int);
int main(){
    int x,y,z;
    cout<<"enter value of xand y \n";
    cin>>x>>y;
    cout<<"before swapping value of x and y are" << x << y << endl;

    z=swap1(x,y);
    cout<<"value of x = "<<x<<"  "<<"value of y = "<<y<<endl;
    
}

int swap1(int a ,int b){
    int temp = a;
    a = b;
    b = temp;
    
    cout<<"value of a = "<<a<<"  "<<"value of b = "<<b<<endl;
    return a,b;

}



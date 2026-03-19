#include<iostream>
using namespace std;

void swap1(int*,int*);
int main(){
    int x,y;
    cout<<"enter value of xand y \n";
    cin>>x>>y;
    cout<<"before swapping value of x and y are" << x << y << endl;

    swap1(&x, &y);
    cout<<"value of x = "<<x<<"  "<<"value of y = "<<y<<endl;
    
}

void swap1(int* a ,int* b){
    int temp = *a;
    *a = *b;
    *b = temp;
    
    cout<<"value of a = "<<*a<<"  "<<"value of b = "<<*b<<endl;
    

}



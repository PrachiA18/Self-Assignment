#include<iostream>
using namespace std;

int main(){
    int i=1;


    while(i<= 25){
        int count = 0;
        for(int j=1; j<= i; j++){
            if(i % j ==0){
                count++;
            }
            
        }
        if(count == 2){
                cout<< i<< endl;
            }
            i++;
    }
}
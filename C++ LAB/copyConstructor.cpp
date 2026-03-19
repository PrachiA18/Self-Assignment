#include<iostream>
using namespace std;

class Sample{
    int id;
    public:
    Sample(int x){
        cout<<"constructor is called\n";
        int id= x;
    }
    void display(){
        cout << id <<endl;
    }
};

int main(){
    Sample obj1(10);
    obj1.display();

    Sample obj2(obj1);
    obj2.display();
}
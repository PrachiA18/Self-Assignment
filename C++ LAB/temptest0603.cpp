#include<iostream>
using namespace std;

class Test
{
int a,b;
public:
void show()
{
a=10;
b=20;
cout<<"obj add"<<this<<endl;//print current class obj adddress
cout<<"a" <<this->a<<endl;
cout<<"b"<<this->b<<endl;
}
};
int main()
{
Test t;
cout<<&t<<endl;
t.show();
}
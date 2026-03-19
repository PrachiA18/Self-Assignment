#include<iostream>
using namespace std;
class Complex
{
  int real,img;
  public:
    Complex(int r,int i)
    {
      real=r;
      img=i;
    }
    void display()
    {
      cout<<"address inside this  is "<<this<<endl;
      cout<<this->real<<"+"<<this->img<<"i"<<endl;
    }
};
int main()
{

  Complex c1(1,2);
  cout<<"address of object c1 is "<<&c1<<endl;
  c1.display();
  
  Complex c2(3,4);
    cout<<"address of object c1 is "<<&c2<<endl;
  c2.display();
  
  
}
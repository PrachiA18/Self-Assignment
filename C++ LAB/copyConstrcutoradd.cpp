 #include<iostream>
 using namespace std;
 class sample
 {
    int id;

    public:

    sample (int x){

        cout<<"constrcutor is called\n";
        id=x;

      
    }
    void display(){

          cout<<id<<endl;

    }
    sample(sample& new_obj1){
          
        new_obj1.id= this->id;
    }

 };
 int main()
 {
    sample obj1(10);
    obj1.display();
    sample obj2(obj1);
    obj2.display();

 }
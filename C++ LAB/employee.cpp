#include <iostream>
#include <string>
using namespace std;

// Global variable
string companyName = "TechM";

class Employee {
private:
    int empId;
    string name;
    int salary;
    static int totalEmployees;

public:
    // Constructor
    Employee(int id, string n, int s) {
        empId = id;
        name = n;
        salary = s;
        totalEmployees++; 
    }

 
    void display() {
        cout << "Company Name: " << companyName << endl;
        cout << "Employee ID: " << empId << endl;
        cout << "Name: " << name << endl;
        cout << "Salary: " << salary << endl;
        cout << "-----------------------------" << endl;
    }

    
    static void showTotalEmployees() {
        cout << "Total Employees Created: " << totalEmployees << endl;
    }
};


int Employee::totalEmployees = 0;

int main() {
  
    Employee e1(101, "Amit", 50000);
    Employee e2(102, "manthan", 60000);
    Employee e3(103, "sanika", 55000);
    Employee e4(104, "Geet", 70000);
    Employee e5(105, "Abhishek", 65000);

 
    e1.display();
    e2.display();
    e3.display();
    e4.display();
    e5.display();

 
    Employee::showTotalEmployees();

    return 0;
}



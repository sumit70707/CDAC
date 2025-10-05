// 2:Create Employee class with members id(int),name(string),dob(Date).Use above created Date class.
// Write default and parameterised constructor in Employee Class.Write accept() function to accept information and display() to display emp information.
#include<iostream> 
using namespace std;


class Employee{
    private:
    int id;
    string name;
    string dob;
    public:
    Employee(){
        id=101;
        name="Siddhart";
        dob="15/08/2001";

    }
    Employee(int id,string name,string dob){
        this -> id=id;
        this-> name=name;
        this-> dob=dob;
    }
    void accept(int id,string name,string dob ){
         this -> id=id;
        this-> name=name;
        this-> dob=dob;
    }

    void display(){
        cout<<"Employee ID: "<<id<<endl;
        cout<<"Employee Name: "<<name<<endl;
        cout<<"Employee Dob: "<<dob<<endl;
    }


};
int main(){
    Employee emp;
    Employee emp1(102,"Sumit","05/04/2001");
    emp.accept(103,"Pushpa","09/09/1999");
    emp.display();
    emp1.display();
    emp1.display();

}
// 3:Consider that payroll software needs to be developed for computerization of
// operations of an ABC organization. The organization has employees.
// 3.1. Construct a class Employee with following members using private access
// specifies:
//  Employee Id integer
//  Employee Name string
//  Basic Salary double
//  HRA double
//  Medical double=1000
//  PF double
// PT double
//  Net Salary double
//  Gross Salary double
// Please use following expressions for calculations://Note:Don't accept HRA,PF PT from user
//  * HRA = 50% of Basic Salary
// * PF = 12% of Basic Salary
// * PT = Rs. 200

// 3.2. Write methods to display the details of an employee and calculate the gross
// and net salary.
// * Goss Salary = Basic Salary + HRA + Medical
// * Net Salary = Gross Salary – (PT + PF)

// Create Object of employee class and assign values and display Details.

#include <iostream>
using namespace std;

class Employee
{
private:
    int id;
    string name;
    double salary;
    double hra;
    double medical = 1000;
    double pf ;
    double pt;
    double net_salary;
    double gross_salary;
    public:
    Employee(){
        id =101;
        name = "john";
        salary = 10000;
        void cal_miscellenious();
        void cal_salary();
    }
    Employee(int id , string name , double salary){
        this->id = id;
        this->name = name;
        this->salary = salary;
        void cal_miscellenious();
        void cal_salary();
    }

    void cal_miscellenious(){
        hra = 0.5 * salary;
        pf = 0.12 * salary;
        pt = 200;
    }
    
    void cal_salary(){
        gross_salary = salary + hra+ medical;
        net_salary = gross_salary - (pt+pf);
    }
    void display(){
        cout <<"Employee Id: "<< id << endl;
        cout <<"name: "<< name << endl;
        cout <<"salary "<< salary << endl;
        cout <<"gross_salary: "<< gross_salary << endl;
        cout <<"net_salary: "<< net_salary << endl;
        cout <<"hra: "<< hra << endl;
        cout <<"pf: "<< pf << endl;
    }



};

int main(){
    Employee emp1;
    emp1.display();
    Employee emp2(102,"Sumit",50000);
    emp2.display();
}


#include <iostream>
using namespace std;

template <class T>
class Calculator{

    private :
    T num1;
    T num2;
     
    public:

    T add(T &num1,T &num2){
        this -> num1=num1;
        this -> num2=num2;
        return num1+num2;
    }

    T substract(T &num1,T &num2){
        this -> num1=num1;
        this -> num2=num2;
        return num1-num2;
    }

    T multiply(T &num1,T &num2){
        this -> num1=num1;
        this -> num2=num2;
        return num1*num2;
    }

    T divide(T &num1,T &num2){
        this -> num1=num1;
        this -> num2=num2;
        return num1/num2;
    }


};

int main(){
    Calculator <int> calc1;
    Calculator <double> calc;
double num1=5.5;
double num2=4.5;

    cout<<" Addition of Num1 and Num2 is  : "<<calc.add(num1,num2)<<endl;
    cout<<" Substraction of Num1 and Num2 is  : "<<calc.substract(num1,num2)<<endl;
    cout<<" Multiply of Num1 and Num2 is  : "<<calc.multiply(num1,num2)<<endl;
    cout<<" Division of Num1 and Num2 is  : "<<calc.divide(num1,num2)<<endl;
}
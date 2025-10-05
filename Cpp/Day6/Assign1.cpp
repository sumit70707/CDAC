#include<iostream>
using namespace std;


template < class T>
void Swap(T& a,T& b){
    T temp;
    temp=a;
    a=b;
    b=temp;
    cout<<"Value of n after swap: "<<a<<endl;
    cout<<"Value of n1 after swap: "<<b<<endl;
};
template < class T>
T Max(T& num1, T& num2){
if(num1>num2){
    return num1;
}
return num2;
}

int main(){
    double n=9.6;
    double n1=8.5;
    Swap(n,n1);
    char ch='A';
    char ch1='B';
    Swap(ch,ch1);
    int a=99,b=20;
    string str="Hi";
    string str1="Hj";
    //Max(ch,ch1);
    //Max(a,b);
    cout<<"Max value of cha : "<< Max(str1,str)<<endl;
    cout<<"Max value of cha : "<< Max(ch,ch1)<<endl;
    cout<<"Max value is : "<<Max(a,b);
}

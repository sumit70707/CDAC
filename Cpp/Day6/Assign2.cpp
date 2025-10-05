#include<iostream>
using namespace std;

template <class T>
class Myclass{

    private :
    T num;

    public:
   void setter(T& n){
        this -> num=n;
    }

    void getter(){
        cout<<"Value of n is : "<<num<<endl;
    }

};

int main(){
    Myclass<int> m;
    int n=10;
    m.setter(n);
    m.getter();

}


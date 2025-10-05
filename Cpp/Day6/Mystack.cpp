#include<iostream>
using namespace std;

template <class T,size_t N>
class mystack{

    private :
    int size;
    T arr[size];

    public:
    void push(T &num,size){
       for(int i=0;i<size;i++){
        arr[i]=num;
       }
    }
    T peek(){
        return arr[size-1];
    }

    T isEmpty(){
        
    }


}
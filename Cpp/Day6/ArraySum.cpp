#include<iostream>
using namespace std;

template <class T,size_t N>
T arraySum(T (&arr)[N]){
    T sum=0;
    for(int i=0;i<N;i++){
        sum+=arr[i];
    }
    return sum;

};
int main(){
    int arr[]={10,20,30,40,50};
    int size=5;
    cout<<"Sum od Array is : "<<arraySum(arr)<<endl;
}

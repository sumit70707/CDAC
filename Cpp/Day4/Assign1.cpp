#include<iostream>
using namespace std ;
class date{
    private:
    int day;
    int month ;
    int year ;

    public:
        date(){
            this->day = 12;
            this->month = 12;
            year = 12;
        }
        date(int day , int month , int year){
            this->day=day;
            this->month=month;
            this->year=year;
        }
       void display(){
            cout << "Date is :" << day <<"/"<< month <<"/"<< year<< endl;
        }
        };
int main(){
    date d1;
    d1.display();
    date d2(15,8,2001);
    d2.display();
}
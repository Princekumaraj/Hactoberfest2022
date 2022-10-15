#include<bits/stdc++.h>
using namespace std;

int main() {
    int a, b, c, d, r1, r2,r;
    cout<<"enter a: ";
    cin>>a;
    cout<<"enter b: ";
    cin>>b;
    cout<<"enter c: ";
    cin>>c;
    d=(b*b)-(4*a*c);
    if(d>0){
        r1=(-b+sqrt(d))/(2*a);
        r2=(-b-sqrt(d))/(2*a);

        cout<<r1<<" "<<r2;
    }
    else if(d<0){
        r1=(sqrt(-d))/(2*a);
        r1=(-b)/(2*a);
        cout<<"imaginary root: "<<r1<<endl;
        cout<<"real root: "<<r2<<endl;
    }
    else if(d==0){
        r=(-b+sqrt(d))/(2*a);
        cout<<r;
    }
    
    }

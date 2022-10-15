#include<bits/stdc++.h>
using namespace std;

int main(){ 
    int n, sum=0;
    
    cout<<"enter no: "<<endl;
    cin>>n;
    
    while(n!=0){
        sum = sum + n%10;
        n = n/10;
        }
        
    cout<<"sum of digits is "<<sum;

    return 0;
}
        

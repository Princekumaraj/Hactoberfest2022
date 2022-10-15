#include<bits/stdc++.h>
using namespace std;

int main(){
int num, reverse=0, rem;

num = 4835;
cout<<"the number is "<<num<<endl;

while(num != 0){
    rem = num%10;
    reverse = reverse*10+rem;
    num = num/10;
    }
    
cout<<"reversed number is "<<reverse;

return 0;
}

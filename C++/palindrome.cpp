#include<bits/stdc++.h>
using namespace std;

int main(){
int num, reverse=0, rem, temp;

cout<<"enter number "<<endl;
cin>>num;

temp = num;

while(temp != 0){
    rem = temp%10;
    reverse = reverse*10+rem;
    temp = temp/10;
    }
    
if(num == reverse)
    cout<<"it is a palindrome number";
    
else
    cout<<"it is not a palindrome number";
    

return 0;
}

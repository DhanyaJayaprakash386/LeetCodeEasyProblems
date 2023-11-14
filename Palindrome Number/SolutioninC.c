#include<stdio.h>
#include<stdbool.h>
bool PalindromeCheck(int x){
    if((x<0)||((x%10)==0)&&(x!=0)){
       return false;
    }
    else if((x/10)==0){
            //printf("Not palindrome");
            return true;
    }
    int temp=x;
    int rev=0,div=0;
    while(temp!=0){
        div=temp%10;
        rev=rev*10+div;
        temp=temp/10;
    }
    if(rev == x){
        //printf("Palindrome");
        return true;
    }
    else{
        //printf("Not palindrome");
        return false;
    }

}
void main(){
    int x=0;
    bool palindrome = PalindromeCheck(x);
    //printf(palindrome?"true":"false"); //prints true/false
    printf("%s",palindrome?"true":"false");
    //printf(palindrome);//prints 1 or 0
}
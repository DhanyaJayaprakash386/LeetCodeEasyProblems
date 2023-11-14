#include<stdio.h>
#include<string.h>
int Character(char x){
    switch(x){
        case 'I': return 1;
                  break;
        case 'V': return 5;
                  break;
        case 'X': return 10;
                  break;
        case 'L': return 50;
                  break;
        case 'C': return 100;
                  break;
        case 'D': return 500;
                  break;
        case 'M': return 1000;
                  break;
    }

}
int RomanNumber(char *input){
    int length = strlen(input);
    int i,s1,s2,total=0;
    //printf("%s\n",input);
    //printf("Length of string:%d\n",length);
    for(i=0;input[i]!='\0';i++){
        s1=Character(input[i]);
      //  printf("i=%d, s1=%d\n",i,s1);
        s2=Character(input[i+1]);
        //printf("i+1=%d,s2=%d\n",i+1,s2);
        if(s1>=s2){ 
            total = total+s1;
          //  printf("in IF s1=%d,total=%d\n",s1,total);
        }
        else{
            total=total-s1;
            //printf("in Else s1=%d,total=%d\n",s1,total);
        }
    } 
   // s1=Character(input[i]);
  //  total = total+s1;
    return total;

}
void main(){
    char input[] = "MCMXCIV";
    
    //printf("outside for s1=%d,total=%d\n",s1,total);
    printf("%d",RomanNumber(input));

}
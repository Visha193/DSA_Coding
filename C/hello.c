#include<stdio.h>
int main(){
    float temperature = 25.5;

switch (temperature) {
    case 20.0:
        printf("Sweater pehno\n");
        break;
    case 25.0:
        printf("Light jacket pehno\n");
        break;
    case 30.0:
        printf("T-shirt pehno\n");
        break;
    default:
        printf("Kuch bhi pehno\n");
}

    return 0;
}
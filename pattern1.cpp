#include<iostream>
using namespace std;

int main() {
    int row=10;
    int col=50;

    for(int i=1; i<=row; i++){
        for(int j=1; j<=col; j++){
            if(i==1 || i==row){
                cout<<"*";
                continue;
            }

            if(j==1 || j==col){
                cout<<"*";
            }
            else{
                cout<<" ";
            }

        }
        cout<<"\n";
    }

    return 0;
}
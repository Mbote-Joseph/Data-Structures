#include<stdio.h>
#include<stdlib.h>


typedef struct node{
    int number;
    struct node *left;
    struct node *right;
}
node;

int main(void){

// int arrayList[]={1,2,3,4,5,6,7,8,9};

bool search(node *tree, int number)
{
    if(tree == NULL){
        return false;
    }else if(number < tree->number){
        return search(tree->left, number);
    }else if(number > tree->number){
        return search(tree->right, number);
    }else{
        // When number == tree->number
        return true;
    }

    // int a=arrayList.search(6);

    // printf("%i\n", a);
}
}
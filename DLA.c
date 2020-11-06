#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node* next;
    struct node* prev;
};

void push(struct node** head_ref,int new_data){

    struct node* new_node = (struct node*)malloc(sizeof(struct node));
    new_node ->data = new_data;
    new_node->next = (*head_ref);
    new_node->prev = NULL;
    if((*head_ref) != NULL){
            (*head_ref)->prev = new_node;
    }
    (*head_ref) = new_node;
}

void insert_after(struct node* prev_node, int new_data){
    if(prev_node == NULL){
            printf("\n Previous node can not be NULL");
            return;
    }
    struct node* new_node = (struct node*)malloc(sizeof(struct node));
    new_node -> data = new_data;
    new_node->next = prev_node -> next;
    prev_node ->next = new_node;
    new_node ->prev = prev_node;

    if(new_node->next != NULL){
            new_node->next->prev =new_node;
    }
}

void print_list(struct node* n){

    for(int i=0;i<n;i++){
            printf("%d->", n->data);
            n = n->next;
    }
}

int main(){

    struct node* head = NULL;
    push(&head,7);
    push(&head,8);
    push(&head,9);
    push(&head, 10);
    push(&head,11);
    push(&head, 12);
    printf("\n The linked list is -     ");
    print_list(head);
    insert_after(head->next->next,14);
    printf("\n The new linked list is -    ");
    print_list(head);
    return 0;
}


import java.util.*;
public class ArraytoStack {
    int array[];
    int top;
    int capacity;

    ArraytoStack(int size){
        array = new int[size];
        top=-1;
        capacity=size;
    }
   public Boolean isFull(){
       return capacity==top+1;
   }

   public Boolean isEmpty(){
       return top==-1;
   }


    //push element in top of the stack
    public void push(int x){
        if(isFull()){
        System.out.println("Stack Overflow");
        System.exit(1);
        }
        System.out.println("Inserting element in stack:" +x );
         array[++top]=x;
    }
    //pop the element in top of the stack
    public int pop (){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            System.exit(1);
        }
      return array[top--];
    }

    public int getSize() {
        return top + 1;
    }

    public void printStack() {
        int i = top;
        while ( i>=0) {
          System.out.println("      " + array[i]);
          i--;
        }
      }

  public static void main(String []args){
    ArraytoStack stack = new ArraytoStack(5);
  
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);

    System.out.println("Stack: ");
    stack.printStack();

    // remove element from stack
    stack.pop();
    System.out.println("\nAfter popping out");
    stack.printStack();
    stack.pop();
    System.out.println("\nAfter popping out");
    stack.printStack();
    
  }
}
 


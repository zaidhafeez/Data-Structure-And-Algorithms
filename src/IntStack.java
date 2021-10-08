// class IntStack {

//     private int top;

//     private int stack[];

//     private int size;

//     IntStack(){
//         top = -1;
//         size = 20;
//         stack = new int[20];
//     }

//     public boolean push(int item){

//         if(!isFull()){

//             top++;
//             stack[top] = item;
//             return true;

//         }
//         else {
//             return false;
//         }
        
        
//     }

//     public int pop(){

//         return (stack[top--]);

//     }

//     public boolean isFull(){

//         return (top == size - 1);

//     }

//     public boolean isEmpty(){

//         return(top == -1);

//     }
    
// }

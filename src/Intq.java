// public class Intq {

//     private int front;
//     private int rear;
//     // private int total;

//     private int size;
//     private int[] q;

//     Intq(int size){

//         this.front = -1;
//         this.rear = -1;
//         // this.total = 0;
//         this.size = size;
//         q = new int[this.size];

//     }

//     public boolean enqueue(int item) {
        
//         if(!isFull()){

//             if(rear == -1){
//                 front = rear = 0;
//             }
//             else{
//                 rear++;
//             }

//             // insert item;
//             q[rear] = item;

//             return true;
            
//         }
//         else{
//             System.out.println("QUEUE IS FULL");
//             return false;
//         }
        
        
//     }

//     public int dequeue(){
        
//         if(!isEmpty()){
//             int item = q[front];
//             if(front == rear){
//                 front = rear = -1;
//             }
//             else{
//                 front++;
//             }

//             return item;
//         }
//         else{
//             return 0;
//         }
        
        

//     }

//     public void shiftingQ() {

//         int j = 0;

//         if(front > 0 && rear==size - 1){

//             for(int i = front; i <=rear; i++){
//                 q[j] = q[i];
//                 j++;
//             }

//         }

//         front = 0;
//         rear = j - 1;
        
//     }

//     public boolean isFull() {

//         if(rear == size - 1){

//             return true;

//         }else{
//            return false;
//         }
        
//     }

//     public boolean isEmpty(){

//         if(front == -1){
//             return true;
//         }
//         else{

//             return false;

//         }
        

//     }

//     public void showAll(){

//         for (int item : q) {

//             System.out.println(item);
            
//         }

//     }
    
// }

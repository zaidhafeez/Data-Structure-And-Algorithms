
public class CircularQ {

    private int rear;
    private int front;
    private int size;
    private int[] q;

    CircularQ(int size){
        
        this.rear = -1;
        this.front = -1;
        this.size = size;
        this.q = new int[this.size];

    }
    
    public boolean enqueue(int item) {

        if(!isFull()){

            if(rear == -1){
                front = rear = 0;
            }
            else if(rear == size - 1){
                rear = 0;
            }
            else{
                rear++;
            }


            q[rear] = item;
            return true;
        }
        else{
            return false;
        }
    }


    public int dequeue(){
        int item;
        if(!isEmpty()){

            item  = q[front];
            if (front == rear) {

                front = rear = -1;
                
            }
            else if(front == size - 1) {

                front = 0;
                
            }
            else{
                front++;
            }

            return item;

        }

        return 0;



    }

    public boolean isFull(){
        if((front == 0 && rear == size - 1)|| (front == rear + 1)){
            System.out.println("QUEUE iS FULL");
            front = rear + 1;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEmpty(){
        if(front == -1){

            System.out.println("Queue is empty");
            return true;

        }
        else {
            return false;
        }
    }

    public void showAll(){
        for(int item: q){
            System.out.println(item);
        }
    }

}


public class CalStack {

    private int top;
    private int size;
    private Calculator[] history;

    CalStack(int size){

        this.top = -1;
        this.size = size;
        this.history = new Calculator[this.size];

    }

    public boolean push(Calculator result){

        if(!isFull()){

            top++;
            history[top] = result;
            return true;

        }
        else{
            return false;
        }

    }

    public Calculator pop(){

        // Calculator history1;

        // if(!isEmpty()){

        //     history1 = history[top--];
        //     return history1;

        // }
        
        return history[top--];

        

    }

    public boolean isFull(){

        if(top == size - 1){
            return true;
        }
        else{
            return false;

        }
    }

    public boolean isEmpty(){

        if(top == -1){

            return true;

        }
        else{
            return false;
        }

    }
    
}

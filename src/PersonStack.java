public class PersonStack {

    private int top;
    private Person stack[];
    private int size;

    PersonStack(){

        top = -1;
        stack = new Person[20];
        size = 20;

    }

    public boolean push(Person item){
        if (!isFull()) {

            top++;
            stack[top] = item;
            return true;
            
        } else {

            return false;
            
        }
        

    }

    public Person pop() {

        return stack[top--];

    }

    public boolean isFull(){

        return(top == size - 1);

    }

    public boolean isEmpty(){

        return(top == -1);

    }
    
}

public class App {
    public static void main(String[] args) throws Exception {
        // IntStack stack = new IntStack();
        // if(!stack.isFull()){

        //     stack.push(2);
        //     stack.push(3);
        //     stack.push(5);
        //     stack.push(9);

        // }
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());


        // Person person1 = new Person("zaid", 123);

        // Person person2 = new Person("zubair", 321);

        // PersonStack stack = new PersonStack();
        // stack.push(person1);
        // stack.push(person2);

        // System.out.println(stack.pop().toString());
        // System.out.println(stack.pop().toString());

        //--------------QUEUE------------------//

    //     Intq q = new Intq(4);
    //     q.enqueue(3);
    //     q.enqueue(4);
    //     q.enqueue(5);
    //     q.enqueue(6);

    //     System.out.println(q.dequeue());
    //     System.out.println(q.dequeue());
    //     System.out.println(q.dequeue());
    //     // System.out.println(q.dequeue());
    //     q.shiftingQ();
    //     q.enqueue(7);
    //     q.enqueue(8);
    //     q.enqueue(9);
    //     q.showAll();

    //     q.enqueue(10);


        // Calculator calc = new Calculator(15, 25);

        // CalStack history = new CalStack(5);
        // history.push(calc);
        // System.out.println(history.pop().sum());

        CircularQ cq = new CircularQ(5);
        cq.enqueue(5);
        cq.enqueue(6);
        cq.enqueue(8);

        cq.showAll();

       System.out.println(cq.dequeue());
       System.out.println(cq.dequeue());
        
        // cq.showAll();

        cq.enqueue(3);
        cq.enqueue(4);
        cq.enqueue(7);
        cq.enqueue(9);

        // cq.showAll();
        cq.enqueue(10);

        


    }

}

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


        Person person1 = new Person("zaid", 123);

        Person person2 = new Person("zubair", 321);

        PersonStack stack = new PersonStack();
        stack.push(person1);
        stack.push(person2);

        System.out.println(stack.pop().toString());
        System.out.println(stack.pop().toString());

    }
}

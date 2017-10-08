public class Stack {
    private String[] stack;
    private int top;

    public Stack () {
        this.stack = stack;
        this.top = 0;
    }

    void push(String item){
        this.stack[top] = item;
        this.top = this.top + 1;
    }

    void pop(){
        this.top = this.top - 1;
        this.stack[top] = null;
    }

    void init(int length){
        this.stack = new String[length];
    }

    void printStack(){
        for(int i = 0; i < this.stack.length; i++){
            System.out.println(this.stack[i]);
        }
        System.out.println(this.top);
    }

    void peek(){
        System.out.println(this.stack[this.top - 1]);
    }

}

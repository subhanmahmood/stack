import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Stack stack = new Stack();
        System.out.print("Stack length: ");
        Scanner sc = new Scanner(System.in);
        int stackLength = sc.nextInt();
        stack.init(stackLength);
        Boolean valid;
        do {
            valid = true;
            System.out.print("Command: ");
            String input = sc.next();
            String[] options = input.split("\\s+");
            if (options[0].equals("push")) {
                if(options.length == 2){
                    stack.push(options[1]);
                }
            } else if (options[0].equals("pop")) {
                stack.pop();
            } else if (options[0].equals("peek")) {
                stack.peek();
            } else if (options[0].equals("print")) {
                stack.printStack();
            } else if (options[0].equals("exit")) {
                valid = false;
            }
            System.out.println("");
        } while (valid);


    }

    void push() {

    }


}

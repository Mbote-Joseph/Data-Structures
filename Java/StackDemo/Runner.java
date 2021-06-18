package Java.StackDemo;

public class Runner {
    public static void main(String[] args){
        Stack nums= new Stack();
        nums.push(15);
        nums.push(8);
        nums.push(10);

        System.out.println(nums.peek());
        nums.push(20);
        nums.push(17);
        nums.push(13);
        System.out.println(nums.pop());
        System.out.println("Size of the stack is : "+nums.size());
        nums.push(30);

        System.out.println("isEmpty : "+nums.isEmpty());
        nums.show();
        System.out.println("\n");
    }
}

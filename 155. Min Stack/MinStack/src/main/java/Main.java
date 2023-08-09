public class Main {
    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(-2);
        ms.push(0);
        ms.push(-3);

        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.top());
        System.out.println(ms.getMin());
    }
}
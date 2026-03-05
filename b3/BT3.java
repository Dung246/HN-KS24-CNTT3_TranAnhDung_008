package b3;
import java.util.*;

public class BT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số :");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Lỗi: số không hợp lệ");
            return;
        }
        if (n == 0) {
            System.out.println("Output: "+0);
            return;
        }
        Stack<Integer> stack = new Stack<>();
        while (n > 0) {
            stack.push(n % 2);
            n = n / 2;
        }
        System.out.print("Output: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}

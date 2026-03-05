package b1;
import java.util.*;

public class BT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("loi: so luong khong hop le");
            return;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }

        List<Integer> keys = new ArrayList<>(map.keySet());

        for (int i = 0; i < keys.size() - 1; i++) {
            for (int j = i + 1; j < keys.size(); j++) {
                if (keys.get(i) > keys.get(j)) {
                    int t = keys.get(i);
                    keys.set(i, keys.get(j));
                    keys.set(j, t);
                }
            }
        }

        int max = 0;

        for (int k : keys) {
            if (map.get(k) > max) {
                max = map.get(k);
            }
        }

        for (int k : keys) {
            System.out.println(k + " xuat hien: " + map.get(k) + " lan");
        }

        System.out.print("So xuat hien nhieu nhat: ");

        for (int k : keys) {
            if (map.get(k) == max) {
                System.out.print(k + " ");
            }
        }

        System.out.println("(" + max + " lan)");
    }
}

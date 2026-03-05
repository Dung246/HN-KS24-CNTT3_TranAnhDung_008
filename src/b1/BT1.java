package b1;
import java.util.*;

public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 0) {
            System.out.println("loi: so luong sinh vien khong hop le");
            return;
        }

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine().trim();
            list.add(name);
        }

        String longest = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() > longest.length()) {
                longest = list.get(i);
            }
        }

        List<String> sortList = new ArrayList<>(list);

        for (int i = 0; i < sortList.size() - 1; i++) {
            for (int j = i + 1; j < sortList.size(); j++) {
                if (sortList.get(i).compareToIgnoreCase(sortList.get(j)) > 0) {
                    String t = sortList.get(i);
                    sortList.set(i, sortList.get(j));
                    sortList.set(j, t);
                }
            }
        }

        int count = 0;

        for (String s : list) {
            if (s.toLowerCase().startsWith("a")) {
                count++;
            }
        }

        System.out.println("Longest name: " + longest);

        System.out.print("sortList ");
        for (String s : sortList) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println("Number of name starting with A: " + count);
    }
}

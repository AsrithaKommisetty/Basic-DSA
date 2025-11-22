package sts;
import java.util.*;

class combinations {
    public static void findcombination(int[] a, int s, int e, int cs, ArrayList<Integer> res) {
        if (res.size() == cs) {
            System.out.println(res);
            return;
        }
        for (int i = s; i < e; i++) {
            res.add(a[i]);
            findcombination(a, i + 1, e, cs, res);
            res.remove(res.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int cs = sc.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        findcombination(a, 0, n, cs, res);
    }
}

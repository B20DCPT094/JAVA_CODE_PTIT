package JAVA_PTIT;
import java.util.*;

public class J05029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <DoanhNghiep> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int sl = Integer.parseInt(sc.nextLine());
            DoanhNghiep x = new DoanhNghiep(ma, ten, sl);
            list.add(x);
        }
        Collections.sort(list);
        int q = sc.nextInt();
        while (q-- > 0){
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for (DoanhNghiep x : list){
                if (x.getSl() >= a && x.getSl() <= b) System.out.println(x);
            }
        }
    }
}

//class DoanhNghiep implements Comparable <DoanhNghiep> {
//    private String ma, ten;
//    private int sl;
//
//    public DoanhNghiep(String ma, String ten, int sl) {
//        this.ma = ma;
//        this.ten = ten;
//        this.sl = sl;
//    }
//
//    public int getSl() {
//        return sl;
//    }
//
//    @Override
//    public String toString() {
//        return this.ma + " " + this.ten + " " + this.sl;
//    }
//
//    @Override
//    public int compareTo(DoanhNghiep o) {
//        if (o.sl == this.sl) return this.ma.compareTo(o.ma);
//        return o.sl - this.sl;
//    }
//}
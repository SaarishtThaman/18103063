import java.util.Scanner;

public class q1 {

    static void comp(String s1, String s2) {
        int cmp = 0;
        for(int i=0;i<n1 && i<n2;i++) {
            if(s1.charAt(i)<s2.charAt(i)) {
                cmp=-1;break;
            }
            if(s1.charAt(i)>s2.charAt(i)) {
                cmp=1;break;
            }
        }
        if(cmp==-1) {
            System.out.println(s1+" < "+s2);
        }
        else if(cmp==1) {
            System.out.println(s2+" < "+s1);
        }
        else {
            if(s1.length()>s2.length()) {
                System.out.println(s2s+" < "+s1s);
            }
            else if(s2.length()>s1.length()) {
                System.out.println(s1s+" < "+s2s);
            }
            else {
                System.out.println(s1s+" = "+s2s);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two strings:");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();
        comp(s1,s2);
    }
}
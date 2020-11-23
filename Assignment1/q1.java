import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Input string 1:");
		String s1=sc.nextLine();
		System.out.println("Input string 2:");
		String s2=sc.next();
		sc.close();

		int[] dct = new int[500];
		for(int j=0;j<s2.length();j++) dct[(int)(s2.charAt(j))]++;
		int cnt = 0;
		for(int i=0;i<s1.length()-s2.length()+1;i++) {
			if(anagram(s1.substring(i, i+s2.length()),dct)) cnt++;
		}
		System.out.println(cnt);
	}

	static Boolean anagram(String s, int[] dct) {
		int[] dct2 = new int[500];
		for(int i=0;i<s.length();i++) dct2[(int)(s.charAt(i))]++;
		Boolean areAnagrams = true;
		for(int i=0;i<s.length();i++) {
			if(dct2[(int)(s.charAt(i))] != dct[(int)(s.charAt(i))]) {
				areAnagrams = false;break;
			}
		}
		return areAnagrams;
	}

}

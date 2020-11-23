import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		System.out.println("Input the paragraph:");
		Scanner sc = new Scanner(System.in);
		StringBuilder para = new StringBuilder(sc.nextLine());
		System.out.println("Input size of vector:");
		int n = sc.nextInt();
		sc.nextLine();
		String[] words = new String[n];
		for(int i=0;i<n;i++) {
			words[i] = sc.nextLine();
		}
		sc.close();

		for(int i=0;i<para.length();i++) {
			int ind = indexofword(para,words,i);
			if(ind != -1) {
				for(int j=i+1;j<i+words[ind].length();j++) {
					para.setCharAt(j, '*');
				}
			}
		}
		System.out.println(para);

	}

	static int indexofword(StringBuilder para, String[] words, int i) {
		for(int j=0;j<words.length;j++) {
			if(i+words[j].length() <= para.length()) {
				Boolean found = true;
				for(int k=0;k<words[j].length();k++) {
					if(words[j].charAt(k) != para.charAt(i+k)) {
						found = false;
						break;
					}
				}
				if(found) return j;
			}
		}
		return -1;
	}

}
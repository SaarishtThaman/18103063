import java.util.Scanner;

class q4 {
	static boolean checkAnagram(String str1, String str2) {
		if (str1.length()!=str2.length()) return false;
		int value=0;
		for (int i=0;i<str1.length();i++) {
			value=value^(int)str1.charAt(i);
			value=value^(int)str2.charAt(i);
		}
		return (value==0);	
	}
	public static void main(String[] args) {
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string 1:");
		s1=sc.nextLine();
		System.out.println("Enter string 2:");
		s2=sc.nextLine();
		boolean ans=checkAnagram(s1,s2);
		if(ans) System.out.println("Strings are anagrams of each other");
		else System.out.println("Strings are not anagrams of each other");
	}
}

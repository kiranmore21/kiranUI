package Revision;

import java.io.*;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mk {

	public static void main(String[] args) throws Exception {

		
		File f = new File("/Users/ranjit/Desktop/kiranNinja/file.txt");
		Scanner sc = new Scanner(f);
		while (sc.hasNext()) {
			String s = sc.next();
			
			
			
			char[] a = s.toCharArray();
			for (int i = a.length - 1; i >= 0; i--) {
				System.out.print(a[i]);
			}
		}
	}

}

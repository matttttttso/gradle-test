package gradletest;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradleTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleTestApplication.class, args);
		
		System.out.println("test");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String s = sc.next();
		System.out.println((a+b+c) + " " + s);
		sc.close();
	}

}

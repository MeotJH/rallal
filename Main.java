import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
    	int hour, min, sec;
        Scanner sc = new Scanner(System.in);
        sec = sc.nextInt();
		
		min = sec / 60;
        hour = min / 60;
        sec = sec % 60;
        min = min % 60;
        System.out.printf("%dΩ√ %d∫– %d√ ", hour, min, sec);

        
    }
}


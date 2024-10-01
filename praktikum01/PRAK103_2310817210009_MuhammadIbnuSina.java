package praktikum01;

import java.util.Scanner;

public class PRAK103_2310817210009_MuhammadIbnuSina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int N = scanner.nextInt();  
        int start = scanner.nextInt(); 
        int printed = 0;
        
        do {
            if (start % 2 != 0) {
                System.out.print(start);
                printed++;
                if (printed < N) {
                    System.out.print(", ");
                }
            }
            start++;
        } while (printed < N);

        System.out.println();

        scanner.close();
    }
}


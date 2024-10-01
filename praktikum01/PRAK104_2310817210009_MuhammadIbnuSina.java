package praktikum01;

import java.util.Scanner ;

public class PRAK104_2310817210009_MuhammadIbnuSina {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("tangan Abu ");
	        String[] tanganAbu = scanner.nextLine().split(" ");
	        
	        System.out.println("tangan Bagas ");
	        String[] tanganBagas = scanner.nextLine().split(" ");
	        
	        int skorAbu = 0;
	        int skorBagas = 0;

	        for (int i = 0; i < 3; i++) {
	            char abu = tanganAbu[i].charAt(0);
	            char bagas = tanganBagas[i].charAt(0);

	            if (abu == bagas) {
	                continue;
	            } else if ((abu == 'B' && bagas == 'G') || 
	                       (abu == 'G' && bagas == 'K') || 
	                       (abu == 'K' && bagas == 'B')) {
	                skorAbu++;
	            } else {
	                skorBagas++;
	            }
	        }
	        
	        if (skorAbu > skorBagas) {
	            System.out.println("Abu");
	        } else if (skorBagas > skorAbu) {
	            System.out.println("Bagas");
	        } else {
	            System.out.println("Seri");
	        }
	        
	        scanner.close();
	    }
	}


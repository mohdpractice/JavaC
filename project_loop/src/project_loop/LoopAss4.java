package project_loop;

public class LoopAss4 {
	public static void main(String args[])
    {
        int i, j, rows=5, k=0;
        for(i=1; i<=rows; i++){
            for(j=1; j<=(rows-i); j++){
                System.out.print(" ");
            }
            while(k != (2*i-1))
            {
                System.out.print("*");
                k++;
            }
            k = 0;
            System.out.println();
        }
    }
	}

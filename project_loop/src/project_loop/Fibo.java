package project_loop;

public class Fibo{
	//int w;
	public static void main(String args[]){
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int z=2;z<=10;z++){
			int w;
			w=a+b;
			a=b;
			b=w;
			System.out.println(w);
		}
	}
}


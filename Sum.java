package janani;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,i=0,sum=0;
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
for(i=0;i<n;i++){
	while(i<=n){
		sum=sum+i;
		i++;
		
	}
	System.out.println(sum);
}
	}

}

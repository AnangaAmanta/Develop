import java.util.Random;

public class TwoDim {
	public static void main(String[] args) {
		
		int[][] a= new int[3][3];
		
		//Random r=new Random();
		//Math.random()
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=(int)(Math.random()*10);
				//System.out.print(i+""+j+ " ");
				//System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		
		
	}

}

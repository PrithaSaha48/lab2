		public class shapeb{  
	public static void main(string[]args){	
		
		int alphabet = 65; //A
		
		for(int i=0; i<4; i++) 
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print((char) alphabet);
				alphabet = alphabet+1;
			}
			System.out.print("\n");
		}
			
	   }
}

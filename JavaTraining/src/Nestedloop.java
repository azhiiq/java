
public class Nestedloop {

	public static void main(String[] args) {
		Nest obj = new Nest();
		obj.matrix();
		obj.sqPatter(3);	
	}
}
		class Nest{
			
			void matrix() {		
				
				int row, column;
				row = column = 4;
				
				for(int r=0; r<row; r++) {  	
					for(int c=0; c<column; c++)
						System.out.print("row: " + r +""+ " column: " + c + " ");
					System.out.println();
				}
				
			}
		
		void sqPatter(int side) { 
			
			for(int r=1; r<=side; r++) {
				for(int c=1; c<=side; c++)
					System.out.print("* ");
				System.out.println();
				
			}
		}
		class Nestx{
			
			void matrix() {		
				
				int row, column;
				row = column = 4;
				
				for(int r=0; r<row; r++) {  	
					for(int c=0; c<column; c++) 
						System.out.print("row: " + r +""+ " column: " + c + " ");
					System.out.println();
				}
				
			}
		
		
		
		}
		}


		
		


	



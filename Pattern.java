public class Pattern{
	
	public static void main(String[] args){
		Pattern p=new Pattern();
		p.pattern1(4);
		System.out.println("");
		p.pattern2(4);
		System.out.println("");
		p.pattern3(4);
		System.out.println("");
		p.pattern4(4);
		System.out.println("");
		p.pattern5(4);
		System.out.println("");
		p.pattern6(4);
		System.out.println("");
		p.pattern7(4);
		System.out.println("");
		
	}
	
		/*		****
				****
				****
				****		*/
	public void pattern1(int n){
		for(int i=0;i<n;i++){						
			for(int j=0;j<n;j++){					
				System.out.print("*");				
			}										
			System.out.println();
		}
	}
	
		/*		*
				 *	
				  *
				   *		*/
	public void pattern2(int n){
		for(int i=0;i<n;i++){				
			for(int j=0;j<n;j++){			
				if(i==j){															
				System.out.print("*");				
				}									
				else{								
				System.out.print(" ");				
				}									
			}				
			System.out.println();
		}
	}
	
		/*		****
				* **
				****
				****		*/
	public void pattern3(int n){
		for(int i=0;i<n;i++){				
			for(int j=0;j<n;j++){			
				if(i==2 && j==2){													
					System.out.print(" ");			
				}									
				else{								
					System.out.print("*");
				}								
			}
			System.out.println();
		}
	}
	
		/*		*
				**
				***
				****		*/
	public void pattern4(int n){
		for(int i=0;i<n;i++){						
			for(int j=0;j<=i;j++){					
				System.out.print("*");				
			}										
			System.out.println();
		}
	}
	
		/*		****
				***
				**
				*			*/
	public void pattern5(int n){
		for(int i=n;i>0;i--){						
			for(int j=0;j<i;j++){					
				System.out.print("*");				
			}										
			System.out.println();
		}
	}
	
		/*		   *
			 	  **
				 ***
				****    	*/
	public void pattern6(int n){
		for(int i=n;i>0;i--){						
			for(int j=1;j<=n;j++){					
				if(j>=i){							
					System.out.print("*"); 			
				}else{
					System.out.print(" ");
				}
				
			}										
			System.out.println();
		}
	}
	
		/*		****
				 ***
				  **
				   *		*/
	public void pattern7(int n){
		for(int i=n;i>0;i--){						
			for(int j=n;j>0;j--){					
				if(j<=i){							
					System.out.print("*"); 			
				}else{
					System.out.print(" ");
				}
				
			}										
			System.out.println();
		}
	}
	
		/*
		
		
							*/
	public void pattern8(int n){
		
		
		
		
		
	}
	
	
	
	
}
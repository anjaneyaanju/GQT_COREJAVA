package com.pattern1;
/**
 *@description  printing A to Z Alphabet and 0 to 9  are displayed with java code # patterns 
 *@patterns with my name using conditional statment
 */
import java.util.Scanner;

/**
 * GQT 
 * @author Veeresh
 * @description This prints two identical patterns side-by-side
 */
public class ClasspatternAtoZ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == n / 2 || j == n / 2 ||
                    i == j || i + j == n - 1 || i + j == n / 2 || j - i == n / 2 ||
                    i - j == n / 2 || i + j == (n - 1) + (n / 2)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i==0||j==0|| i==(n/2)||j==(n-1)){
                    System.out.print("# ");//A
                } else {
                    System.out.print("  ");
                }
            } System.out.print("    ");
            for(int j=0;j<n;j++) {
				if(i==0 ||   				
						   j == 0 || 				
						   i==(n-1)	||						
						   i==(n/2) ||				
						   j==(n-1) ) 	//B			
						{
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.print("  ");
					
					for(int j=0;j<n;j++) {
						if(i==0 ||   				
						   j == 0 || 				
						   i==(n-1)	)	//"C"			
						 
						{
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.print("  ");

					for(int j=0;j<n;j++) {
						if(i==0 ||   				
						   j == 0 || 				
						   i==(n-1)	||					
						   j==(n-1) ) //	"D"			
						{
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.print("  ");
					
					for(int j=0;j<n;j++) {
						if(i==0 ||   				
						   j == 0 || 				
						   i==(n-1)	||	//"E"				
						   i==(n/2) )			
					
						{
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.print("  ");
					
					for(int j=0;j<n;j++) {
						if(i==0 ||   				
						   j == 0 || 					
						   i==(n/2) )//"F"    			
						  
						{
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.print("  ");	
	
					for(int j=0;j<n;j++) {
						if(i==0 ||   				
						   j == 0 || 				
						   i==(n-1)	||					
						   j>=(n/2)&&i==(n/2) ||	
						   i>=(n/2)&&j==(n-1) ) //"G"	
						{
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.print("  ");
					
					for(int j=0;j<n;j++) {
						if(j == 0 || 				
						   i==(n/2) ||				
						   j==(n-1) ) //"H"				
						{
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.print("  ");
					
					for(int j=0;j<n;j++) {
						if(i==0 || 				 
						   j==(n/2) || 				
						   i==(n-1))//"I"				
						{
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.print("  ");
					
					for(int j=0;j<n;j++) {
						if(i==0 || 				
						   j==(n/2) || 				
						   j<=(n/2)&&i==(n-1))	//"J"			
						{
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
						}
					System.out.print("  ");
					
					for(int j=0;j<n;j++) {
						if(j==0 || 				
						   i+j==(n/2)|| 				
						  i-j==(n/2))	//"K"			
						{
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
						}
					System.out.print("  ");
					
					for(int j=0;j<n;j++) {
						if(j==0 ||   				
						   i==(n-1)	)	//"L"			
						 
						{
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.print("  ");
					
					for(int j=0;j<n;j++) {
						if(j == 0 || 				
						   i==0 ||	
						   j==(n/2) ||
						   j==(n-1) ) 	//"M"			
						{
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.print("  ");
					
					for(int j=0;j<n;j++) {
						if(j == 0 || 			
						   i==j ||			
						   j==(n-1) ) 	// N			
						{
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.print("  ");
					for(int j=0;j<n;j++) {
						if(i==0 ||   				
						   j == 0 || 				
						   i==(n-1)	||						
						   j==(n-1) ) 	//'O'			
						{
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.print("  ");
					

            for (int j = 0; j < n; j++) {
                if (i-j==(n/2)||i+j==(n-1)+(n/2)||i+j==(n/2)||j-i==(n/2)||j>=(n/2) && (i==j)){
                    System.out.print("# ");//Q
                } else {
                    System.out.print("  ");
                }
            } System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i==0||i==(n/2)||j==0||i<=(n/2) && j==(n-1)||j>=(n/2) &&(i==j )){
                    System.out.print("# ");//R
                } else {
                    System.out.print("  ");
                }
            } System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i==0||i<=(n/2) && j==0|| i==(n/2)||i>=(n/2) && j==(n-1)||i==(n-1)){
                    System.out.print("# ");//S
                } else {
                    System.out.print("  ");
                }
            } System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i==0||j==(n/2)){
                    System.out.print("# ");//T
                } else {
                    System.out.print("  ");
                }
            }System.out.print("    ");

            for (int j = 0; j < n; j++) {
            	 if (j==0||i==(n-1)||j==(n-1)) {
                    System.out.print("# ");//u
                } else {
                    System.out.print("  ");
                }
            } System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i<=(n/2) && j==0|| i-j==(n/2)||i+j==(n-1)+(n/2)||i<=(n/2) && j==(n-1)){
                    System.out.print("# ");//v
                } else {
                    System.out.print("  ");
                }
            }  System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (j==0||i==(n-1)||j==(n/2)||j==(n-1)){
                    System.out.print("# ");//w
                } else {
                    System.out.print("  ");
                }
            } System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i==j||i+j==(n-1)){
                    System.out.print("# ");//x
                } else {
                    System.out.print("  ");
                }
            } System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if ((i<=(n/2) &&(i==j || i+j==(n-1)))|| i>=(n/2) && j==(n/2)){
                    System.out.print("# ");//y
                } else {
                    System.out.print("  ");
                }
            }System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i==0||i+j==(n-1)||i==(n-1)){
                    System.out.print("# ");//z
                } else {
                    System.out.print("  ");
                }
            } System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i==0||j==0||j==(n-1)||i==(n-1)){
                    System.out.print("# ");//0
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i+j==(n/2)||j==(n/2)||i==(n-1)){
                    System.out.print("# ");//1
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i==(n-1)
                		||i==0 
                		|| i==(n/2)
                		|| i<=(n/2) && j==(n-1)
                		|| i>=(n/2) && j==0 ){
                    System.out.print("# ");//2
                } else {
                    System.out.print("  ");
                }
            } System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i==0
                	||j==(n-1)
                	|| i==(n-1)||
                	i==(n/2)){
                    System.out.print("# ");//3
                } else {
                    System.out.print("  ");
                }
            } System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (j==(n-1)|| j==0 && i<=(n/2)||i==(n/2) ){
                    System.out.print("# ");//4
                } else {
                    System.out.print("  ");
                }
            } System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i==0|| i==(n/2)||i==(n-1)|| i<=(n/2) && j==0||(i>=(n/2) && j==(n-1))){
                    System.out.print("# ");//5
                } else {
                    System.out.print("  ");
                }
            } System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i==0||j==0|| i==(n/2)||i>=(n/2) && j==(n-1)|| i==(n-1)){
                    System.out.print("# ");//6
                } else {
                    System.out.print("  ");
                }
            }  System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i==0|| j==(n-1)){
                    System.out.print("# ");//7
                } else {
                    System.out.print("  ");
                }
            }System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i==0||j==0|| i==(n/2)||i>=(n/2) &&j==(n-1)||i<=(n/2) && j==(n-1)||i==(n-1)){
                    System.out.print("# ");//8
                } else {
                    System.out.print("  ");
                }
            } System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i==0||i<=(n/2) && j==0|| i==(n/2)||j==(n-1)||i==(n-1)){
                    System.out.print("# ");//9
                } else {
                    System.out.print("  ");
                }
            }System.out.print("                    ");

            for (int j = 0; j < n; j++) {
                if (i==0||j==0|| i==(n/2)||j==(n-1)){
                    System.out.print("# ");//A
                } else {
                    System.out.print("  ");
                }
            } System.out.print("  ");
			
			for(int j=0;j<n;j++) {
				if(j == 0 || 			
				   i==j ||			
				   j==(n-1) ) 	// N			
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}System.out.print("  ");
			
			for(int j=0;j<n;j++) {
				if(i==0 || 				
				   j==(n/2) || 				
				   j<=(n/2)&&i==(n-1))	//"J"			
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
				}System.out.print("  ");

	            for (int j = 0; j < n; j++) {
	                if (i==0||j==0|| i==(n/2)||j==(n-1)){
	                    System.out.print("# ");//A
	                } else {
	                    System.out.print("  ");
	                }
	            }System.out.print("  ");
				
				for(int j=0;j<n;j++) {
					if(j == 0 || 			
					   i==j ||			
					   j==(n-1) ) 	// N			
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}System.out.print("  ");
				
				for(int j=0;j<n;j++) {
					if(i==0 ||   				
					   j == 0 || 				
					   i==(n-1)	||	//"E"				
					   i==(n/2) )			
				
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}System.out.print("    ");

	            for (int j = 0; j < n; j++) {
	                if ((i<=(n/2) &&(i==j || i+j==(n-1)))|| i>=(n/2) && j==(n/2)){
	                    System.out.print("# ");//y
	                } else {
	                    System.out.print("  ");
	                }
	            }System.out.print("	 ");

	            for (int j = 0; j < n; j++) {
	                if (i==0||j==0|| i==(n/2)||j==(n-1)){
	                    System.out.print("# ");//A
	                } else {
	                    System.out.print("  ");
	                }
	            }
            System.out.println(); 
        }
    }
}



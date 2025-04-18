package solveEnyPatternQuestion;

public class Main {

	public static void main(String[] args) {
		pattern26(4);

	}
	
	
	
	
	
	
//	********
//	********
//	********
//	********
//	********
//	********
//	********
//	********
	public static void pattern1(int n) {
		for(int roe = 1;roe<=n;roe++) {
			for(int col = 0;col<n;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	
	

//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 
//	* * * * * * 
//	* * * * * * * 
//	* * * * * * * * 
	public static void pattern2(int n) {
		for(int row = 1;row<=n;row++) {
			for(int col = 0;col<row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

	}			

	
	
	
	
//	* * * * * * * * 
//	* * * * * * * 
//	* * * * * * 
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	* 
	public static void pattern3(int n) {
		for(int row = 1;row <=n ;row++) {
			for(int col = 1;col <=n-row+1 ;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

	}	
	
	
	
	
//	1 
//	1 2 
//	1 2 3 
//	1 2 3 4 
//	1 2 3 4 5 
//	1 2 3 4 5 6 
//	1 2 3 4 5 6 7 
//	1 2 3 4 5 6 7 8
	public static void pattern4(int n) {
		for(int row = 1;row <=n ;row++) {
			for(int col = 1;col <=row ;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 
//	* * * * * * 
//	* * * * * * * 
//	* * * * * * * * 
//	* * * * * * * 
//	* * * * * * 
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	* 
	public static void pattern5(int n) {
		for(int row = 1;row <=n ;row++) {
			for(int col = 1;col <=row ;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int row = 1;row <=n ;row++) {
			for(int col = 1;col <n-row+1 ;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

	}
	
	
	
	//	    *
	//	   **
	//	  ***
	//	 ****
	//	*****
//     ****** 
//    *******
//   ********
	public static void pattern6(int n) {
		for(int row = 1;row <=n ;row++) {
			for(int col = 1;col <=n-row+1 ;col++) {
				System.out.print(" ");
			}
			for(int col = 1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

	}
	
	
	
	
	
	

//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 
//	* * * * * * 
//	* * * * * * * 
//	* * * * * * * * 
//	* * * * * * * 
//	* * * * * * 
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	* 
	public static void patternv(int n) {
		for(int row = 1;row < 2* n ;row++) {
			int totalColsInRow = row > n ? 2 * n - row:row;
			for(int col = 0;col <totalColsInRow ;col++) {
				System.out.print("  ");
			}
			System.out.println("* ");
		}
		System.out.println();

	}
	
	
	
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 
//	* * * * * * 
//	* * * * * * * 
//	* * * * * * * * 
//	* * * * * * * 
//	* * * * * * 
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	*
	public static void patternv1(int n) {
		for(int row = 1;row < 2* n ;row++) {
//			int totalColsInRow = row > n ? 2 * n - row:row;
//			System.out.println(row);
			if(row < n) {
				for(int col = 0;col < row ;col++) {
					System.out.print("* ");
				}
			}else {
//				int totalColsInRow =2 * n - row;
				for(int col = 0;col <2 * n - row ;col++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println();

	}
	
	
	
	
	
//	 *******
//	  ******
//	   *****
//	    ****
//	     ***
//	      **
//	       *
	public static void pattern7(int n) {
		for(int row = 1;row <=n ;row++) {
			for(int col = 1;col <=row ;col++) {
				System.out.print(" ");
			}
			for(int col = 1;col<=n-row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

	}
	
	
	
	
//	      *
//	     ***
//	    *****
//	   *******
//    *********
//   ***********
//  *************
// ***************
	public static void pattern8(int n) {
		for(int row = 1;row <=n ;row++) {
			for(int col = 1;col <=n-row ;col++) {
				System.out.print(" ");
			}
			for(int col = 1;col<=row;col++) {
				System.out.print("*");
			}for(int col = 1;col<=row-1;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	
	
//	***********
//	 *********
//	  *******
//	   *****
//	    ***
//	     *
	public static void pattern9(int n) {
		for(int row = 1;row <=n ;row++) {
			for(int col = 2;col <=row;col++) {
				System.out.print(" ");
			}
			for(int col = 1;col<=n-row;col++) {
				System.out.print("*");
			}
			for(int col = 1;col<=n-row-1;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	
	
	
	
//    * 
//   * * 
//  * * * 
// * * * * 
//* * * * * 
	public static void pattern10(int n) {
		for(int row = 1;row <=n ;row++) {

		for(int col = 1;col <=n-row ;col++) {
			System.out.print(" ");
		}
		
		for(int col = 1;col<=row;col++) {
			System.out.print("* ");
		}
		System.out.println();
		}
	}
	
	
	
	
	
	
	
//	* * * * * 
//	 * * * * 
//	  * * * 
//	   * * 
//	    * 
	public static void pattern11(int n) {
		for(int row = 0;row <n;row++) {

		for(int col = 1;col <=row ;col++) {
			System.out.print(" ");
		}
		
		for(int col = 1;col<=n - row;col++) {
			System.out.print("* ");
		}
		System.out.println();
		}
	}
	
	
	
	
	
//	* * * * * * 
//	 * * * * * 
//	  * * * * 
//	   * * * 
//	    * * 
//	     * 
//	    * * 
//	   * * * 
//	  * * * * 
//	 * * * * * 
//	* * * * * *
	public static void pattern12(int n) {
		for(int row = 1;row <n * 2;row++) {
			int noOfSpace = row > n ? 2*n-row:row;
			int   totalColsInRow = n-noOfSpace;
		for(int col = 0;col <noOfSpace ;col++) {
			System.out.print(" ");
		}
		
		for(int col = 0;col<=totalColsInRow ;col++) {
			System.out.print("* ");
		}
		System.out.println();
		}
	}
	
	
	
	
	
//        * 
//       * * 
//      *   * 
//     *     * 
//    *       * 
//   *         * 
//  *           * 
// *             * 
//*****************
	public static void pattern13(int n) {
		for(int row = 1;row <=n;row++) {
			 for(int col = 1 ;col<=n - row;col++) {
				 System.out.print(" ");
			 }
			 for(int col = 1 ;col<=row;col++) {
				 if(row == n) {
					 for(int i = 0; i<row + n-1;i++) {
						 System.out.print("*");
					 }
					col = n+1;
				 }else if(col == 1 || col == row) {
					 System.out.print("* ");
				 }else {
					 System.out.print("  ");
				 }
			 }
			 System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
//	*********
//	 *     *   
//	  *   *     
//	   * *       
//	    *         
	public static void pattern14(int n) {
		for(int row = 0;row <n;row++) {
			 for(int col = 1;col<=row ;col++) {
				 System.out.print(" ");
			 }
			 for(int col = 1;col<=n ;col++) {
				 if(col == 1 && row == 0) {
					 for(int i = 1;i<=n+n-1 ;i++) {
						 System.out.print("*");
					 }
					 col = col+n;
				 }else if(col == 1|| col == n - row) {
					 System.out.print("* ");
				 }else {
					 System.out.print("  ");
				 }
			 }
			 System.out.println();
		}
	}
	
	
	
	
	
	
//    * 
//   * * 
//  *   * 
// *     * 
//*       * 
// *     * 
//  *   * 
//   * * 
//    * 
	public static void pattern15(int n) {
		for(int row = 1;row <=n*2;row++) {
			int c = row > n ? 2*n-row:row;
			 for(int col = 1 ;col<=n - c;col++) {
				 System.out.print(" ");
			 }
			 for(int col = 1 ;col<=c;col++) {
				 if(col == 1 || col == c) {
					 System.out.print("* ");
				 }else {
					 System.out.print("  ");
				 }
			 }
			 System.out.println();
		}
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
//    * 
//   * * 
//  *   * 
// *     * 
//*********
	public static void pattern131(int n) {
		   // Number of rows

	        for (int row = 1; row <= n; row++) {
	            // Print spaces
	            for (int col = row; col < n; col++) {
	                System.out.print(" ");
	            }

	            // Print stars and spaces between
	            for (int col = 1; col <= (2 * row - 1); col++) {
	                if (col == 1 || col == (2 * row - 1) || row == n) {
	                	System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            

	            System.out.println();
	        }

	}
	
	
	
	
	
//	    1
//	   212
//	  32123
//	 4321234
//	  32123
//	   212
//	    1
	public static void pattern17(int n) {
		for(int row = 0;row < n*2 ;row ++) {
			int totalColsInRow = row > n ? 2*n - row: row;
			for(int col =0;col < n-totalColsInRow ;col++) {
				System.out.print("  ");
			}
			for(int col = totalColsInRow;col >1;col--) {
				System.out.print(col+" ");
			}
			for(int col = 1;col <=totalColsInRow;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
//	************
//	*****  *****
//	****    ****
//	***      ***
//	**        **
//	*          *
//	**        **
//	***      ***
//	****    ****
//	*****  *****
//	************
	public static void pattern18(int n) {
		for(int row = 0;row <=n*2;row++) {
			int c = row > n ? 2*n-row:row;
			 for(int col = 0 ;col<=n - c;col++) {
				 System.out.print("*");
			 }
			 for(int col = 1 ;col<=c;col++) {
					 System.out.print("  ");
			 }
			 for(int col = 0 ;col<=n - c;col++) {
				 System.out.print("*");
			 }
			 
			 System.out.println();
		}
	}
	
	
	
	
	
	
	
//	*          *
//	**        **
//	***      ***
//	****    ****
//	*****  *****
//	************
//	*****  *****
//	****    ****
//	***      ***
//	**        **
//	*          *
	public static void pattern19(int n) {
		for(int row = 0;row <=n*2;row++) {
			int c = row > n ? 2*n-row:row;
			 for(int col = 0 ;col<=c;col++) {
				 System.out.print("*");
			 }
			 for(int col = 1 ;col<=n-c;col++) {
					 System.out.print("  ");
			 }
			 for(int col = 0 ;col<=c;col++) {
				 System.out.print("*");
			 }
			 
			 System.out.println();
		}
	}
	
	
	
	
	
	
//	****
//	*  *
//	*  *
//	****
	public static void pattern20(int n) {
		for(int row = 0;row <=n;row++) {
			 for(int col = 0 ;col<=n;col++) {
				 if(row == 0 || row == n) {
					 System.out.print("*");
				 }else if(col == 0 || col == n) {
					 System.out.print("*");
				 }else {
					 System.out.print(" ");
				 }
			 }
			 
			 
			 System.out.println();
		}
	}
	
	
	
	
	
//	1  
//	2  3  
//	4  5  6  
//	7  8  9  10 
//	11 12 13 14 15	
	public static void pattern21(int n) {
		int c = 0;
		for(int row = 0;row <=n;row++) {
//			int c = 0;
			 for(int col =0;col<=row;col++) {
				  c++;
				 int count = count(c);
				 if(count == 1) {
					 System.out.print(c+"  ");
				 }else {
					 System.out.print(c+" ");
 
				 }
			 }
			 System.out.println();
		}
	}
	private static int count(int c) {
	    int count = 0;
	    if (c == 0) 
	    	return 1;
	    while(c!=0) {
	    	  int rem = c % 10;
	          count++;
	          c = c/10;
	    }
		return count;
		}
	
	
	
	
	
	
	
	
	
//	0 
//	1 0 
//	0 1 0 
//	1 0 1 0 
//	0 1 0 1 0 
	public static void pattern22(int n) {
		for(int row = 0;row <=n;row++) {
			 for(int col =0;col<=row;col++) {
				 int c = col+1;
				 if(row % 2 != 0) {
					 if(c % 2 == 0) {
						 System.out.print(0+" ");
					 }else {
						 System.out.print(1+" ");
					 }
				 }else {
					 if(c % 2 == 0) {
						 System.out.print(1+" ");
					 }else {
						 System.out.print(0+" ");
					 }
				 }
			 }
			 System.out.println();
		}
	}
	
	
	
	
	
	
	
//    *       * 
//   * *     * * 
//  *   *   *   * 
// *     * *     * 
//*       *       *
	public static void pattern23(int n) {
		for(int row = 0;row <n;row++) {
			 for(int col =1;col<=n - row;col++) {
				System.out.print(" ");
			 }
			 for(int col =0;col<=row;col++) {
				 if(col == 0 || col == row) {
					 System.out.print("* ");
				 }else {
					 System.out.print("  ");
				 }
			 }
			 
			 
			 for(int col =2;col<n - row ;col++) {
					System.out.print("  ");
				 }
			 for(int col =0;col<=row;col++) {
				 if(row == n-1 && col == 0) {
//					 col++;
					 continue;
				 }
				 if(col == 0 || col == row) {
					 System.out.print("* ");
				 }else {
					 System.out.print("  ");
				 }
			 }
			 System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
//	*       *
//	**     **
//	* *   * *
//	*  * *  *
//	*   *   *
//	*  * *  *
//	* *   * *
//	**     **
//	*       *
	public static void pattern24(int n) {
		for(int row = 0;row <=n *2;row++) {
			int totalColsInRow = row > n ? 2*n - row:row;
			 for(int col =0;col<=totalColsInRow;col++) {
				 if(col == 0 || col == totalColsInRow) {
					 System.out.print("*");
				 }else {
					 System.out.print(" ");
				 }
			 }
			 int spaces = 2 * (n - totalColsInRow);
			 
			 for(int col =2;col<=spaces;col++) {
				System.out.print(" ");
			 }
			 for(int col =0;col<=totalColsInRow;col++) {
				 if(row == n && col == 0) continue;
				 if(col == 0 || col == totalColsInRow) {
					 System.out.print("*");
				 }else {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	




//    *****
//   *   *
//  *   *
// *   *
//*****
	public static void pattern25(int n) {
		for(int row = 0;row <=n;row++) {
			for(int col = 0 ;col<n-row;col++) {
				System.out.print(" ");
			}
			 for(int col = 0 ;col<=n ;col++) {
				 if(row == 0 || row == n) {
					 System.out.print("*");
				 }else if(col == 0 || col == n) {
					 System.out.print("*");
				 }else {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		}
	}
	
	
	
	
	
	public static void pattern26(int n) {
		for(int row = 1;row <=n;row++) {
		
			 for(int col = 0 ;col<=n-row ;col++) {
				System.out.print(row);
			 }
			 System.out.println();
		}
	}
	
	
	
	

//    * 
//   * * 
//  * * * 
// * * * * 
//* * * * * 
// * * * * 
//  * * * 
//   * * 
//    * 
	public static void pattern28(int n) {
		for(int row = 1;row <=n*2 ;row++) {
        int totalColsInRow = row > n ? 2*n - row: row;
        int noOfSpace = n - totalColsInRow;
		for(int col = 1;col <=noOfSpace ;col++) {
			System.out.print(" ");
		}
		
		for(int col = 1;col<=totalColsInRow;col++) {
			System.out.print("* ");
		}
		System.out.println();
		}
	}
	
	
	
	
	
//	    1
//	   212
//	  32123
//	 4321234
	public static void pattern30(int n) {
		for(int row = 1;row <=n ;row ++) {
//			int totalColsInRow = row > n ? 2*n - row: row;
			for(int col =0;col < n-row ;col++) {
				System.out.print(" ");
			}
			for(int col = row;col >1;col--) {
				System.out.print(col);
			}
			for(int col = 1;col <=row;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
//	3 3 3 3 3 
//	3 2 2 2 3 
//	3 2 1 2 3 
//	3 2 2 2 3 
//	3 3 3 3 3 
	public static void pattern31(int n) {
		int copy = n+1;
		n = 2*n;
		for(int row = 1;row<n;row++) {
			for(int col = 1;col<n;col++) {
			    int atEveryIndex =copy - Math.min(Math.min(row, col), Math.min(n-row, n-col));
				System.out.print(atEveryIndex+" ");
			}
			System.out.println();
		}
	}
}

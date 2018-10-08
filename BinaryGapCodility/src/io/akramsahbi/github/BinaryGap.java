package io.akramsahbi.github;

import java.util.Scanner;

public class BinaryGap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		System.out.println(solution(N));

	}
	

	
	    public static int solution(int N) {
	        
	        // write your code in Java SE 8
	        int max_gap = 0;
	        int gap = 0;
	        int i = 0;
	        boolean have_ones_left = false;
	        boolean have_ones_right = false;
	        String n = IntegerToBinary(N);
	        //System.out.println(n);
	        boolean isBinaryGap = false;
	        
	        for(i = 0; i < n.length(); i++)
	        {
	            if(n.charAt(i) == '0')
	            {
	                gap++;
	                if(i < n.length() - 1 && n.charAt(i+1) == '1')
	                {
	                    have_ones_right = true;
	                    if(have_ones_left == true)
	                    {
	                        isBinaryGap = true;
	                        have_ones_left = true;
	                        have_ones_right = false;
	                        if(isBinaryGap == true)
	                        {
	                            if(gap > max_gap)
	                            {
	                                max_gap = gap;    
	                            }
	                            
	                        }
	                    }
	                    
	                }
	                
	            }
	            else
	            {
	                gap = 0;
	                if(i < n.length() - 1 && n.charAt(i+1) == '0')
	                {
	                    have_ones_left = true;
	                }
	                
	            }
	        }
	        if(isBinaryGap)
	        {
	             
	        }
	        else
	        {
	            max_gap =  0;
	        }
	        //System.out.println(max_gap+"");
	        return max_gap;
	    }
	    private static String IntegerToBinary(int N)
	    {
	        int d = N;
	        int r = 0;
	        StringBuffer sb = new StringBuffer();
	        while(d  > 0)
	        {
	            r = d % 2;
	            sb.append(r+"");
	            d /= 2;
	        }
	        return sb.reverse().toString();
	    }
	

}

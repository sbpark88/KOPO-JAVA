import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;
import java.lang.Math;
import java.lang.reflect.Array;

class Solution {

	public static void main(String args[]) {
		String str = "ABCDE";
		int n = str.length();
		char[] arr = str.toCharArray();
		boolean visited[] = new boolean[n];
		for(int i=0; i<n; i++) {
			visited[i] = false;
		}
		char[] branch = new char[n];
		generatePermutations(arr, n, branch, -1, visited);
		
		char[] output = new char[n];
		combination(arr, 3, 0, output, 0);
	}
	
	static void generatePermutations(char[] arr, int size, char[] branch, int level, boolean[] visited)
    {
        if (level >= size-1)
        {
            System.out.println(branch);
            return;
        }
        
        for (int i = 0; i < size; i++)
        {
            if (!visited[i])
            {
                branch[++level] = arr[i];
                visited[i] = true;
                generatePermutations(arr, size, branch, level, visited);
                visited[i] = false;
                level--;
            }
        }
    }
	
	 static void combination(char[] arr, int pick, int startIdx, char[] output, int numElem)
	    {
	        if (numElem == pick)
	        {
	            //System.out.println(Arrays.toString(output));
	        	System.out.println(output);
	            return;
	        }
	        
	        for (int i = startIdx; i < arr.length; i++)
	        {
	        	output[numElem++] = arr[i];
	        	combination(arr, pick, ++startIdx, output, numElem);
	            --numElem;
	        }
	    }
	 
}
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class HeapSort
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 int a[]={0,32,12,45,28,76,4};
	 int n=7;
	 for(int i=n/2;i>0;i--){
	     heapify(a,n,i);
	 }
// 	 for(int c:a){
// 	     System.out.print(c+" ");
// 	 }
	 for(int i=n-1;i>1;i--){
	    // System.out.print(a[1]+" ");
	     a[1]^=a[i];
	     a[i]^=a[1];
	      a[1]^=a[i];
	   
	    //a[i]=0;
	     heapify(a,n,1);
	 }
	  for(int c=1;c<n;c++)
	     System.out.print(a[c]+" ");
	 
	}
	static void heapify(int a[],int n ,int i){
	    int largest=i;
	    int l=2*i;
	    int r=(2*i)+1;
	    if(l<n && a[l]>a[largest]){
	        largest=l;
	    } 
	    if(r<n && a[r]>a[largest]){
	        largest=r;
	    }
	    if(largest!=i){
	       a[largest]^=a[i];
	       a[i]^=a[largest];
	        a[largest]^=a[i];
	        heapify(a,n,largest);
	    }
	    
	}
}

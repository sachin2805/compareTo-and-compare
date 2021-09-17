package compareTo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class MobileInfo implements Comparable<MobileInfo>{
	private String name;
	private double proc;
	private int price;
	private int ram;
	
	/*CompareTo Method (For Sorting) --------> Only one time sorting by using compareTo method 
	becoz of compareTo is the override method  but we do multiple time sorting by using both Compare method and compareTo method*/ 
	  /*@Override
	   public int compareTo(MobileInfo x)  
	    {
		   //Sorting for processor
	    	if(this.proc > x.proc)
	        return 1;
	    	else if(this.proc < x.proc)
	    		return -1;
	    	else return 0;
	    }*/

	   /*public int compareTo(MobileInfo y)
	    {
		 //Sorting for price
	    	if(this.price > y.price)
	        return 1;
	    	else if(this.price < y.price)
	    		return -1;
	    	else return 0;
	    	
	    	//OR
	    	//return this.price - y.price;
	    }*/
	   
	   public int compareTo(MobileInfo x)
	    {
		 //Sorting for Company Name
		  return  this.name.compareTo(x.name);  //this logic use for String
	    	
	    }

	   
	   //Parametrized Constructor
	  public MobileInfo(String name, double proc, int price,int ram) {
		  	this.name = name;
	        this.proc = proc;
	        this.price = price;
	        this.ram=ram;
	    }

	  
	  //Getter method for accessing private data
	public String getName() {
		return name;
	}

	public double getProc() {
		return proc;
	}

	public int getPrice() {
		return price;
	}

	public int getRam() {
		return ram;
	}
	
}
public class CompareTo1  {
	public static void main(String[] args) {
	
	
		List<MobileInfo> l=new ArrayList<MobileInfo>();
		
	   l.add(new MobileInfo("MI",2.5,10000,8));
		l.add(new MobileInfo("Vivo",1.5,25000,6)); 
		l.add(new MobileInfo("Apple",4.5,100000,8));
		l.add(new MobileInfo("Oppo",2.1,15000,4));

		System.out.println("Before Sorting  : ->");
		for(MobileInfo m: l)
		{
			System.out.println("["+m.getName()+"\t"+m.getProc()+"\t"+m.getPrice()+"\t"+m.getRam()+"]");
		}
		
		System.out.println("---------------------------------");
		Collections.sort(l); //Sort by processor
		//l.sort(null);   //----->Other way to sort
		System.out.println("After Sorting  : -> ");
		for(MobileInfo m: l)
		{
			System.out.println("["+m.getName()+"\t"+m.getProc()+"\t"+m.getPrice()+"\t"+m.getRam()+"]");
		}
	
	}
}

/*OUTPUT :
Before Sorting  : ->
[MI	2.5	10000	8]
[Vivo	1.5	25000	6]
[Apple	4.5	100000	8]
[Oppo	2.1	15000	4]
---------------------------------
After Sorting  : -> 
[Apple	4.5	100000	8]
[MI	2.5	10000	8]
[Oppo	2.1	15000	4]
[Vivo	1.5	25000	6]
*/
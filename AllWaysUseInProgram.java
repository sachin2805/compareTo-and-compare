package compareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


class SelectionProcess implements Comparable<SelectionProcess>
{
	String Name;
	double sscMarks;
	double hscMarks;
	String Degree;
	int internShip;
	

	
	public SelectionProcess(String name, double sscMarks, double hscMarks, String degree, int internShip) {
		super();
		Name = name;
		this.sscMarks = sscMarks;
		this.hscMarks = hscMarks;
		Degree = degree;
		this.internShip = internShip;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public double getSscMarks() {
		return sscMarks;
	}



	public void setSscMarks(int sscMarks) {
		this.sscMarks = sscMarks;
	}



	public double getHscMarks() {
		return hscMarks;
	}



	public void setHscMarks(int hscMarks) {
		this.hscMarks = hscMarks;
	}



	public String getDegree() {
		return Degree;
	}



	public void setDegree(String degree) {
		Degree = degree;
	}



	public int getInternShip() {
		return internShip;
	}



	public void setInternShip(int internShip) {
		this.internShip = internShip;
	}



	@Override
	public String toString() {
		return "[Name=" + Name + ", sscMarks=" + sscMarks + ", hscMarks=" + hscMarks + ", Degree="
				+ Degree + ", internShip=" + internShip + "]";
	}






//Using implements comparable and use compareTo() method (Override)
	@Override
	public int compareTo(SelectionProcess o) {
	
		
		return this.Name.compareTo(o.Name);
	}
	
}
//Using Outer Class (implements comparator)
class SortBySSC implements Comparator<SelectionProcess>
{

	public int compare(SelectionProcess o1, SelectionProcess o2) {
		if(o1.sscMarks==o2.sscMarks)
		return 0;
		else if(o1.sscMarks<o2.sscMarks)
		return 1;
		else return -1;
		
	}
	
}
public class AllWaysUseInProgram  {
	 public static void main(String args[]) {
		 SelectionProcess s1 = new SelectionProcess("Sachin",81.20,79.85,"BE",0);
		 	List<SelectionProcess> l=new ArrayList<SelectionProcess>();
		 	l.add(s1);
		 	l.add(new SelectionProcess("Dev",71.20,70.85,"BE",1));
		 	l.add(new SelectionProcess("Akash",85.20,67.45,"MBA",1));
		 	l.add(new SelectionProcess("Ashwini",75.20,78.90,"BE",4));
		 	l.add(new SelectionProcess("Ashraf",90.20,70.85,"BSC",2));
		 	l.add(new SelectionProcess("Anuja",79.50,78.55,"BE",0));
		 	
		    for(SelectionProcess s:l)  // Enhance for loop
		    {
		    	System.out.println(s);
		    }
		 	
		 	
			System.out.println("-----------------------------------------------------------------------\nSorted by Name :\n\n");
			Collections.sort(l);
			  Iterator<SelectionProcess> lit = l.iterator();
			  
			  while(lit.hasNext()) { System.out.println(lit.next()); }
			 
			  System.out.println("----------------------------------------------------------------------\nSelection by SSC Marks :\nDecending Order\n");
				Collections.sort(l,new SortBySSC());   // calling by object of outer SortBySSC class
				  ListIterator<SelectionProcess> lit1 = l.listIterator();  //Using listIterator
				  
				  while(lit1.hasNext()) { System.out.println(lit1.next()); }
				  
				  
				  // Using inner Annynomous class for sorting logic inside compare method
				  Comparator<SelectionProcess> SortByHSC = new Comparator<SelectionProcess>() 
				  {

					@Override
					public int compare(SelectionProcess o1, SelectionProcess o2) {
						if(o1.hscMarks==o2.hscMarks)
							return 0;
							else if(o1.hscMarks<o2.hscMarks)
							return 1;
							else return -1;
						
					}
				};
									
					Collections.sort(l,SortByHSC);  // sort by calling referance of annynomous class
					System.out.println("----------------------------------------------------------------------\nSelection by HSC Marks :\nDecending Order\n");
						l.forEach(p->System.out.println(p));  // Using forEach	
					
						
						//Using Lambda Expression
						  Comparator<SelectionProcess> SortByInternship =(o1,o2)->{return o2.internShip-o1.internShip;};
					    
						  Collections.sort(l,SortByInternship);
						  System.out.println("----------------------------------------------------------------------\nSelection by Internship Count :\nDecending Order\n");
							
						  for(SelectionProcess s:l)  // Enhance for loop
					    {
					    	System.out.println(s);
					    }

	 }
}

/*OUTPUT :
[Name=Sachin, sscMarks=81.2, hscMarks=79.85, Degree=BE, internShip=0]
[Name=Dev, sscMarks=71.2, hscMarks=70.85, Degree=BE, internShip=1]
[Name=Akash, sscMarks=85.2, hscMarks=67.45, Degree=MBA, internShip=1]
[Name=Ashwini, sscMarks=75.2, hscMarks=78.9, Degree=BE, internShip=4]
[Name=Ashraf, sscMarks=90.2, hscMarks=70.85, Degree=BSC, internShip=2]
[Name=Anuja, sscMarks=79.5, hscMarks=78.55, Degree=BE, internShip=0]
-----------------------------------------------------------------------
Sorted by Name :


[Name=Akash, sscMarks=85.2, hscMarks=67.45, Degree=MBA, internShip=1]
[Name=Anuja, sscMarks=79.5, hscMarks=78.55, Degree=BE, internShip=0]
[Name=Ashraf, sscMarks=90.2, hscMarks=70.85, Degree=BSC, internShip=2]
[Name=Ashwini, sscMarks=75.2, hscMarks=78.9, Degree=BE, internShip=4]
[Name=Dev, sscMarks=71.2, hscMarks=70.85, Degree=BE, internShip=1]
[Name=Sachin, sscMarks=81.2, hscMarks=79.85, Degree=BE, internShip=0]
----------------------------------------------------------------------
Selection by SSC Marks :
Decending Order

[Name=Ashraf, sscMarks=90.2, hscMarks=70.85, Degree=BSC, internShip=2]
[Name=Akash, sscMarks=85.2, hscMarks=67.45, Degree=MBA, internShip=1]
[Name=Sachin, sscMarks=81.2, hscMarks=79.85, Degree=BE, internShip=0]
[Name=Anuja, sscMarks=79.5, hscMarks=78.55, Degree=BE, internShip=0]
[Name=Ashwini, sscMarks=75.2, hscMarks=78.9, Degree=BE, internShip=4]
[Name=Dev, sscMarks=71.2, hscMarks=70.85, Degree=BE, internShip=1]
----------------------------------------------------------------------
Selection by HSC Marks :
Decending Order

[Name=Sachin, sscMarks=81.2, hscMarks=79.85, Degree=BE, internShip=0]
[Name=Ashwini, sscMarks=75.2, hscMarks=78.9, Degree=BE, internShip=4]
[Name=Anuja, sscMarks=79.5, hscMarks=78.55, Degree=BE, internShip=0]
[Name=Ashraf, sscMarks=90.2, hscMarks=70.85, Degree=BSC, internShip=2]
[Name=Dev, sscMarks=71.2, hscMarks=70.85, Degree=BE, internShip=1]
[Name=Akash, sscMarks=85.2, hscMarks=67.45, Degree=MBA, internShip=1]
----------------------------------------------------------------------
Selection by Internship Count :
Decending Order

[Name=Ashwini, sscMarks=75.2, hscMarks=78.9, Degree=BE, internShip=4]
[Name=Ashraf, sscMarks=90.2, hscMarks=70.85, Degree=BSC, internShip=2]
[Name=Dev, sscMarks=71.2, hscMarks=70.85, Degree=BE, internShip=1]
[Name=Akash, sscMarks=85.2, hscMarks=67.45, Degree=MBA, internShip=1]
[Name=Sachin, sscMarks=81.2, hscMarks=79.85, Degree=BE, internShip=0]
[Name=Anuja, sscMarks=79.5, hscMarks=78.55, Degree=BE, internShip=0]
*/

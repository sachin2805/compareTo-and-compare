//---------USING Inner comparator anonymous class ---------

package compareTo;

import java.util.*;


class Student1 implements Comparable<Student1>
{
	 String name;
	 int roll;
	 double fees ;
	String StdDiv;

	public Student1(String name, int roll,double fees , String StdDiv ) {
	this.name=name;
	this.roll=roll;
	this.fees=fees;
	this.StdDiv=StdDiv;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", roll=" + roll + ", fees=" + fees + ", StdDiv=" + StdDiv + "]";
	}


	public String getName() {
		return name;
	}

	public int getRoll() {
		return roll;
	}

	public double getFees() {
		return fees;
	}

	public String getStdDiv() {
		return StdDiv;
	}
	@Override
	public int compareTo(Student1 o) {
	
		return this.roll - o.roll;
	}
	
	
}

public class Compare_InnerClass {
 public static void main(String args[])
 {
	
    List<Student1> ll = new ArrayList<Student1>();
   ll.add(new Student1("Sachin",1,60000,"BE-A"));
    ll.add(new Student1("Akash", 50,50000,"BE-B"));
    ll.add(new Student1("Govind", 40,40000,"Profound"));
    ll.add(new Student1("Ashraf", 30,80000,"BE-java"));
    
    System.out.println("-----------------------------------------------------\nGiven Student1 Details :");
    for(Student1 s:ll)
    {
    	System.out.println(s);
    }
    
    
    
  //use compare method in Inner class 
  	 Comparator<Student1> c= new Comparator<Student1>(){
  		public int compare(Student1 o1, Student1 o2) {
  		return (int) (o1.fees-o2.fees);
  		}
  	};
  	


  	 Comparator<Student1> c1=new  Comparator<Student1>(){

  	@Override
  	public int compare(Student1 o1, Student1 o2) {
  		
  		return o1.name.compareTo(o2.name);
  	}
  	};
   
    
  
    System.out.println("-----------------------------------------------------\nAfter Sorting -> Roll Number :");
    Collections.sort(ll);
    //ll.sort(null);
    for(Student1 s:ll)
    {
    	System.out.println(s);
    }
    
    System.out.println("-----------------------------------------------------\nAfter Sorting -> Fees :");
  
    Collections.sort(ll,c);
    for(Student1 s:ll)
    {
    	System.out.println(s);
    }
   
    System.out.println("-----------------------------------------------------\nAfter Sorting -> Name :");
    Collections.sort(ll,c1);
    
    //print list using Iterator
    Iterator<Student1> itr= ll.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	
	}
    
 }
}

/*-----------------------------------------------------
Given Student1 Details :
[name=Sachin, roll=1, fees=60000.0, StdDiv=BE-A]
[name=Akash, roll=50, fees=50000.0, StdDiv=BE-B]
[name=Govind, roll=40, fees=40000.0, StdDiv=Profound]
[name=Ashraf, roll=30, fees=80000.0, StdDiv=BE-java]
-----------------------------------------------------
After Sorting -> Roll Number :
[name=Sachin, roll=1, fees=60000.0, StdDiv=BE-A]
[name=Ashraf, roll=30, fees=80000.0, StdDiv=BE-java]
[name=Govind, roll=40, fees=40000.0, StdDiv=Profound]
[name=Akash, roll=50, fees=50000.0, StdDiv=BE-B]
-----------------------------------------------------
After Sorting -> Fees :
[name=Govind, roll=40, fees=40000.0, StdDiv=Profound]
[name=Akash, roll=50, fees=50000.0, StdDiv=BE-B]
[name=Sachin, roll=1, fees=60000.0, StdDiv=BE-A]
[name=Ashraf, roll=30, fees=80000.0, StdDiv=BE-java]
-----------------------------------------------------
After Sorting -> Name :
[name=Akash, roll=50, fees=50000.0, StdDiv=BE-B]
[name=Ashraf, roll=30, fees=80000.0, StdDiv=BE-java]
[name=Govind, roll=40, fees=40000.0, StdDiv=Profound]
[name=Sachin, roll=1, fees=60000.0, StdDiv=BE-A]
*/
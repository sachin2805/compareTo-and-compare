package compareTo;

import java.util.*;


class Student implements Comparable<Student>
{
	 String name;
	 int roll;
	 double fees ;
	String StdDiv;

	public Student(String name, int roll,double fees , String StdDiv ) {
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
	public int compareTo(Student o) {
	
		return this.roll - o.roll;
	}
	
	
}
class SortByfees implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return (int) (o1.fees-o2.fees);
	}
}

class SortByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.name.compareTo(o2.name);
	}
}

public class Compare {
 public static void main(String args[])
 {
	
    ArrayList<Student> al = new ArrayList<Student>();
   al.add(new Student("Sachin",1,60000,"BE-A"));
    al.add(new Student("Akash", 50,50000,"BE-B"));
    al.add(new Student("Govind", 40,40000,"Profound"));
    al.add(new Student("Ashraf", 30,80000,"BE-java"));
    
    System.out.println("-----------------------------------------------------\nGiven Student Details :");
    for(Student s:al)
    {
    	System.out.println(s);
    }
    
   
    
    SortByfees so=new SortByfees();
    System.out.println("-----------------------------------------------------\nAfter Sorting -> Roll Number :");
    Collections.sort(al);
    al.sort(null);
    for(Student s:al)
    {
    	System.out.println(s);
    }
    
    System.out.println("-----------------------------------------------------\nAfter Sorting -> Fees :");
    Collections.sort(al,so);
    for(Student s:al)
    {
    	System.out.println(s);
    }
    SortByName sn=new SortByName();
    System.out.println("-----------------------------------------------------\nAfter Sorting -> Name :");
    Collections.sort(al,sn);
    
    //print list using Iterator
    Iterator<Student> itr= al.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	
	}
    
 }
}

/*OUTPUT :
-----------------------------------------------------
Given Student Details :
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

package compareTo;

import java.util.*;


class Movie implements Comparable<Movie>
{
	 String name;
	 int year;
	 double ret ;
	double tp;

	public Movie(String name, int year,double ret , double tp ) {
	this.name=name;
	this.year=year;
	this.ret=ret;
	this.tp=tp;
	}

	
	
	@Override
	public String toString() {
		return "[name=" + name + ", year=" + year + ", ret=" + ret + ", tp=" + tp + "]";
	}


	public String getName() {
		return name;
	}

	public int getyear() {
		return year;
	}

	public double getret() {
		return ret;
	}

	public double gettp() {
		return tp;
	}
	

	
	@Override
	public int compareTo(Movie o) {
	
		return this.name.compareTo(o.name);
		
	}
	

	
	
}
class SortByYear implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
			if(o1.year>o2.year )
				return -1;
		if(o1.year<o2.year)
			return 1;
		else return 0;
		

	}
}

class SortByRet implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		if(o1.ret>o2.ret )
			return -1;
	if(o1.ret<o2.ret)
		return 1;
	else return 0;
		
	}
}

public class Movies {
 public static void main(String args[])
 {
	
    ArrayList<Movie> alm = new ArrayList<Movie>();
   alm.add(new Movie("URI",2017,5.0,300));
   alm.add(new Movie("House full",2018,4.0,200));
   alm.add(new Movie("War",2018,4.2,350));
   alm.add(new Movie("Shole",2019,4.9,400));
   alm.add(new Movie("Hera feri",2018,3.0,100));
   alm.add(new Movie("Mini",2018,5.0,300));
   alm.add(new Movie("Dhoom",2017,4.4,500));
   alm.add(new Movie("MGK",2021,4.1,380));
   alm.add(new Movie("Rang",2021,4.8,350));
   alm.add(new Movie("Krish",2018,4.7,100));
    
    System.out.println("-----------------------------------------------------\nGiven Movie Details :");
    for(Movie s:alm)
    {
    	System.out.println(s);
    }
    
    Collections.sort(alm,new SortByYear());
   System.out.println("------------------------------------------------------\n After Sorting by year\n Newest First\n");
   for(Movie s:alm)
   {
   	System.out.println(s);
   } 
   
   Collections.sort(alm,new SortByRet());
   System.out.println("------------------------------------------------------\n After Sorting by reating\nHigher Reating First\n");

    
   // print list using Iterator
    Iterator<Movie> itr= alm.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	
	}
    
 }
}
/*OUTPUT :
-----------------------------------------------------
Given Movie Details :
[name=URI, year=2017, ret=5.0, tp=300.0]
[name=House full, year=2018, ret=4.0, tp=200.0]
[name=War, year=2018, ret=4.2, tp=350.0]
[name=Shole, year=2019, ret=4.9, tp=400.0]
[name=Hera feri, year=2018, ret=3.0, tp=100.0]
[name=Mini, year=2018, ret=5.0, tp=300.0]
[name=Dhoom, year=2017, ret=4.4, tp=500.0]
[name=MGK, year=2021, ret=4.1, tp=380.0]
[name=Rang, year=2021, ret=4.8, tp=350.0]
[name=Krish, year=2018, ret=4.7, tp=100.0]
------------------------------------------------------
 After Sorting by year
 Newest First

[name=MGK, year=2021, ret=4.1, tp=380.0]
[name=Rang, year=2021, ret=4.8, tp=350.0]
[name=Shole, year=2019, ret=4.9, tp=400.0]
[name=House full, year=2018, ret=4.0, tp=200.0]
[name=War, year=2018, ret=4.2, tp=350.0]
[name=Hera feri, year=2018, ret=3.0, tp=100.0]
[name=Mini, year=2018, ret=5.0, tp=300.0]
[name=Krish, year=2018, ret=4.7, tp=100.0]
[name=URI, year=2017, ret=5.0, tp=300.0]
[name=Dhoom, year=2017, ret=4.4, tp=500.0]
------------------------------------------------------
 After Sorting by reating
Higher Reating First

[name=Mini, year=2018, ret=5.0, tp=300.0]
[name=URI, year=2017, ret=5.0, tp=300.0]
[name=Shole, year=2019, ret=4.9, tp=400.0]
[name=Rang, year=2021, ret=4.8, tp=350.0]
[name=Krish, year=2018, ret=4.7, tp=100.0]
[name=Dhoom, year=2017, ret=4.4, tp=500.0]
[name=War, year=2018, ret=4.2, tp=350.0]
[name=MGK, year=2021, ret=4.1, tp=380.0]
[name=House full, year=2018, ret=4.0, tp=200.0]
[name=Hera feri, year=2018, ret=3.0, tp=100.0]
*/
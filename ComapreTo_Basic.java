package compareTo;
/*
  i.comapareTo(x)
  if i>x then o/p : 1 , 
  if i<x then o/p : -1 ,
  if i equal x then o/p : 0
 */
public class ComapreTo_Basic {

	public static void main(String args[])
	{
		Integer i = 100;
		String s="Sachin";
		Double d=5.4;
		Character c= 'A';
		
		System.out.println(i.compareTo(20)); //if i> then o/p : 1 , if i< then o/p : -1 , if equal then o/p : 0
		System.out.println(i.compareTo(200));
		System.out.println(d.compareTo(1.5));
		
		System.out.println(s.compareTo("Sachin"));
		
		/* ASCII Values : 
		A-Z =65-90
		a-z =97-122
		0-9 =48-58
		*/
		
		System.out.println(s.compareTo("sachin")); 
		//compare Sachin (S) with sachin (s) then ASCII(S)- ASCII(s) --> o/p : -32
		
		//System.out.println('a'.compareTo('A')); //ERROR
	
		System.out.println(c.compareTo('B')); // ASCII -->{ A(65) - B(66)  = o/p :-1  }
		System.out.println(c.compareTo('b')); // ASCII -->{ A(65) - b(98)  = o/p :-33 }
	}
}

/*OUTPUT :
1
-1
1
0
-32
-1
-33
*/

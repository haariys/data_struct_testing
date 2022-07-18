import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class arraytest {
private Array obj1;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	 
	}
	@Before
	public void intialization()
	{
		 obj1=new Array();
		 
		 
	}

	
	@Test
	public void test() {
		 
		obj1.insert(1, 0);
		obj1.insert(1, 1);
		obj1.insert(1, 2);
		obj1.insert(2, 0);
	    obj1.display();
		boolean check=true;
		boolean checkfalse=false;
		assertEquals(check,obj1.linearSearch(1));
	assertEquals(checkfalse,obj1.linearSearch(5));
		
		
	}
	@Test
	public void arrayoutofbound()
	{
		try
		{
		Array obj2=new Array();
		for(int i=0;i<101;i++)
		{
			obj2.insert(i, i);
		}
		}catch(Exception a) {
			fail("out of bound");
		}
	}
@Test
	public void negetiveIndex()
	{
		try
		{

		obj1.insert(0, -1);
		obj1.insert(1, -2);
	 //Element 2 should not be present as inserted at negetive index
		}
		catch(Exception a)
		{
			fail("Trying to enter at negetive index");
		}
	
	}
	@Test 
	public void charInput()
	{
	try
	{
	obj1.insert('A',3 );	
	}catch(Exception a)
	{
		fail("Character cannot be entered");
	}
	}
	
	
	@Test
	public void NullTest()
	{
		assertNotNull(obj1.array[2]);
	}
	
	
	@Test 
	public void BubbleSort()
	{
		
		obj1.insert(10, 0);
		obj1.insert(9, 1);
		obj1.insert(8, 2);
		obj1.insert(7, 3);
		obj1.insert(6, 4);
		obj1.insert(5, 5);
		obj1.insert(4, 6);
		
		
		obj1.bubbleSort();
		System.out.println("Elements:");
		obj1.display();
		
		assertEquals(Array.array[0],4);
	}
	
	@Test 
	public void DeleteTest()
	{
		obj1.insert(0, 0);
		obj1.delete(0);
		boolean find=false;
		assertEquals(find,Array.linearSearch(0));
		
	}
	
	
@Test
public void BinarySeachTest()
{
	obj1.insert(0, 0);
	boolean Test=Array.binarySearch(0, 0, 1);
	assertEquals(Test,true);
}
@Test
public void BinarySearchHighLow()
{
	obj1.insert(0, 0);
	obj1.insert(12, 1);
	obj1.insert(15, 2);
	boolean Test=Array.binarySearch(12, 1, 0);
	assertEquals(Test,false);
}


@Test
public void BinarySearchFirstHalf()
{
	obj1.insert(0, 0);
	obj1.insert(12, 1);
	obj1.insert(15, 2);
	obj1.insert(18, 3);
	obj1.insert(19, 4);
	obj1.insert(20, 5);
	boolean Test=Array.binarySearch(12, 0, 5);
	assertEquals(Test,true);
	
}


@Test
public void deleteMiddelIndex()
{

	obj1.insert(1, 0);
	obj1.insert(2, 1);
	obj1.insert(3, 2);
	obj1.insert(4, 3);
	obj1.delete(1);
	
	assertEquals(obj1.array[1],3);


	
}






}

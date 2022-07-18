import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LinkedListTest {
	private LinkedList list;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	@Before
	public void intialization()
	{
		 list=new LinkedList();
	}
	

	@Test
	public void test() {
		list.pushFront(0);
	assertEquals(list.head.key,0);
	LinkedList.main(null);
	}

	@Test
	public void TestPushBack()
	{
		list.display();
		list.pushFront(0);
		list.pushBack(10);
		
		assertEquals(list.head.next.key,10);
	}
	
	@Test
	public void TestingNullValue()
	{
		try {
		assertNull(list.head);
		} catch (Exception e)
		{
			System.out.println("Trying to access Null value");
		}
		
	}
	
	@Test 
	public void PopingNullValue()
	{
		try
		{
		list.pop(0);
		} catch(Exception e)
		{
			System.out.println("Poping Null Value");
		}
		
		
	}
	@Test 
	public void PopBackNullValue()
	{
		try
		{
		list.popBack();
		} catch(Exception e)
		{
			System.out.println("Poping Null Value");
		}
		
		
	}
	@Test 
	public void PopFrontNullValue()
	{
		try
		{
		list.popFront();
		} catch(Exception e)
		{
			System.out.println("Poping Null Value");
		}
		
		
	}
	
	
	@Test 
	public void PushingTwoValueAtTop()
	{
		list.pushFront(-1);
		list.pushFront(-2);
		assertEquals(-2,list.head.key);
	}
	
	@Test
	public void PushingTwoValuesAtBack()
	{
		list.pushFront(-1);
		list.pushFront(-2);
		list.pushBack(1);
		list.pushBack(2);
		list.display();
		assertEquals(2,list.head.next.next.next.key);
	}
	
	@Test
	public void Testpop()
	{
		list.pushFront(1);
		list.pushFront(2);
		list.pushBack(3);
		list.pop(1);
		assertEquals(3,list.head.next.key);
	
	}
	@Test
	public void TestpopFront()
	{
		list.pushFront(1);
		list.pushFront(2);
		list.pushBack(3);
		list.popFront();
		
		assertEquals(1,list.head.key);
	}
	@Test
	public void TestpopBack()
	{
		list.pushFront(1);
		list.pushFront(2);
		list.pushBack(3);
		list.popBack();	
		list.pushBack(4);
		assertEquals(list.head.next.next.key,4);
	}
	
	@Test
	public void PopfromHead()
	{
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(13);
		list.pushBack(3);
		list.pushBack(2);
		list.pop(0);	
	
		assertEquals(list.head.key,2);
	}
	@Test
	public void PopMiddleValue()
	{
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(13);
		list.pop(1);
		assertEquals(list.head.next.key,1);
		
	}
	@Test
	public void popSingleElement()
	{
		list.pushFront(1);
		list.pop(0);
		assertNull(list.head);
	}
	
	@Test
	public void popBackSingleElement()
	{
		list.pushFront(1);
		list.popBack();
		assertNull(list.head);
	}
	
	
}

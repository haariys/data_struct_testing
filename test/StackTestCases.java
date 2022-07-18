import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StackTestCases {
	private Stack stack;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	@Before
	public	void  intialization()
	{
		 stack = new Stack();	
	}

	@Test
	public void stackPushOperation() {
	stack.push(12);
	assertEquals(stack.top(),12);
	Stack.main(null);
	}
	@Test
	public void RightSequenceTest()
	{
		stack.push(12);
		stack.push(10);
		assertEquals(stack.top(),10);
		
	}
	@Test
	public void TopNull()
	{
		assertNull(stack.head); //variables are not private
	}
	
	@Test
	public void pushCharacter()
	{
	
			stack.push('A'); //push ascii value
			assertEquals(stack.top(),65);
		
	}

	@Test
	public void topCheck()
	{
		stack.display();
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.push(-13);
		stack.display();
		stack.pop();
		assertEquals(stack.top(),12);
	}
	@Test
	public void popCheck()
	{
		stack.display();
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.push(-13);
		
		assertEquals(stack.pop(),-13);
	}
	
	
	@Test
	public void popNull()
	{
		assertEquals(-1,stack.pop());
	}
	
	@Test 
	public void Nulltop()
	{
		assertEquals(-1,stack.top());
	}
	
	@Test
	public void sizeTest()
	{
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.push(-13);		
		assertEquals(4,stack.getSize());

	}
	@Test
	public void sizeEmptyStack()
	{
		assertEquals(0,stack.getSize());
	}
	
	
	
	
}

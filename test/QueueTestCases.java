import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QueueTestCases {
Queue queue;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
@Before
public  void initialization()
{
queue=new Queue();	
}
	@Test
	public void EnqueueCheck() {
	queue.enqueue(-1);
	assertEquals(queue.head.key,-1);
	Queue.main(null);
	}

	@Test
	public void SequenceCheck() {
	queue.enqueue(12);
	queue.enqueue(13);
	queue.display();
	assertEquals(queue.head.key,12);
	
	}
	@Test
	public void dequeueCheck() {
		queue.enqueue(12);
		queue.enqueue(13);
		queue.enqueue(15);
		queue.enqueue(16);
		assertEquals(queue.dequeue(),12);
	}
	@Test
	public void dequeueSequenceCheck() {
		queue.enqueue(12);
		queue.enqueue(13);
		queue.enqueue(15);
		queue.enqueue(16);
		queue.dequeue();
		assertEquals(queue.head.key,13);
	}
	
	@Test
	public void dequeueEmptyStack()
	{
		queue.display();
		assertEquals(-1,queue.dequeue());
	}
	
	@Test
	public void NullTest()
	{
		assertNull(queue.head);
	}
	
	@Test
	public void NotNullTest()
	{
		queue.enqueue(10);
		assertNotNull(queue.head);
	}
	
	@Test
	public void charInput()
	{
		queue.enqueue('A');
		queue.enqueue('B');
		queue.enqueue('C');
		assertEquals(65,queue.dequeue()); //ASCII TEST
	}
	
//	@Test
//	public void floatingPointTest()
//	{
//		queue.enqueue(10.02);   //DOES NOT WORK FOR FLOATING POINTS OR OTHER TYPES EXCEPT INTEGER
//		
//	}
//	
}

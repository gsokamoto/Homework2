public class CircularLinkedQueue<T> implements QueueInterface<T>{
	
	private static final int DEFAULT_CAPACITY = 10;
	
	public CircularLinkedQueue()
	{
		this(DEFAULT_CAPACITY);
	}
	
	public CircularLinkedQueue(int desiredSize)
	{
		front = null;
		back = null;
	}
	
	private class Node
	{
		private T entry;
		private Node next;
	}
	
	
	private Node front;
	private Node back;
	
	
	public void enqueue(T newEntry) 
	{
		Node node = new Node();
		node.entry = newEntry;
		if (isEmpty())
		{
			node.next = node;
			front = back = node;
		}
		else
		{
			node.next = front;
			back.next = node;
			front = node;
		}
	}

	public T dequeue() 
	{
		T entry = null;
		try
		{
			entry = front.entry;      
			if (front.next == front)
		    {
		       front = null;
		       back = null;
		    }
		    else
		    {
		       front = front.next;
		       back.next = front;
		    }
        } catch(EmptyQueueException e) {
			System.out.println("Error. Stack is empty.");
		}
		return entry;
	}

	public T getFront() 
	{
		T entry = null;
		try
		{
		entry = front.entry;
		} catch(EmptyQueueException e) {
			System.out.println("Error. Stack is empty.");
		}
		return entry;
	}

	public boolean isEmpty() 
	{
		if(front == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void clear() 
	{
		front = null;
		back = null;
	}

}

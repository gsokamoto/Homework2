public class CircularLinkedQueue<T> implements QueueInterface<T>{

	public CircularLinkedQueue()
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
		node.next = front;
		if(front == null)
		{
			front = node;
			
		}
		else
		{
			
		}
		back = node;
	}

	public T dequeue() 
	{
		T entry = null;
		try{
		entry = front.entry;
		front = front.next;
		} catch(EmptyQueueException e) {
			System.out.println("Error. Stack is empty.");
		}
		return entry;
	}

	public T getFront() 
	{
		T entry = null;
		try{
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

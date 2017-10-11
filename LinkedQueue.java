public class LinkedQueue<T> implements QueueInterface<T>{

	public LinkedQueue()
	{
		free = null;
		back = null;
	}
	
	private class Node
	{
		private T entry;
		private Node next;
	}
	
	private Node free;
	private Node back;
	
	public void enqueue(T newEntry) 
	{
		Node node = new Node();
		node.entry = newEntry;
		if(free == null)
		{
			node.next = free;
			free = back = node;
		}
		else
		{
			node.next = back;
			back = node;
		}
	}

	public T dequeue() 
	{
		T entry = null;
		try
		{
			entry = free.entry;      
			if (free == null)
			{
				back = null;
			}
			else
			{
				free = free.next;
			}
		} catch(EmptyQueueException e) {
			System.out.println("Error. Stack is empty.");
		}
		return entry;
	}

	public T getFront() 
	{
		T entry = null;
		try{
		entry = free.entry;
		} catch(EmptyQueueException e) {
			System.out.println("Error. Stack is empty.");
		}
		return entry;
	}

	public boolean isEmpty() 
	{
		if(free == null)
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
		free = null;
		back = null;
	}

}

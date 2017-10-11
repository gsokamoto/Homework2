public class LinkedQueue<T> implements QueueInterface<T>{

	public LinkedQueue()
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
		if(front == null)
		{
			node.next = front;
			front = back = node;
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
			entry = front.entry;      
			if (front == null)
			{
				back = null;
			}
			else
			{
				front = front.next;
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

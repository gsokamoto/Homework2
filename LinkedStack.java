import java.util.EmptyStackException;

public class LinkedStack<T> implements StackInterface<T>
{
	
	public LinkedStack()
	{
		head = null;
	}
	
	private class Node
	{
		private Node next;
		private T entry;
	}
	
	private Node head;
	
	public void push(T newEntry) 
	{
		Node node = new Node();
		node.entry = newEntry;
		node.next = head;
		head = node;
	}

	public T pop() 
	{
		T entry = null;
		try{
		entry = head.entry;
		head = head.next;
		} catch(EmptyStackException e) {
			System.out.println("Error. Stack is empty");
		}
		return entry;
	}
	
	public T peek()
	{
		T entry = null;
		try{
		entry = head.entry;
		} catch(EmptyStackException e) {
			System.out.println("Error. Stack is empty");
		}
		return entry;
	}

	public boolean isEmpty() 
	{
		if(head == null)
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
		while(head != null)
		{
			head = head.next;
		}
	}
}

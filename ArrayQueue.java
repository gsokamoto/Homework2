
public class ArrayQueue<T> implements QueueInterface<T>
{
	private static final int DEFAULT_CAPACITY = 10;
	private final T[] queue;
	private int front;
	private int back;
	
	public ArrayQueue()
	{
		this(DEFAULT_CAPACITY);
	}
	
	public ArrayQueue(int desiredSize)
	{
		@SuppressWarnings("unchecked")
		T[] tempQueue = (T[])new Object[desiredSize]; 
		queue = tempQueue;
		front = back = 0;
	}
	
	public void enqueue(T newEntry) 
	{
		queue[back] = newEntry;
		back++;
		if(back == DEFAULT_CAPACITY)
		{
			back = 0;
		}
	}

	public T dequeue() 
	{
		T object = null;
		try
		{
			object = queue[front];
			queue[front] = null;
			front++;
			if(front == DEFAULT_CAPACITY)
			{
				front = 0;
			}
		} catch(EmptyQueueException e) {
				System.out.println("Error. Stack is Empty");
		}
		return object;
	}

	public T getFront() 
	{
		T object = null;
		try
		{
			object = queue[front];
		} catch(EmptyQueueException e) {
				System.out.println("Error. Stack is Empty");
		}
		return object;
	}

	public boolean isEmpty() 
	{
		if(front == back)
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
		queue[back] = null;
		while(front != back)
		{
			queue[front] = null;
			front--;
		}
	}
	
}

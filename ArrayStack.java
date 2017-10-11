import java.util.EmptyStackException;

public class ArrayStack<T> implements StackInterface<T>
{
	private static final int DEFAULT_CAPACITY = 10;
	private final T[] stack;
	private int numOfEntries;
	
	public ArrayStack()
	{
		this(DEFAULT_CAPACITY);
	}
	
	public ArrayStack(int desiredSize)
	{
		@SuppressWarnings("unchecked")
		T[] tempStack = (T[])new Object[desiredSize]; 
		stack = tempStack;
		numOfEntries = 0;
	}
	
	public void push(T newEntry)
	{
		stack[numOfEntries] = newEntry;
		numOfEntries++;
	}
	
	public T pop()
	{
		T object = null;
		try
		{
			object = stack[numOfEntries - 1];
			stack[numOfEntries - 1] = null;
			numOfEntries--;
		} catch(EmptyStackException e) {
				System.out.println("Error. Stack is Empty");
		}
		return object;
	}
   public T peek()
   {
	   T object = null;
	   try
	   {
		   object = stack[numOfEntries - 1];
	   } catch(EmptyStackException e) {
		   System.out.println("Error. Stack is Empty");
	   }
	   return object;
   }

	public boolean isEmpty()
	{
		if(numOfEntries == 0)
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
		for(int i = 0; i < numOfEntries - 1; i++)
		{
			stack[i] = null;
		}
		numOfEntries = 0;
	}
}
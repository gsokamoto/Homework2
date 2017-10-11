import java.util.*;

public class VectorStack<T> implements StackInterface<T>{

	//member variables
	Vector<T> vector;
		
	public VectorStack()
	{
		vector = new Vector<T>();
	}
		
	public void push(T newEntry)
	{
		vector.add(newEntry);
	}
	
	public T pop()
	{
		T object = null;
		try
		{
			object = vector.elementAt(vector.size() - 1);
			vector.removeElementAt(vector.size() - 1);
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
			object = vector.elementAt(vector.size() - 1);
		} catch(EmptyStackException e) {
			System.out.println("Error. Stack is Empty");
		}
		return object;
	}

	public boolean isEmpty()
	{
		return vector.isEmpty();
	}
		
	public void clear()
	{
			vector.clear();
	}
}
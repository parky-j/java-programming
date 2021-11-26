import java.util.*;

public class Buffer{
	private String buffer;

	public boolean isEmpty(){
		 if(buffer == null)
			return true;
		else
			return false;
	}
	public void push(String push){
		buffer = push;
		return;
	}
	public String pop(){
		String pop = buffer;
		buffer = null;
		return pop;
	}
}	
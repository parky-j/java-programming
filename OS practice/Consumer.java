import java.util.*;

public class Consumer{
	Buffer buffer;
	String nextConsumed;
	
	public Consumer(Buffer buffer){
		this.buffer = buffer;

		while(true){
			try{
				Thread.sleep(500);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
			if(!(buffer.isEmpty())){
				nextConsumed = buffer.pop();
				if(nextConsumed == "Stop")
					break;
				System.out.println(nextConsumed);
			}
			else
				System.out.println("######Q is empty so can not do pop######");
			
		}
	
	}

}
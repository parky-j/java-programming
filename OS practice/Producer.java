import java.util.*;

public class Producer{
	Buffer buffer; 
	String[] dynamiteLyrics;
	public Producer(Buffer buffer, String[] dynamiteLyrics){
		this.buffer = buffer;
		this.dynamiteLyrics = dynamiteLyrics;
	
		Random rand = new Random();
		int cnt = 0;
		while(true){
			try{
				Thread.sleep(rand.nextInt(500)+500);
			} catch(InterruptedException e){
				e.printStackTrace();
			}

			if(buffer.isEmpty() && cnt != dynamiteLyrics.length){
				buffer.push(dynamiteLyrics[cnt++]);
			}
			else if(buffer.isEmpty() && cnt == dynamiteLyrics.length){
				buffer.push("Stop");
				break;
			}
			else
				System.out.println("######Q is ouccupied so blocked to push######");

		}
	}
}
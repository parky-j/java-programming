import java.util.*;

public class Main{
	public static void main(String args[]){
		String[] dynamiteLyrics = {"Cos ah ah I'm in the stars tonight",
				"So watch me bring the fire and set the night alight",
				"Shining through the city with a little funk and soul",
				"So I'mma light it up like dynamite, woah",
				"Dynnnnnanana, life is dynamite",
				"Dynnnnnanana, life is dynamite",
				"Shining through the city with a little funk and soul",
				"So I'mma light it up like dynamite, woah"}; 
		Buffer buf = new Buffer();

		Runnable prodTask = () -> {Consumer con = new Consumer(buf);};
		Runnable conTask = () -> {Producer pd = new Producer(buf, dynamiteLyrics);};

		Thread t1 = new Thread(prodTask);
		Thread t2 = new Thread(conTask);
		t1.start();
		t2.start();
	}
}


	public class MultiThreading {


/*


Reference:
https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html
https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html
https://docs.oracle.com/javase/tutorial/essential/concurrency/locksync.html
https://stackoverflow.com/questions/15595538/monitors-and-synchronized-blocks-in-java-it-appears-two-threads-own-a-monitor-a
https://www.javatpoint.com/synchronized-block-example

https://www.geeksforgeeks.org/method-block-synchronization-java/
https://stackoverflow.com/questions/8161896/example-code-to-show-how-java-synchronized-block-works

https://docs.oracle.com/javase/tutorial/essential/concurrency/sync.html
*/


		public static void main(String args[]){
			Display d = new Display();
			new Thread1(d);
			new Thread2(d);
			new Thread3(d);
			new Thread4(d);

		}
	}



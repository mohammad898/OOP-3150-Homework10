 




class Display {
	
		int number = 1;
		
		synchronized void print(char ch, int num){
			while(number%4 != num)
				try{
					wait();
				}catch(InterruptedException e) {
					System.out.println("Something wrong");
				}
			System.out.print(ch);
			number++;
			notifyAll();
		}	
	}

	class Thread1 implements Runnable{
		Thread t1;
		Display d;
		char[] char1 = new char[]{'A', 'E', 'I', 'M', 'Q', 'U', 'Y'};
		
		Thread1(Display d){
			this.d = d;
			t1 = new Thread(this);
			t1.start();
		}
		
		public void run(){
			
			for(int i = 0; i < char1.length; i++){				
				d.print(char1[i], 1);
			}		
		}
	}

	class Thread2 implements Runnable{
		Thread t2;
		Display d;
		char[] char2 = new char[]{'B', 'F', 'J', 'N', 'R', 'V', 'Z'};
		
		Thread2(Display d){
			t2 = new Thread(this);
			this.d = d;
			t2.start();
		}
		
		public void run(){
			
			for(int i = 0; i < char2.length; i++){
				d.print(char2[i], 2);
			}
				
		}
	}

	class Thread3 implements Runnable{
		Thread t3;
		Display d;
		char[] char3 = new char[]{'C', 'G', 'K', 'O', 'S', 'W'};
		
		Thread3(Display d){
			t3 = new Thread(this);
			this.d = d;
			t3.start();
		}
		
		public void run(){
			
			for(int i = 0; i < char3.length; i++){
				d.print(char3[i], 3);
			}					
		}
	}

	class Thread4 implements Runnable{
		Thread t4;
		Display d;
		char[] char4 = new char[]{'D', 'H', 'L', 'P', 'T', 'X'};
		
		Thread4(Display d){
			t4 = new Thread(this);
			this.d = d;
			t4.start();
		}
		
		public void run(){
				
			for(int i = 0; i < char4.length; i++){
				d.print(char4[i], 0);			
			}
		}
	}

	

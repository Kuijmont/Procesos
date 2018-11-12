package ej3;

public class HiloTac extends Thread{
	@Override
	public void run(){
		for (;;) {
			System.out.println("TAC");
			try {
				HiloTic.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

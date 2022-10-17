
public class Clock {
	
	private int hr;
	private int min;
	private int sec;
	private int allSec;
	
	public Clock(int hr, int min, int sec) {
		this.hr = hr;
		this.min = min;
		this.sec = sec;
		hmsToAllSec();
	}
	
	public Clock(int sec) {
		allSec = sec;
		allSecToHms();
	}
	
	//Sets internal allSec from internal ht, min and sec
	public void hmsToAllSec() {
		allSec = 3600 * hr + 60 * min + sec;
	}
	
	public void allSecToHms() {
		hr = allSec / 3600;
		int minResidual = allSec % 3600;
		min = minResidual / 60;
		sec = allSec % 60;
	}
	
	public void tick() {
		allSec += 1;
		allSecToHms();
	}
	
	public int timeInSeconds() {
		return allSec;
	}
	
	public void displayTime() {
		System.out.println("The time is:\n" + hr + ":" + min + ":" + sec);
	}
	public static void main(String[] args) {
		Clock test = new Clock(4, 45, 20);
		test.tick();
		for (int i = 0; i < 10000; i++) {
			test.tick();
		}
		test.displayTime();
	}
}

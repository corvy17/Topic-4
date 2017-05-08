
public class Time {
	int cHour;
	int cMinute;
	int cSecond;
	long cTime;
	
	public Time () {
		cTime = System.currentTimeMillis();
	} 
	
	public Time(long time) {
		cTime = time;
	}
	
	public Time(int hour, int minute, int second) {
		cHour = hour;
		cMinute = minute;
		cSecond = second;
	}
	
	public void setTime(long elapsedTime) {
		cTime = elapsedTime;
	}
	
	public int getHour() {
		return (int)(cTime / (1000 * 60 * 60)) % 24;
	}
	
	public int getMinute() {
		return (int)(cTime / (1000 * 60)) % 60;
	}
	
	public int getSecond() {
		return (int)(cTime / 1000) % 60;
	}	
}

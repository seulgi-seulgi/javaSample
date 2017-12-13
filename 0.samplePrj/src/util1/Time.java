package util1;

public class Time {

	private int hour;
	private int minute;
	private int second;
	private boolean am; // am pm

	public Time() {
	}

	public Time(int hour, int minute, int second) {
		this.setHour(hour);
		this.setMinute(minute);
		setSecond(second);
	}

	public Time(int hour, int minute, int second, boolean am) { this.hour =
	hour; this.setMinute(minute); this.second = second; this.am = am; }
	public boolean isAm() { return am; }
	 
	public void setAm(boolean am) { this.am = am; }
	

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (!(0 <= hour && hour < 24)) {
			return;
		}
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (!(0 <= minute && minute < 60)) {
			return;
		}
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (!(0 <= second && second <= 60)) {
			return;
		}
		this.second = second;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}
	/*
	public void display(){
		if(am==true){
			if(hour>12){
				System.out.printf();
			}
			
		}
		String d = "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
		System.out.println(d);
	}
	*/
}

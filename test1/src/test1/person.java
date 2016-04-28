package test1;

public class person {
	static int num=1000;
	private int year;
	private double balance;
	
	
	public static int getnum()
	{
		return num;
	}
	
	public void save(int num){
		setYear(num);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}

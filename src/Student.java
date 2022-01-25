
public class Student {
	private String name;
	private Integer quiz1;
	private Integer quiz2;
	private float difference;
	private float average;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getQuiz1() {
		return quiz1;
	}
	public void setQuiz1(Integer quiz1) {
		this.quiz1 = quiz1;
	}
	public Integer getQuiz2() {
		return quiz2;
	}
	public void setQuiz2(Integer quiz2) {
		this.quiz2 = quiz2;
	}
	public float getDifference() {
		return difference;
	}
	public void setDifference(float difference) {
		this.difference = difference;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	public Student(String name, Integer quiz1, Integer quiz2) {
		super();
		this.name = name;
		this.quiz1 = quiz1;
		this.quiz2 = quiz2;
		calculateDifference();
		calulateAverage();
	}
	public Student() {
		super();
	}
	
	private void calulateAverage() {
		this.average = ((this.getQuiz1() + this.getQuiz2()) / 2)*1f;
	}
	
	private void calculateDifference() {
		this.difference = this.quiz1 - this.quiz2;
	}
	
	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s %-15.2f %-15.2f \n",this.getName(), this.getQuiz1(), this.getQuiz2(), this.getDifference(), this.getAverage());
		//return super.toString();
	}
}

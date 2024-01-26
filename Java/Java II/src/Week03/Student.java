package Week03;

class Student {
	private String name;
	private double score;
	private String grade;
	
	public Student() {
		this("anonymous", 0.0);
		// name = "anonymous";
		// score = 0.0;
		studentGrade();
	}
	
	public Student(String name, double score) {
		this.name = name;
		this.score = score;
		studentGrade();
	}
	
	private void studentGrade() {
		if(score <= 100.0 && score >= 95.0)
			grade = "A+";
		else if(score >= 90.0)
			grade = "A";
		else if(score >= 85.0)
			grade = "B+";
		else if(score >= 80.0)
			grade = "B";
		else if(score >= 75.0)
			grade = "C+";
		else if(score >= 70.0)
			grade = "C";
		else if(score >= 65.0)
			grade = "D";
		else
			grade = "F";
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setScore(double score) {
		this.score = score;
		studentGrade();
	}
	
	@Override
	public String toString() {
		return "Student [ 이름="+ name +", 성적="+ score +", 등급="+ grade +"]";
	}
}

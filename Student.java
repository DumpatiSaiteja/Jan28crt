
public class Student {
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollegename() {
		return Collegename;
	}
	public void setCollegename(String collegename) {
		Collegename = collegename;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
		@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Collegename=" + Collegename + ", course=" + course + ", fee="
				+ fee + ", marks=" + marks + "]";
	}
		public Student(int id, String name, String collegename, String course, int fee, int marks) {
		super();
		this.id = id;
		this.name = name;
		Collegename = collegename;
		this.course = course;
		this.fee = fee;
		this.marks = marks;
	}
		int id;
		String name;
		String Collegename;
		String course;
		int fee;
		int marks;
	}


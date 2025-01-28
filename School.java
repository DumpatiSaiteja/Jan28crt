
public class School {
	String Sname;
	String Sadd;
	int Fee;
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSadd() {
		return Sadd;
	}
	public void setSadd(String sadd) {
		Sadd = sadd;
	}
	public int getFee() {
		return Fee;
	}
	public void setFee(int fee) {
		Fee = fee;
	}
	@Override
	public String toString() {
		return "School [Sname=" + Sname + ", Sadd=" + Sadd + ", Fee=" + Fee + "]";
	}
	public School(String sname, String sadd, int fee) {
		super();
		Sname = sname;
		Sadd = sadd;
		Fee = fee;
	}

}

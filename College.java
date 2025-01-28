
public class College {
	String Cname;
	String Cadd;
	int Fee;
	int Rank;
	public College(String cname, String cadd, int fee, int rank) {
		super();
		Cname = cname;
		Cadd = cadd;
		Fee = fee;
		Rank = rank;
	}
	@Override
	public String toString() {
		return "College [Cname=" + Cname + ", Cadd=" + Cadd + ", Fee=" + Fee + ", Rank=" + Rank + "]";
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getCadd() {
		return Cadd;
	}
	public void setCadd(String cadd) {
		Cadd = cadd;
	}
	public int getFee() {
		return Fee;
	}
	public void setFee(int fee) {
		Fee = fee;
	}
	public int getRank() {
		return Rank;
	}
	public void setRank(int rank) {
		Rank = rank;
	}

}

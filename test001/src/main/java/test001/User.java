package test001;

public class User {
	private String id;
	private String password;
	private String password_check;
	private String name;
	private String year;
	private String month;
	private String day;
	private String fr;
	private String se;
	private String th;
	private String email;
	private String major;
	
	//get을 통해 변수 값 지정해 주기
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getPassword_check() {
		return password_check;
	}
	public String getName() {
		return name;
	}
	public String getYear() {
		return year;
	}
	public String getMonth() {
		return month;
	}
	public String getDay() {
		return day;
	}
	public String getFr() {
		return fr;
	}
	public String getSe() {
		return se;
	}
	public String getTh() {
		return th;
	}
	public String getEmail() {
		return email;
	}
	public String getMajor() {
		return major;
	}
	
	//set을 통해서 private 접근 불가능한 변수 가지고 오기
	public void setId(String id) {
		this.id = id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setPassword_check(String password_check) {
		this.password_check = password_check;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public void setFr(String fr) {
		this.fr = fr;
	}
	public void setSe(String se) {
		this.se = se;
	}
	public void setTh(String th) {
		this.th = th;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void print() {
		System.out.println(this.id + this.password + this.password_check + this.name + this.year + this.month + this.day+ this.fr + this.se + this.th + this.email + this.major);
	}
}

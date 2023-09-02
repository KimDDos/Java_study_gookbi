package studentManager;

public class Student {
	
	/* 학생클래스 : 한 학생의 정보를 나타내는 클래스
	 * = 학번, 이름, 주민번호, 학부, 학과, 과목s(과목클래스를 배열로 생성[5])
	 * - 멤버변수 선언, 생성자, getter/setter, 기타 메서드...
	 * - (학생이 수강을 시청하는 메서드(배열이 꽉 차면 배열 새로 복사생성), 철회하는 메서드, 기타 출력)
	 * */
	
	private String studentId;
	private String name;
	private String persnalNumber;
	private String college;
	private String major;
	private int size = 5;
	private Subject[] sub = new Subject[size];
	private int cnt;
	private String str;
	
	
	public Student() {}
	public Student(String name) {
		this.name = name;
	}
	public Student(String studentId, String name, String persnalNumber, String college, String major, Subject[] sub,
			int cnt) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.persnalNumber = persnalNumber;
		this.college = college;
		this.major = major;
		this.sub = sub;
		this.cnt = cnt;
	}
	
	public void printInfo() {
		System.out.println("[ 이름:"+name+"| 학번:"+studentId+"]");
		for(int i=0; i<cnt; i++) {
			sub[i].printsubject();
		}
		System.out.println();
		
	}
	
	public void insertStudent(String name) {
		this.name = name; 
	}
	
	public void insertSubject(String subject) {
		if(cnt==sub.length) {
			Subject[] sub1 = new Subject[2*sub.length];
			for(int i=0; i<sub.length; i++) {
				sub1[i] = sub[i];
			}
			sub = sub1;
		}
		sub[cnt] = new Subject(subject);
		cnt++;
	}
	
	public void deleteSubject(String str) {
		for(int i=0; i<cnt; i++) {
			if(str.equals(sub[i].getSubjectName())) {
				sub[i].deleteSubject();
				if(sub[i]==null) {
					for(int j=i+1; j<=cnt; j++) {
						sub[i] = sub[j];
						sub[j] = null;
					}
				}
			}
		}
	}
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPersnalNumber() {
		return persnalNumber;
	}
	public void setPersnalNumber(String persnalNumber) {
		this.persnalNumber = persnalNumber;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Subject[] getSub() {
		return sub;
	}
	public void setSub(Subject[] sub) {
		this.sub = sub;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	}
	

package day19_2;

import java.util.ArrayList;

import org.w3c.dom.ls.LSOutput;

public class Student {
	
	/* 학생클래스 : 한 학생의 정보를 나타내는 클래스
	 * = 학번, 이름, 주민번호, 학부, 학과, 과목s(과목클래스를 배열로 생성[5])
	 * - 멤버변수 선언, 생성자, getter/setter, 기타 메서드...
	 * - (학생이 수강을 시청하는 메서드(배열이 꽉 차면 배열 새로 복사생성), 철회하는 메서드, 기타 출력)
	 * */
	
	private String name;
	private String studentId;
	private String persnalNumber;
	private String college;
	private String major;
	private int size = 5;
	private ArrayList<Subject> sub = new ArrayList<Subject>();
	private int cnt;
	private String str;
	
	
	public Student() {}
	public Student(String name,String studentId) {
		this.name = name;
		this.studentId=studentId;
		sub.add(new Subject(null,0));
	}
	public Student(String name,String studentId, String subjectName, int subjectNum) {
		this.name = name;
		this.studentId=studentId;
		sub.add(new Subject(subjectName,subjectNum));
	}
	
	@Override
	public String toString() {
		return "이름:" + name + ", 학번" + studentId +", "+ sub.toString();
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
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public ArrayList<Subject> getSub() {
		return sub;
	}
	public void setSub(ArrayList<Subject> sub) {
		this.sub = sub;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
	}
	

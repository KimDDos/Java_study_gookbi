package day19_2;

public class Subject {
	/* 과목클래스 : 한 과목의 기본정보를 나타내는 클래스
	 *   - 과목코드, 과목명, 학점, 시수, 교수명, 학기, 시간표
	 *   - 멤버변수 선언, 생성자, getter/setter, 그 외 필요한 메서드
	 *   - toString, print 메서드 정도?
	 * */
	
	private String subjectName;
	private int subjectNum;
	private double subrank;
	private String subjectTime;
	private String professor;
	private String tern;
	private String timeTable;
	
	public Subject() {}
	public Subject(String subjectName, int subjectNum) {
		this.subjectName=subjectName;
		this.subjectNum=subjectNum;
	}
	@Override
	public String toString() {
		return "과목명:" + subjectName + ", 과목번호:" + subjectNum;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getSubjectNum() {
		return subjectNum;
	}
	public void setSubjectNum(int subjectNum) {
		this.subjectNum = subjectNum;
	}
	public double getSubrank() {
		return subrank;
	}
	public void setSubrank(double subrank) {
		this.subrank = subrank;
	}
	public String getSubjectTime() {
		return subjectTime;
	}
	public void setSubjectTime(String subjectTime) {
		this.subjectTime = subjectTime;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public String getTern() {
		return tern;
	}
	public void setTern(String tern) {
		this.tern = tern;
	}
	public String getTimeTable() {
		return timeTable;
	}
	public void setTimeTable(String timeTable) {
		this.timeTable = timeTable;
	}
}

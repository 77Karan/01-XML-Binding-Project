package in.ashokit.beans;
import in.ashokit.beans.Address.Address;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Student 
{
	private String studentName;
	private int studentId;
	private int studentRank;
	private int studnetMarks;
	private Address address;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getStudentRank() {
		return studentRank;
	}
	public void setStudentRank(int studentRank) {
		this.studentRank = studentRank;
	}
	public int getStudnetMarks() {
		return studnetMarks;
	}
	public void setStudnetMarks(int studnetMarks) {
		this.studnetMarks = studnetMarks;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", studentRank=" + studentRank
				+ ", studnetMarks=" + studnetMarks + ", address=" + address + "]";
	}
	
	
	
	

}

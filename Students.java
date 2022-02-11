package week3.day1.assignments;

public class Students {
	public void Studentsinfo() {
		System.out.println("Student information");
	}
public static void Studentinfo(int id) {
		
		System.out.println("Student ID is = "+id);
	}
	public void Studentinfo(int id1,String name) {
		
		System.out.println("Student ID is = "+id1);
		System.out.println("Student Name is = "+name);
	}
	public void Studentinfo(String email,long phoneno) {
		
		System.out.println("Student Email ID is = "+email);
		System.out.println("Student Phone No. is = "+phoneno);
	}
	public static void main(String[] args) {
		 Students student =new  Students();
		 student.Studentinfo(101);
		 student.Studentinfo(102, "Harishankar");
		 student.Studentinfo("harishankar2702@gmail.com", 8838453545L);

}
}
package week3.day1.assignment2;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println(id);
		}
	public void getStudentInfo(int id, String name) {
		System.out.println(id);
		System.out.println(name);
		
		}
	public void getStudentInfo(String email,String phonenumber) {
		System.out.println(email);
		System.out.println(phonenumber);
	}
	public static void main(String[] args) {
		Students obj=new Students();
		obj.getStudentInfo(1);
		obj.getStudentInfo(2,"abarna");
		obj.getStudentInfo("denesh1800@yahoo.com","0568707751");
		}

}


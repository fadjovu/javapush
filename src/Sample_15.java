class Employee
{
	String ename;
	String dept;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {//return type string
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}// how can i get values of the attributes.....using a setter method
	
	



}



public class Sample_15 {

	public static void main(String[] args) {
		System.out.println("Where is USA?");
		
		Employee emp_obj = new Employee(); // we have only one object
		emp_obj.setEname("Jack");
		emp_obj.setDept("Accounts"); // we have now set the values using setters
		//show the values as output
		
		System.out.println("");
	}

}

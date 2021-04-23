package 리뷰문제;

public class 직원클래스 {
	   
	   String name;
	   String gender;
	   String phone;
	   
	   public 직원클래스(String name, String gender, String phone) {
	      this.name = name;
	      this.gender = gender;
	      this.phone = phone;
	   }

	   @Override
	   public String toString() {
	      return "직원 [name=" + name + ", gender=" + gender + ", phone=" + phone + "]";
	   }
	   
	}

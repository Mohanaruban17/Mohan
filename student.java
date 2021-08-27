class Student2{  
	 int rollno;  
	 String name;  
	  
	 void insertRecord(int r, String n){  //method  
	  rollno=r;  
	  name=n;  
	 }  
	  
	 void displayInformation(){System.out.println(rollno+" "+name);}//method  
	  
	 public static void main(String args[]){  
	  Student2 s3=new Student2();  
	  Student2 s4=new Student2();  
	  
	  s3.insertRecord(111,"Karan");  
	  s4.insertRecord(222,"Aryan");  
	  
	  s3.displayInformation();  
	  s4.displayInformation();  

          Student2 s5=new Student2();  
	  Student2 s4=new Student2();  
	  
	  s3.insertRecord(111,"Karan");  
	  s4.insertRecord(222,"Aryan");  
	  
	  s3.displayInformation();  
	  s4.displayInformation();
     output 
       111 Karan
       222 Aryan

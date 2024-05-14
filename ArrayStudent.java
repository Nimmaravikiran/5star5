
class Student{
	int rollno;
	String name;
	int marks[];
	void setter(int rollno, String name, int marks[]) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	int sum() {
		int total_marks=0;
		for(int i=0; i<marks.length; i++) {
			total_marks += marks[i]; 
		}
		return total_marks;
	}
	double average(){
		int avg = sum() / marks.length;
		return avg;
	}
}
public class ArrayStudent {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		Student s1 = new Student();
		Student s2= new Student();
		Student s3= new Student();
		int s1_marks[]= {100,87,59,78};
		int s2_marks[]= {92,76,99,73};
		int s3_marks[]= {56,32,75,97};
		s1.setter(1, "Ravikiran", s1_marks);
		s2.setter(2, "Rajendar", s2_marks);
		s3.setter(3, "Vinay",s3_marks);
		Student students[] = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		int count=1;
		int array1[]=new int[3];
		for(int i=0;i<students.length;i++){
			array1[i] = students[i].sum();
			System.out.println("--------------------"+"Student"+count+ "--------------------");
			System.out.println("The total marks of "+students[i].name+" :"+students[i].sum());
			System.out.println("The average Marks of "+students[i].name+" :"+ students[i].average());
			System.out.println("------------------------------------------------");
			count++;	
		}
		for(int i=0;i<array1.length;i++){
			System.out.print(array1[i]+"\t");
		}
		System.out.println();
		int maximum=0;
		int position=0;
		for(int i=0;i<array1.length;i++){
			maximum = (maximum>=array1[i])?maximum:array1[i];
		}
		System.out.println("Maximum :"+maximum);
		for(int i=0;i<array1.length;i++){
			if(maximum==array1[i]){
				position = (i+1);
			}
		}
		switch(position){
			case 1:{
				System.out.println(students[position-1].name + " scored highest marks.");
				break;
			}
			case 2:{
				System.out.println(students[position-1].name + " scored highest marks.");
				break;
			}
			case 3:{
				System.out.println(students[position-1].name + " scored highest marks.");
				break;
			}
			default:{
				System.out.println("May be all students scored equal.");
			}
		}
	}
}

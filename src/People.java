

class Student {

    int rollno;
    String name;
    String marks;

}

public class People{
    public static void main(String[] args) {
        
          Student s1 = new Student();
        s1.rollno = 2;
        s1.name = "Yaser";
        s1.marks = "pass";

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Yaser";
        s2.marks = "pass";

        Student s3 = new Student();
        s3.rollno = 2;
        s3.name = "Yaser";
        s3.marks = "pass";

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        
        for (Student stud : students) {
            System.out.println(stud.name + " : " + stud.marks );

        }


       // System.out.println(s1.rollno + " " + s1.name + " " + s1.marks);
       
        //     int nums[] = new int[3]; // Notice the semicolon at the end of this line

        //     nums[0] = 6;
        //     nums[1] = 8;
        //     nums[2] = 10;
        
        // for  (int n : nums) {
        //     System.out.println(n);
        // }
    }
}




package tasks;

public class Course {
    String CourseName;
    static int maxCapacity=100;
    String[] enrolledStudents = new String[maxCapacity];
    String courseName;
    int enrollment=0 ;


  Course(String name){
      this.courseName=name;
  }

    public void enrollStudent(String StudentName){
        enrolledStudents[enrollment]=StudentName;
        System.out.println(StudentName+" Enrolled successfully...");
        enrollment++;
        System.out.println(new StringBuilder().append("Seats available : ").append(maxCapacity - enrollment).toString());

    }
    public void unEnrollStudent(String StudentName){
        System.out.println(StudentName+" Removed successfully...");
        enrollment--;
    }
    public static void setMaxcapacity(int maxCapacity){
           Course.maxCapacity=maxCapacity;
    }

    static void main(String[] args) {
      Course course = new Course("trading");
      Course.setMaxcapacity(100);
      course.enrollStudent("Hari");
    }
}

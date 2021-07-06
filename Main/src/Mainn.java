
public class Mainn {
    public static void main(String[] args) throws Exception {
        
        Student student=new Student();
        Instructor instructor=new Instructor();

        //String[] courses = {"dasdsa","sdsada"};



        student.setFirstName("fatih");
        student.setId(61616161);

        instructor.setFirstName("engin");
        instructor.setId(06060606);

       // System.out.println((courses));
        instructor.setCourses("Java , React js -");

        StudentManager studentManager= new StudentManager();
        studentManager.add(student);

        InstructorManager instructorManager=new InstructorManager();
        instructorManager.add(instructor);

    }
}

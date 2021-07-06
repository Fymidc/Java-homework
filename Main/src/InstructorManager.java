public class InstructorManager extends UserManager {
    public void add (Instructor instructor){
        System.out.println(instructor.getId()+"id'li kişi eklendi");
        System.out.println(instructor.getCourses()+"kursları eklendi");
    }
    
}

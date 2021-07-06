public class Student extends User{
    private String courses;
    private String school;   
    
    public String getCourses(){
        return courses;
    }

    public void setCourses(String courses){
        this.courses=courses;
    }

    public String getSchool(){
        return school;
    }

    public void setSchool(String school){
        this.school=school;
    }
}

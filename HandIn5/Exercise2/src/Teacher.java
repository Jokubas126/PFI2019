public class Teacher extends Person{
    private int numCourses = 0;
    private String[] courses = new String [5];

    Teacher(String name, String address){
        super(name,address);
    }

    public boolean addCourse(String course){
        for(int i=0; i<this.numCourses; i++){
            if(course.equals(this.courses[i])){
                return false;
            }
        }
        return true;
    }

    public boolean removeCourse(String course){
        for(int i=0; i<this.numCourses; i++){
            if(course.equals(this.courses[i])){
                return true;
            }
        }
        return false;
    }

    public void printCourses(){
        for(int i=0; i<this.numCourses; i++){
                System.out.println(this.courses[i]);
            }
        }

    public String toString(){
        return "Teacher" + super.toString();
    }
}

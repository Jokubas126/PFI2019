public class Student extends Person{
    private int numCourses = 0;
    private String[] courses = new String[30];
    private int[] grades = new int[30];

    Student(String name, String address){
        super(name,address);
    }

    public void addCourseGrade(String course, int grade){
        this.courses[numCourses] = course;
        this.grades[numCourses] = grade;
        this.numCourses++;
    }

    public void printGrades(){
        for(int i=0; i<this.numCourses; i++){
            System.out.println(this.courses[i] + " " + this.grades[i]);
        }
    }

    public double getAverageGrade(){
        double x = 0.0;
        for(int i=0; i<this.numCourses; i++){
            x += grades[i];
        }
        double average = x / numCourses;
        return average;
    }

    public String toString(){
        return "Student: " + super.toString();
    }
}

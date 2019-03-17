public class Exercise2 {
    public static void main(String[] args){
        Student st = new Student("RandomStudent", "AdresiuksStudent");
        Teacher tch = new Teacher("RandomTeacher", "AddressTeacher");

        st.addCourseGrade("Math", 12);
        st.addCourseGrade("Biology", 10);
        st.addCourseGrade("IT", 7);
        st.addCourseGrade("Math", 10);
        st.addCourseGrade("English", 4);
        st.printGrades();

        tch.addCourse("Math1");
        tch.addCourse("Math2");
        tch.addCourse("Math3");
        tch.addCourse("Math4");
        //tch.addCourse("Math5");

        tch.printCourses();
    }
}

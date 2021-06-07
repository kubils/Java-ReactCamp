package hwInh;

public class Main {

    public static void main(String[] args) {

        User userStudent = new Student(1919, "Kubilay", "Sevim", "kubils19@gmail.com", "12345", "Java-React");
        User userInstructor = new Instructor(
                1,"Engin", "Demiroğ", "ed.kodlama.io", "54321", "Spring"
        );

        StudentManager student = new StudentManager();
        student.add(userStudent);
        student.enrollCourse(userStudent);
        userStudent.setId(19);
        student.update(userStudent);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(userInstructor);
        instructorManager.addCourse(userInstructor);
        userInstructor.setId(111);
        instructorManager.update(userInstructor);
    }
}

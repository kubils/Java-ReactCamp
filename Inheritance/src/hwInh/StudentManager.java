package hwInh;

public class StudentManager extends UserManager{

    @Override
    public void add(User user) {
        System.out.println(user.getName() + " " + user.getLastName() + " öğrencisi eklendi!");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getName() + " " + user.getLastName() + " öğrencisi silindi!");
    }

    @Override
    public void update(User user) {
        System.out.println(user.getName() + " " + user.getLastName() + " öğrencisi güncellendi!");
    }

    public void enrollCourse(User user) {
        System.out.println(user.getName() + ", " + user.getCourse() + " kursuna kaydoldu!");
    }
}

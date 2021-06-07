package hwInh;

public class InstructorManager extends UserManager{

    @Override
    public void add(User user) {
        System.out.println(user.getName() + " " + user.getLastName() + " eğitmeni eklendi!");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getName() + " " + user.getLastName() + " eğitmeni silindi!");
    }

    @Override
    public void update(User user) {
        System.out.println(user.getName() + " " + user.getLastName() + " eğitmeni güncellendi!");
    }

    public void addCourse(User user) {
        System.out.println(user.getName() + ", " + user.getCourse() + " kursunu ekledi!");
    }
}

package hwInh;

public class User {
    private int id;
    private String name;
    private String lastName;
    private String eEmail;
    private String password;
    private String course;

    public User(int id, String name, String lastName, String eEmail, String password, String course) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.eEmail = eEmail;
        this.password = password;
        this.course = course;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteEmail() {
        return eEmail;
    }

    public void seteEmail(String eEmail) {
        this.eEmail = eEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

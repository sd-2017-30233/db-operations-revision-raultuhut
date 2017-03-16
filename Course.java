package tema;


public class Course {


    private String nume;
    private String teacher;
    private int id;
    private int an;


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAn() {
        return an;
    }

    @Override
    public String toString() {
        return "Course{" +
                "nume='" + nume + '\'' +
                ", teacher='" + teacher + '\'' +
                ", id=" + id +
                ", an=" + an +
                '}';
    }

    public void setAn(int an) {
        this.an = an;
    }
}

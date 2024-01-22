public class Student {
    String name;
    int age;
    String address ;
    String comment;

    public Student(String name, int age, String address ,String comment) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student karabo = new Student("karabo", 27, "1716 Morolong section" ,"first year mentee");
        Student tshepo = new Student("Tshepo", 24, "1716 jozi section" , "first year mentee");
        System.out.println(karabo.toString());
        System.out.println(tshepo .toString());
    }
}

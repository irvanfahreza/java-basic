public class Student extends Person{
    public String major;
    public Integer studentId;

    public Student(Integer id, String name, String gender, String address,
                   int age, String major, Integer studentId){
        super(id, name, gender, address, age);
        this.major = major;
        this.studentId = studentId;
    }

    @Override
    public void sayHello(){
        System.out.println("Hi, Im Student");
        System.out.println("My name is "+this.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}

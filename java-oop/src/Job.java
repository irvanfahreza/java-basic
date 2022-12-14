public class Job extends Person{
    public String position;
    public String description;

    public void job(){
        System.out.println("Job: "+position+", dengan bahasa pemrograman: "+description);
    }
    public Job(Integer id, String name, String gender, String address,
               int age, String position, String description) {
        super(id, name, gender, address, age);
        this.position = position;
        this.description = description;
    }
}

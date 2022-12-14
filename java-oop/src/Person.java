public abstract class Person {

    // List property or field
    public Integer id;
    public String name;
    public String gender;
    public String address;
    public int age;

    public void SayHello(){
        System.out.println("Hi, my name is " +name+", and Im "+age+" years old");
    }

    public Person(Integer id, String name, String gender, String address, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }

    public abstract void sayHello();


    // List of Method getter and setter
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
}

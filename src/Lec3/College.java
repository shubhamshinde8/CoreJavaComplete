package Lec3;

public class College {

    private String name;
    private String address;
    private Student s1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student getS1() {
        return s1;
    }

    public void setS1(Student s1) {
        this.s1 = s1;
    }

    public static void main(String[] args) {
        College c=new College();
        c.setName("Vivekananda college ");
        c.setAddress("Aurangabad");

        Student s1=new Student();
        s1.setId(1);
        s1.setName("shubham shinde");
        s1.setAddress("Sillod ");

        c.setS1(s1);

        System.out.println(c.getName());
        System.out.println(c.getAddress());
        System.out.println(c.getS1().getId());
        System.out.println(c.getS1().getName());
        System.out.println(c.getS1().getAddress());
    }
}

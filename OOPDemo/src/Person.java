/**
 * Created by fhani on 7/7/2017.
 */
public class Person {

    private String fullname;
    private int age;
    private String ss;
    private String address;


    //blank constructor -- if we don't make one, java will do it for us
    public Person() {

    }

    //overloaded contstructor
    public Person(String fullname, int age, String address) {
        this.fullname = fullname;
        this.age = age;
        this.ss = ss;
        this.address = address;
    }
//

    public void sayHi() {
        System.out.println("Hello");
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age1) {
        age = age1; // can get rid of this. by changing parameter name
    }

    public String getSs() {
        return ss;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;


    }

    @Override //this toString will return this method instead of original toString method
    public String toString() {

        return fullname + " " + age + " " + address;
    }

}


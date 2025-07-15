package ClassWorks.Inheritance;
class Animal{
    int noOfEyes;
    int noOfLegs;
    int age;

    public int getNoOfEyes() {
        return noOfEyes;
    }

    public void setNoOfEyes(int noOfEyes) {
        this.noOfEyes = noOfEyes;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Dog extends Animal{
    String name;
    boolean cute;

}
public class Inheritance {
    public static void main(String[] args) {
//        Dog puppy=new Dog();
//        puppy.setAge(1);
//        puppy.setNoOfEyes(2);
//        puppy.name="tommy";
        Animal puppy=new Dog();
        puppy.setAge(1);

    }
}

public class Student {
    private String Name;
    private String ID;
    private int Old;


    public Student() {
    }
    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", ID='" + ID + '\'' +
                ", Old=" + Old +
                ", Class='" + Class + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }

    public Student(String name, String ID, int old, String aClass, String phoneNumber) {
        Name = name;
        this.ID = ID;
        Old = old;
        Class = aClass;
        PhoneNumber = phoneNumber;
    }

    private String Class;
    private String PhoneNumber;

    public String getName(){
        return Name ;
    }

    public void setName(String name){
        this.Name = name;
    }
    public String getID(){
        return ID;
    }
    public void setID(String id){
        this.Name = id;
    }
    public String getPhoneNumber(){
        return PhoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.PhoneNumber = phoneNumber;
    }

    public int getOld(){
        return Old;
    }
    public void setOld(int old){
        this.Old = old;
    }
    public String getString(){
        return Class;
    }
}

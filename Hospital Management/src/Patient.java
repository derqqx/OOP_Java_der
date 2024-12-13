public class Patient {
    private String name;
    private int age;
    private String disease;

    public Patient(String name , int age , String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }
    public String getName(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getDisease(){
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
     @Override
    public String toString(){
         return "Patient [name=" + name + ", id=" + age + ", disease=" + disease + "]";
     }
}
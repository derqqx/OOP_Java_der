public class LibraryMember {
    private int id;
    private String name;
    public LibraryMember(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return "LibraryMember {id=" + id + ", name=" + name + "}";
    }
}

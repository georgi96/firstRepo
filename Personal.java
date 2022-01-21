

public class Personal {
    private String name;
    private int id;
    private String position;
    private int age;
    private String education;

    public Personal(String name, int id, String position, int age, String education) throws CustomException {
        this.setName(name);
        this.id = id;
        this.setPosition(position);
        this.setAge(age);
        this.setEducation(education);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws CustomException {
        if(name.length() <1){
            throw new CustomException("Invalid name! The name should be at least 1 letter long");
        }
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) throws CustomException{
        if(position.length() <1){
            throw new CustomException("Invalid position! The position should be at least 1 letter long");
        }
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)throws CustomException {
        if(age <14){
            throw new CustomException("Invalid age! The age should be at least 14 ");
        }
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education)  throws CustomException{
        if(position.length() <1){
            throw new CustomException("Invalid education! The type fo education should be at least 1 letter long");
        }
        this.education = education;
    }

    @Override
    public String toString() {
        return "Personal:" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", education='" + education + '\'' + "\n";
    }
}

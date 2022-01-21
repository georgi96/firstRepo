public class Cars {
    String manufacture;
    String model;
    int year;
    int id;

    public Cars(String manufacture, String model, int year,int id) throws CustomException {
        this.setManufacture(manufacture);
        this.setModel(model);
        this.setYear(year);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) throws CustomException{
        if(manufacture.length() <1){
            throw new CustomException("Invalid manufacture! The manufacture should be at least 1 letter long");
        }
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) throws CustomException {
        if(model.length() <1){
            throw new CustomException("Invalid model! The model should be at least 1 letter long");
        }
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws CustomException {
        if(year <1886){
            throw new CustomException("Invalid year! The year  should be at least 1886 !");
        }
        this.year = year;
    }


    @Override
    public String toString() {
        return "Cars{" +
                "manufacture='" + manufacture + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", id=" + id +
                '}';
    }
}

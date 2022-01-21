public class CarParts {
    private int id;
    private String type;
    private double price;
    private int number;
    private String manufacture;
    private String Model;
    private int year;


    public CarParts(int id, String type, double price, int number, String manufacture, String Model, int year) throws CustomException {
        this.id = id;
        this.setType(type);
        this.setPrice(price);
        this.setNumber(number);
        this.setManufacture(manufacture);
        this.setModel(Model);
        this.setYear(year);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) throws CustomException{
        if(type.length() <1){
            throw new CustomException("Invalid type! The type should be at least 1 letter long");
        }
        this.type = type;
    }

    public double getPrice()  {
        return price;
    }

    public void setPrice(double price) throws CustomException {
        if(price <1){
            throw new CustomException("Invalid price! The price should be at least 0(free)");
        }
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number)throws CustomException {
        if(number <1){
            throw new CustomException("");
        }
        this.number = number;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) throws CustomException {
        if(manufacture.length() <1){
            throw new CustomException("Invalid manufacture! The manufacture should be at least 1 letter long");
        }
        this.manufacture = manufacture;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) throws CustomException{
        if(Model.length() <1){
        throw new CustomException("Invalid model! The model should be at least 1 letter long");
    }

        this.Model = Model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year ) throws CustomException {
        if(year <1886){
            throw new CustomException("Invalid year! The year  should be at least 1886 !");
        }

        this.year = year;
    }


    @Override
    public String toString() {
        return "CarParts:" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", number=" + number +
                ", manufacture='" + manufacture + '\'' +
                ", Model='" + Model + '\'' +
                ", year=" + year + "\n";
    }
}

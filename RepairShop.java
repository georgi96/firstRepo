import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class RepairShop {
    List<CarParts> carParts;
    private String name;
    private String address;
    private int workspaces;
    ArrayList<Personal> personal;
    ArrayList<Cars> cars;

    public RepairShop(String name, String address, int workspaces, List<CarParts> carParts, ArrayList<Personal> personal,ArrayList<Cars> cars) throws CustomException {
        this.setName(name);
        this.setAddress(address);
        this.setWorkspaces(workspaces);
        this.carParts = carParts;
        this.personal = personal;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws CustomException {
        if(name.length() <1){
            throw new CustomException("The name of the repair shop you tried to create has invalid  name. The  name of a repair shop should be at least 1 character long !");
        }
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws CustomException {
        if(address.length() <1){
            throw new CustomException("The address of the repair shop you tried to create has invalid  name. The  address of a repair shop should be at least 1 character long !");
        }
        this.address = address;
    }

    public int getWorkspaces() {

        return workspaces;
    }

    public void setWorkspaces(int workspaces) throws CustomException {
        if(workspaces <1){
            throw new CustomException("The number of workspaces in  the repair shop you tried to create has invalid  amount. The  number of workspaces in a repair shop should be at least 0 !");
        }
        this.workspaces = workspaces;
    }

    public List<CarParts> getCarParts() {
        return carParts;
    }

    public void setCarParts(ArrayList<CarParts> carParts) {
        this.carParts = carParts;
    }

    public ArrayList<Personal> getPersonal() {
        return personal;
    }

    public void setPersonal(ArrayList<Personal> personal) {
        this.personal = personal;
    }

    public ArrayList<Cars> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Cars> cars) {
        this.cars = cars;
    }

    public void addNewProduct(CarParts carPart){

        carParts.add(carPart);

        if(carPart.getNumber()==1){
            System.out.println("1 piece of the product with ID: " + carPart.getId() + "was added!" );
        }else if(carPart.getNumber()==0){
            System.out.println("Nothing was added");
        }else if(carPart.getNumber()>1){
            System.out.println(carPart.getNumber()  + " pieces of the product with ID: " + carPart.getId()  + " were added!" );
        }
    }

    public void addNumberOfProduct(int id, int number) throws CustomException {
        for(CarParts p:carParts){
            if(p.getId()==id){
                p.setNumber(p.getNumber()+number);
            }
        }
        if(number ==1){
            System.out.println("1 piece of the product with ID: " + id + "was added!" );
        }else if(number==0){
            System.out.println("Nothing was added!");
        }else if(number>1){
            System.out.println(number  + " pieces of the product with ID: " + id + " were added!" );
        }


    }


    public void removeProduct(int id){
        for(CarParts p:carParts){
            if(p.getId()==id){
               carParts.remove(p);
                System.out.println("The product with ID:" + id+" was removed successfully!");

            }
        }
    }

    public void removeNumber(int number, int id) throws CustomException {
        for(CarParts p:carParts){
            if(p.getId()==id){
                p.setNumber(p.getNumber()-number);
            }
        }
       if(number ==1){
           System.out.println("1 piece of the product with ID: " + id + "was removed!" );
       }else if(number==0){
           System.out.println("Nothing was removed!");
       }else if(number>1){
           System.out.println(number  + " pieces of the product with ID: " + id + " were removed!" );
       }

    }

     public void inventory(RepairShop repairShop) {
       System.out.println(repairShop.carParts.toString());
    }

     int x =0;

     public void partSale( int number, int id) throws CustomException {

    for(CarParts p:carParts){
        if(p.getId()==id) {
            if (p.getNumber() >= number) {
                p.setNumber(p.getNumber() - number);
                x += number * p.getPrice();
                System.out.println("Current sold parts income: " + x);
            }else {
                System.out.println("Not enough parts to make this sale!");
            }
        }
    }
    }

    public void addEmployee(Personal worker){
        personal.add(worker);
        System.out.println("Employee with ID:" + worker.getId()+" was hired !");
    }

    public void fireEmployee(int id){
        for(int p =0; p<personal.size(); p++){         // Personal p:personal
            if(personal.get(p).getId() == id){
                personal.remove(p);
                System.out.println("Employee with ID: "+id + " was fired!");

            }
        }
    }

    public void showPersonal(RepairShop repairShop){
        System.out.println(repairShop.personal.toString());
    }

    public void addCar(Cars car) {
        // int o = 0;
        while (cars.size() <= workspaces) {
            cars.add(car);
            if (cars.size() > workspaces) {
                System.out.println("Not enough workspaces for all cars!");

            }
        }


    }
    public void fixCar(int id){
        for(int p =0; p<cars.size(); p++){         // Personal p:personal
            if(cars.get(p).getId() == id){
                cars.remove(p);
                System.out.println("Car with ID: "+id + " fixed!");

            }
        }
    }

}






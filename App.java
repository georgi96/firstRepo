import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws  CustomException {

try {
    ArrayList<CarParts> products = new ArrayList<>();
    ArrayList<Personal> personal = new ArrayList<>();
    ArrayList<Cars> cars = new ArrayList<>();
    RepairShop TurboService = new RepairShop("1", "1", 3, products, personal, cars);

    CarParts engine = new CarParts(1, "t", 3, 8, "Ford", "Mustang", 2015);
    Personal worker1 = new Personal("Ivan ", 2, "mechanic", 29, "High School");
    Personal worker2 = new Personal("Petyr ", 1, "mechanic", 41, "Middle School");
    CarParts fuelPump = new CarParts(3, "1", 2, 11, "Kia", "Sportage", 2020);

    Cars car1 = new Cars("Chevrolet", "Camaro", 2017, 1);
    Cars car2 = new Cars("Opel", "Astra", 2010, 2);
    Cars car3 = new Cars("Chevrolet", "Camaro", 2017, 3);
    Cars car4 = new Cars("Bugatti", "Chiron", 2018, 4);
    Cars car5 = new Cars("Ferrari", "458 Italia", 2009, 5);
    Cars car6 = new Cars("Ferrari", "458 Italia", 2009, 6);

    TurboService.addCar(car1);
    TurboService.addCar(car2);
    TurboService.addCar(car3);
    TurboService.addCar(car4);
    TurboService.addCar(car5);
    TurboService.addCar(car6);

    TurboService.addNewProduct(fuelPump);
    TurboService.addNewProduct(engine);
    TurboService.addEmployee(worker2);
    //  TurboService.addEmployee(worker1);

    TurboService.fireEmployee(2);

    TurboService.removeNumber(3, 3);
    TurboService.inventory(TurboService);
    TurboService.partSale(4, 1);
    TurboService.partSale(12, 3);
    // System.out.println(fuelPump.getNumber());
    TurboService.showPersonal(TurboService);
    TurboService.addNumberOfProduct(3, 4);
    TurboService.inventory(TurboService);

}catch (CustomException e ){
    System.out.println(e.getMessage());

}








}
}
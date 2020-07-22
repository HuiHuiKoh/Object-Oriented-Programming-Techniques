
package practical4q4;

public class Registration {
    static int currentRegNo=1001;               //generate by ourselves
    
    private int regNo;
    private OwnerInfo owner;
    private CarInfo car;                //because car type is combined with the car info alrd

    public Registration(OwnerInfo owner, CarInfo car) {
        this.regNo = currentRegNo;
        this.owner = owner;
        this.car = car;
        
        currentRegNo++; 
    }
    
    public String toString(){
        return String.format("%15d %s %s",regNo, owner.toString(), car.toString());         //toString means return all
    }
    
    
}

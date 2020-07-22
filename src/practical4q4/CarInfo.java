
package practical4q4;

public class CarInfo {
    private String plateNo;
    private String color;
    private int yearReg;
    private CarType type;               //property of CarType

    public CarInfo(String plateNo, String color, int yearReg, CarType type) {
        this.plateNo = plateNo;
        this.color = color;
        this.yearReg = yearReg;
        this.type=type;
    }
    
    public String toString(){
        return String.format("%10s %8s %6d %s", plateNo, color, yearReg, type.toString());       //can also print one by one
    }
}

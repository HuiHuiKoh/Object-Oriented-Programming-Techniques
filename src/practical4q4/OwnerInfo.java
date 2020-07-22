/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical4q4;

/**
 *
 * @author HP
 */
public class OwnerInfo {

    private String ownerName;
    private String ic;                      //it's more appropriate to be declared as string even though it's integer

    public OwnerInfo(String ownerName, String ic) {
        this.ownerName = ownerName;
        this.ic = ic;
    }

    public String toString() {
        return String.format("%12s %12s", ownerName, ic);
    }

}

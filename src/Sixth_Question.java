/*
Implement a banking system using java. Create 3 sub class of Bank : SBI, BOI, ICICI

Classes should have attributes like Name, headofficeAddress, chairmanName, branchCount, fdInterestRate, personalLoanInterestRate, homeLoanInterestRate.
All 3 should have following methods:

1. add getters and setters for the fields
2. print details of every bank (override toString)
 */

class Bank{
    private String Name ;
    private String headofficeAddress;
    private String chairmanName;
    private int branchCount;
    private double fdInterestRate ;
    private double personalLoanInterestRate;
    private double homeLoanInterestRate;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getHeadofficeAddress() {
        return headofficeAddress;
    }

    public void setHeadofficeAddress(String headofficeAddress) {
        this.headofficeAddress = headofficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public double getFdInterestRate() {
        return fdInterestRate;
    }

    public void setFdInterestRate(double fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "Name='" + Name + '\'' +
                ", headofficeAddress='" + headofficeAddress + '\'' +
                ", chairmanName='" + chairmanName + '\'' +
                ", branchCount=" + branchCount +
                ", fdInterestRate=" + fdInterestRate +
                ", personalLoanInterestRate=" + personalLoanInterestRate +
                ", homeLoanInterestRate=" + homeLoanInterestRate +
                '}';
    }
}

class SBI extends Bank{ }

class BOI extends Bank { }

class ICICI extends Bank { }


public class Sixth_Question {

    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.setName("STATE BANK OF INDIA");
        sbi.setChairmanName("Dinesh Khara");
        sbi.setBranchCount(22000);
        sbi.setFdInterestRate(6.5);

        System.out.println(sbi);

        BOI boi = new BOI();
        boi.setName("Bank of India");
        System.out.println(boi);
    }

}

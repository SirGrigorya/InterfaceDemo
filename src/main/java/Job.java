public class Job extends Person implements PersonInterface {

    private String phoneNumber;

    private String status;

    private String department;

    @Override
    public String getInfo() {
        return " birthYear: " + birthYear + " phoneNumber: " + phoneNumber + " department: " + department + " adress: " + adress;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public String getFIO() {
        return FIO;
    }

    public Job(String FIO, String status, String birthYear, String phoneNumber, String department, String adress) {
//        this.FIO = FIO;
//        this.status = status;
//        this.birthYear = birthYear;
        super(FIO, adress, birthYear);
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.status = status;
        count += 1;
    }

}

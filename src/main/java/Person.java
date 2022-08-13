public abstract class Person {
    protected String FIO;

    protected String adress;

    protected String birthYear;

    public Person(String FIO, String adress, String birthYear) {
        this.FIO = FIO;
        this.adress = adress;
        this.birthYear = birthYear;
    }
    public static int count;
    public static int countClients;

    static  {
        count = 0;
        countClients = 0;
    }
}

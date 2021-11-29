package implementation;

public class Company implements IService {
    String name;
    String individualNumber;
    String bankAccount;

    public Company(String name, String individualNumber, String bankAccount)
    {
        this.name = name;
        this.individualNumber = individualNumber;
        this.bankAccount = bankAccount;
    }

    public String getIndividualNumber() {
        return individualNumber;
    }

    @Override
    public String makeService(){
        return ("Company:" + name + ", " + bankAccount);
    }
    @Override
    public String getName(){
        return (name + "," + individualNumber);
    }
    @Override
    public String getShortName(){
        return name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", individualNumber='" + individualNumber + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                '}';
    }
}

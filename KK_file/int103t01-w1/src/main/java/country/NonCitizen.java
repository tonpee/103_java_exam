package country;

public class NonCitizen extends Human{
    private final String reason;
    public NonCitizen(String firstName, String lastName, String reason){
        super(firstName, lastName);
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }


    @Override
    public String toString() {
        return "NonCitizen{" +
                "reason='" + reason + '\'' +
                '}';
    }
}

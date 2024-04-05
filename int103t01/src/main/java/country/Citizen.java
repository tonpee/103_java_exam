package country;

public class Citizen extends Human {
    private int citizenId;

    public Citizen(int citizenId, String firstName, String lastName) {
        super(firstName, lastName);
        this.citizenId = citizenId;
    }

    public int getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(int citizenId) {
        this.citizenId = citizenId;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "citizenId=" + citizenId +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }
}

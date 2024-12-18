package ElectionDirectory;

public class VotersPortal extends DateOfBirth {
    private String firstName;
    private String lastName;
    private String gender;
    private String voterId;
    DateOfBirth dateOfBirth = new DateOfBirth();

    public VotersPortal(String firstName, String lastName, String gender, String voterId, DateOfBirth dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.voterId = voterId;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setAge(int age) {
        dateOfBirth.setDayOfBirth(String.valueOf(age));
    }

//    public String generateVoterId() {
//        for(int i = 0;)
//    }
}

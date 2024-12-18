package ElectionDirectory;

public class Candidates {
    private String firstName;
    private String lastName;
    private int age;
    private String candidateAddress;
    private String gender;
    private String partyName;


    public Candidates(String firstName,String lastName, int age, String candidateAddress, String gender, String partyName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.candidateAddress = candidateAddress;
        this.gender = gender;
        this.partyName = partyName;
    }
    public String getCandidateFullName() {
        return firstName + " " + lastName;
    }

    public void validateAge(int age) {
        boolean ageIsValid = age >= 25 && age <= 80;
        if (!ageIsValid) throw new IllegalArgumentException("Age must be between 25 and 80");
    }
    public void setAge (int age) {
        validateAge(age);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void validateGender (String gender) {
        boolean genderIsValid = gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female");
        if(!genderIsValid)
            throw new IllegalArgumentException("Invalid gender");
    }
    public void setGender(String gender) {
        validateGender(gender);
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    public String getCandidateAddress() {
        return candidateAddress;
    }

    public String getPartyName() {
        return partyName;
    }

    public void validatePartyName(String partyName) {
        boolean startsWithANumber = Character.isDigit(partyName.charAt(0));
        if (startsWithANumber) throw new IllegalArgumentException("Invalid party name");
    }

    public void setPartyName(String partyName) {
        validatePartyName(partyName);
        this.partyName = partyName;
    }
}

package Assignment_7;

class Stud implements Comparable<Stud> {
    private String firstName;
    private String lastName;
    private double gpa;

    public Stud(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Stud other) {
        return this.lastName.compareTo(other.lastName);
    }
}
public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
    }

    public String getfirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firstName.equals((author.firstName)) && lastName.equals(author.lastName);

    }
    public int hashCode() {
        return java.util.Objects.hash(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return this.getfirstName() + " " + this.getlastName();
    }
}



public class Author {
    String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public String toString() {
        return "Имя автора  " + this.name + " Фамилия автора " + this.surname;
    }

    public boolean equals(Author other) {
        if (other != null) {
            if (this.getClass() != other.getClass()) {
                return false;
            }
        }
        Author author = (Author) other;
        return name.equals(other.name) && surname.equals(other.surname);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }

}

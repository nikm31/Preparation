package ru.nikm31.lesson1.builder;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final String country;
    private final String address;
    private final String phone;
    private final int age;
    private final String gender;

    private Person(Builder builder) {

        if (builder.firstName.length() < 2 || builder.lastName.length() < 3) {
            throw new IllegalArgumentException("Short name / lastname");
        }

        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;
        this.country = builder.country;
        this.address = builder.address;
        this.phone = builder.phone;

        if (builder.age < 0) {
            throw new IllegalArgumentException("Illegal age. Must be not less then 0");
        }

        this.age = builder.age;
        this.gender = builder.gender;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private int age;
        private String gender;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }

}

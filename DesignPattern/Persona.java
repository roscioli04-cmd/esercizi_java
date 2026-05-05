package DesignPattern;

public class Persona {

    public static class Person {
        private String firstName;
        private String lastName;
        private int age;
        private String address;

        private Person(Builder builder) {
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.age = builder.age;
            this.address = builder.address;
        }

        public String getFirstName() { return firstName; }
        public void setFirstName(String firstName) { this.firstName = firstName; }

        public String getLastName() { return lastName; }
        public void setLastName(String lastName) { this.lastName = lastName; }

        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }

        public String getAddress() { return address; }
        public void setAddress(String address) { this.address = address; }

        @Override
        public String toString() {
            return "Person [Nome=" + firstName + ", Cognome=" + lastName + 
                   ", Eta=" + age + ", Indirizzo=" + address + "]";
        }

        public static class Builder {
            private String firstName;
            private String lastName;
            private int age;
            private String address;

            public Builder(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            public Builder setAge(int age) {
                this.age = age;
                return this;
            }

            public Builder setAddress(String address) {
                this.address = address;
                return this;
            }

            public Person build() {
                return new Person(this);
            }
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person.Builder("Mario", "Rossi")
                .setAge(30)
                .setAddress("Via Roma 1")
                .build();

        Person p2 = new Person.Builder("Luigi", "Verdi")
                .setAddress("Via Milano 10")
                .build();

        System.out.println(p1);
        System.out.println(p2);
    }
}
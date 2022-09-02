package org.example.builderPattern;

public class ClassB {

    private int id;

    private String firstName;

    private String lastName;

    private String phoneNumber;


    private ClassB(int id, String firstName, String lastName, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }


    public static ClassBBuilder builder(){
        return new ClassBBuilder();
    }


    public static class ClassBBuilder {
        private int id;
        private String firstName;
        private String lastName;
        private String phoneNumber;

        private ClassBBuilder() {
        }

        public ClassBBuilder id(int id){
            this.id = id;
            return this;
        }

        public ClassBBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ClassBBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ClassBBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public ClassB build() {
            return new ClassB(id, firstName, lastName, phoneNumber);
        }

        public String toString() {
            return "ClassB.ClassBBuilder(id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", phoneNumber=" + this.phoneNumber + ")";
        }
    }


    @Override
    public String toString() {
        return "ClassB{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}

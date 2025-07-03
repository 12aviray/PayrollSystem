

    public abstract class Employee {
        private final String firstName;
        private final String lastName;
        private final String socialSecurityNumber;

        // Constructor to initialize common properties
        public Employee(String firstName, String lastName, String socialSecurityNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.socialSecurityNumber = socialSecurityNumber;
        }

        // Getters for the properties
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getSocialSecurityNumber() {
            return socialSecurityNumber;
        }

        // Override toString() to return a string representation of the Employee
        @Override
        public String toString() {
            return String.format("%s %s%nsocial security number: %s",
                    getFirstName(), getLastName(), getSocialSecurityNumber());
        }

        // Abstract method must be overridden by concrete subclasses
        public abstract double earnings(); // no implementation here
    }


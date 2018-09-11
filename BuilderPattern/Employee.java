package com.employee;

public class Employee {

    private String firstName;
    private String lastName;
    private String departmant;
    private int salary;
    private int experience;
    private int id;
    private String joiningDate;

    private Employee(EmployeeBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.departmant = builder.departmant;
        this.salary = builder.salary;
        this.experience = builder.experience;
        this.id = builder.id;
        this.joiningDate = builder.joiningDate;
    }

    /**
     * Returns the firstName of  the employee
     *
     * @return FirstName of the Employee
     */
    public String getFirstName() {
        return firstName;
    }


    /**
     *  Returns the laseName of the employee
     *
     * @return LastName of the employee
     */

    public String getLastName() {
        return lastName;
    }

    /**
     * Returns the employee Department
     *
     * @return Employee Department
     */

    public String getDepartmant() {
        return departmant;
    }

    /**
     * Returns the Employee Salary
     *
     * @return Employee Salary
     */

    public int getSalary() {
        return salary;
    }

    /**
     * Returns the employee experience
     *
     * @return Employee experience
     */

    public int getExperience() {
        return experience;
    }

    /**
     * Returns the employee Id
     *
     * @return Employee Id
     */

    public int getId() {
        return id;
    }

    /**
     * Returns the employee JoiningDate
     *
     * @return Employee JoiningDate
     */

    public String getJoiningDate() {
        return joiningDate;
    }


    public static class EmployeeBuilder {

        private String firstName;
        private String lastName;
        private String departmant;
        private int salary;
        private int experience;
        private int id;
        private String joiningDate;

      

        public EmployeeBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public EmployeeBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public EmployeeBuilder setDepartmant(String departmant) {
            this.departmant = departmant;
            return this;
        }

        public EmployeeBuilder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public EmployeeBuilder setExperience(int experience) {
            this.experience = experience;
            return this;
        }

        public EmployeeBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder setJoiningDate(String joiningDate) {
            this.joiningDate = joiningDate;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departmant='" + departmant + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                ", id=" + id +
                ", joiningDate='" + joiningDate + '\'' +
                '}';
    }


    public static void main(String[] args) {

        Employee emp = new Employee.EmployeeBuilder().setDepartmant("Maths").setExperience(2).build();
        System.out.println(emp);
    }


}

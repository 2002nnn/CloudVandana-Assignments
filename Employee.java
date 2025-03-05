package assignmentcloudvandana;



class Employee {
    // Private attributes (Encapsulation)
    private int id;
    private String name;
    private double salary;

    // Constructor to initialize Employee
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display Employee details
    public void displayDetails() {
        System.out.println("ID: " + id + " | Name: " + name + " | Salary: Rs " + salary);
    }
}


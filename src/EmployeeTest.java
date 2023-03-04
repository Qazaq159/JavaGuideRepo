import com.example.business.EmployeeStockPlan;
import com.example.domain.*;

import java.text.NumberFormat;

public class EmployeeTest {
    public static void printEmployee(Employee emp, EmployeeStockPlan esp) {
        System.out.println();
        System.out.println("Employee type: " + emp.getClass().getSimpleName());
        System.out.println(emp);
        System.out.println("Stock options: " + esp.grantStock(emp));
    }

    public static void main(String[] args) {
        Engineer engineer = new Engineer("012345678", "Jane Smith", 120345.123, 101);
        Manager manager = new Manager(207, "Barbara Johnson", "054122367", 109531.45, "US Marketing");
        Admin admin = new Admin(204, "1230985673", "Boe Milson", 450000.23);
        Director director = new Director(1, "Beknur Altynbek", "98845678", 980456.12, "Global Marketing", 1000000.0);
        EmployeeStockPlan esp = new EmployeeStockPlan();

        printEmployee(engineer, esp);
        printEmployee(manager, esp);
        printEmployee(admin, esp);
        printEmployee(director, esp);

        System.out.println(NumberFormat.getCurrencyInstance().format(director.getSalary()));
        director.raiseSalary(-8789);
        System.out.println(NumberFormat.getCurrencyInstance().format(director.getSalary()));

        System.out.println(director.getName());
        director.setName(null);
        System.out.println(director.getName());
    }
}


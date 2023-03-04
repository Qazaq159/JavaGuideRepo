package com.example.business;
import com.example.domain.*;

public class EmployeeStockPlan {
    public EmployeeStockPlan(){}

    public int grantStock(Employee emp) {
        boolean is_director = emp instanceof Director;
        boolean is_manager = emp instanceof  Manager;

        if(is_director)
            return 1000;

        if(is_manager)
            return 100;

        return 10;
    }
}

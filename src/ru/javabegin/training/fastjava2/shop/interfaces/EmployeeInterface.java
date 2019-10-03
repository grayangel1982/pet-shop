package ru.javabegin.training.fastjava2.shop.interfaces;

public interface EmployeeInterface{

    String getName();

    DepartmentInterface getDepartment();

    void setDepartment(DepartmentInterface department);

    boolean isFree();

}

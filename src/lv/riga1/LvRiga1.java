/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.riga1;

/**
 *
 * @author user
 */
public class LvRiga1 {

    /**
     * @param args the command line arguments
     */
    public static void main2(String[] args) {
       square s1 = new square(5, "red");
       square s2 = new square(20, "green");
       
       System.out.println("Kvadrāta 1 krāsa ir " 
               + s1.getColor() );
       
       System.out.println("Kvadrāta 2 laukuma ir "
               + s2.getArea());
       
       System.out.println("Kvadrāta 2 perimetrs ir"
               + s2.getPerimeter());
    }
    public static void main(String[] args) {
// Darbinieka dzīvesvieta
Address employeeResidence = new Address();
employeeResidence.country = "Latvia";
employeeResidence.city = "Riga";

// Nodaļas atrašanās vieta
Address departmentLocation = new Address();
departmentLocation.country = "latvia";
departmentLocation.city = "Ventspils";

Department employeeDepartment = new Department();
employeeDepartment.name = "IT department";
employeeDepartment.location = departmentLocation;

// Darbinieks
Employee employee = new Employee();
employee.name = "Jānis";
employee.residence = employeeResidence;
employee.actualDepartment = employeeDepartment;

System.out.println("Mani sauc" + employee.name + "es dzīvoju" + employee.residence.getFullAddress() + ",");









} 
}
}
    
}

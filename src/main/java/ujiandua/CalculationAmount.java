package ujiandua;

public class CalculationAmount {

    double calculateTax(Employee employee) {
        double resultSalary = 0;

        if(employee.getAmount() > 7000){
            double resultacc_no = employee.getAmount() * employee.getacc_no()/100;
            resultSalary = employee.getAmount() - resultacc_no;
        } else {
            resultSalary = employee.getAmount();
        }

        return resultSalary;
    }

}
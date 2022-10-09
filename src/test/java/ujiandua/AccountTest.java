package ujiandua;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountTest {

    Employee employee;
    CalculationAmount calculationAmount;

    @BeforeMethod
    public void setUp(){
        employee = new Employee();
        calculationAmount = new CalculationAmount();
    }

    @Test
    public void testCalculateTaxOne(){
        employee.setName("mohammad zakaria yusri");
        employee.setAmount(8000);
        employee.setacc_no(10);

        double actual = calculationAmount.calculateTax(employee);
        Assert.assertEquals(actual, 7200.0);
    }

    @Test
    public void testCalculateTaxTwo(){
        employee.setName("Koswara");
        employee.setAmount(6000);
        employee.setacc_no(10);

        double actual = calculationAmount.calculateTax(employee);
        Assert.assertEquals(actual, 6000.0);
    }

}
package Mockito.Exercise;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;


public class SalaryCalculatorServiceTest {

    @Mock
    TaskManagementSystem taskManagementSystem;

    private SalaryCalculatorService salaryCalculatorService;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
        salaryCalculatorService = new SalaryCalculatorService(taskManagementSystem);
    }

    @Test
    public void shouldHaveNoBonus() {
        //given
        Employee employee = new Employee("Tomek", BigDecimal.valueOf(2000));
        Mockito.when(taskManagementSystem.countFinishedTasksForEmployee(employee)).thenReturn(9);

        //when
        BigDecimal salary = salaryCalculatorService.calculateSalary(employee);

        //then
        Assertions.assertThat(salary).isEqualTo(BigDecimal.valueOf(2000));
    }

    @Test
    public void shouldHave1000Bonus(){
        //given
        Employee employee = new Employee("Tomek", BigDecimal.valueOf(2000));
        Mockito.when(taskManagementSystem.countFinishedTasksForEmployee(employee)).thenReturn(20);

        //when
        BigDecimal salary = salaryCalculatorService.calculateSalary(employee);

        //then
        Assertions.assertThat(salary).isEqualTo(BigDecimal.valueOf(3000));
    }
    @ParameterizedTest
    @ValueSource(ints={10,19})
    public void shouldHave500Bonus(int finishedTasks){
        //given
        Employee employee = Mockito.mock(Employee.class);
        Mockito.when(employee.getBaseSalary()).thenReturn(BigDecimal.valueOf(2000));
        Mockito.when(taskManagementSystem.countFinishedTasksForEmployee(employee)).thenReturn(finishedTasks);

        //when
        BigDecimal salary = salaryCalculatorService.calculateSalary(employee);

        //then
        Assertions.assertThat(salary).isEqualTo(BigDecimal.valueOf(2500));
    }

    @Test
    public void shouldHandleVoidMethod(){
        Employee employee = Mockito.mock(Employee.class);

        Mockito.doThrow(new IllegalStateException().).when(employee).setName(ArgumentMatchers.anyString());
        employee.setName("Tomek");
        employee.setName("Romek");
    }
}

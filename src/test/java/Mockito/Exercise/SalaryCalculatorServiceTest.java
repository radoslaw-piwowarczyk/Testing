package Mockito.Exercise;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
}

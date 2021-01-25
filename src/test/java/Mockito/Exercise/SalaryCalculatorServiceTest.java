package Mockito.Exercise;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class SalaryCalculatorServiceTest {

    @Mock
    TaskManagementSystem taskManagementSystem;

    private SalaryCalculatorService salaryCalculatorService;

    @BeforeEach
    public void init(){
        MockitoAnnotations.openMocks(this);
        salaryCalculatorService = new SalaryCalculatorService(taskManagementSystem);
    }
}

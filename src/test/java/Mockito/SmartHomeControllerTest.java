package Mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


public class SmartHomeControllerTest {

    @Mock
    private HumiditySensor humiditySensorMock;
    @Mock
    private WateringController wateringControllerMock;

    @BeforeEach
    void init(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldDisableWatering() {
//        HumiditySensor humiditySensorMock = Mockito.mock(HumiditySensor.class);
//        WateringController wateringControllerMock = Mockito.mock(WateringController.class);

        //given
        Mockito.when(humiditySensorMock.getHumidity()).thenReturn(50);
        SmartHomeController smartHomeController = new SmartHomeController(humiditySensorMock, wateringControllerMock);

        //when
        smartHomeController.enableWateringIfNeeded();

        //then
        Mockito.verify(wateringControllerMock).disableWatering();
    }

}

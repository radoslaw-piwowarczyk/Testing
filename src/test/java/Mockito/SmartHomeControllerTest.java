package Mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class SmartHomeControllerTest {

    @Test
    void shouldDisableWatering() {
        HumiditySensor humiditySensorMock = Mockito.mock(HumiditySensor.class);
        Mockito.when(humiditySensorMock.getHumidity()).thenReturn(50);

        WateringController wateringControllerMock = Mockito.mock(WateringController.class);
        SmartHomeController smartHomeController = new SmartHomeController(humiditySensorMock, wateringControllerMock);

        //when
        smartHomeController.enableWateringIfNeeded();

        //then
        Mockito.verify(wateringControllerMock).disableWatering();
    }

}

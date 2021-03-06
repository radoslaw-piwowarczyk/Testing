package Mockito.SmartHome;

import Mockito.SmartHome.HumiditySensor;
import Mockito.SmartHome.SmartHomeController;
import Mockito.SmartHome.WateringController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SmartHomeControllerTest {

    @Mock
    private HumiditySensor humiditySensorMock;
    @Mock
    private WateringController wateringControllerMock;
    @InjectMocks
    private SmartHomeController smartHomeController;

    /**
     * when not using MockitoExtension
     */
//    @BeforeEach
//    void init(){
//        MockitoAnnotations.openMocks(this);
//    }

    @Test
    void shouldDisableWatering() {
        /**
         * when not using Mock annotation
         */
//        HumiditySensor humiditySensorMock = Mockito.mock(HumiditySensor.class);
//        WateringController wateringControllerMock = Mockito.mock(WateringController.class);
        /**
         * when not using InjectMockito
         */
//        SmartHomeController smartHomeController = new SmartHomeController(humiditySensorMock, wateringControllerMock);

        //given
        Mockito.when(humiditySensorMock.getHumidity()).thenReturn(50);

        //when
        smartHomeController.enableWateringIfNeeded();

        //then
        Mockito.verify(wateringControllerMock).disableWatering();
    }

}

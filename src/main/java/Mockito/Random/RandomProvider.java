package Mockito.Random;

import java.util.UUID;

public class RandomProvider {

    public String generateRandomKey() {
        return UUID.randomUUID().toString();
    }
}

package uk.sky.loki.starter.threading.starter;

public class PrimeNumberCalculator {

    public static boolean isPrime(int possiblePrime) {

        for(int i = 2; i < possiblePrime; i++){
            if (((possiblePrime % i) == 0)){
                return false;
            }
        }
        return true;
    }

}

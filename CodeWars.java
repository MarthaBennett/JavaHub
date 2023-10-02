public class CodeWars {
    public int cockroachSpeed(double kph) {
        int secondsInHour = 3600;
        int cmInKm = 100000;
        int centimetresPerSecond = (int) (kph * cmInKm / secondsInHour);
        return centimetresPerSecond;
    }
}

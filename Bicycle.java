public class Bicycle implements Vehicle {


    @Override
    public void start() {
        System.out.println("велосипед начал движение");
    }

    @Override
    public void stop() {
        System.out.println("велосипед остановился");
    }
}

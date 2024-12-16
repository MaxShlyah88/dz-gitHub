public class Car implements Vehicle {
public void start(){
    System.out.println("Автомобиль завелся");
}

    @Override
    public void stop() {
        System.out.println("Автомобиль остановился");
    }
}

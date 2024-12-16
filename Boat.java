public class Boat implements Vehicle{
    @Override
    public void start() {
        System.out.println("ЛОДКА ОТЧАЛИЛА ОТ ПРИЧАЛА");
    }

    @Override
    public void stop() {
        System.out.println("ЛОДКА ОСТАНОВИЛАСЬ");

    }
}

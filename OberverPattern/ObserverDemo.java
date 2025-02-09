package OberverPattern;

public class ObserverDemo {
    public static void main(String[] args){
        Observer obj1 = new MobileDisplayObserver("weather");
        WeatherStation weathSubject = new WeatherStation();

        weathSubject.attach(obj1);

        weathSubject.updateTemp(22);

        Observer obj2 = new MobileDisplayObserver("wind");
        weathSubject.attach(obj2);
        weathSubject.updateTemp(50);

    }
}

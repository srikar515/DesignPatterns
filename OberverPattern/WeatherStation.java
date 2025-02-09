package OberverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private List<Observer> allObservers;
    private float temp;

    WeatherStation(){
        allObservers = new ArrayList<>();
        temp = 0;
    }

    @Override
    public void notifyObservers(){
        for(Observer obj : allObservers){
            obj.update(temp);
        }
    }

    @Override
    public void attach(Observer obj){
        allObservers.add(obj);
    }

    @Override
    public void detach(Observer obj){
        allObservers.remove(obj);
    }

    public void updateTemp(float temp){
        this.temp = temp;
        notifyObservers();
    }
}

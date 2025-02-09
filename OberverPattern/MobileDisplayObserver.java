package OberverPattern;

public class MobileDisplayObserver implements Observer{

    // Constructer injection 
    // Subject obj;
    // MobileDisplayObserver(Subject obj){
    //     this.obj = obj;
    // }
    // when we need to ask the obseravable to get the Data
    // public void update(){
    //     obj.getData();
    // }

    private String name;

    public MobileDisplayObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(float temp){
        System.out.println(name + " displays Temperature: " + temp + " degrees Celsius");
    }
}

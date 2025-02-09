package OberverPattern;

interface Subject {
    void notifyObservers();
    void attach(Observer obj);
    void detach(Observer obj);
}

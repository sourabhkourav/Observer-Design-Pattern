package NewsBrodcast1;

public interface Subject {
	void registerObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers(String news);
}

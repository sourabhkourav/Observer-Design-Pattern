package NewsBrodcast2;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {
	private List<Observer> observers = new ArrayList<>();
	private String latestNews;

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(latestNews);
		}
	}

	public void publishNews(String news) {
		this.latestNews = news;
		notifyObservers();
	}
}

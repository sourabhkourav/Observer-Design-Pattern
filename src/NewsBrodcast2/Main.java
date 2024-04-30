package NewsBrodcast2;

public class Main {
	public static void main(String[] args) {
		NewsAgency newsAgency = new NewsAgency();

		// Self register for the passing Observable
		Observer observer1 = new NewsSubscriber(newsAgency,"Sourabh");
		Observer observer2 = new NewsSubscriber(newsAgency,"Ashok");
		Observer observer3 = new NewsSubscriber(newsAgency,"Rahul");

		// Publish news
		newsAgency.publishNews("Breaking News: Observer Pattern Explained!");

		// Unregister a subscriber
		newsAgency.removeObserver(observer1);

		// Publish another news
		newsAgency.publishNews("Java 17 Released!");

		// Output:
		// Subscriber 1 received news: Breaking News: Observer Pattern Explained!
		// Subscriber 2 received news: Breaking News: Observer Pattern Explained!
		// Subscriber 2 received news: Java 17 Released!
	}
}

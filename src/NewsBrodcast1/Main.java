package NewsBrodcast1;

public class Main {
	public static void main(String[] args) {
		NewsAgency newsAgency = new NewsAgency();

		Observer observer1 = new NewsSubscriber("Sourabh");
		Observer observer2 = new NewsSubscriber("Ashok");
		Observer observer3 = new NewsSubscriber("Rahul");

		newsAgency.registerObserver(observer1);
		newsAgency.registerObserver(observer2);
		newsAgency.registerObserver(observer3);

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

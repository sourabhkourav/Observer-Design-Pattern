package NewsBrodcast2;

public class NewsSubscriber implements Observer {
	private String name;
	private Subject subject;

	public NewsSubscriber(Subject subject, String name) {
		this.name = name;
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	@Override
	public void update(String news) {
		System.out.println(name + " received news: " + news);
	}
}

package ro.ase.csie.cts.seminar4.banking;

public class EmailNotificationService implements NotificationService {

	@Override
	public void sendNotification(Person destination, String message) {
		System.out.print("Sending email to "+destination.getEmail()+"\n");
		System.out.print(message);
	}

}
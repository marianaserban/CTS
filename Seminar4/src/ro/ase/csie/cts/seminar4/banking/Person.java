package ro.ase.csie.cts.seminar4.banking;

import java.util.Date;

public class Person {

	private String name;

	private String address;

	private Date birthDate;

	private Integer age;

	private long salary;

	private String email;

	private String mobile;

	private NotificationType notificationType;

	public static enum NotificationType {
		EMAIL {
			@Override
			public NotificationService getNotificationService() {
				return new EmailNotificationService();
			}
		},
		SMS
		{
			@Override
			public NotificationService getNotificationService() {
				return new SMSNotificationService();
			}
		};

		public abstract NotificationService getNotificationService();
	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public NotificationType getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(NotificationType notificationType) {
		this.notificationType = notificationType;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
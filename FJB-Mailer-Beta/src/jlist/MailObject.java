package jlist;

import java.util.Date;

public class MailObject {

	private String from;
	private String subject;
	private Date date;
	private String text;

	public MailObject() {
		this.from = "from";
		this.subject = "subject";
		this.date = new Date();
		this.text = "text";
	}
	
	public MailObject(String from, String subject, Date date, String text) {
		this.from = from;
		this.subject = subject;
		this.date = date;
		this.text = text;
	}
	
	public String getListViewText() {
		
		return from + "\n" + subject + "\n" + date;
	}

	public String getFrom() {
		return from;
	}

	public String getSubject() {
		return subject;
	}

	public Date getDate() {
		return date;
	}

	public String getText() {
		return text;
	}

	@Override
	public String toString() {
		return from + "\n" + subject + "\n" + date;
	}
	
}

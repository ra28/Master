package entity;

import java.awt.Image;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

public class Announcement implements Serializable{
	
	private int idAnnouncement;
	private String comment;
	private Date date;
	private Time time;
	private int idShelter;
	private Image imageUrl;
	
	
	public Announcement() {
		super();
	}


	public Announcement(int idAnnouncement, String comment, Date date, Time time, int idShelter, Image imageUrl) {
		super();
		this.idAnnouncement = idAnnouncement;
		this.comment = comment;
		this.date = date;
		this.time = time;
		this.idShelter = idShelter;
		this.imageUrl = imageUrl;
	}


	public int getIdAnnouncement() {
		return idAnnouncement;
	}


	public void setIdAnnouncement(int idAnnouncement) {
		this.idAnnouncement = idAnnouncement;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Time getTime() {
		return time;
	}


	public void setTime(Time time) {
		this.time = time;
	}


	public int getIdShelter() {
		return idShelter;
	}


	public void setIdShelter(int idShelter) {
		this.idShelter = idShelter;
	}


	public Image getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(Image imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	
	
	

}

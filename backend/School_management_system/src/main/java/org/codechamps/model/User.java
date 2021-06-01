package org.codechamps.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
@Entity(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "teacher")
	private boolean teacher;

	@Column(name = "pupil")
	private boolean pupil;

	@Column(name = "admin")
	private boolean admin;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "password")
	private String password;

	public User() {}


	public User(int id, String firstName, String lastName, boolean teacher, boolean pupil, boolean admin,
			String userName, String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.teacher = teacher;
		this.pupil = pupil;
		this.admin = admin;
		this.userName = userName;
		this.password = password;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public boolean isTeacher() {
		return teacher;
	}

	public void setTeacher(boolean teacher) {
		this.teacher = teacher;
	}

	public boolean isPupil() {
		return pupil;
	}


	public void setPupil(boolean pupil) {
		this.pupil = pupil;
	}


	public boolean isAdmin() {
		return admin;
	}


	public void setAdmin(boolean admin) {
		this.admin = admin;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

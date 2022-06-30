package ar.edu.utn.link.tpLink.admin.app;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Entity
@Table(name="admin")
public class Admin{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(unique=true, nullable=false)
	private String username;

	@Column
	private String password;
	
	@ElementCollection
	private List<String> roles;
	
	public Admin() {
		super();
	}
	
	public Admin(String username, String password, String name, String...roles) {
		super();
		this.username= username;
		this.password = password;
		this.roles = new ArrayList<>(Arrays.asList(roles));
	}

	public Admin(int id, String username, String password, String...roles) {
		super();
		this.id = id;
		this.username= username;
		this.password = password;
		this.roles = new ArrayList<>(Arrays.asList(roles));
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", username=" + username + ", password=" + password + ",roles="
				+ roles + "]";
	}
	
}
package entities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale.Category;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id; 
<<<<<<< HEAD
=======
	
>>>>>>> a357fd8f88c3458c5c388c9966611e0a35f3689c
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user; 
	
	private String content; 
	
	@Column(name="post_time")
	private LocalDateTime postTime; 
	
	private Category category; 
	
	private Double price; 
	
	private String title; 
<<<<<<< HEAD
	@ManyToOne
	@JoinColumn(name="community_id")
	private Community community; 
	@OneToMany(mappedBy="item")
=======
	
	@ManyToOne
	@JoinColumn(name="community_id")
	private Community community; 
	
	@OneToMany(mappedBy="item_id")
>>>>>>> a357fd8f88c3458c5c388c9966611e0a35f3689c
	private List<Post> posts;
	
	public Item() {
		
	}
	
	public int getId() {
		return id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDateTime getPostTime() {
		return postTime;
	}
	public void setPostTime(LocalDateTime postTime) {
		this.postTime = postTime;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Community getCommunity() {
		return community;
	}
	public void setCommunity(Community community) {
		this.community = community;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", user=" + user + ", content=" + content + ", postTime=" + postTime + ", category="
				+ category + ", price=" + price + ", title=" + title + ", community=" + community + "]";
	}
	
	
	
}

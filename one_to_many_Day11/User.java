package one_to_many_Day11;
//one
public class User {
	Post[] posts;
	String userName;
	static int count=0;
	
	public User(int size,String userName) {
		posts=new Post[size];
		this.userName=userName;
	}
	
	public void addPost(Post post) {
		if(count<posts.length) {
			posts[count++]=post;
			System.out.println("Post added");
		}
		else {
			System.out.println("Cannot add posts!");
		}
		
	}
	public void displayPosts() {
		for(int i=0;i<count;i++) {
			Post p=posts[i];
			System.out.println(p.description+" "+p.postId);
		}
	}
}

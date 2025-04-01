package one_to_many_Day11;

import java.util.Scanner;

public class postDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		
		User user=new User(size,"MagNus");
		boolean flag=true;
		
		while (flag) {
			System.out.println("Enter 1 to add post\nEnter 2 to display post\nEnter 3 to remove post" + "\nEnter 4 to exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter post id: ");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter post description: ");
				String description = sc.nextLine();
				Post post = new Post(id,description);
				user.addPost(post);

			case 2:
				user.displayPosts();
				break;

			case 3:
				flag = false;
				break;
			}
		}
		
}
}
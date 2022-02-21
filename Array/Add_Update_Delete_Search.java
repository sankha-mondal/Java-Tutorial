import java.util.*;
public class Add_Update_Delete_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of task to add in task list: ");
		int n = sc.nextInt();
		String[] task = new String[10000];
 		System.out.println("Enter the tasks:");
		for(int i=0;i<n;i++) {
			task[i] = sc.next();
		}
		System.out.println("Task List: ");
		for(int i=0;i<n;i++) {
			System.out.println((i+1)+"."+ task[i]);
		}
		System.out.println("-----------------------------");
		
		while(true) {
		System.out.println("Press 1:To add the task.");
		System.out.println("Press 2:To update the task.");
		System.out.println("Press 3:To delete the task.");
		System.out.println("Press 4:To search the task.");
		System.out.println("Press 5:To close.");
		int choice = sc.nextInt();
		
		
		if(choice == 1) {    
			int l = task.length;
			String addTask[] = new String[l+1];  
			System.out.print("Enter the task to add: ");
			String add = sc.next();
			System.out.print("Enter the position to add: ");
			int pos = sc.nextInt(),j=0;
											     // add
			for(int i=0;i<l+1;i++) {
				if(pos == i+1) {
					addTask[i] = add;
					n++;
				}  else {
					addTask[i] = task[j++]; 
				}
			} System.out.println();
			System.out.println("Updated Task List: ");
			for(int i=0;i<n;i++) {
				task[i] = addTask[i];
				if(task[i] != null) 
					System.out.println((i+1)+"."+ task[i]);
			}
			System.out.println("-----------------------------");
		}
		
		
		else if(choice == 2) {
			System.out.print("Enter the position to update: ");
			int pos = sc.nextInt();
			System.out.print("Enter the task to include for update: ");
			String update = sc.next();
			task[pos-1] = update;
											   // update
			System.out.println("Updated Task list: ");
			for(int i=0;i<n;i++) {
				System.out.println((i+1)+"."+task[i]);
			}
			System.out.println("-----------------------------");
		}
		
		
		else if(choice == 3) {
			System.out.print("Enter the task to delete: ");
			String delete = sc.next();
			int p,j;
			for(j=0; j<n; j++) {
		      if(delete.equals(task[j])) {   							
		            p=j;  						 	     // delete
		            break;
		        }
			}
			for(p=j ; p<n ;p++) {
				task[p] = task[p+1];
			}
		 System.out.println("Task list after deletion " );
	       for(int i=0;i<n-1; i++) {
	             System.out.println((i+1) +"."+ task[i]+ " ");
	       }
	       System.out.println("-----------------------------");
		}
	
		
		
		else if(choice == 4) {
			System.out.print("Enter the task to search: ");
			String search = sc.next();
			int found = 0,j;
			for(j=0;j<n;j++) {
				if(search.equals(task[j])) {
					found = 1;
					break;
				}							 // search
			}
			if(found == 1) {
				System.out.println("\n"+search+" is founded at position: "+(j+1));
			}  else {
				System.out.println("\n"+search+" is not founded any where");
			}
			System.out.println("-----------------------------");
		}
		
		
		else if(choice == 5) {
			System.exit(0);  					           // close
			System.out.println("-----------------------------"); 
		}
		
		
		
		else {
			System.out.println("Invalid Input");
			System.out.println("-----------------------------");
		}
		
		
		
		
		}
	}
}

package com.main;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.bean.MagicOfBook;
import com.bean.log_table;
import com.service.MagicOfBookSERVICE;

public class MagicOfBookMAIN {
	
	public static void main(String[] args) {
		
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Scanner sc = new Scanner(System.in);
		MagicOfBookSERVICE ms = new MagicOfBookSERVICE();
		
		int id, soldCopies; String name, authorName, genre; float price; 	//  MagicOfBook attributes 
		int choices; String want,ans;
		
		do {
			System.out.println("****************** MANU ******************");
			System.out.println("Press 1.Add a new book:\nPress 2.Delete a book:\nPress 3.Update a book:");
			System.out.println("Press 4.Display all the books:\nPress 5.See the total count of the books:");
			System.out.println("Press 6.See the all the books under Autobiography genre:");
			System.out.println("Press 7.Arrange the book in price low to high order:");
			System.out.println("Press 8:Arrange the book in price high to low order:");
			System.out.println("Press 9:Arrange the book in best Selling order:");
			System.out.println("Press 10:To see all log:");
			System.out.print("\nEnter your choice: ");
			choices = sc.nextInt();
			switch (choices) {
			
		case 1:															//  Press 1. Add MagicOfBook data"
			System.out.println("Enter Book-Id to insery: ");
			id = sc.nextInt();
			System.out.println("Enter Book-Name to insery: ");
			sc.nextLine(); 	// hold the enter key
			name = sc.nextLine();
			System.out.println("Enter Book-AuthorName to insery:");
			authorName = sc.nextLine();
			System.out.println("Enter Book-Genre to insery: ");			
			genre = sc.nextLine();
			System.out.println("Enter Book-Price to insery: ");
			price = sc.nextFloat();
			System.out.println("Enter Book-SoldCopies to insery: ");
			soldCopies = sc.nextInt();
			
			MagicOfBook mb1 = new MagicOfBook(id, name, authorName, genre, price, soldCopies);
			ans = ms.storeMagicOfBook(mb1);
			System.out.println(ans);
			break;
			
		case 2: 														//  Press 2. Delete MagicOfBook data:
			Criteria crd = session.createCriteria(MagicOfBook.class);
			Projection d_id = Projections.property("id");
			Projection d_name = Projections.property("name");
			ProjectionList ppd = Projections.projectionList();
			ppd.add(d_id); 
			ppd.add(d_name);
			crd.setProjection(ppd);
			List<Object[]> listOfRec1 = crd.list();
			System.out.println("Number of Book Records: "+listOfRec1.size());
			listOfRec1.forEach(Id_name->System.out.println("Id: "+Id_name[0]+"	| Book-Name: "+Id_name[1]));
			
			System.out.println("Enter Id to delete data: ");
			id = sc.nextInt();
			ans = ms.deleteMagicOfBook(id);								
			System.out.println(ans);
			break;
		
		case 3: 														//  Press 3. Update MagicOfBook data:
			Criteria cru = session.createCriteria(MagicOfBook.class);
			Projection u_id = Projections.property("id");
			Projection u_name = Projections.property("name");
			ProjectionList ppu = Projections.projectionList();
			ppu.add(u_id); 
			ppu.add(u_name);
			cru.setProjection(ppu);
			List<Object[]> listOfRec2 = cru.list();
			System.out.println("Number of Book Records: "+listOfRec2.size());
			listOfRec2.forEach(Id_name->System.out.println("Id: "+Id_name[0]+"	| Book-Name: "+Id_name[1]));
			
			System.out.println("Enter Id for update: ");
			id = sc.nextInt();											
			
			System.out.println("Based on ID:\nPress 1.To update Book-Name:\nPress 2.To update Author-Name:");
			System.out.println("Press 3.To update Book-Genre:\nPress 4.To update Book-Price:");
			System.out.println("Press 5.To update Book-SoldCopies:");
			int up = sc.nextInt();
			MagicOfBook mb2 = new MagicOfBook();
			
			if(up == 1) {												//   Update Book-Name
				System.out.println("Enter Book-Name to update: ");		
				sc.nextLine();   
				name = sc.nextLine();											
				mb2.setId(id);		
				mb2.setName(name);
				ans = ms.updateMagicOfBookName(mb2);
				System.out.println(ans);
			} 
			else if(up == 2) {											//   Update Author-Name
				System.out.println("Enter Author-Name to update: ");
				sc.nextLine();   
				authorName = sc.nextLine();											
				mb2.setId(id);		
				mb2.setAuthorName(authorName);
				ans = ms.updateMagicOfBookAuthorName(mb2);
				System.out.println(ans);
			}
			else if(up == 3) {											//   Update Book-Genre
				System.out.println("Enter Genre to update: ");
				sc.nextLine();   
				genre = sc.nextLine();											
				mb2.setId(id);		
				mb2.setGenre(genre);
				ans = ms.updateMagicOfBookGenre(mb2);
				System.out.println(ans);
			}
			else if(up == 4) {											//   Update Book-Price
				System.out.println("Enter Book-Price to update: ");
				sc.nextLine();   
				price = sc.nextFloat();											
				mb2.setId(id);		
				mb2.setPrice(price);
				ans = ms.updateMagicOfBookPrice(mb2);
				System.out.println(ans);
			}
			else if(up == 5) {											//   Update Book-soldCopies
				System.out.println("Enter Book-soldCopies to update: ");
				sc.nextLine();   
				soldCopies = sc.nextInt();											
				mb2.setId(id);		
				mb2.setSoldCopies(soldCopies);
				ans = ms.updateMagicOfBooksoldCopies(mb2);
				System.out.println(ans);
			}
			break;
			
			
		case 4:															//  Press 4. Retrieve MagicOfBook Name and information:
			Criteria cr = session.createCriteria(MagicOfBook.class);
			List<MagicOfBook> listOfBook = cr.list();
			System.out.println("All books & informations:");
			listOfBook.forEach(b->System.out.println(b));
			break;
			
			
		case 5: 														//  Press 5. No of Books present:
			Criteria cn	= session.createCriteria(MagicOfBook.class);
			cn.setProjection(Projections.count("name"));
			List<Integer> countBooks = cn.list();
			System.out.println("No of Books: "+ countBooks.get(0));
			break;
			
		case 6:															//  Press 6. Retrieve Autobiography Books Name:
			System.out.println("All Autobiography Books Name");					
			ms.findAutobiographyBooks().forEach(e->System.out.println(e));
			break;
			
		case 7: 														//  Press 7: Arrange the book in price low to high order:					
			System.out.println("Arrange books in price low to high order:");	
			ms.priceLowtoHigh().forEach(e->System.out.println(e));
			break;
			
		case 8: 														//  Press 8: Arrange the book in price high to low order:					
			System.out.println("Arrange books in price high to low order:");	
			ms.priceHightoLow().forEach(e->System.out.println(e));
			break;	
			
		case 9: 														//  Press 9: Arrange the book in best Selling order:					
			System.out.println("Arrange books in best Selling order:");			
			ms.priceHightoLow().forEach(e->System.out.println(e));
			break;
		
		case 10:													    //  Press 10:To see all log
			Criteria lt = session.createCriteria(log_table.class);
			List<log_table> listOfLog = lt.list();
			listOfLog.forEach(e->System.out.println(e));
			
		default:														//   Default Condition
			System.out.println("Wrong choice");
			break;
			}
			System.out.println("\nDo you want to continue? Enter y/n : ");
			System.out.println("Press anything to terminate: ");
			want = sc.next();
		} while(want.equals("y"));
		
	
	
	
	}
}

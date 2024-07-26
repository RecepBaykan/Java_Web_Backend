
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import controller.DataBaseController;
import controller.StudentController;
import model.DataBase;
import model.Student;

public class App {
	public static void main(String[] args) {


		ApplicationContext cac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		DataBase dataBase = (DataBase) cac.getBean("dataBase");
		
		dataBase.setUser("root");
		dataBase.setUrl("jdbc:mysql://localhost:3306/personel");
		dataBase.setPassword("");
		
		DataBaseController dataBaseController = (DataBaseController) cac.getBean("dataBaseController");
		
		dataBaseController.connectDB();
		
		StudentController studentController = (StudentController) cac.getBean("studentController");
		
		studentController.setStudentList(dataBaseController.moveList());
		
		studentController.Listing();
		
	
	
		
		
		
	}
}

package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;



import model.DataBase;
import model.Student;

@Component("dataBaseController")

public class DataBaseController {
	
	private Connection connect;

	@Autowired
	private DataBase dataBase;
	
	

	public void connectDB() {
		try {
			connect = DriverManager.getConnection(dataBase.getUrl(), dataBase.getUser(), dataBase.getPassword());
			
			System.out.println("Veri Tabanına bağlanıldı");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Veritabanına bağlanılamadı");
		}
	}
	
	
	public List<Student> moveList() {
		
		connectDB();
		
		
		List<Student> listStudent = new ArrayList<Student>();
		try {
			
			Statement stat = connect.createStatement();
			ResultSet res; 
			res = stat.executeQuery("select no, name, surname from student");
			
			while(res.next()) {
				Student student = new Student();
				
				student.setName(res.getString("name"));
				student.setSurName(res.getString("surname"));
				student.setNo(res.getInt("no"));
				listStudent.add(student);
			}
			res.close();
			stat.close();
			connect.close();
			
		}catch(Exception e) {
			System.err.println("Hata 1 - Listeye eklenemedi");
		}
		
		
		return listStudent;
		
		
	}
	
	public void closeDB() {
		
		try {
			connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public DataBase getDataBase() {
		return dataBase;
	}
	
	public void setDataBase(DataBase dataBase) {
		this.dataBase = dataBase;
	}
}

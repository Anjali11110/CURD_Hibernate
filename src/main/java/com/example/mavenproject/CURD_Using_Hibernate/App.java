package com.example.mavenproject.CURD_Using_Hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
//    	User user1=new User();
//    	user1.setName("Anjali");
//    	user1.setPhoneNumber(895624315);
//    	user1.setRollNo(101);
//    	
//    	User user2=new User();
//    	user2.setName("Venkeesh");
//    	user2.setPhoneNumber(789635421);
//    	user2.setRollNo(102);
    	// for update
//    	User user2=new User();
//    	user2.setRollNo(3);
//    	user2.setName("Venkat");
//    	
    	
       Configuration cfg=new Configuration().configure("com\\example\\mavenproject\\CURD_Using_Hibernate\\hibernate.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();// it provides curd operations
       Transaction tr=s.beginTransaction();
       
//======================= inserting the values====================
//       try {
//       s.save(user1);
//       s.save(user2);
//       tr.commit();
//       }
//       catch(Exception e) {
//    	   tr.rollback();
//    	   e.printStackTrace();
//       }
       
// =====================retrival of data from database=============
//       try {
//    	   s.get(User.class, 1);
//       }
//       catch(Exception e) {
//    	   e.printStackTrace();
//       }
       
//======================update======================================
//       s.saveOrUpdate(user2);
// it will update the value given to it but the already value will be not remain same 
//       User user=s.get(User.class, 1);
//       user.setName("venkatTulabandala");
//       s.saveOrUpdate(user);
//       tr.commit();
       
//=========================delete=====================================
       User user=s.get(User.class, 3);
       s.delete(user);
       tr.commit();
    }
}

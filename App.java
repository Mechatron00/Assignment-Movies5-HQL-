//HQL Code
package com.ProjectAssignment.Movies5;

import java.util.List;
import java.util.Scanner;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	 ServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
         Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
         SessionFactory factory=meta.getSessionFactoryBuilder().build();
         Session session=factory.openSession();
         Transaction t=session.beginTransaction();
         System.out.println("Session Created");
         
         
         Movies movies=new Movies();
         
         movies.setName("Dinesh");
        movies.setAge(22);
        movies.setEmail("dixitdinesh52@gmail.com");
        movies.setFavouriteMovie("John Wick");
        
      //  session.save(movies);
     
        
//        Movies m1=session.get(Movies.class, 2);
//       System.out.println("Survey data:"+m1);
//       System.out.println();
      
       
//       for (int i = 0; i < 3; i++) 
//       {
//		Movies m2 =new Movies();
//		m2.setName("Name "+i);
//		m2.setAge(i);
//		m2.setEmail("Name"+i+"@gmail.com");
//		m2.setFavouriteMovie("movie"+i);
//		session.save(m2);
//		
//	    }
       
       //HQL Query
//       Query query=session.createQuery("from Movies");
//       List<Movies>list=query.list();
//     for (Movies str : list) 
//     {
//		System.out.println(str);
//	   }
       
       //HQL pagination
//     Query query1=session.createQuery("from Movies");
//     query1.setFirstResult(0);
//     query1.setMaxResults(4);
//       
//     List<Movies>list1=query1.list();
//     for (Movies str : list1) 
//     {
//		System.out.println(str);
//	}
       
       
     //update
//       Query q=session.createQuery("update Movies set name=:n where srno=:i");
//       q.setParameter("n", "Ganesh");
//       q.setParameter("i", 4);
//       int result=q.executeUpdate();
//       System.out.println("Updated Successfully");
//     
//       Query query=session.createQuery("from Movies");
//       List<Movies>list=query.list();
//     for (Movies str : list) 
//     {
//		System.out.println(str);
//	   }
//     
     
       //delete
//       Query query=session.createQuery("delete from Movies where age=2");
//       
//      
//       System.out.println("Deleted Successfully");
    
    
     
     //criteria
//     Criteria cr=session.createCriteria(Movies.class);
//     cr.setFirstResult(0);
//     cr.setMaxResults(4);
//     
//     List list1=cr.list();
     
     
        //criterisQuery using Builder
        CriteriaBuilder builder=session.getCriteriaBuilder();
        CriteriaQuery<Movies>criteria=builder.createQuery(Movies.class);
        criteria.from(Movies.class);
        List<Movies> list3=session.createQuery(criteria).getResultList();
       for (Movies movies2 : list3) 
       {
		System.out.println(movies2);
	}
        
     
     t.commit();
    session.close();
    }
    
}

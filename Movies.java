//HQL Code
package com.ProjectAssignment.Movies5;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Movies 
{
	     @Id
		@GeneratedValue(strategy=GenerationType.AUTO)
	     
		private int srno;
		String name;
		int age;
		String email;
		String favouriteMovie;
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getFavouriteMovie() {
			return favouriteMovie;
		}
		public void setFavouriteMovie(String favouriteMovie) {
			this.favouriteMovie = favouriteMovie;
		}
		@Override
		public String toString() {
			return "Movies [srno=" + srno + ", name=" + name + ", age=" + age + ", email=" + email + ", favouriteMovie="
					+ favouriteMovie + "]";
		}
		
		
		

}

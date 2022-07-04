package com.sbp.clone.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	
	  @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      @Column(name="id")
          private Long id;
      
      @Column(name="username")
      private String username;
      
      @Column(name="email")
      private String email;
      
      @Column(name="password")
      private String password;

}

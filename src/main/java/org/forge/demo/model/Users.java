package org.forge.demo.model;
// Generated Mar 18, 2017 6:48:25 PM by Hibernate Tools 5.2.0.Final


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Users generated by hbm2java
 */
@Entity
@Table(name="users"
    ,catalog="phonebook"
)
public class Users  implements java.io.Serializable {


     private Integer userId;
     private String name;
     private String password;
     private Set<Contacts> contactses = new HashSet<Contacts>(0);

    public Users() {
    }

	
    public Users(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public Users(String name, String password, Set<Contacts> contactses) {
       this.name = name;
       this.password = password;
       this.contactses = contactses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="user_id", unique=true, nullable=false)
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    
    @Column(name="name", nullable=false, length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="password", nullable=false, length=45)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="users")
    public Set<Contacts> getContactses() {
        return this.contactses;
    }
    
    public void setContactses(Set<Contacts> contactses) {
        this.contactses = contactses;
    }




}


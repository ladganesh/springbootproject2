/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo2;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author Rajesh
 */
@Entity
@Table(name = "mytable")
public class MyUsers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer id;
    private String name =null, email=null, phone=null ;
    

    public Integer getId () {
        return id;
    }

    public void setId ( Integer id ) {
        this.id = id;
    }

    public MyUsers (  String name , String email , String phone ) {
        
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

   
public MyUsers (  ) {
      
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail ( String email ) {
        this.email = email;
    }

    public String getPhone () {
        return phone;
    }

    public void setPhone ( String phone ) {
        this.phone = phone;
    }
    

    
    @Override
    public int hashCode () {
        int hash = 0;
        hash += ( id != null ? id.hashCode () : 0 );
        return hash;
    }

    @Override
    public boolean equals ( Object object ) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if ( ! ( object instanceof MyUsers ) ) {
            return false;
        }
        MyUsers other = ( MyUsers ) object;
        if ( ( this.id == null && other.id != null ) || ( this.id != null && ! this.id.equals ( other.id ) ) ) {
            return false;
        }
        return true;
    }

    @Override
    public String toString () {
        return "com.example.demo2.MyUsers[ id=" + id + " ]";
    }
    
}

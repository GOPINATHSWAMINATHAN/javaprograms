/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learn.java.inheritance;

/**
 *
 * @author gopinath
 */
public class Manager extends Ceo{
    
    @Override
    public void manage()
    {
        System.out.println("I'll manage projects and the employee based on their requirements");
    }
    
    public void employee()
    {
        System.out.println("I'm also the employee in a dubakoor company!!");
    }
    
    public static void main(String[] args) {
//       ManagingDirector md=new ManagingDirector();
//       md.employee();
//       md.manage();

//Downcasting
//super run-->override methods-->sub class-->run

Ceo c=new Manager();
c.manage();
c.invest();
Manager n=new Manager();
n.employee();
//ManagingDirector md=new Manager();


//Manager m=new Manager();
//m.manage();
//m.employee();
        
    }
    
}

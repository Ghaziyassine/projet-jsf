/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Services.EmployeService;
import Services.ServiceService;
import entities.Employe;
import entities.Service;
import java.util.Date;

/**
 *
 * @author YASSINE
 */
public class Test {
    public static void main(String[] args){
   
        ServiceService ss=new ServiceService();
        EmployeService es=new  EmployeService();
       
                
        
         Service s1=new Service( "finance");
        Service s2=new Service("Rh");
        Service s3=new Service("informatique");

        Employe e1=new Employe("yassine", "ghazi", "maphoto", new Date(), s3, null);
      
        ss.create(s1);
            ss.create(s2);
        ss.create(s3);
es.create(e1);

    
    }
}

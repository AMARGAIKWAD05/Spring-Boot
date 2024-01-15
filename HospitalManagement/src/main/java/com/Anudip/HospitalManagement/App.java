package com.Anudip.HospitalManagement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration con =new Configuration().configure().addAnnotatedClass(Appointment.class);
    	SessionFactory sf=con.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction t=session.beginTransaction();
    	Appointment apl=new Appointment();
    	apl.setPatientname("Amar");
    	apl.setPatientcontact("8421280880");
    	apl.setDate("17-08-2023");
    	session.save(apl);
    	
    	Appointment apl2=new Appointment();
    	apl2.setPatientname("Pratik");
    	apl2.setPatientcontact("7035312339");
    	apl2.setDate("18-08-2023");
    	session.save(apl2);
    	t.commit();
    	
        System.out.println( "Hello World!" );
    }
    
    public static void  getAppointment(Session s1) 
    {
    	Optional<Appointment> optional=s1.getbyId(Appointment.class).loadOptional(1);
    	if(optional.isPresent) {
    	System.out.println("Patient name:  "+optional.getPatientname());
    	System.out.println("Patient contact:  "+optional.getPatientcontact());
    	System.out.println("Date:  "+optional.getDate());
    	}
    }
}

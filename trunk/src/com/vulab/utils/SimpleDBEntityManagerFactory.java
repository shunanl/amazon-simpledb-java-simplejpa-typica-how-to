package com.vulab.utils;



import javax.persistence.EntityManager;

import com.spaceprogram.simplejpa.EntityManagerFactoryImpl;
/* **************************************************************************
 * Author: Srinivas Nelakuditi 
 * Company: VU Lab Inc.
 * URL: http://vulab.com
 * Core Competency: IT Training, Management Training & Career Mentoring
 * Blog URL: http://vulab.com/blog
 * forum URL:http://vulab.com/community
 * Date: March 5th 2009
 * 
 * 
 * Please modify the code as you wish and use it in any
 * commercial or free software and distribute it.
 * please keep the above author information intact.
 * 
 *****************************************************************************/

public class SimpleDBEntityManagerFactory
{	
	
	public static EntityManager getEntityManager()
	{
		 final EntityManagerFactoryImpl factory = new EntityManagerFactoryImpl("studentdb",null);
		 EntityManager em = factory.createEntityManager();
		 return em;		
	}	
	
}
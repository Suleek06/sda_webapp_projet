package com.sda.sapiens.webapp.dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    static {
        // get configuration from the xml file
        StandardServiceRegistry standardServiceRegistry =
                new StandardServiceRegistryBuilder()
                        .configure("hibernate.cfg.xml").build();
        // create the metadata object from the configuration
        Metadata metadata = new MetadataSources(standardServiceRegistry)
                .getMetadataBuilder().build();
        // create a session
        sessionFactory = metadata.getSessionFactoryBuilder().build();
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}


package com.portfolio.demo.Repository;

import com.portfolio.demo.Table.Contact;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> 
{
}

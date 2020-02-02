**[How To Map `@ManyToOne` Relationship To A SQL Query Via The Hibernate `@JoinFormula`](https://github.com/AnghelLeonard/Hibernate-SpringBoot/tree/master/HibernateSpringBootJoinFormula)**
 
**Description:** This application is an example of mapping the JPA `@ManyToOne` relationship to a SQL query via the Hibernate `@JoinFormula` annotation. We start with two entities, `Author` and `Book`, involved in a unidirectional `@ManyToOne` relationship. Each book has a price. While we fetch a book by id (let's call it book `A`), we want to fetch another book `B` of the same author whose price is the next smaller price in comparison with book `A` price.

**Key points:**
- fetching the book `B` is done via `@JoinFormula`
     
-----------------------------------------------------------------------------------------------------------------------    
<table>
     <tr><td><b>If you need a deep dive into the performance recipes exposed in this repository then I am sure that you will love my book "Spring Boot Persistence Best Practices"</b></td><td><b>If you need a hand of tips and illustrations of 100+ Java persistence performance issues then "Java Persistence Performance Illustrated Guide" is for you.</b></td></tr>
     <tr><td>
<a href="https://www.apress.com/us/book/9781484256251"><p align="left"><img src="https://github.com/AnghelLeonard/Hibernate-SpringBoot/blob/master/Spring%20Boot%20Persistence%20Best%20Practices.jpg" height="500" width="450"/></p></a>
</td><td>
<a href="https://leanpub.com/java-persistence-performance-illustrated-guide"><p align="right"><img src="https://github.com/AnghelLeonard/Hibernate-SpringBoot/blob/master/Java%20Persistence%20Performance%20Illustrated%20Guide.jpg" height="500" width="450"/></p></a>
</td></tr></table>

-----------------------------------------------------------------------------------------------------------------------    

# HibernateSpringBootJoinFormula

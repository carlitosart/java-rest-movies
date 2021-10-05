package bo.edu.ucb.ingsof.movies;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
+-------------+----------------------+------+-----+-------------------+-----------------------------+
| Field       | Type                 | Null | Key | Default           | Extra                       |
+-------------+----------------------+------+-----+-------------------+-----------------------------+
| country_id  | smallint(5) unsigned | NO   | PRI | NULL              | auto_increment              |
| country     | varchar(50)          | NO   |     | NULL              |                             |
| last_update | timestamp            | NO   |     | CURRENT_TIMESTAMP | on update CURRENT_TIMESTAMP |
+-------------+----------------------+------+-----+-------------------+-----------------------------+
3 rows in set (0.00 sec)
*/

@Entity(name = "country")
public class Movie{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer country_id;
    
    
    private String country;
    private String last_update;

    public Movie(){
        
    }
    
    public Movie(Integer country_id, String country, String last_update) {
        this.country_id = country_id;
        this.country = country;
        this.last_update = last_update;
    }


    public Integer getCountry_id() {
        return country_id;
    }


    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }


    public String getCountry() {
        return country;
    }


    public void setCountry(String country) {
        this.country = country;
    }


    public String getLast_update() {
        return last_update;
    }


    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }

}
package rest.example.demo3.Model;
import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "grocery")
public class User {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String name;
private String emailid;
private String city;
private String product;
private int quantity;
public ArrayList<User> findAll() {
    return null;
}
public void save(User user) {
}
}

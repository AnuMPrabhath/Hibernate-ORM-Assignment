package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class Book {
    @Id
    private String code;
    private String name;
    private int year;
    private double price;
    @ManyToMany (mappedBy = "bookList")
    private List<Author> authorList;
}

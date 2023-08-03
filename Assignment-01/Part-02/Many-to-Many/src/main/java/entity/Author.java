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
public class Author {
    @Id
    private String id;
    private String name;
    private String dob;
    @ManyToMany
    private List<Book> bookList;
}

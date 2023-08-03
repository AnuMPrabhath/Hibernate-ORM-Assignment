package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

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
    private String author;
    private int year;
    private double price;
}

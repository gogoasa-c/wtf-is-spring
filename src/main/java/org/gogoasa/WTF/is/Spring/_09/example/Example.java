package org.gogoasa.WTF.is.Spring._09.example;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Example {

    public String name;
    public String description;
    @Id
    public Long id;
    public String type;
}

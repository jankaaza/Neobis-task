package kg.neobis.task.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "ingredients")
public class Ingredients extends Baseentity {

    @Column(name = "ingredient1")
    public String ingredient1;

    @Column(name = "ingredient2")
    public String ingredient2;

    @Column(name = "ingredient3")
    public String ingredient3;
    
    @Column(name = "ingredient4")
    public String ingredient4;
}

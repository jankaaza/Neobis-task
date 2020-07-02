package kg.neobis.task.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cake")
@Getter
@Setter
public class Cake extends Baseentity{

    @Column(name = "name")
    private String name;

    @Column(name = "origin")
    private String origin;

   /*   @ManyToOne
    @JoinColumn(name = "ingredients_id")
    private Ingredients ingredientsId;*/

    @Column(name = "price")
    private Integer price;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "quantity")
    private Integer quantity;

 /*   @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customerId;*/
}

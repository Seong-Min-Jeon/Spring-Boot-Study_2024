package com.seongmin.shop;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data // @Data = @Getter + @Setter + @ToString
@SequenceGenerator(name = "item_seq", sequenceName = "item_seq", initialValue = 1, allocationSize = 1)
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_seq")
    private Long id;
    private String title;
    private Integer price;

//    public String toString(){
//        return this.id + " " + this.title + " " + this.price;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public Integer getPrice() {
//        return price;
//    }
}

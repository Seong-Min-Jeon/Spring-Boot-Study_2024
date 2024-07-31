package com.seongmin.shop;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data // @Data = @Getter + @Setter + @ToString
public class Item {
    @Id
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

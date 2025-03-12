package com.Mahmuda.SimpleWebApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter


@Entity
public class Product {

    @Id
    private int prodID;
    private String prodName;
    private int price;
}

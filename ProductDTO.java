package com.bhargavi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "Product_Table")
@Data
public class ProductDTO {
@Id
@GenericGenerator(name = "auto", strategy = "increment")
@GeneratedValue(generator = "auto")
private int id;
private String pName;
private String pCategory;
private String pCompany;
private int pQuantity;
private double pPrice;
}

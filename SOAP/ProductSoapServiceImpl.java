package com.soap.service;
import java.util.*;

public class ProductSoapServiceImpl {
 private static List<Product> produtCatalog;
 
 public ProductSoapServiceImpl() {
     super();
     // TODO Auto-generated constructor stub
     initializeProductCatalog();
 }
 public Product searchById(int id) throws Exception 
 {
     for(Product p: produtCatalog) if(p.getId()==id) return p;
     throw new Exception("No product found with id " + id );
 }

 public Product[] getAllProducts() {
     Product[] products = new Product[produtCatalog.size()];
     int i = 0;
     for(Product p: produtCatalog) {
         products[i]=p;
         i++;
     }
     return products;

 }

 public void insertProduct(Product product)
{
     produtCatalog.add(product);}
 
 public boolean removeProduct(int id) throws Exception{
 	for (Product p : produtCatalog) if (p.getId() == id) return produtCatalog.remove(p);
 	throw new Exception("No product found with id " + id);
 }
 
 public int totalProducts() {
 	return produtCatalog.size();
 }
 

 public void initializeProductCatalog() {
     if (produtCatalog ==null) {
         produtCatalog= new ArrayList<Product>();
         produtCatalog.add(new Product(1,"Soap" ,"Cleaning " ,29.00));
         produtCatalog.add(new Product(2,"Toothpaste" ,"Commoditiy " ,29.00));
         produtCatalog.add(new Product(3,"Soft_Drinks" ,"Drinks" ,29.00));
         produtCatalog.add(new Product(4,"Cereals" ,"Food" ,29.00));
}}
}

package com.capgemini.takehome.UI;


import java.util.Scanner;



import com.capgemini.takehome.beans.Product;
import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.dao.ProductDAO;
import com.capgemini.takehome.exceptions.ProductDoesNotExistException;
import com.capgemini.takehome.service.ProductService;


public class Client {
	private static Scanner scanner =new Scanner(System.in);
	private static IProductDAO productDAO=new ProductDAO();
	private static ProductService productService= new ProductService(productDAO);

	public static void main(String[] args) throws ProductDoesNotExistException {
		
		//Declerations
		int choice;
		Product product=productService.getProductDetails(1001);
		System.out.println(product);
		
		while(true)
		{
			System.out.println();
			System.out.println("1) Generate Bill by entering Product code and qualtity");
			System.out.println("2) Exit");
			System.out.println("**** Enter your chioce ****");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:generateBill();
					break;
			case 2:System.exit(0);
					break;
			default:System.out.println("You have Choosed Wrong Choice ! ");
				break;
			}
		}
	}

	//Method For Generating Bill
	private static void generateBill() throws ProductDoesNotExistException {
		int productCode;
		int quantity = 0;
		Product product;
		
		System.out.println("Enter the product id");
		productCode=scanner.nextInt();
		while(!(productCode>1000 && productCode<9999))// assuming we have product code in this range only
		{
			System.out.println("Wrong product ID, Enter again");
			productCode=scanner.nextInt();
		}
		product=productService.getProductDetails(productCode);
			
		System.out.println("Enter quantity of "+ product.getProductName());
		quantity=scanner.nextInt();
		while(!(quantity>0))
		{
			System.out.println("Product Quantity can't be zero, Enter some value");
			quantity=scanner.nextInt();
		}
		
		generateAndPrint(product,quantity);
			
		
		
	}
	
	//Method 
	private static void generateAndPrint(Product product, int quantity) {
		
		double lineTotal=product.getProductPrice()*quantity;
		
		System.out.println("BILL");
		System.out.println("Product Details:   "+ product.getProductName());
		System.out.println("Product Category:  "+ product.getProductCategory());
		System.out.println("Product Price(Rs): "+ product.getProductPrice());
		System.out.println("Quantity:          "+ quantity);
		System.out.println("Line Total:        "+ lineTotal);
		
	}

	

}

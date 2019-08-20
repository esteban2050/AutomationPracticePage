package com.automationpractice.steptostep.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MostExpensiveDress {

	public static void VestidoCaro(WebDriver driver) {
		int tamanoArreglos = 5;
		Double prices[] = new Double[tamanoArreglos];
		String hrefs[] = new String[tamanoArreglos];
		int numeroPrecio = 1;
		for (int i = 0; i < prices.length; i++) {			
			String precioCadena = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li["+ numeroPrecio +"]/div[1]/div[2]/div[1]/span[1]")).getText();
			String href = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li["+ numeroPrecio +"]/div[1]/div[2]/h5[1]/a[1]")).getAttribute("href");
			double precioNumber = Double.parseDouble(precioCadena.substring(1));		
			prices[i] = precioNumber;
			hrefs[i] = href;
			numeroPrecio++;
		}
		double precio = BuscarPrecioMayor(prices);		
		IrALaUrlDelVestido(precio, prices, hrefs, driver);		 
	}
	
	public static double BuscarPrecioMayor(Double prices[]) {
		double higherPrice = 0;		
		for (int i = 0; i < prices.length; i++) {
			if(prices[i] > higherPrice) {
				higherPrice = prices[i];
			}
		}
		return higherPrice;
	}
	
	public static void IrALaUrlDelVestido(double precio, Double prices[], String hrefs[] ,WebDriver driver) {
		for (int i = 0; i < prices.length; i++) {
			if(precio == prices[i]) {				
				driver.get(hrefs[i]);
			}
		}
	}
}

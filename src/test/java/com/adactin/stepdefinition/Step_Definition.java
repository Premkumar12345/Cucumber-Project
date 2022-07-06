package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.PropertiesFile.File_Reader_Manager;
import com.adactin.baseclass.Base_Class;
import com.adactin.runner.Runner_Class;
import com.sdp.Page_Object_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {
	
	public static WebDriver driver = Runner_Class.driver;
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Given("^user Launch The Url In The Adactin Application$")
	public void user_Launch_The_Url_In_The_Adactin_Application() throws Throwable {
	String geturl = File_Reader_Manager.getinstance().getinstanceCR().geturl();
		geturl("https://adactinhotelapp.com/");
	}

	@When("^user Enter The Username In The Username Field$")
	public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {
	 Sendkeys(pom.getHp().getUsername(), "premkumar007");
	}

	@When("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
	 Sendkeys(pom.getHp().getPassword(), "90ZPS7");
	}

	@Then("^User click On The Login Button And It Navigates To Search Hotel Page$")
	public void user_click_On_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
	ClickOnElement(pom.getHp().getLogin());
	}

	@When("^User Select The Location$")
	public void user_Select_The_Location() throws Throwable {
		dropdown(pom.getSh().getLocation(), "byvalue", "London");
	}

	@When("^User Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		dropdown(pom.getSh().getHotels(), "byvisibletext", "Hotel Creek");
	}

	@When("^User Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
	dropdown(pom.getSh().getRoom_type(), "byvalue", "Double");
	}

	@When("^User Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
	dropdown(pom.getSh().getRoom_nos(), "byindex", "1");
	}

	@When("^User Select The Check In Date$")
	public void user_Select_The_Check_In_Date() throws Throwable {
	clear(pom.getSh().getDatepick_in());
	Sendkeys(pom.getSh().getDatepick_in(), "20/07/2022");
	}

	@When("^User Select The Check Out Date$")
	public void user_Select_The_Check_Out_Date() throws Throwable {
	clear(pom.getSh().getDatepick_out());
	Sendkeys(pom.getSh().getDatepick_out(), "27/07/2022");
	}

	@When("^User Select The Adults Per Room$")
	public void user_Select_The_Adults_Per_Room() throws Throwable {
	dropdown(pom.getSh().getAdult_room(), "byvalue","2");
	}

	@When("^User Select The Children Per Room$")
	public void user_Select_The_Children_Per_Room() throws Throwable {
	dropdown(pom.getSh().getChild_room(), "byvalue", "1");
	}

	@Then("^User Click On The Search Button And It Navigates To Select Hotel$")
	public void user_Click_On_The_Search_Button_And_It_Navigates_To_Select_Hotel() throws Throwable {
	ClickOnElement(pom.getSh().getSubmit());
	}

	@When("^User Click The Select Button$")
	public void user_Click_The_Select_Button() throws Throwable {
	ClickOnElement(pom.getSl().getRadiobutton());
	}

	@Then("^User Click On The Continue Button It Navigates To Book A Hotel$")
	public void user_Click_On_The_Continue_Button_It_Navigates_To_Book_A_Hotel() throws Throwable {
	ClickOnElement(pom.getSl().getNextpage());
	}

	@When("^User Enter The FirstName In The FirstName Field$")
	public void user_Enter_The_FirstName_In_The_FirstName_Field() throws Throwable {
	Sendkeys(pom.getBh().getFirst(), "Prem");
	}

	@When("^User Enter The LastName In The LastName Field$")
	public void user_Enter_The_LastName_In_The_LastName_Field() throws Throwable {
	Sendkeys(pom.getBh().getLast(), "Kumar");
	}

	@When("^User Enter The Billing Address In The Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_The_Billing_Address_Field() throws Throwable {
	Sendkeys(pom.getBh().getAddress(), "T.nagar");
	}

	@When("^User Enter The Card No In The Card No Field$")
	public void user_Enter_The_Card_No_In_The_Card_No_Field() throws Throwable {
	Sendkeys(pom.getBh().getCardno(), "2345 2345 2345 2345");
	}

	@When("^User Select The Credit Card Type$")
	public void user_Select_The_Credit_Card_Type() throws Throwable {
	dropdown(pom.getBh().getCardtype(), "byvalue", "VISA");
	}

	@When("^User Select The Expiry Date And Select Month$")
	public void user_Select_The_Expiry_Date_And_Select_Month() throws Throwable {
	dropdown(pom.getBh().getCardmonth(),"byvalue", "3");
	}

	@When("^User Select The Expiry Date And Select Year$")
	public void user_Select_The_Expiry_Date_And_Select_Year() throws Throwable {
	dropdown(pom.getBh().getYear(), "byvalue","2022");
	}

	@When("^User Enter The Cvv Number In The Cvv Number Field$")
	public void user_Enter_The_Cvv_Number_In_The_Cvv_Number_Field() throws Throwable {
	Sendkeys(pom.getBh().getCvv(), "123");
	}

	@Then("^User Click On The Book Now Button And It Navigates To Booking Conformation Page$")
	public void user_Click_On_The_Book_Now_Button_And_It_Navigates_To_Booking_Conformation_Page() throws Throwable {
	ClickOnElement(pom.getBh().getBooknow());
	}



}

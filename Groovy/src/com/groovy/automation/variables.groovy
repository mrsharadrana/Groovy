/**
 * 
 */
package com.groovy.automation

/**
 * @author SH360659
 *
 */
		// TODO Auto-generated method stub
		def name = "sharad"
		println(name)
		println'My name is $name'//If we give single ' ' then whole statement will print
		println "My name is $name" //If we give Double " " then text will be printed with value call
		println name.getClass()
		name = 123
		println name.getClass()
		println "Storing integer value $name"
		//Working with Multi line Strings
		println """Line First  
				Line Second 
				Line Third"""
		
				//Groovy is dynamic typing
				//Means we can assign value to same variable again and again
				name = "sharad"
				println name
				name = "Rupa"
				println name
				
				//Run time value Declaring 
				def (a,b,c)= [10,20,30]
				println a
				println b
				println c
				//Now we will remove one value
				(a,b,c) = [10,20]
				println a
				println b
				println c // It return null for C
				//Now we will remove one variable but with value
				(a,b)= [10,20,30]
				println a
				println b //If we assign extra value then it will simply ignore the extra value.
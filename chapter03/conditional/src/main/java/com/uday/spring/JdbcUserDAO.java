/**
 * 
 */
package com.uday.spring;

import java.util.Arrays;
import java.util.List;

/**
 * @author uday
 *
 */
public class JdbcUserDAO implements UserDAO
{

	@Override
	public List<String> getAllUserNames()
	{
		System.out.println("**** Getting usernames from RDBMS *****");
		return Arrays.asList("Uday","kumar","Reddy");
	}

}
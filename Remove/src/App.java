package com.EPAM_TDD_JUNIT.Remove;

/**
 * Hello world!
 *
 */
public class App 
{
		String answer="";
	public String Remove(String s)
	{   
		int len=s.length();
		if(len>=2)
		{
			char firstcharacter=s.charAt(0);
			char secondcharacter=s.charAt(1);
			if(firstcharacter=='A' && secondcharacter=='A' && len==2)
			{
				answer=answer+"NULL";
			}
			else if(firstcharacter=='A' && secondcharacter=='A')
			{
				answer=answer+s.substring(2,len);
			}
			else if(firstcharacter=='A' )
			{
				answer=answer+s.substring(1,len);
			}
			else if( secondcharacter=='A')
			{
				answer=answer+firstcharacter+s.substring(2,len);
			}
			else
			{
				answer=answer+s;
			}
		}
		
		
		
		
		return answer;
	}
	}

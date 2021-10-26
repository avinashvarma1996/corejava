import java.io.*;
class Players1
{
		//private data members
        protected String name;
		protected String country;
		protected String skill;


                //setters and getters for private data members
		void setName(String name)
		{
		this.name=name;
		}
		String getName()
		{
		return name;
		}
		void setCountry(String country)
		{
		this.country=country;
		}
		String getCountry()
		{
		return country;
		}
		void setSkill(String skill)
		{
		this.skill=skill;
		}
		String getSkill()
		{
		return skill;
		}

                //constructor to initialize data members
		Player(String name,String country,String skill)
		{
		this.name=name;
		this.country=country;
		this.skill=skill;
		}

}


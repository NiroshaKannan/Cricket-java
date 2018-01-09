import java.util.Arrays;
import java.util.Scanner; 
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class cricket 
{	
	
	// Its a team Name

	public static String[] team = 
	{
		"India", 
		"Australia", 
		"Pakistan", 
		"England",
		"WestIndies",
		"SriLanka",
		"Bangladesh",
		"SouthAfrica",
		"NewZealand",
		"Zimbabwe",
		"Afghanistan"
	};

	// Its is India	team members.

	public static String[] India = 
	{
			"Rohit Sharma",
			"Shikar Dhawan",
			"Virat Kohli",
			"Hardik Pandya",
			"MS Dhoni",
			"Kedar Jadhav",
			"Dinesh Karthik",
			"Akshar Patel",
			"Bhuvaneshwar Kumar",
			"Jsaprit Bumrah",
			"Yuzvendra Chahal"
	};

	//Its is a Australia team members.

	public static String[] Australia =
	{
			"Cameron Bancroft",
			"David Warner",
			"Usman Khawaja",
			"Steven Smith",
			"Shaun Marsh",
			"Mitchell Marsh",
			"Tim Paine",
			"Pat Cummins",
			"Nathan Lyon",
			"Josh Hazlewood",
			"Jackson Bird"
	};

	//Its is a England team members.

	public static String[] England =
	{
			"Alastair Cook",
			"Mark Stoneman",
			"James Vince",
			"Joe Root",
			"Dawid Malan",
			"Jonny Bairstow",
			"Moeen Ali",
			"Chris Woakes",
			"Tom Curran",
			"Stuart Broad",
			"James Anderson"
	};

	//It's a Pakistan team members

	public static String[] Pakistan = 
	{
			"Azhar Ali",
			"Fakhar Zaman",
			"Babar Azam",
			"Shoaib Malik",
			"Mohammad Hafeez",
			"Imad Wasim",
			"Sarfraz Ahmed",
			"Shadab Khan",
			"Hasan Ali",
			"Junaid Khan",
			"Mohammad Amir"
	};

	//It's a Westindies team members.

	public static String[] WestIndies = 
	{
			"Jason Holder",
			"Devendra Bishoo",
			"Jonathan Carter",
			"Roston Chase",
			"Alzarri Joseph",
			"Evin Lewis",
			"Jason Mohammed",
			"Ashley Nurse",
			"Kieran Powell",
			"Rovman Powell",
			"Kesrick Williams"
	};

	//It's a Srilanka team members.

	public static String[] SriLanka = 
	{
			"Angelo Mathews",
			"Upul Tharanga",
			"Niroshan Dickwella",
			"Kusal Perera",
			"Kusal Mendis",
			"Chamara Kapugedera",
			"Asela Gunaratne",
			"Dinesh Chandimal",
			"Lasith Malinga",
			"Suranga Lakmal",
			"Nuwan Pradeep"
	};

	//It's a Bangladesh team members

	public static String[] Bangladesh = 
	{
			"Tamim Iqbal",
			"Soumya Sarkar",
			"Imrul Kayes",
			"Mushfiqur Rahim",
			"Shakib Al Hasan",
			"Mahmudullah",
			"Sabbir Rahman",
			"Mosaddek Hossain",
			"Mehedi Hasan",
			"Sunzamul Islam",
			"Mashrafe Bin Mortaza"
	};

	//It's a Southafrica team members

	public static String[] SouthAfrica = 
	{
			"AB de Villiers",
			"Hashim Amla",
			"Farhaan Behardien",
			"Quinton de Kock",
			"JP Duminy",
			"Faf du Plessis",
			"Imran Tahir",
			"Keshav Maharaj",
			"David Miller",
			"Morne Morkel",
			"Chris Morris"
	};

	//It's a Newzealand team members.

	public static String[] NewZealand = 
	{
			"Kane Williamson",
			"Martin Guptill",
			"Tom Latham",
			"Luke Ronchi",
			"Ross Taylor",
			"Neil Broom",
			"Jimmy Neesham",
			"Corey Anderson",
			"Mitch Santner",
			"Colin de Grandhomme",
			"Jeetan Patel"
	};

	//It's a Zimbabwe team members
	
	public static String[] Zimbabwe = 
	{
			"Alastair Cook",
			"Mark Stoneman",
			"James Vince",
			"Joe Root",
			"Dawid Malan",
			"Jonny Bairstow",
			"Moeen Ali",
			"Chris Woakes",
			"Tom Curran",
			"Stuart Broad",
			"James Anderson"
	};

	//It's a Afghanistan team members

	public static String[] Afghanistan = 
	{
			"Asghar Stanikzai",
			"Amir Hamza",
			"Fareed Ahmad",
			"Javed Ahmadi",
			"Nasir Jamal",
			"Rahmat Shah",
			"Samiullah Shenwari",
			"Shapoor Zadran",
			"Gulbadin Naib",
			"Mohammad Nabi",
			"Noor Ali Zadran"
	};

	// It's a Team1players.

	public static String[] Team1Player = 
	{
			"Player 1",
			"Player 2",
			"Player 3",
			"Player 4",
			"Player 5",
			"Player 6",
			"Player 7",
			"Player 8",
			"Player 9",
			"Player 10",
			"Player 11"
	};

	//It's a Team2players

	public static String[] Team2Player = 
	{
			"Player 1",
			"Player 2",
			"Player 3",
			"Player 4",
			"Player 5",
			"Player 6",
			"Player 7",
			"Player 8",
			"Player 9",
			"Player 10",
			"Player 11"
	};

	//Initially team1player status is 0

	public static int[] Team1PlayerStatus = 
	{ 
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
	};

	//Initially team2player status is 0

	public static int[] Team2PlayerStatus = 
	{ 
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
	};

	

	public static int iActiveBatsman;

	public int iActiveBowler;

	public static int iWhoIsBatting;



	public static void main(String[] args) throws InterruptedException 
	{
		int iOvers;
		int tossWin, iTeamBatting, iFirstTeamScore, iSecondTeamScore;

		Scanner ss = new Scanner(System.in);//Its getting input.

		System.out.print("Enter team 1 : "); // Its just a printing statement for entered team1

		String sFirstTeam = ss.nextLine(); //The nextLine() method is waits for input to be entered for the first team

		if ( CheckTeamName(sFirstTeam) != true ) // Its check the entered TEAM name is not belongs to team detailed which is mention in starting.The condition is satisfied.
			
			{
				System.out.println(Arrays.toString(team)); //Then entered into the 1st line and its shows the list of team names.
				
				System.out.println("Please ENTER correct team name:  " ); // Its just a printing statement.

				sFirstTeam = ss.nextLine();// Its wait for a receiving a input for the first team.

				System.out.println("Name of the first team is  "+ sFirstTeam ); // Its just printing a first team name.

			}
			
			UpdateTeam (sFirstTeam, true);//Its set or take the first team which is input


			System.out.print("Enter team 2 : ");// Its just a printing statement for entered team2.

			String sSecondTeam = ss.nextLine();  //The nextLine() method is waits for input to be entered for the seconds team

			if ( CheckTeamName(sSecondTeam) != true ) // Its check the entered TEAM name is not belongs to team detailed which is mention in starting.The condition is satisfied

			{

				System.out.println(Arrays.toString(team)); //Then entered into the 1st line and its shows the list of team names.

				System.out.println("Please ENTER correct team name:  " ); // Its just a printing statement

				sSecondTeam = ss.nextLine();// Its wait for a receiving a input for second team

				System.out.println("Name of the second team is  "+ sSecondTeam );// Its just printing the name of the second team.

			}

			UpdateTeam (sSecondTeam, false);//Its set or take the second team which is inputed.


			System.out.print("Enter overs : ");// Its just a printing statement for enter the number of overs.

			iOvers = ss.nextInt();  //The nextLine() method is waits for input to be entered for the over and assign the over value to the iovers.

			System.out.print("\n\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n\n");//Its just printing statement.

			System.out.print( sFirstTeam + " versus " + sSecondTeam + " (" + iOvers + " overs) match" );//Its shows the first and second team name and also a number of overs for the match.

			System.out.print("\n\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n\n");//Its just printing statement.

			


			System.out.println( sFirstTeam + "'s Players");//Its just a printing statement for first team name.

			System.out.println( "--------------------------------------------------------");//Its just printing statement.

			for (int i = 0; i < Team1Player.length; i++)// This for loop shows the Team1Player name details.
			
			{
				 System.out.println(Team1Player[i]);//Its shows the names of the players
			}
			
			System.out.print("\n\n");//Its printing the newline



		        System.out.println( sSecondTeam + "'s Players");//Its just a printing statement for the second team name

			System.out.println( "--------------------------------------------------------");//Its just printing statement

			for (int i = 0; i < Team2Player.length; i++)//This for loop shows the Team2Player name details
			{
				System.out.println(Team2Player[i]);//Its shows the team2player name
			}

			System.out.print("\n\n");//Its just printing new line.



			System.out.println("\n=====================================================\n" );//Its just printing statement

			System.out.println( "tossing");//Its just printing tossing.

			tossWin = ThreadLocalRandom.current().nextInt(0, 1 + 1);//ThreadLocalRandom.current() retern the current thead for the ThreadLocalRandom and NextInt methed hava two paramater one is lower and upper value.And those upper or lower value to the tosswin varible.

			if (tossWin > 0 )//Its check the tossWin is greater then the least value.the condition is satisfied
			{
				System.out.println( sFirstTeam + " Won the toss!" );//Its just printing the first team won the toss
			}
			else //The condition is not satisfied
			{
				System.out.println( sSecondTeam + " Won the toss!" );//Its just printing the second team won the toss	
		  	}




			iFirstTeamScore = iSecondTeamScore = iWhoIsBatting = 0;

			iTeamBatting  = ThreadLocalRandom.current().nextInt(0, 1 + 1);//ThreadLocalRandom.current() retern the current thead for the ThreadLocalRandom and NextInt methed hava two paramater one is lower and upper value for the iteam bating

	
			if ( tossWin > 0 )// tossWin is greater then the least value.The condition is satisfied then
			{
				if ( iTeamBatting > 0  )//iTeamBatting is greater then the least value.The condition is satisfied then
				{

					System.out.println( sFirstTeam + " Will do the batting!" );//Its just printing the first team choose to bat first.

					iWhoIsBatting = 1;// Set the value iWhoIsBatting to 1.

				}
				
				else //The condition is not satisfied
				{
			
					System.out.println( sFirstTeam + " Will do the bowling!" );//The first team choose to bowl first and its also a print statement

					iWhoIsBatting = 0;// Set the value iWhoIsBatting to 0

				}
			}

			else//The condition not satisfied thet means second team choose to bat or bowl first
			{

				if ( iTeamBatting > 0  )//iTeamBatting is greater then the least value,if the condition is satisfied then
				{

					System.out.println( sSecondTeam + " Will do the batting!" );//The second team choose to bat first and its also printing statement.

					iWhoIsBatting = 0;// Set the value iWhoIsBatting to 0.

				}
				else//The condition is not satisfied then
				{

					System.out.println( sSecondTeam + " Will do the bowling!" );//The second team choose to bowl first ,and its also a printing statement.

					iWhoIsBatting = 1;// Set the value iWhoIsBatting to 1.

				}
			}

			System.out.println("\n=====================================================\n" );//Its just printing statement.




	int bowlerCount = 10;// bowlerCount is a variable.

	for ( int iTeamCount = 1; iTeamCount <= 2; iTeamCount++ )//This For loop for the team count.

	{

		firstTimeBatting ( );//Its  a function prototype for firstTimeBatting ( ).

		for ( int iOverCount = 1; iOverCount <= iOvers; iOverCount ++ )// this for loop is first over first ball for the first team 
		{
			
			if ( iActiveBatsman == 10 )// its check the current batsman is last batsman.This condition is satisfied that means no other batsman for batting.
			{
				break;//Its a break statement.Because no other batsman to play.

			}

			TimeUnit.SECONDS.sleep(3);//Its time between the 2 batsman, and the time is 3 seconds

			System.out.println("\n=====================================================\n" );//Its just a printing statement.

			if ( iWhoIsBatting > 0)//iWhoIsBatting is 1 that means first team bat first.this condition is true
			{

				System.out.println ( Team2Player[bowlerCount] + " bowling" + " [" + iOverCount + "] over(s)");//team2 bowler bowling the overs.Because first team bat first.
			
			}
			else// The condition not statisfied thet means second team bat first.
			{
			
				System.out.println ( Team1Player[bowlerCount] + " bowling" + " [" + iOverCount + "] over(s)");//team1 bowler bowling the overs.Because second team bat first.

			}

			System.out.println("\n=====================================================\n" );//Its just a printing statement.

			for ( int iCount = 1; iCount <= 6 ; iCount++ )//This for loop is used for number of ball for the particuler over.

			{
				
				TimeUnit.SECONDS.sleep(2);//Its time between the 2 bowler, and the time is 2 seconds

				if ( iActiveBatsman == 10 ) //The contion is iActiveBatsman value is 10.then the condition is stisfied.No other batsman in this particular team.
				{
					
					System.out.println("All wickets down. Next innings will start now");//Its just a printing statement for allbatsman is out.

					if ( iWhoIsBatting > 0 )//iWhoIsBatting is 1 that means first team bat first.this condition is true.
					{
						iWhoIsBatting = 0;//Set the iWhoIsBatting to 0 for bowling the first team.becuse all players is out.

					}
					else//The condition not statisfied then Second team bats first.
					{

						iWhoIsBatting = 1;//Set the iWhoIsBatting to 0 for bowling the second team.becuse all players is out

					}
					bowlerCount = 10;//Its indicate which bowler bowl first.In my program the 10th bowler is a best bowler.so every team start bowling with a best bowler.

					break;//Its just a breaking statement.
				}



				int iBall = ThreadLocalRandom.current().nextInt(1, 11 + 1);//ThreadLocalRandom.current() retern the current thead for the ThreadLocalRandom and NextInt methed hava two paramater one is lower and upper value.The upper value is 12 because its include extra ball like noball.

				if ( iBall == 4 )// if the condition is satisfied that means the iball value is 4 thet means the particular ball is No ball
				{

					System.out.println("Ball " + iCount + " "  +" No Ball!");//Its just print the corresponding ball is noball.

					if (iWhoIsBatting > 0 )//iWhoIsBatting is 1 that means first team bat first.this condition is true.
					{

						iFirstTeamScore++;//Its no ball so we increase the first team score plus 1.so i increment the team score to one.

					}
					else//The condition not satisfied.Its indicates 2nd team is batting
					{

						iSecondTeamScore++;//Its no ball so we increase the second team score plus 1.so i increment the second tem score to one.

					}

					iCount --;//Its noball so we have to provide a extra one ball for the particular over.so i decrement the ball count for provide the extra one ball.

					continue;//Its just a statement.Its just proceed.

				}

				if ( iBall == 5 )//if the condition is stisfied that means the iball value is 5 thet means the particular ball is wide Wide
				{

					System.out.println( "Ball " + iCount + " "  +" Wide!");//Its just print the corresponding ball is wide

					if (iWhoIsBatting > 0 )//iWhoIsBatting is 1 that means first team bat first.this condition is true.
					{

						iFirstTeamScore++;//Its wide ball so we increase the first team score plus 1.so i increment the team score to one.

					}
					else//The condition not satisfied.Its indicates 2nd team is batting
					{

						iSecondTeamScore++;//Its wide ball so we increase the second team score plus 1.so i increment the second tem score to one.

					}

					iCount --;//Its wide ball so we have to provide a extra one ball for the particular over.so i decrement the ball count for provide the extra one ball.

					continue;//Its just a statement.Its just proceed.

				}

				if ( iBall == 1 )//if the condition is satisfied that means the iball value is 1 then the particulat ball is Catch
				{
					
					 System.out.println("Ball " + iCount + " "  + getCurrentBatsMan() + " Got Out by Catch");//Its just print the curresponding batsman is out,which was get by getCurrentBatsMan() .

				         callNextBatsMan ();//The curresponding batsman is out then we have to call the next batsmen. so i used the callNextBatsMan () function here.

					 continue;//Its just a statement.Its just proceed.
				}

				if ( iBall == 2 )//if the condition is satisfied that means iball value is 2 then the particular ball is Bold
			   	{

					System.out.println("Ball " + iCount + " "  + getCurrentBatsMan() + " Got Out by Bold");//Its just print the curresponding batsman is out,which was get by getCurrentBatsMan()

					callNextBatsMan ();//The curresponding batsman is out then we have to call the next batsmen. so i used the callNextBatsMan () here.

					continue;//Its just a statement.Its just proceed.
				  
				}

				if ( iBall == 3 )//if the condition is satisfied that means the iball value is 3 then the prticular ball is LBW
				{

					System.out.println("Ball " + iCount + " "  + getCurrentBatsMan() + " Got Out by LBW");//Its just print the corresponding batsman is out,which was get by getCurrentBatsMan()

					callNextBatsMan ();//The curresponding batsman is out then we have to call the next batsmen. so i used the callNextBatsMan () here.

					continue;//Its just a statement.Its just proceed.				  
					  
				}

				switch (iBall)
				{
					case 6://This case value is 6.Here iball value is 6 thet mean the batsman gets 0 runs for the particular ball.
						
						System.out.println("Ball " + iCount + " "  +" No Run");//Its just print the batsmen does not get any run for the corresponding ball.
		
						break;// Its just break the statement.

					case 7://This case value is 7.Here iball value is 7 then mean the batsman gets 1 runs for the particular ball

						System.out.println("Ball " + iCount + " "  + getCurrentBatsMan() + " took a single run");//Its just printing the corresponding batsman gets single run for the corresponding ball.

						if (iWhoIsBatting > 0 )//iWhoIsBatting is 1 that means first team bat first.this condition is true.
				    	        {

				    		  iFirstTeamScore++;//The batsman get single.so we increase the first team score plus 1.so i increment the team score to one.

				    		}
				    		else//The condition not satisfied.Its indicates 2nd team is batting
				    		{

				    		 iSecondTeamScore++;//The batsman get single.so we increase the second team score plus 1.so i increment the team score to one.

				    		}

				    		switchToNextBatsMan ();//In this case the batsmen take single run.So we make the next ball for nextbatsmen.So i use the switchToNextBatsMan ().

					        break;// Its just break the statement.
						
					case 8://This case value is 8.Here iball value is 8 then the batsman gets 2 runs for the particular ball

					    	System.out.println("Ball " + iCount + " "  + getCurrentBatsMan() + " took 2 runs");//Its just printing the corresponding batsman gets 2 runs for the corresponding ball.
				    
					    	if (iWhoIsBatting > 0 )//iWhoIsBatting is 1 that means first team bat first.this condition is true.
					    	{

					    		iFirstTeamScore += 2;//The batsman get two runs.so we increase the first team score plus 2.so i increment the team score to two.

					    	}
					    	else//The condition not satisfied.Its indicates 2nd team is batting
					    	{

					    		iSecondTeamScore += 2;//The batsman get two runs.so we increase the Second team score plus 1.so i increment the team score to two.

					    	}
				    
						break;//Its just break the statement.

					case 9://This case value is 9.Here iball value is 9 then mean the batsman gets 3 runs for the particular ball

						System.out.println("Ball " + iCount + " "  + getCurrentBatsMan() + " took a 3 run");//Its just printing the corresponding batsman gets 3 run for the corresponding ball.

						if (iWhoIsBatting > 0 )//iWhoIsBatting is 1 that means first team bat first.this condition is true.
				    	        {

				    		  iFirstTeamScore += 3;//The batsman get 3 runs.so we increase the first team score plus 3.so i increment the team score to 3.

				    		}
				    		else//The condition not satisfied.Its indicates 2nd team is batting
				    		{

				    		 iSecondTeamScore += 3;//The batsman get 3 runs.so we increase the second team score plus 3.so i increment the team score to 3.

				    		}

				    		switchToNextBatsMan ();//In this case the batsmen take 3 runs.So we make the next ball for nextbatsmen.So i use the switchToNextBatsMan ().

					        break;// Its just break the statement.

					case 10://This case value is 10.Here iball value is 10 then mean the batsman gets 4 runs for the particular ball 

					    	System.out.println("Ball " + iCount + " "  + getCurrentBatsMan() + " took 4 runs!");//Its just printing the corresponding batsman gets 4 runs for the corresponding ball.
				    	
					    	if (iWhoIsBatting > 0 )//iWhoIsBatting is 1 that means first team bat first.this condition is true.
					    	{

					    		iFirstTeamScore += 4;//The batsman get 4 runs.so we increase the first team score plus 4.so i increment the team score to 4.

					    	}
					    	else//The condition not satisfied.Its indicates 2nd team is batting
					    	{

					    		iSecondTeamScore += 4;//The batsman get 4 runs.so we increase the second team score plus 4.so i increment the team score to 4.

					    	}
					    break;//Its just break the statement.

					case 11://This case value is 11.Here iball value is 11 then mean the batsman gets 6 runs for the particular ball 

					    	System.out.println("Ball " + iCount + " "  + getCurrentBatsMan() + " took 6 runs!");//Its just printing the corresponding batsman gets 4 runs for the corresponding ball.
				    	
					    	if (iWhoIsBatting > 0 )//iWhoIsBatting is 1 that means first team bat first.this condition is true.
					    	{

					    		iFirstTeamScore += 6;//The batsman get 6 runs.so we increase the first team score plus 6.so i increment the team score to 6.

					    	}
					    	else//The condition not satisfied.Its indicates 2nd team is batting
					    	{

					    		iSecondTeamScore += 6;//The batsman get 6 runs.so we increase the second team score plus 6.so i increment the team score to 6.

					    	}
					    break;//Its just break the statement.

					}//switch
			
				}//for over

				System.out.println("Over " +  iOverCount + " Completed!" );//Its just print the corresponding over is completed.

				if ( iActiveBatsman != 10 )//Its check the iActiveBatsman value to 10.The condition is satisfied,that means some batsman is available
				{

					 bowlerCount --;//I decrement bowler count value for bowling next over.
					  
					 if (bowlerCount <= 6 )//The bowler count is less then 6.
 					 {

						 bowlerCount = 10;//the condition is satisfied.That time we dont have any new bowler. so we have to use again best bowler.so i pick up the best bowler by using bowler count varible.

					 }
					  
					 switchToNextBatsMan ();//Every end of the over,we have to changing the batsmen for the next over.so i use the switchToNextBatsMan () function here. 

				}
				else//Its check the iActiveBatsman value to 10.The condition is not satisfied thet means no batsman is available
				{

					  break;//Its just the break statement.

				}

			}//For loop for team.


				if (iActiveBatsman != 10)//Its check the iActiveBatsman value to 10.The condition is satisfied then
			  	{

					if ( iWhoIsBatting > 0 )//iWhoIsBatting is 1 that means first team bat first.this condition is true.
					{

						iWhoIsBatting = 0;//Set the iWhoIsBatting value to 0 for first team make bowl next time

				  	}
				  	else//The condition is not stisfied then the second team bat first. 
				  	{
	
					  	iWhoIsBatting = 1;//Set the iWhoIsBatting value to 0 for second team make bowl next time

				  	}
						  
				   	bowlerCount = 10;//Each and every time the corresponding team always pick up the best bowler first time.

			  	}			  
			  iActiveBatsman = 0;//None of batsman is bating.so i set the iActiveBatsman to 0

		}


		  	System.out.println( sFirstTeam +" Team Score " +  iFirstTeamScore );//Its just print the first team score

			System.out.println( sSecondTeam + " Team Score " +  iSecondTeamScore );//Its just print the second team score
		  
		 
		  	System.out.println("\n=====================================================\n" );//Its just print statement  


		  	if ( iFirstTeamScore > iSecondTeamScore )//Its checking the first team score is greater then the second team score.The condition is satisfied
		  	{

			  System.out.println( "Team " +  sFirstTeam + " Won The Game!!!" );//Its print first team won the match.

		  	}
		  	else if ( iSecondTeamScore > iFirstTeamScore )//Its checking the second team score is greater then the first team score.The condition is satisfied
		  	{

			  System.out.println("Team " +  sSecondTeam + " Won The Game!!!" );//Its print first team won the match.			  

		  	}
		  	else if ( iSecondTeamScore == iFirstTeamScore )//Its checking the second team score is equal to the first team score.The condition is satisfied 
		  	{

			  System.out.println("Match Draw!!!" );//Its just print the match is draw

		  	}
			 
 
		  System.out.println("\n=====================================================\n" );//Its just print statement

	}




	public static String getCurrentBatsMan (  )
	{

		if ( iWhoIsBatting > 0 )// Here iWhoIsBatting is 1. Its checking the 1>0 this condition is satisfied.
		{

		 return Team1Player[iActiveBatsman];//Its return the first team palyer bats first.

		}
		else//The condition not satisfied then
		{

		 return Team2Player[iActiveBatsman];//Its return the second team palyer bats first.

		}		
	}


	public static boolean CheckTeamName (String teamName) 
	{		
	    for (String string : team)
	    {
	        if (string.equalsIgnoreCase(teamName))//Its check enterd team string is belongs to the team name
		 {

	            return true;//Its return true,if the condition is true.

	         }
	     }

	    return false;//Its return false ,if entered team is not belongs to the team name.

	}


	public static void firstTimeBatting ( )
	{
		if ( iWhoIsBatting > 0 )//iWhoIsBatting is 1 the condition is true.That means first team bat first
		{

			//set first 2 player's status as active for the first team

		  Team1PlayerStatus[iActiveBatsman] = 1;

		  Team1PlayerStatus[iActiveBatsman+1] = 1;

		}
		else//The condition is not satisfied then second team bat first
		{

			//set first 2 player's status as active for the second team

		  Team2PlayerStatus[iActiveBatsman] = 1;

		  Team2PlayerStatus[iActiveBatsman+1] = 1;

		}			
	}


	 public static void callNextBatsMan ()
    	 {
    		if ( iWhoIsBatting > 0 )//iWhoIsBatting is 1 the condition is true.That means first team bat first
		{
    	  		// suppose the player is OUT.so i make the first team player staus to 2

		  	Team1PlayerStatus[iActiveBatsman] = 2;

		}
		else//The condition is not satisfied then second team bat first
		{

		  Team2PlayerStatus[iActiveBatsman] = 2;// suppose the player is OUT.so i make the second team player staus to 2

		}

    	//find out next available bats man for bating next

    	for ( int iCount = 0; iCount < 11; iCount++ )//This for loop for player for the team
    	{
    		if ( iWhoIsBatting > 0 )//iWhoIsBatting is 1 the condition is true.That means first team bat first
    		{
	    		if ( Team1PlayerStatus[iCount] == 0)//Its checking the corresponding player is not active or not played, in first team,if the condition is satisfied then set
	    		{

	    			iActiveBatsman = iCount;//Set particular icount of the player to the iActiveBatsman
      	    	    
	    			Team1PlayerStatus[iActiveBatsman] = 1;//Set the particular player status to active plyer for first team

	    			break;//Its just the break statement.

	    		}
    		}
    		else//The condition is not satisfied then second team bat first
    		{

	    		if ( Team2PlayerStatus[iCount] == 0)//Its checking the corresponding player is not active or not played, in second team,if the condition is satisfied then set
	    		{

	    			iActiveBatsman = iCount;//Set particular icount of the player to the iActiveBatsman

	    			Team2PlayerStatus[iActiveBatsman] = 1;//Set the particular player status to active plyer for second team

	    			break;//Its just the break statement.
	    		}    			
    		}
    	}

    	return;//its just return statement
    }
		
    public static void switchToNextBatsMan ()
    {
    		 
	    	if ( iWhoIsBatting > 0 )//iWhoIsBatting is 1 the condition is true.That means first team bat first
		{

			for ( int iCount = 0; iCount < 11; iCount++ )//This for loop is uesd for find out next available bats man for the first team.

			{
				if ( Team1PlayerStatus[iCount] == 1 && ( iActiveBatsman != iCount ) )//Its checking the Team1PlayerStatus is equal to 1 and also iActiveBatsmanis not equal to icount.
				{

					iActiveBatsman = iCount;//The condition is satisfied, then set  that player as active batsman.					

					break;//Its just break statement.

				}	
		    	}
		}
		else//The condition is not satisfied then second team bat first
		{

			for ( int iCount = 0; iCount < 11; iCount++ )//This for loop is uesd for find out next available bats man for the second team.
			{

				if ( Team2PlayerStatus[iCount] == 1 && ( iActiveBatsman != iCount ) )//Its checking the Team12PlayerStatus is equal to 1 and also iActiveBatsmanis not equal to icount.

				{
					iActiveBatsman = iCount;//The condition is satisfied, then set  that player as active batsman.	
				
					break;//Its just break statement

				}	
		    	}
		}	    	
    	return;//Its return statement
    }



	public static void UpdateTeam (String sFirstTeam, boolean bFirst)
	{
		if ( sFirstTeam.equalsIgnoreCase("India") && bFirst == true )//Its check wheather india is first team or second team
		{
			Team1Player = India;
		}
		else if ( sFirstTeam.equalsIgnoreCase("India") && bFirst == false )
		{
			Team2Player = India;
		}		
		else if ( sFirstTeam.equalsIgnoreCase("Australia") && bFirst == true )//Its check wheather austrlia is first team or second team
		{
			Team1Player = Australia;
		}
		else if ( sFirstTeam.equalsIgnoreCase("Australia") && bFirst == false )
		{
			Team2Player = Australia;
		}
		else if ( sFirstTeam.equalsIgnoreCase("Pakistan") && bFirst == true )//Its check wheather pakisthan is first team or second team
		{
			Team1Player = Pakistan;
		}
		else if ( sFirstTeam.equalsIgnoreCase("Pakistan") && bFirst == false )
		{
			Team2Player = Pakistan;
		}
		else if ( sFirstTeam.equalsIgnoreCase("England") && bFirst == true )//Its check wheather england is first team or second team
		{
			Team1Player = England;
		}
		else if ( sFirstTeam.equalsIgnoreCase("England") && bFirst == false )
		{
			Team2Player = England;
		}
		else if ( sFirstTeam.equalsIgnoreCase("WestIndies") && bFirst == true )//Its check wheather westindies is first team or second team
		{
			Team1Player = WestIndies;
		}
		else if ( sFirstTeam.equalsIgnoreCase("WestIndies") && bFirst == false )
		{
			Team2Player = WestIndies;
		}
		else if ( sFirstTeam.equalsIgnoreCase("SriLanka") && bFirst == true )//Its check wheather srilanka is first team or second team
		{
			Team1Player = SriLanka;
		}
		else if ( sFirstTeam.equalsIgnoreCase("SriLanka") && bFirst == false )
		{
			Team2Player = SriLanka;
		}
		else if ( sFirstTeam.equalsIgnoreCase("Bangladesh") && bFirst == true )//Its check wheather bangladesh is first team or second team
		{
			Team1Player = Bangladesh;
		}
		else if ( sFirstTeam.equalsIgnoreCase("Bangladesh") && bFirst == false )
		{
			Team2Player = Bangladesh;
		}
		else if ( sFirstTeam.equalsIgnoreCase("SouthAfrica") && bFirst == true )//Its check wheather southafrica is first team or second team
		{
			Team1Player = SouthAfrica;
		}
		else if ( sFirstTeam.equalsIgnoreCase("SouthAfrica") && bFirst == false )
		{
			Team2Player = SouthAfrica;
		}
		else if ( sFirstTeam.equalsIgnoreCase("NewZealand") && bFirst == true )//Its check wheather newzealand is first team or second team
		{
			Team1Player = NewZealand;
		}
		else if ( sFirstTeam.equalsIgnoreCase("NewZealand") && bFirst == false )
		{
			Team2Player = NewZealand;
		}
		else if ( sFirstTeam.equalsIgnoreCase("Zimbabwe") && bFirst == true )//Its check wheather zimbbwe is first team or second team
		{
			Team1Player = Zimbabwe;
		}
		else if ( sFirstTeam.equalsIgnoreCase("Zimbabwe") && bFirst == false )
		{
			Team2Player = Zimbabwe;
		}
		else if ( sFirstTeam.equalsIgnoreCase("Afghanistan") && bFirst == true )//Its check wheather afghanistan is first team or second team
		{
			Team1Player = Afghanistan;
		}
		else if ( sFirstTeam.equalsIgnoreCase("Afghanistan") && bFirst == false )
		{
			Team2Player = Afghanistan;
		}		
	}

		 
}
				  
	


					    


				  
					  


		






	

				


			

 


			 
		  

	
				
	
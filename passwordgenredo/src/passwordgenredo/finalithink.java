package passwordgenredo; 

import java.util.Scanner; 
import java.util.Random; 

							/*      Strengths and weaknesses: 
							 * + The biggest strengths of my program lie in its complexity, ability to adjust complexity
							 *       based on password importance, and relative ease of use. 
							 * + Another strength is its ability to add more characters to the end of the password if the 
							 * 		 previous inputs combined weren't long enough to create a secure password. If the 
							 * 		 password is less than 8 characters, another question is asked, and the answer is
							 * 		 altered slightly and then added to the end of the password. So, a secure password
							 *		 is generated every time. 
							 * - I can't really think of any weakness to my program, so perhaps one would be the lack 
							 * 		 of a GUI. If I have A LOT of time on my hands, I might be able to learn how to make 
							 * 		 one in Eclipse IDE or something XD. 
							 * - It might also be a little TOO complex for a project like this, but i had fun :3
							 */ 
							
							/*      Current issues: 
							 * - Having too many vowels in the identified name (like a lot; ~10) results in 
							 *   scientific notation(?). (e.g. 1.248956297E9) (fix is rather long).
							 *   
							 */ 
							 
							/*
							 *      Bug fixes:
							 * > Fixed issue where inputting a single letter (that is also a vowel) for any "root"/sub-word 
							 *   will result in an exception. 
							 * > Made so if password output is less than 10 letters long, will ask another question and 
							 *   add more letters. 
							 * > Made so whether to add an exclamation point or not is based on logic.
							 * > Fixed issue where inputting letters in the 1-5 account type selection results in error.
							 * > Made so word-components are inputted as all of the same category, instead of dividing 
							 *   it up into "prefix-root1-root2-root3-suffix".
							 *
							 */
							    
							 			 
							/*    etc (note-to-self)
							 * - Copy this into eclipse and git move to main. 
							 */ 





public class finalithink
{

	public static void main(String[] args) 
	{
			// Below declares + assigns key variables. 
		
		String pass = "";
		String yn = ""; 
		String root1 = ""; 
		String root2 = ""; 
		String root3 = ""; 
		String root4 = ""; 
		String root5 = ""; 
		int numWords = 0; 
		int numVowels = 0;
		int accType = 0; 
		double accVow = 0; 
		
				// Below is introduction. 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("\nCirno's Perfect Password Generator ⑨"); 
		System.out.println("________________________________________\n");
		System.out.println("First, identify website/application name."); 
		System.out.println("(You can combine multiple words for more security) [>10 letters in total recommended].");
		System.out.println("  (e.g. \"you-tube-account\" instead of just \"you-tube\").\n");

		
		
				// Below prompts for root1, root2, root3, root4, and root5 inputs. 
				// If there's no need for a root 4, will skip over inputs for root 4 and 5.
		
		System.out.println("Please enter the first furthest-most divisible word-component (or next divisible sub-word)\n  of the identified name (e.g. \"git\" in \"git-hub-account\"):"); 
		root1 = sc.nextLine(); 
		root1 = root1.replace(" ", ""); 
		root1 = root1.toLowerCase(); 
		numWords = 1; 
		System.out.println("1st Root: "  + "\"" + root1  + "\"" + "\n");
		
		while(true) {
			System.out.println("Input second sub-word? [max 5] (y/n)\n  (like the \"hub\" in \"git-hub-account\")");
			yn = sc.nextLine(); 
			if(yn.equalsIgnoreCase("n")) {
				break; 	
			} else if(yn.equalsIgnoreCase("y")) {
				System.out.println("Please input second sub-word:");
				root2 = sc.nextLine(); 
				root2 = root2.replace(" ", ""); 
				root2 = root2.toLowerCase(); 
				numWords = 2; 
				System.out.println("Second Root: " + "\"" + root2 + "\"" + "\n");
				
				
				while(true) {
					System.out.println("Input a third sub-word? [max 5] (y/n)");
					yn = sc.nextLine();
					if(yn.equalsIgnoreCase("n")) {
						break; 
					} else if(yn.equalsIgnoreCase("y")) {
						System.out.println("Please input third sub-word:");
						root3 = sc.nextLine(); 
						root3 = root3.replace(" ", ""); 
						root3 = root3.toLowerCase(); 
						numWords = 3; 
						System.out.println("Third Root: " + "\"" + root3 + "\"" + "\n");
						
						
						while(true) {
							System.out.println("Input a fourth sub-word? [max 5] (y/n)");
							yn = sc.nextLine();
							if(yn.equalsIgnoreCase("n")) {
								break; 
							} else if(yn.equalsIgnoreCase("y")) {
								System.out.println("Please input fourth sub-word:");
								root4 = sc.nextLine(); 
								root4 = root4.replace(" ", ""); 
								root4 = root4.toLowerCase(); 
								numWords = 4; 
								System.out.println("Fourth Root: " + "\"" + root4 + "\"" + "\n");

								
								while(true) {
									System.out.println("Input a Fifth sub-word? [max 5] (y/n)");
									yn = sc.nextLine();
									if(yn.equalsIgnoreCase("n")) {
										break; 
									} else if(yn.equalsIgnoreCase("y")) {
										System.out.println("Please input fifth sub-word:");
										root5 = sc.nextLine(); 
										root5 = root5.replace(" ", ""); 
										root5 = root5.toLowerCase(); 
										numWords = 5; 
										System.out.println("Fifth Root: " + "\"" + root5 + "\"" + "\n");
										break;
									} else {
										System.out.println("\nInvalid input, please try again.");
									}
								}
								break; 
								
								
							} else {
								System.out.println("\nInvalid input, please try again.");
							}
						}
						break; 
									
							
					} else {
						System.out.println("\nInvalid input, please try again.");
					}
				}
				break;
				
				
			} else {
				System.out.println("\nInvalid input, please try again."); 
			}
		}
		
		
		

		
		

		pass = root5+root4+root3+root2+root1; 
				
			/* Note: This "for" script below counts the number of vowels in the String and stores it in numVowels. 
			Copied from Stack Overflow like a true programmer. 
			I don't even know what it means XD. -But it works! */
		for (int i=0 ; i<pass.length(); i++){
	         char ch = pass.charAt(i);
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' ')
	         {
	            numVowels ++;
	         }
		}
		

		
			//Removes all vowels from the sting. 
		
		root1 = root1.replaceAll("[aeiouAEIOU]", "");
		root2 = root2.replaceAll("[aeiouAEIOU]", "");
		root3 = root3.replaceAll("[aeiouAEIOU]", "");
		root4 = root4.replaceAll("[aeiouAEIOU]", "");
		root5 = root5.replaceAll("[aeiouAEIOU]", "");
	
		
		


		/* Exception error: problem is that if "a" is input for root 3 (or any root for that matter), 
		 * it cannot process in the mess that is below. Add a checking system that will 
		 * ignore particular root variable if "" before running process(?). 
		 */
		
		
				/* Below makes all word-components Camel-case and puts them together in reverse order.
				(probably not optimal) */ 
	
		if (numWords == 5) {
			if(!root4.equals("")) {
				root4 = root4.substring(0, 1).toUpperCase() + root4.substring(1);
			}
			if(!root3.equals("")) {
				root3 = root3.substring(0, 1).toUpperCase() + root3.substring(1);
			}
			if(!root2.equals("")) {
				root2 = root2.substring(0, 1).toUpperCase() + root2.substring(1);
			}
			if(!root1.equals("")) {
				root1 = root1.substring(0, 1).toUpperCase() + root1.substring(1);
			}
			
		} else if (numWords == 4) {
			if(!root3.equals("")) {
				root3 = root3.substring(0, 1).toUpperCase() + root3.substring(1);
			}
			if(!root2.equals("")) {
				root2 = root2.substring(0, 1).toUpperCase() + root2.substring(1);
			}
			if(!root1.equals("")) {
				root1 = root1.substring(0, 1).toUpperCase() + root1.substring(1);
			}
			
		} else if (numWords == 3) {
			if(!root2.equals("")) {
				root2 = root2.substring(0, 1).toUpperCase() + root2.substring(1);
			}
			if(!root1.equals("")) {
				root1 = root1.substring(0, 1).toUpperCase() + root1.substring(1);
			}
			
		} else if (numWords == 2) {
			if(!root1.equals("")) {
				root1 = root1.substring(0, 1).toUpperCase() + root1.substring(1);
			}
			
		} else if (numWords == 1) {
			
		} else {
			System.out.println("error. fix pls.");
		}
	
		
		pass = root5+root4+root3+root2+root1; 
		
		
		

		
		
		
		/* Below receives input for account type (String accTypeS).
		 * If String input is equal to "1" "2" "3" "4" or "5", will convert String to an int (int accType). This is 
		 * 		so if letters are accidentally inputed, it will not result in an exception (as letters cannot
		 * 		go in int variables). It should instead prompt for re-input. 
		 * Then, converts accType and numVowels from two integers to two doubles, so can use the Math.pow command. 
		 * Then, does accTypeD(double) ^ numVowelsD(double); assigns to new double variable "accVow." 
		*/
		
		System.out.println("\nWhat type of account will this password be associated with?");
		System.out.println("Type 5 if it's for an important or secure account\nType 4 if it's for somewhat personal use\nType 3 if it's for school/educational use\nType 2 if it's for misc use\nType 1 if it's for \"junk\" (not high importance).");
		while(true) {
			String accTypeS = sc.nextLine(); 
			accTypeS = accTypeS.replace(" ", ""); 
			if( (accTypeS.equals("1")) || (accTypeS.equals("2")) || (accTypeS.equals("3")) || (accTypeS.equals("4")) || (accTypeS.equals("5")) ) {
		        accType = Integer.parseInt(accTypeS);
				double accTypeD = accType; 
				double numVowelsD = numVowels; 
				accVow = Math.pow(accTypeD, numVowelsD); 
				break;
			} else {
				System.out.println("Invalid input, please try again.");
			}
		}
		
		
		// Adds the previous exponential equation's product (accVow) to the end of the "pass" String. 
		// Then removes ".0" from String (because it's a double; easier than converting back to int).
		pass += accVow; 
		pass = pass.replaceAll(" ",""); 
		pass = pass.replaceAll(".0",""); 
		
		
		
		/* If the password is less than 10 letters long, it will prompt for the browser name (or OS name if NA).
		 * Then, it will convert the input to Upper case, and will repeatedly remove letters from the end of 
		 * the inputed browser name (which will later be added to the end of the password), until the necessary 
		 * number of letters in the browser name for the password to be at least 10 letters long--when put at
		 * the end of the password--would be fulfilled. 
		 *
		 * Furthermore, if the password importance (accType) is set to 3, 4, or 5, the 
		 * browser name that will be added onto the password at the end will not cap out 
		 * at 10 letters (when looking at the password as a whole). 
		 * If accType <= 2, will cap out at 10 letters (10 letter password). 
		 * If accType = 3, will cap out at 12 letters.
		 * If accType = 4, will cap out at 16 letters. 
		 * If accType = 5, will cap out at 20 letters. 
		 * Note that if the password is longer than 10 letters beforehand, it will not go through 
		 * this subscript and therefore, not be limited by a max number of letters. 
		 */
		int passLength = pass.length(); 
		if (passLength <= 9) {
			int numNeededLetters = 9 - passLength; 
			int accTypex = accType; 
			if (accType < 3) {
				accTypex = 0;
			} else if (accType == 3) {
				accTypex = 2;
			} else if (accType == 4) {
				accTypex = 6;
			} else if (accType == 5) {
				accTypex = 10;
			} else {
				System.out.println("error, fix this.");
			}
			System.out.println("\nNot enough inputs, so the password is too short.\n...Adding more inputs to generate secure password:\n- Please enter the name of your Browser.\n- If not applicable, enter the OS name.");
			String extraInput = sc.nextLine(); 
			extraInput = extraInput.replace(" ", ""); 
			extraInput = extraInput.toUpperCase(); 
			int browserNum = extraInput.length(); 
			
			while(true) {
				if (browserNum <= (numNeededLetters + accTypex)) {
					break;
				}
				extraInput = removeLastChar(extraInput);
				browserNum -= 1;
			}
			pass += extraInput;
		}
		
		// If accType is 3-5 (more secure), then add exclamation point at the end. 
		// If accType is 1-2 (less important), then add question mark at the end. 
		if (accType == 3 || accType == 4 || accType == 5) {
			pass += "!"; 
		} else if (accType == 1 || accType == 2) {
			pass += "?";
		}
		
			//Final output
		System.out.println("\n\n"+ pass);
		System.out.println("Password Generated.\nSmart Cirno ᗜˬᗜ\n\n[enter \"9\" for secret] [\"end\" to finish]");
		
		
		// Completely unnecessary ASCII art generator. 
		
		
		while(true) {
			yn = sc.nextLine(); 
			if(yn.equalsIgnoreCase("9")) {
				Random ran = new Random(); 
				int randomx = ran.nextInt(5); 
				
				if(randomx==0) {
					System.out.println("	　　　　＿_　　 _____　　 ＿_____");
					System.out.println("	　　　,´　_,, '-´￣￣｀-ゝ 、_ イ、");
					System.out.println("	　 　 'r ´　　　　　　　　　　ヽ、ﾝ、");
					System.out.println("	　　,'＝=─-　　　 　 -─=＝',　i");
					System.out.println("	　　i　ｲ　iゝ、ｲ人レ／_ルヽｲ i　|");
					System.out.println("	　　ﾚﾘｲi (ﾋ_] 　　 　ﾋ_ﾝ ).| .|、i .||");
					System.out.println("	　　　!Y!\"\"　 ,＿__, 　 \"\" 「 !ﾉ i　|　　＿人人人人人人人人人人人人人人人＿");
					System.out.println("	　　　 L.',.　 　ヽ _ﾝ　　　　L」 ﾉ| .|　　＞ ゆっくりしていってね！！！　　＜");
					System.out.println("	　　　 | ||ヽ、　　　　　　 ,ｲ| ||ｲ| /　　￣^Ｙ^Ｙ^Ｙ^Ｙ^Ｙ^Ｙ^Ｙ^Ｙ^Ｙ^Ｙ^Ｙ^Ｙ^Ｙ^Ｙ^￣");
					System.out.println("	　　 　レ ル｀ ー--─ ´ルﾚ　ﾚ´");
					
					System.out.println("\n   Yukkuri Reimu from Touhou.");
					
					System.out.println("\n\n\nRandom ASCII generator(for no particular reason)\n   [\"end\" to exit] [\"9\" for another]");
					

				} else if(randomx==1) {
					
					System.out.println("………………….___…………………………………………….__„„„„-");
					System.out.println("……………„-~*¯¸„--~¯**~--¸……………………………_„-~^*¯„-~*");
					System.out.println("………...„*: : „-*…………….*……………………„-~*¯: : ¸„-*");
					System.out.println("……….ƒ: : ƒ………………………………….„-*: : : _„„-*––––––„„¸_");
					System.out.println("………'|: :.'|…………………_„--~^***¯¯¯¯´`-, : : *¯: : : : : . : . : . : .¯*~--„_");
					System.out.println("………|:.:.'|…………...„-~*¯ : : : : : : : : . : : `-, : : : : : : : .*~-„„„„–––––––-*^-„¸");
					System.out.println("………*„:.:|……….„-* : : : : : : : : : : : : : . : : : `, : : : : . : . : : : *-„");
					System.out.println("………..*-„*„…..„-* : : : : : : : : : : : , : : : : . : : : ', : . : . : : : :, : : : '*-„");
					System.out.println("…………...**-„'* : : : :, : : : : : : : : :|\\ : : . : . : \\ : ',-, : : : : : : :`-, : : : :*-„");
					System.out.println("…………….„* : : : :,-´. : . : . : ', . : | '\\ : : . : . : |\\ ¸„-^***^ : : : : : :`-, : : : :*-„");
					System.out.println("…………...ƒ : : : ,-' . : . : . : : :| : : | .'\\ :\\ : : : . '|'*', ', . *-„ : : : : : : :*„„  : : :*„");
					System.out.println("…………../ : : : ,' . : . : : : : : :_„-~^^~ \\ :\\ : : . :| . .',', . . *-„ : : : : : :*„~--„¸ : :*„");
					System.out.println("………….|' : : :,' . : . : :.:. :¸„-* , : :| . . . *„\\ : : : | . . .\\ ._„„--*„ : ', : : : :\\…..¯*-„*„");
					System.out.println("………….| : :,´ . : : / :.:. :-* : :,', :,' . . . . .*„ : : '| . . ~„„„~^\\¯|'*„ :', : : : :|………**„");
					System.out.println("………….| : ,' ,| : : | : :. : : : :,' .| / . . _ . . .*„ : '| . . . |; ; ; ;| ' | `, ',-, : : '|");
					System.out.println("………….'| / ./ | : :'| :.:. : : : :| . |/„-~*„„^^ . . .'| :'| . . . .|´\\„/ |'| . |:.|\\,', ', : :'|");
					System.out.println("…………..|´/ : '| : : | :.:. : : :ƒ-^*'„~^* ; ;\\ . . . | :| . . . . \\ _ /¸| . \\:.:| '...'\\ : |");
					System.out.println("………….'/^ : :'| : :,| :.:. : : ƒ *¯\\; ; ; ;',\\ \\ . . .'|ƒ . . . . . ¯¯ . . . \\.:\\…...\\ |");
					System.out.println("………….'..| | :| : :/ |:.:. : :ƒ*„ .`-,\\;\\'\\_| '\\ , . . .* . . . - . . . . . . .„* . \\…..\\|");
					System.out.println("…………..„„|/„„ | : |:.|.:.: :„*.:.*„ . . `-,,_„-' . . . . . . .,–-´ . . . .,-´,\\.:. . \\");
					System.out.println("…………( . . . . ¯*^-„|.:.:„*.:.:.:*„-^*^„ . . . . . . .*~*´ . . . . „-*\\..\\ |.: : .'\\");
					System.out.println("………….`,--„„„_ . . . .*-„/_\\.:.:.| . . .| . . . . . . . . . . . „-*´|| | | |…`\\.: : \\ '\\");
					System.out.println("…………'„* : :.:.¯*-„„----„_*--`,_,' . . /`,––––––-,––,~*´; ;'| | / /……'\\ : : \\ '\\");
					System.out.println("………..„* : :.,-´.:.( . . . . ¯^, . . . . |.:.:*„`,:: :: :`-:: ,\\; ; ,',',',','……..'\\ : '|.'\\'\\");
					System.out.println("……..'„*. : ,-´: .:.:,-` . .¯**^´-¸ . . . .| . : :*-„`,_„„„„„-´ .| ; | | | |………..'\\ :'|...\\");
					System.out.println("……„* . : ,´ : .:.:¸-`~~--„„„„---´ . . .¸-'`, : . : :*-„`-, . . .| ;,',',',''|………...'*ƒ");
					System.out.println("….„*: . :,-´ : .:.:.*, . . __,) . . . . ../;;; `,`, . :*„-*„ `, . '| ,',',',' |…………..|");
					System.out.println("..„*: . : ,' : .:.:.:.:.'|¯*^-„ . . . . . ...'|;;,-' ,'`-`, . :|`,`,`,`,'|,',,',' ,´");
					System.out.println("„*': . : / : .:.:.:.:.:,´\\ . .', ¯**,......_,'-´; ;/ \\ \\ `, :|---„„  `,' ','.-/");
					System.out.println("„-*| : / : .:.:.:.:,-** . . . .\\ ; ; `*^*´; ; „-*´_/ . `-\\ '| ; ; ; `„-´ ;`**^-„");
					System.out.println("…| :'|: :.:.:.:.:.| . . . . . . . ; ; ; ; ; . . -/* `-, . .|/ ¯¯¯,-´ ; ;\\;;; ; ;\\");
					System.out.println("…*„/: :.:.:.:.:.:', . . . . . . . .`. . . ... ,' . . . `-, . . . ,' ; ; ; ;|-, ; ; ; \\");
					System.out.println("…..*„:.:.:.:.:.:.:.', . . . . . . . . .. . . / . . . . . . . . . | ; ; ; ;| . **^„ ; \\");
					
					System.out.println("\n   Konata from Lucky Star");
					
					System.out.println("\n\n\nRandom ASCII generator(for no particular reason)\n   [\"end\" to exit] [\"9\" for another]");
					

				} else if(randomx==2) {
					
					
					System.out.println("------------------------------------------------------------------------------------------");
					System.out.println("------------------------------------------------------------------------------------------");
					System.out.println("-------------------------------------------------------::::::::::::-----------------------");
					System.out.println("------------------------------------------------------:/::::----.--:::::------------------");
					System.out.println("-------------------------------------------------------------::::::-----::::--------------");
					System.out.println("----------------------------------::::::::::::::::::::::-------------:/-.--/--------------");
					System.out.println("-----------------------------::::------:://:-...--------:::::::----::::::::---------------");
					System.out.println("-------------------------:::---...---:+/:---...-.------.-...::-://:::::-------------------");
					System.out.println("---------------------::----..-----.-//------.:/.-.--------.`--:---:::---------------------");
					System.out.println("------------------::--...-.-.-.--.-/-..-/-..:+o-.-------.-.`/-.:/-.---::------------------");
					System.out.println("----------------::-...---------.-::-..:+-.-/+::/.------.....+-..+o:::.--::----------------");
					System.out.println("---------------::.----.-------.-/:.-.:o/-:+/-../-.----.-.-.:s.--oo+-/--.-:/---------------");
					System.out.println("---------------+-.------------:+:.-.:+o:-:-````-/.-------.-//::+-/o/-/..-.-::-------------");
					System.out.println("--------------::.----.---.---:o-.-.-+-/-:-`````./.----.-.-:-/.:--:++-+--.-...::-----------");
					System.out.println("-------------:+-..---::---..:o:.-.-/.`//-`..-.``:-.----.-:`:::-``.:s-/:..-...`-:----------");
					System.out.println("------------::.---.-/---.--.:/..--/.`.+ooyhdms-`.:.---.::``:-:`````///+-.--.-.`-:---------");
					System.out.println("-----------::.---.-/-.--.`..:/.--//oydmmmdmy.```./--.-:-``./:`:ys/../::/-..--.-.::--------");
					System.out.println("----------::.--..-/-.---.`..-/-.sdysmdddddmo`````/-.-:.```-+```+Nmds/+-./-.-----./--------");
					System.out.println("---------::...-.-/--.-.-.``../-/:.`:mdddhhm+`````:::-``````````/mdddmd+../----.//-:-------");
					System.out.println("---------/..-.-./-..-----.`..:+-```:mso+/+d/`````.-.```````````:mdddms+:`.o-.-.-+-/-------");
					System.out.println("---------:..--./:.--------...-/````:s:///+d:```````````````````-ms+sho````+o-..-://-------");
					System.out.println("--------::.-.::/.-.----------./.````.:///+h.```````````````````.ds//+o````-o+-.-::+:------");
					System.out.println("--------/-.--/-/:..---------..-/`````-:-.-:`````````````````````/.:/++````.o+/.::-/-------");
					System.out.println("--------/-..::.-::-.-----------::.```````````````````````````````.--:-`````+++:/----------");
					System.out.println("--------/.--/-.---:-.------------:.```````````````````````````````..```````++++:----------");
					System.out.println("--------/..::.-.---::-.-----.--+:-:....````````````````````````````````````/o+o-----------");
					System.out.println("--------+../---.--::-/:-.---.-.-/::/.````````````````````````````````.`.```/oo/-----------");
					System.out.println("-------:/--/...--.-:/--::--..--.::.:+.`````````````````````````````````````+o/------------");
					System.out.println("-------:./-+--..--.--/:--//:----.::`..`````````````````````````````````````+o-------------");
					System.out.println("------/.-/-+o-.-.-.--.:/:-/..--:::/-`````````````----...``````````````````::--------------");
					System.out.println("-----/-.:::++o:.----.---/++/````...`````````````./----/+/-```````````````-:---------------");
					System.out.println("----::../-+++os/.-.---.-.-:o/```````````````````./------/:`````````````-//----------------");
					System.out.println("-----.-.+-++++so+-..-------.-::.`````````````````.:::-...```````````.-::--/---------------");
					System.out.println("-------./:+++++soo/----...-.-.--:-.``````````````````````````````.-::-:/-.::--------------");
					System.out.println("-------./:++++++oooo:--::::--.----::`````````````````````````.-:+/-.-//-.-./--------------");
					System.out.println("--------/+/:-......-/+s-...-:::-.../-```````````````````.-:/+oo+o-./+:---..::-------------");
					System.out.println("----::.....--..........:.......-::./o/-````````..--::/++s+++++++o-+/-----..-/-------------");
					System.out.println("---:/:`..........................-:ooso::--..-:/oo+++oooo++++++os/--.--.--../-------------");
					System.out.println("---.--........-://++/:-.............-+hhhhhys-.:oooo+soo++++++o+:-.-------../-------------");
					System.out.println("---........-/++++++++++/-............./s+oyhho`ssyhhyys++++++o/-.--..--..--/:-------------");
					System.out.println("------...:+++++++++++++++:-..:.........-`.-/yh-hmhhhhhho+++o+:.----:::-:::----------------");
					System.out.println("---------:://+++++++osysooo+//+.............-ysohhhhhhso+-::---:-....+::------------------");
					System.out.println("--------------:/osyyyyyyyyy++++/----.........-o/ohhhdyooo:-::-.......----.-/--------------");
					System.out.println("----------------:/osyyyyyyysoo+++++++/:-....../:.-shhhhy+o.-.............../--------------");
					System.out.println("-------------------:/osyyyyyyyyysssssssso/:..`:+.`.shhh:.-...............::---------------");
					System.out.println("-----------------------/+oosyyyyyyyyyyhddso+/--+....yhy/............-:--:-:---------------");
					System.out.println("----------------------------::/+oossyyyyhdddhhyo::-.ooooo......-:/++++-....:--------------");
					System.out.println("------------------------------------::://+ossyyyyyyysos+o:..-:////:::---------------------");
					System.out.println("------------------------------------------------------------------------------------------");
					
					System.out.println("\n   Yuuri from Girls' Last Tour");
					
					System.out.println("\n\n\nRandom ASCII generator(for no particular reason)\n   [\"end\" to exit] [\"9\" for another]");
					
					
				} else if(randomx==3) {
					
					System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMNdMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMd+NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMm-+dMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMNo--+hNMMMMMMMMMMMNmmmddddmmmNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMMNs:--:+shdddhhs+/::------:::://+sydmNMMMMMMMMMMMMMMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMMMMNdyso/:--------------------------:/ohmNMMMMMMMMMMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMMMMMNds/-.------------------------------:/sdNMMMMMMMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMMNdo:---------------------------------------/hNMMMMMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMNh+-.-------------------------------------------/hNMMMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMmy/-.--::-----------/-----------------------::-------+mMMMMMMMMMMMM");
					System.out.println("MMMMMMMMMNho:-----::------------+--------------------------:--------hMMMMMMMMMMM");
					System.out.println("MMMNNmhs/----:---::------------+/-------------:-------------/--------yMMMMMMMMMM");
					System.out.println("myo/:-----:+o:--/-------:-----+o-------------/:--------------/--------sMMMMMMMMM");
					System.out.println("MMNNmddddmNy--:/-------/--:::+/+------------::+:::------------/--------yMMMMMMMM");
					System.out.println("MMMMMMMMMMh.`:/------:/----:+://-----------:/-:/-------:-------/-------:hMMMMMMM");
					System.out.println("MMMMMMMMMd.`:/-.-----+----//-.:/-----------+-..//------::----.-:/-------/mMMMMMM");
					System.out.println("MMMMMMMMN:.:/--...--o:--:+:-..//--.-------:/....//------+-..-.--:/-------oNMMMMM");
					System.out.println("MMMMMMMMo-:/-------o/-/shhhdddo/--....----+.odhhyhy/----+:-------/:------/hMMMMM");
					System.out.println("MMMMMMMm-//-------/o/ymNmmdddh/+-:-------:/.sddmNNNmo:--+:--------/:------oNMMMM");
					System.out.println("MMMMMMMs/+-------:yhmdshmNNNNm/-//:--:---/../sdNNNNmhy+:+/-------/-:/-----+hMMMM");
					System.out.println("MMMMMMMso--------sdd/-:dNmNmmNy`//+:-/:--+`.-omNNNNNmsoyyo-------/+::/:---/oNMMM");
					System.out.println("MMMMMMMy:-------:dh` /odmmmmmmh``/+/::/-::`-oymmmmmmmm-.ys--------o++////:/+mMMM");
					System.out.println("MMMMMMN:--------+h. `dmmmmmmmmy ``////+:/-`ymmmmmmmmmN. `o--------//-:///+oohMMM");
					System.out.println("MMMMMM+--------:o+   shosyysyd-````--:+o/-`sdhdmmmddmh`  o---------+-----:/+dMMM");
					System.out.println("MMMMMy---------++...``/-----/-`````````/+-`.o/-:/::+y.  `o-:::::::-+:--:-:++NMMM");
					System.out.println("MMMMm:-------:+:.`........``````````````/-```.------.`...+:::::::-:o:::::/oyMMMM");
					System.out.println("MMMM+----:---:/```......`````````````````.```...........-/:::::::::o:::::ohMMMMM");
					System.out.println("MMMd-:---:---:o```````````````````.````..`````.........`:::::::::::o::::yNMMMMMM");
					System.out.println("MMM+-/----:--oy/.-......-````````````..````......```````+::::::::::s//:-NMMMMMMM");
					System.out.println("MMN-:+----:--yh .-......:-................:..`...:...--:+:::::::::-o----NMMMMMMM");
					System.out.println("MMN-/+----/::dN. ````````    ````.........:::-----.``  ./:::::::::+/---/MMMMMMMM");
					System.out.println("MMN-/s-:--+::mM/```             ````````````````````   /://:::::::o-::/sMMMMMMMM");
					System.out.println("MMM/+d---:o/:NMy////::::---..`````````````````````````:/++:::::::ssossohMMMMMMMM");
					System.out.println("MMMyoMo--:+o:NMm/++++++++++++++++++++++++++++++++++++soo+/:::::/ssooooomMMMMMMMM");
					System.out.println("MMMMsMN/:-+d/dMN//++++++++++++++++++++++++++++++++++sos+/::::/ososssoo+NMMMMMMMM");
					System.out.println("MMMMNMMN+-/dmyMN:  `...-::::////++++++++ooooo++++++oos+:-:/+/+/::--..--NMMMMMMMM");
					System.out.println("MMMMMMMMMy:yMNNM+                                 ./+/////:.----------/MMMMMMMMM");
					System.out.println("MMMMMMMMMMmyNMMMy                                `-..` .--------------oMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMm                                      .--------------sMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMN- `                                   .-------------.dMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMM+/+/-`                               `.-------------.NMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMs++++/.-.`                        `..-+ooo.----------NMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMm/++++oo//+/:--.--...```....---.:/++oosoos.---------/MMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMN/++s+oo+/so++oo++++++/o++++++++y+++osoooo.---------oMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMM/++o+os++so++oo++o++++y/++o++++y++++ooos:---------.yMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMo.++++s+++o+++o+++++++y/++++++o/++++oos-----------.dMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMd `-::/o++++++s+++s+++y/+/so+++o`/+osso-----------.NMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMN`     `/+++++s/++so+/s++/os++++`-:/:-------------:NMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMN:        `..`:///////+//:-..`    `---------------/MMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMM+           ./:-/:.              .---------------oMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMMy           .::-::-`            `---------------.yMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMMm            .....`            `.---------------.dMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMMN-                             .----------------.NMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMMM/                            `-----------------:NMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMMMy-.``                       `--------------:://sMMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMMMm/+////:-..````            `.-----::://++oooooohMMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMMMN//+++++++++///////////////+oooooooosoooooooooodMMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMMMM/`.-://++++++++++++++++++ooooooooooooooo+//:-.mMMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMMMMh-`    `..---::///////++ooo+++////:::--------+NMMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMMMMMNho/.``             `.-----------------:/ohmMMMMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMNdyso+:-.`````-----------:/+osyhdmNMMMMMMMMMMMMMMMMMM");
					System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNmmmmmmmNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");

					System.out.println("\n   Nadeshiko (in curry noodle cup) from Yuru-camp");
					
					System.out.println("\n\n\nRandom ASCII generator(for no particular reason)\n   [\"end\" to exit] [\"9\" for another]");

					
				} else if(randomx==4) {
					
					System.out.println("                                     :+osssso+..``                          `-///.`                 ");
                    System.out.println("                                   .+oossssoo..```                       `-/++++.`                  ");
                    System.out.println("                                 `:+oossssoo-                         `-/+oooo/.`                   ");
                    System.out.println("                                .:/+++ooooo/`                      `-/+oooooo/.``                   ");
                    System.out.println("                              `-::::::///+/.``     ```          `.:+oosssssoo-``                    ");
                    System.out.println("                             `-::::::::::/-..```  `-----.``` `.-::/ooosssso+-.``                    ");
                    System.out.println("                          `.::::::::::::::..```    `-::::::-::::::///+oooo:`` `                     ");
                    System.out.println("                        `--::::::::::::::..```  `..--::::::::::://:::/+++-```                       ");
                    System.out.println("                      .---::::::::::::::-```````-:::::::::::::::::///://...`                        ");
                    System.out.println("                    `----::::::::::::::/-```-:::::::::::::::::::::/:://-.```                        ");
                    System.out.println("                  `.-------:::::::::::/::-.-:::::::::::::::::/::::://:::-.``                        ");
                    System.out.println("                 `------------::::::::-------:::::::::::::::::/:::::://:::-`                        ");
                    System.out.println("                .---------------:::----------:::::::::::::::---:::::::::/:::.`                      ");
                    System.out.println("               .----------------::--------------:::::::::::-----:::::::::/:::-.`                    ");
                    System.out.println("              ..---------------:-----------------::-:::-:::------::-------::::--.`                  ");
                    System.out.println("             ...--------------:-...--------------::------:--------:--------+oo+---.`                ");
                    System.out.println("            ...--------------:--..--.-----------::-------:---------:----/oo+-.-/+-...`              ");
                    System.out.println("           `...-------------:------------------:::------::--------------+ss:   :o:..--.`            ");
                    System.out.println("          ````...---------------------------:-::-::-----/--------...-----/so:-:+o:--......`         ");
                    System.out.println("          .``...--------------------------:::::---::---:/--------...:----:oso:++/.```.......```     ");
                    System.out.println("          ....----------------:----------::--.`````-:-:/:--------...:-----::/..--       ```````     ");
                    System.out.println("          `..-----:-----------:---------::-.````````-::/------------::------:--:-                   ");
                    System.out.println("           ..--------::-------:--------::.```````````:/:----------.:--------:--:-`                  ");
                    System.out.println("           `-.----------------:------:osooo+:..-..```./----------...:-------:--:-`                  ");
                    System.out.println("            ...------:--------:-----:ohyyhhddhs/-..``.------------``.-------:----`                  ");
                    System.out.println("             -.------:--------:-----+/. .yyhd+/sy-```----------:+/:.`.------:----`                  ");
                    System.out.println("             ..------:--------:---:o./o+/hysys``--``---::-----ohhhhho-.-----:--/:`                  ");
                    System.out.println("              -.-:---:------------:/`ooshdhsss  ```.-:/:-----//yh/-/yh+.:---/----                   ");
                    System.out.println("              `--:-------------:-:--`::+sso/:-  ``-:--/-----/--ss+``-yo://-:/---.                   ");
                    System.out.println("               ----------------:-----.-----.`  ``.-``:----..sssso/  -:-//:::--.-`                   ");
                    System.out.println("               .------:---------:----.`-///-````````.:---``.oso::` ``./:/:-:-...                    ");
                    System.out.println("              `-------:---------------......````````--..````:-..````-::/::-:---`                    ");
                    System.out.println("             `-.--::--/----------------.```````````.-```````-:-````.:://:::-.-.                     ");
                    System.out.println("           `.---::::::/-----------------.`````````````````````````./:///:::--`                ```   ");
                    System.out.println("       ``..---:::///:://-::----------:---.````````````````````````:::/:::::--`              ` ```   ");
                    System.out.println("   `...---::::::////////:-::-----------``.`````.:------.``````````:::::-::::-.             `````````");
                    System.out.println("     `..--:::::://////////:/::---------````````:::::////.`````````/::::-:-----`           ``````````");
                    System.out.println("          `````.-/:://///////::--------.````````.....--.````````.:/:/::.-`.-..-`           `````````");
                    System.out.println("                -:::::::///////::------:.````````````````````.-::://:::.-  ``...`       ``` ````````");
                    System.out.println("                ::::``::////////::-----:---.```````````````.:::::///::--.     ```      ```` ````````");
                    System.out.println("                :::`  `///////ss///:---:-..---..````..```  `::::://:::--`         ``````````````````");
                    System.out.println("                -:.-:+sy+///+o:oy+o+/--:-....-/::::::-      .::::/:::--`         ```````````````````");
                    System.out.println("                .-:syhhhho/ohhy//ss/++:::-..-+/:::::/-......`-::::::--.             ````````````````");
                    System.out.println("                 `.syhhyo:``.-/+:-/+--+/s/:-+s:////ohho:::oy-`://:::-.`           ``````````````````");
                    System.out.println("                   -oos:`       ``.....:oys+/s/-:+oyyho//+yd:`:::::-.`         `````````````````````");
                    System.out.println("                   `:/.            `..:o/:oysys./ss-``.-//yd- .`-:-.`        ```````````````````````");
                    System.out.println("                  .//`              `..:oo:/syy:/soo-    `-o- ` `-.`   `    ````````````````````````");
                    System.out.println("                 -o+`                ```./o+-/so:s-+s-      ```  .` ````````````````````````````````");
                    System.out.println("                -oo.                 `````./:.-/-+:`os:  `   `-`  ``````````````````````````````````");
                    System.out.println("               `/o/             `.:://:::`   `````` .sy/``   -/-` ````` ````````````````````````````");
                    System.out.println("                `..           `:++:.``` ```    :: -` -yy+` `:/.`````````````````````````````````````");
                    System.out.println("                 ``         `:+/-  `.-//-`-/    .`+-  /yy+./:`.-` ```````.``````````````````````````");
                    
                    System.out.println("\n   Senko-san, the helpful fox");
					
					System.out.println("\n\n\nRandom ASCII generator(for no particular reason)\n   [\"end\" to exit] [\"9\" for another]");
				            
				
				} else {
					System.out.println("error. - pls fix");
					break;
				}
            } else if(yn.equalsIgnoreCase("end")) {
                break;
            }
		}

		
		sc.close();
	}
	
		// Thank you Stack Overflow; this creates a method to remove the last character of a given String, apparently. 
	public static String removeLastChar(String str) {
	    return removeLastChars(str, 1);
	}
	public static String removeLastChars(String str, int chars) {
	    return str.substring(0, str.length() - chars);
	}
}	



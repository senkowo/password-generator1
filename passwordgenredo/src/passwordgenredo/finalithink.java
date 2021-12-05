package passwordgenredo; 

import java.util.Scanner; 
import java.util.Random; 


									/*      Strengths and weaknesses: 
								     * + The biggest strengths of my program lie in its complexity, ability to adjust complexity
									 *       based on password importance, and relative ease of use. 
									 * + Another strength is its ability to add more characters to the end of password if the 
									 * 		 previous inputs combined weren't long enough to create a secure password. If the 
									 * 		 password is less than 8 characters, another question is asked, and the answer is
									 * 		 altered slightly and then added to the end of the password. So, a secure password
									 *		 is generated every time. 
									 * - I can't really think of any weakness to my program, so perhaps one would be the lack 
									 * 		 of a GUI. If I have A LOT of time on my hands, I might be able to learn how to make 
									 * 		 one in Eclipse IDE or something XD. 
									 *[FIXED!] The main weakness of my program is the necessity to add extra words into the initial name
									 *       to make the password more secure. For example, an input like "git-hub" would result in  
									 *       something like "GtHb8," which isn't very secure. It then becomes necessary to add 
									 *       extra words, like "account" to the end of "git-hub" (git-hub-account) (output: "ccntHbGt243"). 
									 *       To fix this, I might add a checking system to see if the password is less than 8, and 
									 *       if true, add extra letters and numbers based on previous inputs. 
									 *[FIXED!] Another weakness is the last prompt with adding an exclamation point. When I make my passwords,
									 *       I decide whether to put a particular symbol at the end or not using sheer intuition, and 
									 *       that initial decision for my password sticks to my memory. However, for this project, 
									 *       it might be better to use a more logic-based approach to that decision. 
									 */ 

									/* Current issues
									 * - Inputting a single letter (that is also a vowel) for any "root"/sub-word 
									 *   will result in an exception. 
									 * 		There is a fix but with my little experience, it will be very 
									 * 		unoptimized and excruciating to type out. bruh. 
									 * - Inputting a letter for the 1-5 number selection will result in an exception. 
									 * 		Might be fixed if I change the input variable from an int to a String, 
									 * 		then have it checked to see if only numbers 1-5 exists, and if not, prompt
									 * 		an error and re-input. If yes, proceed. Might fix this very soon. 
									 *[FIXED] Perhaps I shouldn't refer to the "identified application/website name"
									 *   as "prefix-root-suffix," but instead, as furthest-devisible, individual 
									 *   word-parts. That might reduce confusion and keep things straight-forward
									 *   for the end-user. However, I would have to rewrite everything :marisad:. 
									 *[COMPLETED] Continue adding onto the completely unnecessary ASCII generator. 
									 * - Having too many vowels in the identified name (like a lot) results in 
									 *   scientific notation(?). (e.g. 1.248956297E9) (fix is rather long). 
									 */ 

									    
	 
									/*    Ways to improve (might make over-complicated): 
									 * 
									 *
									 * 
									 */
									 			 
								    /* etc (note-to-self)
									 * - Copy this into eclipse and git move to main. 
									 * 
									*/ 





public class finalithink
{

	public static void main(String[] args) 
	{
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
		
				// Above declares + assigns key variables. 
				// Below is intro. 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Cirno's Perfect Password Generator (9)"); 
		System.out.println("________________________________________\n");
		System.out.println("First, identify website/application name."); 
		System.out.println("(You can combine multiple words for more security).");
		System.out.println("  (e.g. \"you-tube-account\" instead of just \"you-tube\").\n");

		
		
				// Below prompts for root1, root2, root3, root4, and root5. 
		
		System.out.println("Please enter the first furthest-most divisible word-component (or next divisible sub-word)\n  of the identified name (e.g. \"git\" in \"git-hub-account\") [>10 letters in total reccomended]:"); 
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
			if(root4 != "") {
				root4 = root4.substring(0, 1).toUpperCase() + root4.substring(1);
			}
			if(root3 != "") {
				root3 = root3.substring(0, 1).toUpperCase() + root3.substring(1);
			}
			if(root2 != "") {
				root2 = root2.substring(0, 1).toUpperCase() + root2.substring(1);
			}
			if(root1 != "") {
				root1 = root1.substring(0, 1).toUpperCase() + root1.substring(1);
			}
			
		} else if (numWords == 4) {
			if(root3 != "") {
				root3 = root3.substring(0, 1).toUpperCase() + root3.substring(1);
			}
			if(root2 != "") {
				root2 = root2.substring(0, 1).toUpperCase() + root2.substring(1);
			}
			if(root1 != "") {
				root1 = root1.substring(0, 1).toUpperCase() + root1.substring(1);
			}
			
		} else if (numWords == 3) {
			if(root2 != "") {
				root2 = root2.substring(0, 1).toUpperCase() + root2.substring(1);
			}
			if(root1 != "") {
				root1 = root1.substring(0, 1).toUpperCase() + root1.substring(1);
			}
			
		} else if (numWords == 2) {
			if(root1 != "") {
				root1 = root1.substring(0, 1).toUpperCase() + root1.substring(1);
			}
			
		} else if (numWords == 1) {
			
		} else {
			System.out.println("error. fix pls.");
		}
	
		
		pass = root5+root4+root3+root2+root1; 
		
		
		

		
		
		
		/* Below receives input for account type (integer accType).
		 * Then, converts accType and numVowels from int to two doubles, so can use the Math.pow command. 
		 * Then, does accTypeD(double) ^ numVowelsD(double); assigns to new double variable accVow. 
		*/
		        // If letters are inputted below instead of numbers, it will result in an exception. 
		        // If I change the input variable from an int to a String, I should be able to make a
		        //     system that prompts for a reinput in the case of an incorrect number input OR letter. 
		
		System.out.println("\nWhat type of account will this password be associated with? [#'s 1-5 only]");
		System.out.println("Type 5 if it's for an important or secure account\nType 4 if it's for somewhat personal use\nType 3 if it's for school/educational use\nType 2 if it's for misc use\nType 1 if it's for \"junk\" (not high importance).");
		while(true) {
			accType = sc.nextInt(); 
			sc.nextLine(); 
			if(accType == 1 || accType == 2 || accType == 3 || accType == 4 || accType == 5) {
				double accTypeD = accType; 
				double numVowelsD = numVowels; 
				accVow = Math.pow(accTypeD, numVowelsD); 
				break;
			} else {
				System.out.println("Invalid input, please try again.");
			}
		}
		
		
		// Adds the previous exponential equation's product (accVow) to the end of the "pass" String. 
		// Then removes ".0" from String.
		pass += accVow; 
		pass = pass.replaceAll(" ",""); 
		pass = pass.replaceAll(".0",""); 
		
		
		
		/* If the password is less than 8 letters long, it will prompt for the browser name (or OS name).
		 * Then, it will convert the input to Upper case, and will repeatedly remove letters from the end of 
		 * the inputed browser name (which will later be added to the end of the password), until the necessary 
		 * number of letters in the browser name for the password to be at least 8 letters long--when put at
		 * the end of the password--would be fulfilled. 
		 */
		int passLength = pass.length(); 
		if (passLength <= 7) {
			int numNeededLetters = 7 - passLength; 
			int accTypex = accType; 
			if (accType < 3) {
				accTypex = 0;
			} else if (accType == 3) {
				accTypex = 2;
			} else if (accType == 4) {
				accTypex = 8;
			} else if (accType == 5) {
				accTypex = 12;
			} else {
				System.out.println("error, fix this.");
			}
			System.out.println("\nPlease enter the name of your Browser.\nIf not applicable, enter the OS name.");
			String extraInput = sc.nextLine(); 
			extraInput = extraInput.replace(" ", ""); 
			extraInput = extraInput.toUpperCase(); 
			int browserNum = extraInput.length(); 
			
			/* Furthermore, if the password importance (accType) is set to 3, 4, or 5, the 
			 * browser name that will be added onto the password at the end will not cap out 
			 * at 8 letters (when looking at the password as a whole). 
			 * If accType <= 2, will cap out at 8 letters (8 letter password). 
			 * If accType = 3, will cap out at 10 letters.
			 * If accType = 4, will cap out at 16 letters. 
			 * If accType = 5, will cap out at 20 letters. 
			 * Note that if the password is longer than 8 letters beforehand, it will not go through 
			 * this subscript and therefore, not be limited by a max number of letters. 
			 */
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



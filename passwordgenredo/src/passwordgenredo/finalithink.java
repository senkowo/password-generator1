package passwordgenredo; 

import java.util.Scanner; 
import java.util.Random; 

										/* Current issues
										 * - Inputting a single letter (that is also a vowel) for any "root"/sub-word 
										 *   will result in an exception. 
										 * 		There is a fix but with my little experience, it will be very 
										 * 		unoptimized and excruciating to type out. bruh. 
										 * - Inputting a letter for the 1-5 number selection will result in an exception. 
										 * 		Might be fixed if I change the input variable from an int to a String, 
										 * 		then have it checked to see if only numbers 1-5 exists, and if not, prompt
										 * 		an error and re-input. If yes, proceed. 
										 *[FIXED] Perhaps I shouldn't refer to the "identified application/website name"
										 *   as "prefix-root-suffix," but instead, as furthest-devisible, individual 
										 *   word-parts. That might reduce confusion and keep things straight-forward
										 *   for the end-user. However, I would have to rewrite everything :marisad:. 
										 * - Continue adding onto the completely unnecessary ASCII generator. 
										 * - Having too many vowels in the identified name (like a lot) results in 
										 *   scientific notation(?). (e.g. 1.248956297E9) (fix is rather long). 
										 */ 
										 
										 
										/*    Ways to improve (might make overcomplicated): 
										 *      Add stuff like this:
										 * String sysOs = name of the OS/browser/device. 
                                         * Make sysOs all CAPS. 
                                         * Make sysOs shortened to max 4 or 5 letters, depending on ease of use. 
                                         * Determine based on which is easier to remember. 
                                         * e.g. CHRO < CHROM (Google Chrome). 
                                         * CHROM is obviously easier to remember, so use that. 
                                         * if both options are reasonable, default to max 4 letters. 
                                         * On Scratch, maybe after user string input, display both 4 letter and 5 letter options. Then, let the user select which option is easier to remember and more appropriate. 
                                         * Add sysOs to end of passcode string. 
										 *
										 * sAdd –= number of letters in identified software name
                                         * Compound operator btw
                                         * e.g. lkClsslnkCHROM, 7 letters 
                                         * accType –= 7
                                         * 28561 –= 7 
                                         * sAdd = 28554 
                                         * Add sAdd integer to the end of the password string. 
										 */
										 
										 
									    /* etc 
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
		
				// Below counts the number of variables in the string and stores it in numVowels. 
			
			/* Note: This "for" script below counts the number of vowels in the String; 
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
	
		
		


		/* problem is that if "a" is input for root 3 (or any root for that matter), 
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
		
		
		

		
		
		
		/* Receives input for account type (integer accType).
		 * Then, converts accType and numVowels from int to double, so can use Math.pow command. 
		 * Raises accTypeD(double) to the power of numVowelsD(double); assigns to new double variable accVow. 
		*/
		
		System.out.println("\nWhat type of account will this password be associated with?");
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
		
		
		// Adds "accTypeD to the power of numVowelsD" to the end of the "pass" String. 
		// Then removes ".0" from String.
		pass += accVow; 
		pass = pass.replaceAll(" ",""); 
		pass = pass.replaceAll(".0",""); 
		
		
		System.out.println("\nFinally, do you want an exclamation point at the end of the password? (y/n)\n[if it's an important password, might as well add it!]\n   (probably doesn't make much of a difference from a cybersecurity-perspective though...)");
		while(true) {
			yn = sc.nextLine(); 
			if(yn.equalsIgnoreCase("n")) {
				break;
			} else if(yn.equalsIgnoreCase("y")) {
				pass += "!"; 
				break; 
			} else {
				System.out.println("Invalid input, please try again.");
			}
		}
		
		
		System.out.println("\n\n"+ pass);
		System.out.println("Password Generated.\nSmart Cirno ᗜˬᗜ\n\n[press 9 for secret]");
		
		
		// Completely unnecessary ASCII art generator. 
		
		boolean activationOne = false; 
		boolean activationTwo = false; 
		
		while(true) {
			yn = sc.nextLine(); 
			if(yn.equalsIgnoreCase("9")) {
				Random ran = new Random(); 
				int randomx = ran.nextInt(2); 
				
				if(randomx==0) {
				    activationOne = true; 
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
				    activationOne = true; 
					
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
					System.out.println("placeholder2");
					
					
					
				} else if(randomx==3) {
					System.out.println("placeholder3");
					
					
					
				} else if(randomx==4) {
					System.out.println("placeholder4(this shouldn't happen - fix");
					
					
					
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
}	









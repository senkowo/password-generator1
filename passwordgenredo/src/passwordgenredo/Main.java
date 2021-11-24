package passwordgenredo;

import java.util.Scanner; 

											/* Current issues
											 * - inputting a single letter (that is also a vowel) for a prefix/root/suffix 
											 *   will result in an exception. 
											 * 		There is a fix but with my little experience, it will be very 
											 * 		unoptimized and excruciating to type out. bruh. 
											 * - Perhaps I shouldn't refer to the identified application/website name
											 *   as "prefix-root-suffix," but instead, as the furthest devisible, individual 
											 *   word-parts. That might reduce confusion and keep things straight forward. 
											 *   However, I would have to rewrite everything :marisad: . 
											 */ 

public class Main
{

	public static void main(String[] args) 
	{
		String pass = "";
		String yn = ""; 
		String prefix = ""; 
		String root1 = ""; 
		String root2 = ""; 
		String root3 = ""; 
		String root4 = ""; 
		String root5 = ""; 
		String suffix = ""; 
		int suffixOn = 0; 
		int numVowels = 0;
		int accType = 0; 
		double accVow = 0; 
		
				// Above declares + assigns key variables. 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Cirno's Perfect Password Generator (9)"); 
		System.out.println("________________________________________\n");
		System.out.println("First, identify website/application name."); 
		System.out.println("(You can combine multiple words together into one for more security).");
		System.out.println("  (e.g. \"you-tube-account\" instead of just \"you-tube\").\n");

		
		
				// Below is stating the prefix, root1, root2, root3, root4, root5, and suffix. 
		
		while(true) {
			System.out.println("Does the identified name (as a whole) have a prefix of sorts? (y/n)"); 
			yn = sc.nextLine(); 
			if(yn.equalsIgnoreCase("n")) {
				break; 
			} else if(yn.equalsIgnoreCase("y")) {
				System.out.println("Please input prefix name:");
				prefix = sc.nextLine(); 
				prefix = prefix.replace(" ", "");
				prefix = prefix.toLowerCase(); 
				System.out.println("Prefix: " + "\"" + prefix + "\"" + "\n");
				break; 
			} else {
				System.out.println("\nInvalid input, please try again.\n"); 
			}
		}
		
		System.out.println("Please enter the first root word (or next divisible sub-word) of the identified name:"); 
		root1 = sc.nextLine(); 
		root1 = root1.replace(" ", ""); 
		root1 = root1.toLowerCase(); 
		suffixOn = 6; 
		System.out.println("1st Root: "  + "\"" + root1  + "\"" + "\n");
		
		while(true) {
			System.out.println("Input second root/sub-word? [max 5] (y/n)");
			yn = sc.nextLine(); 
			if(yn.equalsIgnoreCase("n")) {
				break; 	
			} else if(yn.equalsIgnoreCase("y")) {
				System.out.println("Please input second root word:");
				root2 = sc.nextLine(); 
				root2 = root2.replace(" ", ""); 
				root2 = root2.toLowerCase(); 
				suffixOn = 5; 
				System.out.println("Second Root: " + "\"" + root2 + "\"" + "\n");
				
				
				while(true) {
					System.out.println("Input a third root word? [max 5] (y/n)");
					yn = sc.nextLine();
					if(yn.equalsIgnoreCase("n")) {
						break; 
					} else if(yn.equalsIgnoreCase("y")) {
						System.out.println("Please input third root word:");
						root3 = sc.nextLine(); 
						root3 = root3.replace(" ", ""); 
						root3 = root3.toLowerCase(); 
						suffixOn = 4; 
						System.out.println("Third Root: " + "\"" + root3 + "\"" + "\n");
						
						
						while(true) {
							System.out.println("Input a fourth root word? [max 5] (y/n)");
							yn = sc.nextLine();
							if(yn.equalsIgnoreCase("n")) {
								break; 
							} else if(yn.equalsIgnoreCase("y")) {
								System.out.println("Please input fourth root word:");
								root4 = sc.nextLine(); 
								root4 = root4.replace(" ", ""); 
								root4 = root4.toLowerCase(); 
								suffixOn = 3; 
								System.out.println("Fourth Root: " + "\"" + root4 + "\"" + "\n");

								
								while(true) {
									System.out.println("Input a Fifth root word? [max 5] (y/n)");
									yn = sc.nextLine();
									if(yn.equalsIgnoreCase("n")) {
										break; 
									} else if(yn.equalsIgnoreCase("y")) {
										System.out.println("Please input fifth root word:");
										root5 = sc.nextLine(); 
										root5 = root5.replace(" ", ""); 
										root5 = root5.toLowerCase(); 
										suffixOn = 2; 
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
		
		
		while(true) {
			System.out.println("Finally, does the identified name (as a whole) have a suffix of sorts? (y/n)"); 
			yn = sc.nextLine(); 
			if(yn.equalsIgnoreCase("n")) {
				break; 
			} else if(yn.equalsIgnoreCase("y")) {
				System.out.println("Please input suffix name:");
				suffix = sc.nextLine(); 
				suffix = suffix.replace(" ", "");
				suffix = suffix.toLowerCase(); 
				suffixOn = 1; 
				System.out.println("Suffix: " + "\"" + suffix + "\"" + "\n");
				break; 
			} else {
				System.out.println("\nInvalid input, please try again.");
			}
		}
		
		

		
				// Below counts the number of variables in the string and stores it in numVowels, 

		pass = suffix+root5+root4+root3+root2+root1+prefix; 
			/* Note: This "for" script below to count the number of vowels in the String is copied; 
			I don't even know what it means XD. -But it works! */
		for (int i=0 ; i<pass.length(); i++){
	         char ch = pass.charAt(i);
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' ')
	         {
	            numVowels ++;
	         }
		}
		

		
			//Removes all vowels from the sting. 
		prefix = prefix.replaceAll("[aeiouAEIOU]", "");
		root1 = root1.replaceAll("[aeiouAEIOU]", "");
		root2 = root2.replaceAll("[aeiouAEIOU]", "");
		root3 = root3.replaceAll("[aeiouAEIOU]", "");
		root4 = root4.replaceAll("[aeiouAEIOU]", "");
		root5 = root5.replaceAll("[aeiouAEIOU]", "");
		suffix = suffix.replaceAll("[aeiouAEIOU]", "");
		
		


		/* problem is that if "a" is input for root 3 (or any root for that matter), 
		 * it cannot process in the mess that is below. Add a checking system that will 
		 * ignore suffix/root/prefix if "" (?). 
		 */
		
		
				/* Below makes all word-components Camel-case and puts them together in reverse order.
				(probably not optimal) */ 
		
		if(suffixOn == 1) {
			if(root5 != "") {
				root5 = root5.substring(0, 1).toUpperCase() + root5.substring(1);
			}
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
			if(prefix != "") {
				prefix = prefix.substring(0, 1).toUpperCase() + prefix.substring(1);
			}
		} else if (suffixOn == 2) {
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
			if(prefix != "") {
				prefix = prefix.substring(0, 1).toUpperCase() + prefix.substring(1);
			}
		} else if (suffixOn == 3) {
			if(root3 != "") {
				root3 = root3.substring(0, 1).toUpperCase() + root3.substring(1);
			}
			if(root2 != "") {
				root2 = root2.substring(0, 1).toUpperCase() + root2.substring(1);
			}
			if(root1 != "") {
				root1 = root1.substring(0, 1).toUpperCase() + root1.substring(1);
			}
			if(prefix != "") {
				prefix = prefix.substring(0, 1).toUpperCase() + prefix.substring(1);
			}
		} else if (suffixOn == 4) {
			if(root2 != "") {
				root2 = root2.substring(0, 1).toUpperCase() + root2.substring(1);
			}
			if(root1 != "") {
				root1 = root1.substring(0, 1).toUpperCase() + root1.substring(1);
			}
			if(prefix != "") {
				prefix = prefix.substring(0, 1).toUpperCase() + prefix.substring(1);
			}
		} else if (suffixOn == 5) {
			if(root1 != "") {
				root1 = root1.substring(0, 1).toUpperCase() + root1.substring(1);
			}
			if(prefix != "") {
				prefix = prefix.substring(0, 1).toUpperCase() + prefix.substring(1);
			}
		} else if (suffixOn == 6) {
			if(prefix != "") {
				prefix = prefix.substring(0, 1).toUpperCase() + prefix.substring(1);
			}
		} else if (suffixOn == 0) {
			if(prefix != "") {
			}
		}
		
		pass = suffix+root5+root4+root3+root2+root1+prefix; 
		
		
		

		
		
		
		// Figuring out account type (integer accType). 
		
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
		
		
		// Adds 'account-type to the power of num-vowels' to the end of the "pass" String. 
		pass += accVow; 
		pass = pass.replaceAll(" ",""); 
		pass = pass.replaceAll(".0",""); 
		
		
		System.out.println("\nFinally, do you want an exclamation point at the end of the password? (y/n)\n[if it's an important password, might as well add it!]");
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
		
		// Unnecessary ASCII art. 
		
		yn = sc.nextLine(); 
		if(yn.equalsIgnoreCase("9")) {
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
					

		}

		System.out.println("test");



		
		
		

		
		
		
		
		
		
		
		sc.close();
	}
}	

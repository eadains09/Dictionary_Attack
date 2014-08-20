import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Scanner;


public class PasswordCrack {
	
	public static void category1(ArrayList<String> dictionary, ArrayList<String> hashes)
	{
		ArrayList<String> dictionaryHashes = new ArrayList<String>();
		ArrayList<String> hashesTranslation = new ArrayList<String>();
		String currHash;
		int foundCount=0;
		
		//iterating through dictionary, converting to hash and adding to hash file and copy of dictionary file
		for (String s: dictionary)
		{
			hashesTranslation.add(s);
			currHash = toMD5(s);//hash s to md5
			dictionaryHashes.add(currHash);
		}
		
		for (int i=0; i<hashes.size(); i++)
		{
			for (int k=0; k<dictionaryHashes.size(); k++)
			{
				if (hashes.get(i).equals(dictionaryHashes.get(k)))
				{
					System.out.println(hashesTranslation.get(k));
					foundCount++;
					dictionaryHashes.remove(k);
					hashesTranslation.remove(k);
					break;
				}
			}
		}
		
		System.out.println(foundCount + " Category 1 hashes found.");
	}//end category1 method
	
	public static void category2(ArrayList<String> dictionary, ArrayList<String> hashes)
	{
		ArrayList<String> dictionaryHashes = new ArrayList<String>();
		ArrayList<String> hashesTranslation = new ArrayList<String>();
		String currWord;
		String currHash;
		int foundCount = 0;
		
		for(String s: dictionary)
		{
			for (int i=0; i<10; i++)
			{
				currWord = s + i;
				hashesTranslation.add(currWord);
				currHash = toMD5(currWord);//Convert word to hash
				dictionaryHashes.add(currHash);
			}
		}
		
		for (int i=0; i<hashes.size(); i++)
		{
			for (int k=0; k<dictionaryHashes.size(); k++)
			{
				if (hashes.get(i).equals(dictionaryHashes.get(k)))
				{
					System.out.println(hashesTranslation.get(k));
					foundCount++;
					dictionaryHashes.remove(k);
					hashesTranslation.remove(k);
					break;
				}
			}
		}
		
		System.out.println(foundCount + " Category 2 hashes found.");
	}//end category2 method
	
	public static void category3(ArrayList<String> dictionary, ArrayList<String> hashes)
	{
		ArrayList<String> dictionaryHashes = new ArrayList<String>();
		ArrayList<String> hashesTranslation = new ArrayList<String>();
		int foundCount = 0;
		
		for(String s: dictionary)
		{
			String currWord;
			String currHash;
			char[] current = s.toCharArray();
			if (s.contains("a"))
			{
				int index = 0;
				while(index < current.length)
				{
					index = s.indexOf('a', index);
					if (index < 0)
					{
						break;
					}else
					{
					current[index] = '4';
					currWord = new String (current);
					currHash = toMD5(currWord);//convert to md5 hash
					dictionaryHashes.add(currHash);
					hashesTranslation.add(currWord);
					current[index] = 'a';
					}
					index++;
				}
			}
			if (s.contains("b"))
			{
				int index = 0;
				while(index < current.length)
				{
					index = s.indexOf('b', index);
					if (index < 0)
					{
						break;
					}else
					{
					current[index] = '8';
					currWord = new String (current);
					currHash = toMD5(currWord);//convert to md5 hash
					dictionaryHashes.add(currHash);
					hashesTranslation.add(currWord);
					current[index] = 'b';
					}
					index++;
				}
			}
			if (s.contains("e"))
			{
				int index = 0;
				while(index < current.length)
				{
					index = s.indexOf('e', index);
					if (index < 0)
					{
						break;
					}else
					{
					current[index] = '3';
					currWord = new String (current);
					currHash = toMD5(currWord);//convert to md5 hash
					dictionaryHashes.add(currHash);
					hashesTranslation.add(currWord);
					current[index] = 'e';
					}
					index++;
				}
			}
			if (s.contains("g"))
			{
				int index = 0;
				while(index < current.length)
				{
					index = s.indexOf('g', index);
					if (index < 0)
					{
						break;
					}else
					{
					current[index] = '6';
					currWord = new String (current);
					currHash = toMD5(currWord);//convert to md5 hash
					dictionaryHashes.add(currHash);
					hashesTranslation.add(currWord);
					current[index] = 'g';
					}
					index++;
				}
			}
			if (s.contains("i"))
			{
				int index = 0;
				while(index < current.length)
				{
					index = s.indexOf('i', index);
					if (index < 0)
					{
						break;
					}else
					{
					current[index] = '1';
					currWord = new String (current);
					currHash = toMD5(currWord);//convert to md5 hash
					dictionaryHashes.add(currHash);
					hashesTranslation.add(currWord);
					current[index] = 'i';
					}
					index++;
				}
			}
			if (s.contains("l"))
			{
				int index = 0;
				while(index < current.length)
				{
					index = s.indexOf('l', index);
					if (index < 0)
					{
						break;
					}else
					{
					current[index] = '1';
					currWord = new String (current);
					currHash = toMD5(currWord);//convert to md5 hash
					dictionaryHashes.add(currHash);
					hashesTranslation.add(currWord);
					current[index] = 'l';
					}
					index++;
				}
			}
			if (s.contains("o"))
			{
				int index = 0;
				while(index < current.length)
				{
					index = s.indexOf('o', index);
					if (index < 0)
					{
						break;
					}else
					{
					current[index] = '0';
					currWord = new String (current);
					currHash = toMD5(currWord);//convert to md5 hash
					dictionaryHashes.add(currHash);
					hashesTranslation.add(currWord);
					current[index] = 'o';
					}
					index++;
				}
			}
			if (s.contains("s"))
			{
				int index = 0;
				while(index < current.length)
				{
					index = s.indexOf('s', index);
					if (index < 0)
					{
						break;
					}else
					{
					current[index] = '5';
					currWord = new String (current);
					currHash = toMD5(currWord);//convert to md5 hash
					dictionaryHashes.add(currHash);
					hashesTranslation.add(currWord);
					current[index] = 's';
					}
					index++;
				}
			}
			if (s.contains("t"))
			{
				int index = 0;
				while(index < current.length)
				{
					index = s.indexOf('t', index);
					if (index < 0)
					{
						break;
					}else
					{
					current[index] = '7';
					currWord = new String (current);
					currHash = toMD5(currWord);//convert to md5 hash
					dictionaryHashes.add(currHash);
					hashesTranslation.add(currWord);
					current[index] = 't';
					}
					index++;
				}
			}
			if (s.contains("z"))
			{
				int index = 0;
				while(index < current.length)
				{
					index = s.indexOf('z', index);
					if (index < 0)
					{
						break;
					}else
					{
					current[index] = '2';
					currWord = new String (current);
					currHash = toMD5(currWord);//convert to md5 hash
					dictionaryHashes.add(currHash);
					hashesTranslation.add(currWord);
					current[index] = 'z';
					}
					index++;
				}
			}
		}
		
		for (int i=0; i<hashes.size(); i++)
		{
			for (int k=0; k<dictionaryHashes.size(); k++)
			{
				if (hashes.get(i).equals(dictionaryHashes.get(k)))
				{
					System.out.println(hashesTranslation.get(k));
					foundCount++;
					dictionaryHashes.remove(k);
					hashesTranslation.remove(k);
					break;
				}
			}
		}
		
		System.out.println(foundCount + " Category 3 hashes found.");
	}//end category3 method
	
	public static void category4(ArrayList<String> dictionary, ArrayList<String> hashes)
	{
		ArrayList<String> dictionaryHashes = new ArrayList<String>();
		ArrayList<String> hashesTranslation = new ArrayList<String>();
		int foundCount = 0;
		
		for(String s: dictionary)
		{
			String currWord;
			String currHash;
			char[] current = s.toCharArray();
			
			for (int i=0; i<current.length; i++)
			{
				current[i] = Character.toUpperCase(current[i]);
				currWord = new String (current);
				hashesTranslation.add(currWord);
				currHash = toMD5(currWord);//Convert word to hash
				dictionaryHashes.add(currHash);
				current[i]=Character.toLowerCase(current[i]);
			}
		}
		
		for (int i=0; i<hashes.size(); i++)
		{
			for (int k=0; k<dictionaryHashes.size(); k++)
			{
				if (hashes.get(i).equals(dictionaryHashes.get(k)))
				{
					System.out.println(hashesTranslation.get(k));
					foundCount++;
					dictionaryHashes.remove(k);
					hashesTranslation.remove(k);
					break;
				}
			}
		}
		
		System.out.println(foundCount + " Category 4 hashes found.");
	}//end category4 method
	
	public static String toMD5(String password)
	//code from http://howtodoinjava.com/2013/07/22/how-to-generate-secure-password-hash-md5-sha-pbkdf2-bcrypt-examples/
	{
		String passwordToHash = password;
		String generatedPassword = null;
		try {
			// Create MessageDigest instance for MD5
			MessageDigest md = MessageDigest.getInstance("MD5");
			//Add password bytes to digest
			md.update(passwordToHash.getBytes());
			//Get the hash's bytes 
			byte[] bytes = md.digest();
			//This bytes[] has bytes in decimal format;
			//Convert it to hexadecimal format
			StringBuilder sb = new StringBuilder();
			for(int i=0; i< bytes.length ;i++)
			{
				sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
			}
			//Get complete hashed password in hex format
			generatedPassword = sb.toString();
		} 
		catch (NoSuchAlgorithmException e) 
		{
			e.printStackTrace();
		}
		
		return generatedPassword;
	}//end toMD5 method
	
	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);
		BufferedReader testFile=null;
		BufferedReader dictionaryFile=null;
		boolean isTestOpen = false;
		boolean isDictionaryOpen = false;
		ArrayList<String> dictionary= new ArrayList<String>();
		ArrayList<String> hashes = new ArrayList<String>();
	
		//Open necessary files
		String testDoc = args[0];
		String dictionaryDoc = "FinalDictionary.txt";
		
		//If user input is desired.
		/*System.out.println("Enter name of test file:");
		String testDoc = in.nextLine();
		System.out.println("Enter name of dictionary file:");
		String dictionaryDoc = in.nextLine();*/
		
		
		while (!isTestOpen)
		{
			try
			{
				testFile = new BufferedReader(new FileReader(testDoc));
				isTestOpen=true;
			}
			catch(IOException e)
			{
				System.out.println("Could not open command-line file. Enter new test doc name: ");
				testDoc = in.nextLine();
			}
		}
		
		while(!isDictionaryOpen)
		{
			try
			{
				dictionaryFile = new BufferedReader(new FileReader(dictionaryDoc));
				isDictionaryOpen=true;
			}
			catch(IOException e)
			{
				System.out.println("Hard coded dictionary file did not open. Please re-enter dictionary file: ");
				dictionaryDoc = in.nextLine();
			}
		}
	
		//Add the test hashes to their array
		try {
			while(testFile.ready())
			{
				String curr = testFile.readLine();
				curr = curr.trim();
				hashes.add(curr);
			}
		} catch (IOException e) {
			//Auto-generated catch block
			e.printStackTrace();
		}
	
		//Add dictionary words to their array
		try {
			while (dictionaryFile.ready())
			{
				String currWord = dictionaryFile.readLine();
				currWord = currWord.trim();
				dictionary.add(currWord);
			}
		} catch (IOException e) {
			//auto-generated catch statement
			e.printStackTrace();
		}
		
		category1(dictionary, hashes);
		category2(dictionary, hashes);
		category4(dictionary, hashes);
		category3(dictionary, hashes);
		
		in.close();
		try {
			testFile.close();
			dictionaryFile.close();
		} catch (IOException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("All categories searched.");
	
	
	} //end main
}//end class

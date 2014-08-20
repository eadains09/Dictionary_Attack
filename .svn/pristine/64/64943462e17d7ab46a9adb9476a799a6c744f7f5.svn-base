import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class converter {	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		BufferedReader pass=null;
		BufferedReader finalFile=null;
		PrintWriter output=null;
		boolean open=false;
		ArrayList<String> dictionary = new ArrayList<String>();

		System.out.println("File?");
		String doc=in.nextLine();
		
		while (!open)
		{
			try
			{
				pass = new BufferedReader (new FileReader(doc));
				output=new PrintWriter(new BufferedWriter(new FileWriter("FinalDictionary.txt", true)));
				finalFile=new BufferedReader (new FileReader("FinalDictionary.txt"));
				open=true;
			}
			catch (IOException e)
			{
				System.out.println("Could not open file. Enter new title:");
				doc=in.nextLine();
			}
		}
		
		try 
		{
			while(finalFile.ready())
			{
				String test=finalFile.readLine();
				if (test.length()>=14)
				{
					dictionary.add(test);
				}
			}
		} catch (IOException e1)
		{
			System.out.println("Error adding to dictionary array.");
		}
		
		System.out.println("out of add block");
		int tracker =0;
		try {
			while(pass.ready())
			{
				String currLine;
				currLine=pass.readLine();
				currLine=currLine.toLowerCase();
				boolean doesContain=false;
				System.out.println(tracker +" "+ currLine);
				
				if (currLine.length()>=14)
				{
				for (int i=0; i<dictionary.size(); i++)
				{
						if (dictionary.get(i).matches(currLine))
						{
							System.out.println("matches");
							doesContain=true;
							break;
						}
						else
						{
							doesContain=false;
						}
				}
				
				if (doesContain==false)
				{
					if (currLine.length()>=5 && currLine.length()<=16)
					{
						if (currLine.endsWith("1")||currLine.endsWith("2")||currLine.endsWith("3")||currLine.endsWith("4")||currLine.endsWith("5")||currLine.endsWith("6")||currLine.endsWith("7")||currLine.endsWith("8")||currLine.endsWith("9")||currLine.endsWith("0"))
						{
							currLine = currLine.substring(0, currLine.length()-1);
							for (int i=0; i<dictionary.size(); i++)
							{
									if (dictionary.get(i).matches(currLine))
									{
										doesContain=true;
										break;
									}
									else
									{
										doesContain=false;
									}
							}
							if (doesContain==false)
							{
								if (currLine.contains("1"))
								{
									doesContain=true;
								}else if(currLine.contains("2"))
								{
									doesContain = true;
								}else if(currLine.contains("3"))
								{
									doesContain = true;
								}else if (currLine.contains("4"))
								{
									doesContain = true;
								}else if (currLine.contains("5"))
								{
									doesContain = true;
								}else if (currLine.contains("6"))
								{
									doesContain = true;
								}else if (currLine.contains("7"))
								{
									doesContain = true;
								}else if (currLine.contains("8"))
								{
									doesContain = true;
								}else if (currLine.contains("9"))
								{
									doesContain = true;
								}else if (currLine.contains("0"))
								{
									doesContain = true;
								}
							}
						}
						if (doesContain == false)
						{
							output.println(currLine);
							output.flush();
							System.out.println("adding to file");
							tracker++;
						}
					}
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Program done.");
	}
}

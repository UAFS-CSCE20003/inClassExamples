package randomAccess;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class UserDB {
	public static final int USERIDSIZE = 4;
	public static final int USERNAMESIZE = 15;
	public static final int PASSWDSIZE = 25;
	User[] users = {new User(1001,"jsmith","pass123"),
			new User(1002,"jjones","pass123456"),
			new User(1003,"mwilson","p123"),
			new User(1004,"gbrandon","pass123567889"),
			new User(1005,"abrown","pass123!@#$%")};
	
	public void writeString(RandomAccessFile raFile,String str, int size) throws IOException {
		StringBuilder sb = new StringBuilder(str);
		sb.setLength(size);
		raFile.writeChars(sb.toString());
	}
	
	public String readString(RandomAccessFile raFile,int size) throws IOException {
		String str;
		char[] array = new char[size];
		int index;
		
		for(index=0;index<size;index++) {
			array[index] = raFile.readChar();
		}
		str = new String(array);
		return str.trim();
	}
	
	public void writeRecord(RandomAccessFile raFile, User user, long location) throws IOException {
		long recordSize = USERIDSIZE + (USERNAMESIZE + PASSWDSIZE) * 2;
		long filePtr = location * recordSize;
		raFile.seek(filePtr);
		raFile.writeInt(user.userID);
		writeString(raFile,user.username,USERNAMESIZE);
		writeString(raFile,user.passwd,PASSWDSIZE);
	}
	
	public User readRecord(RandomAccessFile raFile, long location) throws IOException {
		User user = new User();
		long recordSize = USERIDSIZE + (USERNAMESIZE + PASSWDSIZE) * 2;
		long filePtr = location * recordSize;
		raFile.seek(filePtr);
		user.userID = raFile.readInt();
		user.username = readString(raFile,USERNAMESIZE);
		user.passwd = readString(raFile,PASSWDSIZE);
		return user;
	}
	
	public void run() throws IOException {
		File file = new File("users.dat");
		RandomAccessFile raFile = new RandomAccessFile(file,"rw");
		int index;
		
		for(index=0;index<users.length;index++) {
			writeRecord(raFile,users[index],index);
		}
		
		User user = new User(1111,"dtrump","democrat");
		writeRecord(raFile,user,3);
		
		for(index=0;index<users.length;index++) {
			users[index]=readRecord(raFile,index);
			users[index].show();
		}
		raFile.close();
		

		
		raFile.close();
	}
	
	
}

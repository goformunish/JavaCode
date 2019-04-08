
 class userdtl {
String name,gender;
private int id;
userdtl()
{
	name="Munishghfh";
	gender="na";
	id=53;
}
userdtl(String nm, String g)
{
	name=nm;
	gender=g;
}
void setid(int d)
{
	id=d;
}
int getid()
{
	return id;
}
 }

public class user
{
	public static void main(String[] args) {
		userdtl user1=new userdtl();
		userdtl user4=new userdtl("Munish","Mal");
		userdtl user2=new userdtl();
		System.out.println(user4.gender);
	}
}


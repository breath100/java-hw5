package Java12;
//CStyle.java,此檔案置於 pack6\subpack1\subsubpack 資料夾內
package pack6.subpack1.subsubpack;
public class class02
{
	public int style;

	public class02(int n)
	{
		style=n;
		System.out.println("style"+style);
	}
}
// CCircle.java, 此檔案置於 pack6\subpack1 資料夾內
package pack6.subpack1;
public class CCircle
{
	public void show()
	{
		System.out.println("show() method of class CCircle called");
	}
}
// CRectangle.java, 此檔案置於 pack6\subpack2 資料夾內
package pack6.subpack2;
public class CRectangle
{
	public void show()
	{
		System.out.println("show() method of class CRectangle called");
	}
}
package pack6;
import pack6.subpack1.CCircle;
import pack6.subpack2.CRectangle;
import pack6.subpack1.subsubpack.CStyle;
public class Class08
{
	public static void main(String args[])
	{
		CCircle cir=new CCircle();
		CRectangle rect=new CRectangle();
		class02 sty=new class02(1);
		cir.show();
		rect.show();
	}
}

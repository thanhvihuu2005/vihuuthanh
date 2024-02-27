package bt;

public class test {
public static void main(String[] args) {
	ResizableCircle rs =new ResizableCircle(3);
	System.out.println(rs.getArea());
	rs.resize(10);
	System.out.println(rs.getArea());
}
}

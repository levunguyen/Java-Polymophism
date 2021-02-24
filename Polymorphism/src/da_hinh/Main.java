package da_hinh2;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();

        Person p= new Employee();

        emp.setTen("A");
        emp.setLuong(24);

        p.setTen("B");
//        p.setLuong(25);
//
        emp.thongTin();
        p.thongTin();

        Person p1=new Person();
        p1.thongTin();
    }
}

public class Hello {
    public static void main (String [] args){
        GoodsDAO dao = new GoodsDAO();
        dao.insert();
        dao.update();

        DeptDAO dDao = new DeptDAO();
        dDao.insert();
        System.out.println("Hello World!");
    }
}

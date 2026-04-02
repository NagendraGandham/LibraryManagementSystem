public class Main {
    public static void main(String[] args) {
        //Create Library Items
        Book book1=new Book("Java001","Head First Java","Kathy Sierra");
        Book book2 = new Book("Java002", "Effective Java", "Joshua Bloch");
        Book book3 = new Book("Java003", "Clean Code", "Robert C. Martin");
        Magazine m1=new Magazine("Mag001","AI Evolution",10);
        Magazine m2 = new Magazine("Mag002", "Tech Today", 5);
        Magazine m3 = new Magazine("Mag003", "Science World", 12);

        //Create Users
        Student stRamu=new Student("24Stu00","Ramu");
        Student stAmit = new Student("24Stu001", "Amit");
        Student stSneha = new Student("24Stu002", "Sneha");


        Professor pfKumar=new Professor("EMP001","kumar");
        Professor pfSharma = new Professor("EMP002", "Sharma");
        Professor pfRavi = new Professor("EMP003", "Ravi");


        //Borrow items
        stAmit.borrow(book1);
        stSneha.borrow(m1);//constraint of students on magazine

        pfRavi.borrow(book2);
        pfRavi.borrow(m1);


        //show  Borrowed Items
        stAmit.showBorrowedItems();
        stSneha.showBorrowedItems();
    }
}

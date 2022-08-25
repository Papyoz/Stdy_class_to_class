package code;

public class Main {
    public static void main(String[] args) {
        BOOK B = new BOOK("Война и мир");
        B.book_called();
    }
}
    class BOOK{
        private String title;
        private NAME name;

        {
            title = "Произведение ";
            name = new NAME();
            System.out.println("Создан экземпляр класса author");
        }
        BOOK(){}
        BOOK(String title){
            this.title = this.title + title;
        }

        void book_called(){
            name.book_called();
        }

        class NAME{
            void book_called(){
                System.out.println(title + " под авторством...");
            }
        }
    }

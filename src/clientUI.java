import java.util.Scanner;

public class clientUI {
    // 在Main类中添加
        public static void main(String[] args) {
            Library library = new Library();
            Scanner scanner = new Scanner(System.in);

            while(true) {
                System.out.println("\n1. 添加书籍");
                System.out.println("2. 查看所有书籍");
                System.out.println("3. 查找书籍");
                System.out.println("4. 借阅书籍");
                System.out.println("5. 归还书籍");
                System.out.println("6. 删除书籍");
                System.out.println("7. 修改书籍信息");
                System.out.println("0. 退出");
                System.out.print("请选择: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // 消耗换行符

                if(choice == 0) break;

                switch(choice) {
                    case 1:
                        // 让用户输入书籍信息
                        System.out.print("请输入书籍名称: ");
                        String title = scanner.nextLine();
                        System.out.print("请输入书籍作者: ");
                        String author = scanner.nextLine();
                        System.out.print("请输入书籍价格: ");
                        double price = scanner.nextDouble();
                        Book book = new Book(title, author, price, "ISBN");
                        library.addBook(book);
                        System.out.println("Book added successfully.");
                        break;
                    case 2:
                        library.listAllBooks();
                        System.out.println("Press any key to continue...");
                        scanner.next();
                        break;
                    case 3:
                        // 让用户输入ISBN查找
                        System.out.print("请输入书籍ISBN: ");
                        String isbn = scanner.next();
                        Book foundBook = library.findBookByISBN(isbn);
                        if(foundBook != null) {
                            System.out.println(foundBook);
                            System.out.println("Press any key to continue...");
                            scanner.next();
                            break;
                        }
                        break;

                    case 4:
                        // 让用户输入ISBN借阅
                        System.out.print("请输入书籍ISBN: ");
                        String isbn2 = scanner.next();
                        if(library.borrowBook(isbn2)) {
                            System.out.println("Book borrowed successfully.");
                            System.out.println("Press any key to continue...");
                            scanner.next();
                            break;
                        }
                        break;

                    case 5:
                        // 让用户输入ISBN归还
                        System.out.print("请输入书籍ISBN: ");
                        String isbn3 = scanner.next();
                        library.returnBook(isbn3);
                        System.out.println("Book returned successfully.");
                        System.out.println("Press any key to continue...");
                        scanner.next();
                        break;

                    case 6:
                        // 让用户输入ISBN删除
                        System.out.print("请输入书籍ISBN: ");
                        String isbn4 = scanner.next();
                        Book bookToRemove = library.findBookByISBN(isbn4);
                        if(bookToRemove != null) {
                            library.removeBook(bookToRemove);
                            System.out.println("Book removed successfully.");
                        }
                        System.out.println("Press any key to continue...");
                        scanner.next();
                        break;

                    case 7:
                        // 让用户输入ISBN修改书籍信息
                        System.out.print("请输入书籍ISBN: ");
                        String isbn5 = scanner.next();
                        Book bookToUpdate = library.findBookByISBN(isbn5);
                        if(bookToUpdate != null) {
                            System.out.print("请输入新的书籍名称: ");
                            String title1 = scanner.nextLine();
                            System.out.print("请输入新的书籍作者: ");
                            String author1 = scanner.nextLine();
                            System.out.print("请输入新的书籍价格: ");
                            double price1 = scanner.nextDouble();
                            bookToUpdate.setTitle(title1);
                            bookToUpdate.setAuthor(author1);
                            bookToUpdate.setPrice(price1);
                            System.out.println("Book updated successfully.");
                            System.out.println("Press any key to continue...");
                            scanner.next();
                            break;
                        }
                        break;

                    default:
                        System.out.println("无效的选择！");
                }
            }
            scanner.close();
        }
    }
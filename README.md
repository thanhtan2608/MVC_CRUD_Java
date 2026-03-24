**MVC_CRUD_JAVA**

**📌 Giới thiệu**

Đây là ứng dụng demo mô hình MVC được xây dựng bằng Java theo mô hình MVC (Model – View – Controller).
Ứng dụng cho phép thực hiện các chức năng CRUD (Thêm, xem, sửa, xóa) dữ liệu sản phẩm trong cơ sở dữ liệu.
Giao diện được xây dựng bằng Swing và kết nối cơ sở dữ liệu phpMyAmin thông qua JDBC.

**🏗 Kiến trúc MVC**

View (Swing GUI)->
  Controller->
    Model->
Database (phpMyAmin)

**🛠 Công nghệ sử dụng**

Java,
Swing (GUI),
JDBC,
phpMyAdmin,
IntelliJ IDEA,
Git & GitHub.

**📂 Cấu trúc Project**

src
 ├─ connect
 
 │   └─ conDB.java
 
 ├─ controler
 
 │   └─ productControler.java
 
 ├─ data
 
 │   └─ database.sql
 
 ├─ model
 
 │   └─ product.java
 
 ├─ view
 
 │   └─ viewproduct
 
 │        ├─ viewproduct.java
 
 │        └─ viewproduct.form
 
 └─ Main.java
 
 ├── data
 
 │   └── database.sql

 │
 
 ├── README.md
 
 └── .gitignore


**🗄Cơ sở dữ liệu**

Database: demo1
CREATE TABLE product (
    productId INT AUTO_INCREMENT PRIMARY KEY,
    proName VARCHAR(255),
    oder INT,
    isActive BOOLEAN
);

**✨Chức năng**

Thêm sản phẩm,
Hiển thị danh sách sản phẩm,
Cập nhật sản phẩm,
Xóa sản phẩm,
Hiển thị dữ liệu bằng JTable.

**▶️ Cách chạy project**

**1. Tạo database**

Tạo database demo1 trong phpMyAdmin.

**2. Cấu hình kết nối database**

Sửa trong file: conDB.java

String url = "jdbc:mysql://localhost:3306/demo1";

String user = "root";

String password = "";

**3. Chạy chương trình**

Chạy file:
Main.java

**👨‍💻 Tác giả:**
 Thanh Tấn

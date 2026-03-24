MVC_CRUD_JAVA

**📌 Giới thiệu**

Đây là ứng dụng demo mô hình MVC được xây dựng bằng Java theo mô hình MVC (Model – View – Controller).
Ứng dụng cho phép thực hiện các chức năng CRUD (Thêm, xem, sửa, xóa) dữ liệu sản phẩm trong cơ sở dữ liệu.
Giao diện được xây dựng bằng Swing và kết nối cơ sở dữ liệu MySQL thông qua JDBC.
**🏗 Kiến trúc MVC**

View (Swing GUI)
      ↓
Controller
      ↓
Model
      ↓
Database (MySQL)

**🛠 Công nghệ sử dụng**

Java
Swing (GUI)
JDBC
MySQL
phpMyAdmin
IntelliJ IDEA
Git & GitHub

**Cấu trúc Project**

src
 ├─ connect
 
 │   └─ conDB
 
 ├─ controler
 
 │   └─ productControler
 
 ├─ data
 
 │   └─ database.sql
 
 ├─ model
 
 │   └─ product
 
 ├─ view
 
 │   └─ viewproduct
 
 │        ├─ viewproduct
 
 │        └─ viewproduct.form
 
 └─ Main
 
 ├── data
 
 │   └── database.sql

 │
 
 ├── README.md
 
 └── .gitignore


**Cơ sở dữ liệu**

Database: demo1
CREATE TABLE product (
    product_id INT AUTO_INCREMENT PRIMARY KEY,
    pro_name VARCHAR(255),
    order_num INT,
    active BOOLEAN
);

**Chức năng**

Thêm sản phẩm
Hiển thị danh sách sản phẩm
Cập nhật sản phẩm
Xóa sản phẩm
Hiển thị dữ liệu bằng JTable

**Cách chạy project**

**1. Tạo database**

Tạo database demo1 trong phpMyAdmin.

**2. Cấu hình kết nối database**

Sửa trong file:
DBConnection.java
String url = "jdbc:mysql://localhost:3306/demo1";
String user = "root";
String password = "";

**3. Chạy chương trình**

Chạy file:
Main.java

**👨‍💻 Tác giả**
Thanh Tấn

package controler;

import connect.conDB;
import model.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class productController {

        // CREATE
        public void insertProduct(product p){
            try{

                Connection conn = conDB.getConnection();

                String sql = "INSERT INTO product(proName,oder,isActive) VALUES(?,?,?)";

                PreparedStatement ps = conn.prepareStatement(sql);

                ps.setString(1,p.getProName());
                ps.setInt(2,p.getOder());
                ps.setBoolean(3,p.getActive());

                ps.executeUpdate();

                System.out.println("Insert thành công");

            }catch(Exception e){
                e.printStackTrace();
            }
        }

        // READ (Lấy tất cả product)
        public List<product> getAllProducts(){

            List<product> list = new ArrayList<>();

            try{

                Connection conn = conDB.getConnection();

                String sql = "SELECT * FROM product";

                Statement st = conn.createStatement();

                ResultSet rs = st.executeQuery(sql);

                while(rs.next()){

                    product p = new product(
                            rs.getInt("productId"),
                            rs.getString("proName"),
                            rs.getInt("oder"),
                            rs.getBoolean("isActive")
                    );

                    list.add(p);
                }

            }catch(Exception e){
                e.printStackTrace();
            }

            return list;
        }

        // UPDATE
        public void updateProduct(product p){

            try{

                Connection conn = conDB.getConnection();

                String sql = "UPDATE product SET proName=?,oder=?,isActive=? WHERE productId=?";

                PreparedStatement ps = conn.prepareStatement(sql);

                ps.setString(1,p.getProName());
                ps.setInt(2,p.getOder());
                ps.setBoolean(3,p.getActive());
                ps.setInt(4,p.getProductId());

                ps.executeUpdate();

                System.out.println("Update thành công");

            }catch(Exception e){
                e.printStackTrace();
            }

        }

        // DELETE
        public void deleteProduct(int id){

            try{

                Connection conn = conDB.getConnection();

                String sql = "DELETE FROM product WHERE productId=?";

                PreparedStatement ps = conn.prepareStatement(sql);

                ps.setInt(1,id);

                ps.executeUpdate();

                System.out.println("Delete thành công");

            }catch(Exception e){
                e.printStackTrace();
            }

        }

    }

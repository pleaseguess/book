package com.standalone.jdbc;

import java.sql.*;

/**
 * TODO JDBC连接数据库
 * 2019/1/30 17:22
 */
public class MysqlDemo {
    //JDBC驱动名称和数据库URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://47.98.111.76:3306/taotao";

    //用户名和密码
    static final String USER = "root";
    static final String PASSWORD = "123456";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        try {
            Class.forName(JDBC_DRIVER);

            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);

            System.out.println("初始化statement...");
            stat = conn.createStatement();
            String sql = "select id,title,price from tb_item where id = '536563'";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("title"));
                System.out.println(rs.getString("price"));
            }
            rs.close();
            stat.close();
            conn.close();
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stat!=null) stat.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }


}

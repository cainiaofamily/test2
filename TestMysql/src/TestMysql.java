import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement;  
import java.util.ArrayList;
import java.util.List;
  
public class TestMysql {  
    // 创建静态全局变量  
    static Connection conn;  
  
    static Statement st;  
  
 
    /* 查询数据库，输出符合要求的记录的情况*/  
    public static void query() {  
          
        conn = getConnection(); //同样先要获取连接，即连接到数据库  
        try {  
            String sql = "select * from news";     // 查询数据的sql语句  
            st = (Statement) conn.createStatement();    //创建用于执行静态sql语句的Statement对象，st属局部变量  
              
            ResultSet rs = st.executeQuery(sql);    //执行sql查询语句，返回查询数据的结果集  
            System.out.println("最后的查询结果为：");  
            
            List<News> list = new ArrayList<News>();
            
            
            while (rs.next()) { // 判断是否还有下一个数据  
               
            	News news = new News();
            	news.setId(rs.getInt(1));
            	news.setTitles(rs.getString(2));
            	news.setContent(rs.getString(3));
            	news.setAuthor(rs.getString(4));
            	news.setHits(rs.getInt(5));
            	news.setItemid(rs.getInt(6));
            	list.add(news);
            	
            }  
            for(News news:list){
            	System.out.println(news.getId()+"");
            	System.out.println(news.getTitles()+"");
            	System.out.println(news.getContent()+"");
            	System.out.println(news.getAuthor()+"");
            	System.out.println(news.getHits()+"");
            	System.out.println(news.getItemid()+"");          	
            }
            
            conn.close();   //关闭数据库连接  
              
        } catch (SQLException e) {  
            System.out.println("查询数据失败");  
        }  
    }  
  
    
      
    /* 获取数据库连接的函数*/  
    public static Connection getConnection() {  
        Connection con = null;  //创建用于连接数据库的Connection对象  
        try {  
            Class.forName("com.mysql.jdbc.Driver");// 加载Mysql数据驱动  
              
            con = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/test1", "root", "123456789");// 创建数据连接  
              
        } catch (Exception e) {  
            System.out.println("数据库连接失败" + e.getMessage());  
        }  
        return con; //返回所建立的数据库连接  
    }  
}  
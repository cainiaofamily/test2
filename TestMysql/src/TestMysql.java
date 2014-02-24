import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement;  
import java.util.ArrayList;
import java.util.List;
  
public class TestMysql {  
    // ������̬ȫ�ֱ���  
    static Connection conn;  
  
    static Statement st;  
  
 
    /* ��ѯ���ݿ⣬�������Ҫ��ļ�¼�����*/  
    public static void query() {  
          
        conn = getConnection(); //ͬ����Ҫ��ȡ���ӣ������ӵ����ݿ�  
        try {  
            String sql = "select * from news";     // ��ѯ���ݵ�sql���  
            st = (Statement) conn.createStatement();    //��������ִ�о�̬sql����Statement����st���ֲ�����  
              
            ResultSet rs = st.executeQuery(sql);    //ִ��sql��ѯ��䣬���ز�ѯ���ݵĽ����  
            System.out.println("���Ĳ�ѯ���Ϊ��");  
            
            List<News> list = new ArrayList<News>();
            
            
            while (rs.next()) { // �ж��Ƿ�����һ������  
               
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
            
            conn.close();   //�ر����ݿ�����  
              
        } catch (SQLException e) {  
            System.out.println("��ѯ����ʧ��");  
        }  
    }  
  
    
      
    /* ��ȡ���ݿ����ӵĺ���*/  
    public static Connection getConnection() {  
        Connection con = null;  //���������������ݿ��Connection����  
        try {  
            Class.forName("com.mysql.jdbc.Driver");// ����Mysql��������  
              
            con = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/test1", "root", "123456789");// ������������  
              
        } catch (Exception e) {  
            System.out.println("���ݿ�����ʧ��" + e.getMessage());  
        }  
        return con; //���������������ݿ�����  
    }  
}  

	public static String[][] getTable()
	{
		String[][] table= null;
		String[] attr={"SNO","SNAME","ADRESS","PHONE","WECHAT","EMAIL","QQ","WORDS"};
		String sql= "select * from StuList";
		int k=8;
		Connection conn=null;
		Statement stmt = null;
		ResultSet rs,rs1=null;
		String url = "jdbc:sqlite:./StudentList.db";
		try
		{
			try {
				Class.forName("org.sqlite.JDBC");
			} catch (ClassNotFoundException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			rs=stmt.executeQuery(sql);
			int sample = 0;
		    while (rs.next())
		    {
		    	sample++;
		    }
		    table=new String[sample][k];
		    rs = stmt.executeQuery(sql);
		    for (int i = 0; rs.next(); i++)
		    {
		    		int j=0;
	                for(;j<k;j++)
	                	table[i][j]=rs.getString(attr[j]);
	        }
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
			System.out.println("数据库连接失败");
		}
		finally
		{
			try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
			try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
		return table;
	}
	
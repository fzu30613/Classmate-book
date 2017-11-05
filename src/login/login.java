
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
	public void makeInsert(String[] a) throws SQLException
	{
		int k=8;
		String sql= "INSERT INTO StuList(SNO,SNAME,ADRESS,PHONE,WECHAT,EMAIL,QQ,WORDS) VALUES (?,?,?,?,?,?,?,?);";
		Connection conn=null;
		PreparedStatement pstmt = null;
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
			try {
			   pstmt = conn.prepareStatement(sql);
			   for(int i=0;i<8;i++)
			   {
				   if(i<a.length)
				   pstmt.setString(i+1,a[i]);
				   else
					   pstmt.setString(i+1,"");
			   }
			   int rows = pstmt.executeUpdate();
			   System.out.println("Rows impacted : " + rows );
			}
			catch (SQLException e) {
				e.printStackTrace();
				System.out.println("数据库插入失败");
			}
			finally {
				if(pstmt!=null)
		            pstmt.close();
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
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
	}
	public void makeDelete(String[] a) throws SQLException
	{
		String sql= "DELETE FROM StuList WHERE SNO=?";
		int k=1;
		Connection conn=null;
		PreparedStatement pstmt = null;
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
			try {
			   pstmt = conn.prepareStatement(sql);
			   for(int i=0;i<k;i++)
			   {
				   pstmt.setString(i+1,a[i]);
			   }
			   int rows = pstmt.executeUpdate();
			   System.out.println("Rows impacted : " + rows );
			}
			catch (SQLException e) {
				e.printStackTrace();
				System.out.println("数据库删除失败");
			}
			finally {
				if(pstmt!=null)
		            pstmt.close();
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
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
	}
	public static String[][] makeSelect(String[] a)
	{
		String[][] table= null;
		String[] attr={"SNO","SNAME","ADRESS","PHONE","WECHAT","EMAIL","QQ","WORDS"};
		String sql= "select * from StuList where SNO like ?1 and SNAME like ?2 and ADRESS like ?4 and PHONE like ?5 and WECHAT like ?6 and EMAIL like ?7 and QQ like ?6 and WORDS like ?8";
		int k=8;
		Connection conn=null;
		PreparedStatement pstmt = null;
		Statement stmt=null;
		ResultSet rs=null;
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
			String tmp=sql;
			for(int i=1;i<=k;i++)
			{
				String b="?"+i;
				if(i>=10) b="?"+(char)((int)('a')+i-10);
				if(a[i-1].equals("")) tmp=tmp.replace(b,"'%'");
				else
				tmp=tmp.replace(b,"'"+a[i-1]+"'");
			}
			System.out.println(tmp+'\n');
			pstmt=conn.prepareStatement(tmp);
			rs=pstmt.executeQuery();
			int sample = 0;
		    while (rs.next())
		    {
		    	sample++;
		    }
		    table=new String[sample][k];
		    rs=pstmt.executeQuery();
		    for (int i = 0;rs.next(); i++)
		    {
		    		int j=0;
	                for(;j<k;j++)
	                {
	                	table[i][j]=rs.getString(attr[j]);
	                }               
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
		         if(pstmt!=null)
		            pstmt.close();
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
	





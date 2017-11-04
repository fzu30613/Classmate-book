package login;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;


public class login 
{
	public static void main(String args[])
	{
		new ex().setVisible(true);
	}
}
class chaxunjieguo extends JDialog{
	public chaxunjieguo(String[] str ,String[][] str1){
		Container container = getContentPane();
		container.setLayout(null);
		DefaultTableModel biaomodel = new DefaultTableModel(str1,str);
		JTable biao = new JTable(biaomodel);
		JTableHeader tou = biao.getTableHeader();
		tou.setBounds(5, 3, 800, 20);
		biao.setBounds(5,23,800,500);
		container.add(biao);
		container.add(tou);
		setSize(820,530);
	}
}
class ex extends JDialog{
	public ex(){
		super();
		Container container = getContentPane();
		container.setLayout(null);
		ImageIcon background = new ImageIcon("background.jpg");
		JLabel backgrounde = new JLabel(background);
		backgrounde.setSize(1100,619);
		container.add(backgrounde);
		JTabbedPane xianshi = new JTabbedPane();
		xianshi.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
		ImageIcon imageIcon = new ImageIcon("tab.jpg");
		JLabel tb1 = new JLabel();
		xianshi.addTab("同学", imageIcon,tb1,"同学");
		xianshi.setBounds(10,20,500,530);
		backgrounde.add(xianshi);
		JComboBox chazhaoliebiao = new JComboBox();
		chazhaoliebiao.addItem("同学");
		chazhaoliebiao.setBounds(850,80,80,30);
		String[] changshangtou = {"学号","姓名","家庭住址","电话","微信","邮箱","QQ","个性语言"};
		String[][] changshangshuju = getTable();		//此处应有数据库
		DefaultTableModel changshangmodel = new DefaultTableModel(changshangshuju,changshangtou);
		JTable changshangbiao = new JTable(changshangmodel);
		changshangbiao.setBounds(3,20,495,500);
		JTableHeader changshangbiaotou = changshangbiao.getTableHeader();
		changshangbiaotou.setBounds(3,0,changshangbiao.getWidth(),20);
		tb1.add(changshangbiaotou);
		tb1.add(changshangbiao);
		//查找部分
		JComboBox xiugailiebiao = new JComboBox();
		JButton xiugai = new JButton("修改");
		JButton xiugaitijiao = new JButton("修改");
		JButton chazhao = new JButton("查找");
		chazhao.setBounds(850, 30, 80, 30);
		JTextField jt21 = new JTextField("",20);
		JTextField jt22 = new JTextField("",20);
		JTextField jt23 = new JTextField("",20);
		JTextField jt24 = new JTextField("",20);
		JTextField jt25 = new JTextField("",20);
		JTextField jt26 = new JTextField("",20);
		JTextField jt27 = new JTextField("",20);
		JTextField jt28 = new JTextField("",20);
		jt21.setBounds(850,130,80,30);
		jt22.setBounds(850,180,80,30);
		jt23.setBounds(850,230,80,30);
		jt24.setBounds(850,280,80,30);
		jt25.setBounds(850,330,80,30);
		jt26.setBounds(850,380,80,30);
		jt27.setBounds(850,430,80,30);
		jt28.setBounds(850,480,80,30);
		JLabel jl21 = new JLabel("");
		JLabel jl22 = new JLabel("");
		JLabel jl23 = new JLabel("");
		JLabel jl24 = new JLabel("");
		JLabel jl25 = new JLabel("");
		JLabel jl26 = new JLabel("");
		JLabel jl27 = new JLabel("");
		JLabel jl28 = new JLabel("");
		jl21.setBounds(850,110,80,20);
		jl22.setBounds(850,160,80,20);
		jl23.setBounds(850,210,80,20);
		jl24.setBounds(850,260,80,20);
		jl25.setBounds(850,310,80,20);
		jl26.setBounds(850,360,80,20);
		jl27.setBounds(850,410,80,20);
		jl28.setBounds(850,460,80,20);
		JButton chazhaotijiao = new JButton("提交");
		chazhaotijiao.setBounds(950,480,80,30);
		//删除部分
		JButton shanchu = new JButton("删除");
		shanchu.setBounds(700, 30, 80, 30);
		JLabel xxx = new JLabel("");
		xxx.setBounds(620, 540, 80, 30);
		JTextField xxxx = new JTextField("",20);
		xxxx.setBounds(700,540,80,30);
		backgrounde.add(xxx);
		backgrounde.add(xxxx);
		JButton daochu = new JButton("导出");
		daochu.setBounds(700, 500, 80, 30);
		daochu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String road = xxxx.getText();
				xxxx.setText("");
				String[][] changshangshuju =getTable();
				new ExportExcel(changshangshuju,road);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
			});
		backgrounde.add(daochu);
		JComboBox shanchuliebiao = new JComboBox();
		shanchuliebiao.addItem("同学");
		shanchuliebiao.setBounds(700, 80, 80, 30);
		JButton tianjia = new JButton("添加");
		tianjia.setBounds(550, 30, 80, 30);
		JComboBox tianjialiebiao = new JComboBox();
		tianjialiebiao.addItem("同学");
		tianjialiebiao.setBounds(550, 80, 80, 30);
		JTextField jt1 = new JTextField("",20);
		jt1.setBounds(550,130,80,30);
		JTextField jt2 = new JTextField("",20);
		jt2.setBounds(550,180,80,30);
		JTextField jt3 = new JTextField("",20);
		jt3.setBounds(550, 230, 80, 30);
		JTextField jt4 = new JTextField("",20);
		jt4.setBounds(550, 280, 80, 30);
		JTextField jt5 = new JTextField("",20);
		jt5.setBounds(550, 330, 80, 30);
		JTextField jt6 = new JTextField("",20);
		jt6.setBounds(550, 380, 80, 30);
		JTextField jt7 = new JTextField("",20);
		jt7.setBounds(550, 430, 80, 30);
		JTextField jt8 = new JTextField("",20);
		jt8.setBounds(550, 480, 80, 30);
		JLabel jl1 = new JLabel("");
		JLabel jl2 = new JLabel("");
		JLabel jl3 = new JLabel("");
		JLabel jl4 = new JLabel("");
		JLabel jl5 = new JLabel("");
		JLabel jl6 = new JLabel("");
		JLabel jl7 = new JLabel("");
		JLabel jl8 = new JLabel("");
		jl1.setBounds(550, 110, 100, 20);
		jl2.setBounds(550, 160, 100, 20);
		jl3.setBounds(550, 210, 100, 20);
		jl4.setBounds(550, 260, 100, 20);
		jl5.setBounds(550, 310, 100, 20);
		jl6.setBounds(550, 360, 100, 20);
		jl7.setBounds(550, 410, 100, 20);
		jl8.setBounds(550, 460, 100, 20);
		JButton tijiaotianjia = new JButton("提交");
		tijiaotianjia.setBounds(550, 530, 80, 30);
		tijiaotianjia.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					String a0=jt1.getText()+","+jt2.getText()+","+jt3.getText()+","+jt4.getText()+","+jt5.getText()+","+jt6.getText()+","+jt7.getText()+","+jt8.getText();
					String[] a=a0.split(",");
					try {
						makeInsert(a);
					} catch (SQLException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
					/*String格式 jt1.getText()为商号，···2.···厂名，3 地址 4 联系方式5备注*/
					
					
					String[][] changshangshuju =getTable();//////
					
					
					changshangmodel.setDataVector(changshangshuju, changshangtou);
					changshangbiao.repaint();
				
				
			}
		});
		tianjialiebiao.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==1){
					backgrounde.remove(jt1);
					backgrounde.remove(jt2);
					backgrounde.remove(jt3);
					backgrounde.remove(jt4);
					backgrounde.remove(jt5);
					backgrounde.remove(jt6);
					backgrounde.remove(jt7);
					backgrounde.remove(jt8);
					backgrounde.remove(jl1);
					backgrounde.remove(jl2);
					backgrounde.remove(jl3);
					backgrounde.remove(jl4);
					backgrounde.remove(jl5);
					backgrounde.remove(jl6);
					backgrounde.remove(jl7);
					backgrounde.remove(jl8);
					jl1.setText("");
					jl2.setText("");
					jl3.setText("");
					jl4.setText("");
					jl5.setText("");
					jl6.setText("");
					jl7.setText("");
					jl8.setText("");
					jt1.setText("");
					jt2.setText("");
					jt3.setText("");
					jt4.setText("");
					jt5.setText("");
					jt6.setText("");
					jt7.setText("");
					jt8.setText("");
					
					
						jl1.setText("学号");
						jl2.setText("姓名");
						jl3.setText("家庭住址");
						jl4.setText("电话");
						jl5.setText("微信");
						jl6.setText("邮箱");
						jl7.setText("QQ");
						jl8.setText("个性语言");
						backgrounde.add(jl1);
						backgrounde.add(jl2);
						backgrounde.add(jl3);
						backgrounde.add(jl4);
						backgrounde.add(jl5);
						backgrounde.add(jl6);
						backgrounde.add(jl7);
						backgrounde.add(jl8);
						
						backgrounde.add(jt1);
						backgrounde.add(jt2);
						backgrounde.add(jt3);
						backgrounde.add(jt4);
						backgrounde.add(jt5);
						backgrounde.add(jt6);
						backgrounde.add(jt7);
						backgrounde.add(jt8);
						backgrounde.repaint();
					
				}
			}
		});
		JTextField jt11 = new JTextField("",20);
		JTextField jt12 = new JTextField("",20);
		JTextField jt13 = new JTextField("",20);
		JTextField jt14 = new JTextField("",20);
		JTextField jt15 = new JTextField("",20);
		JTextField jt16 = new JTextField("",20);
		JTextField jt17 = new JTextField("",20);
		JTextField jt18 = new JTextField("",20);
		jt11.setBounds(700,130,80,30);
		jt12.setBounds(700,180,80,30);
		jt13.setBounds(700,230,80,30);
		jt14.setBounds(700,280,80,30);
		jt15.setBounds(700,330,80,30);
		jt16.setBounds(700,380,80,30);
		jt17.setBounds(700,430,80,30);
		jt18.setBounds(800,380,80,30);
		JLabel jl11 = new JLabel("");
		JLabel jl12 = new JLabel("");
		JLabel jl13 = new JLabel("");
		JLabel jl14 = new JLabel("");
		JLabel jl15 = new JLabel("");
		JLabel jl16 = new JLabel("");
		JLabel jl17 = new JLabel("");
		JLabel jl18 = new JLabel("");
		jl11.setBounds(700,110,80,20);
		jl12.setBounds(700,160,80,20);
		jl13.setBounds(700,210,80,20);
		jl14.setBounds(700,260,80,20);
		jl15.setBounds(700,310,80,20);
		jl16.setBounds(700,360,80,20);
		jl17.setBounds(700,410,80,20);
		jl18.setBounds(800,360,80,20);
		JButton shanchutijiao = new JButton("提交");
		shanchutijiao.setBounds(800, 430, 80, 30);
		shanchuliebiao.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==1){
					backgrounde.remove(jt11);
					backgrounde.remove(jt12);
					backgrounde.remove(jt13);
					backgrounde.remove(jt14);
					backgrounde.remove(jt15);
					backgrounde.remove(jt16);
					backgrounde.remove(jt17);
					backgrounde.remove(jt18);
					backgrounde.remove(jl12);
					backgrounde.remove(jl13);
					backgrounde.remove(jl14);
					backgrounde.remove(jl15);
					backgrounde.remove(jl16);
					backgrounde.remove(jl17);
					backgrounde.remove(jl18);
					backgrounde.remove(jl11);
					
					jt11.setText("");
					jt12.setText("");
					jt13.setText("");
					jt14.setText("");
					jt15.setText("");
					jt16.setText("");
					jt17.setText("");
					jt18.setText("");
					jl11.setText("");
					jl12.setText("");
					jl13.setText("");
					jl14.setText("");
					jl15.setText("");
					jl16.setText("");
					jl17.setText("");
					jl18.setText("");
					backgrounde.add(shanchutijiao);
					
						jl11.setText("学号");
						backgrounde.add(jl11);
						backgrounde.add(jt11);
						backgrounde.repaint();
					
				}
			}
		});
		shanchutijiao.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println(shanchuliebiao.getSelectedItem());
				
					String a0=jt11.getText()+",";
					String[] a=a0.split(",");
					try {
						makeDelete(a);
					} catch (SQLException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
					/*jt11.getText()商号*/
					
					
					String[][] changshangshuju =getTable();
					
					changshangmodel.setDataVector(changshangshuju, changshangtou);
					changshangbiao.repaint();
				
			}
		});
		shanchu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				backgrounde.remove(xiugaitijiao);
				backgrounde.remove(xiugailiebiao);
				backgrounde.remove(jt12);
				backgrounde.remove(jt13);
				backgrounde.remove(jt14);
				backgrounde.remove(jt15);
				backgrounde.remove(jt16);
				backgrounde.remove(jt17);
				backgrounde.remove(jt18);
				backgrounde.remove(jl12);
				backgrounde.remove(jl13);
				backgrounde.remove(jl14);
				backgrounde.remove(jl15);
				backgrounde.remove(jl16);
				backgrounde.remove(jl17);
				backgrounde.remove(jl18);
				backgrounde.remove(jt21);
				backgrounde.remove(jt22);
				backgrounde.remove(jt23);
				backgrounde.remove(jt24);
				backgrounde.remove(jt25);
				backgrounde.remove(jt26);
				backgrounde.remove(jt27);
				backgrounde.remove(jt28);
				backgrounde.remove(jl21);
				backgrounde.remove(jl22);
				backgrounde.remove(jl23);
				backgrounde.remove(jl24);
				backgrounde.remove(jl25);
				backgrounde.remove(jl26);
				backgrounde.remove(jl27);
				backgrounde.remove(jl28);
				backgrounde.remove(chazhaotijiao);
				backgrounde.remove(chazhaoliebiao);
				backgrounde.remove(tianjialiebiao);
				backgrounde.remove(jl8);
				backgrounde.remove(jl7);
				backgrounde.remove(jl6);
				backgrounde.remove(jl5);
				backgrounde.remove(jl4);
				backgrounde.remove(jl3);
				backgrounde.remove(jl2);
				backgrounde.remove(jl1);
				backgrounde.remove(jt1);
				backgrounde.remove(jt2);
				backgrounde.remove(jt3);
				backgrounde.remove(jt4);
				backgrounde.remove(jt5);
				backgrounde.remove(jt6);
				backgrounde.remove(jt7);
				backgrounde.remove(jt8);
				backgrounde.remove(tijiaotianjia);
				jl11.setText("学号");
				backgrounde.add(shanchuliebiao);
				backgrounde.add(jl11);
				backgrounde.add(jt11);
				backgrounde.add(shanchutijiao);
				backgrounde.repaint();
			}
		});
		backgrounde.add(shanchu);
		tianjia.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				backgrounde.add(tianjialiebiao);
				backgrounde.repaint();
				tianjialiebiao.setSelectedItem("同学");
				jl1.setText("学号");
				jl2.setText("姓名");
				jl3.setText("家庭住址");
				jl4.setText("电话");
				jl5.setText("微信");
				jl6.setText("邮箱");
				jl7.setText("QQ");
				jl8.setText("个性语言");
				backgrounde.remove(xiugaitijiao);
				backgrounde.remove(xiugailiebiao);
				backgrounde.remove(jt21);
				backgrounde.remove(jt22);
				backgrounde.remove(jt23);
				backgrounde.remove(jt24);
				backgrounde.remove(jt25);
				backgrounde.remove(jt26);
				backgrounde.remove(jt27);
				backgrounde.remove(jt28);
				backgrounde.remove(jl21);
				backgrounde.remove(jl22);
				backgrounde.remove(jl23);
				backgrounde.remove(jl24);
				backgrounde.remove(jl25);
				backgrounde.remove(jl26);
				backgrounde.remove(jl27);
				backgrounde.remove(jl28);
				backgrounde.remove(chazhaotijiao);
				backgrounde.remove(chazhaoliebiao);
				backgrounde.remove(jt11);
				backgrounde.remove(jt12);
				backgrounde.remove(jt13);
				backgrounde.remove(jt14);
				backgrounde.remove(jt15);
				backgrounde.remove(jt16);
				backgrounde.remove(jt17);
				backgrounde.remove(jt18);
				backgrounde.remove(jl11);
				backgrounde.remove(jl12);
				backgrounde.remove(jl13);
				backgrounde.remove(jl14);
				backgrounde.remove(jl15);
				backgrounde.remove(jl16);
				backgrounde.remove(jl17);
				backgrounde.remove(jl18);
				backgrounde.remove(shanchutijiao);
				backgrounde.remove(shanchuliebiao);
				backgrounde.remove(jl6);
				backgrounde.remove(jt6);
				backgrounde.add(tijiaotianjia);
				backgrounde.add(jl1);
				backgrounde.add(jl2);
				backgrounde.add(jl3);
				backgrounde.add(jl4);
				backgrounde.add(jt1);
				backgrounde.add(jt2);
				backgrounde.add(jt3);
				backgrounde.add(jt4);
				backgrounde.add(jt5);
				backgrounde.add(jl5);
				backgrounde.add(jt6);
				backgrounde.add(jl6);
				backgrounde.add(jt7);
				backgrounde.add(jl7);
				backgrounde.add(jt8);
				backgrounde.add(jl8);
				backgrounde.repaint();
			}
		});
		
		//查找
		backgrounde.add(chazhao);
		chazhaotijiao.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
					String[] a={jt21.getText(),jt22.getText(),jt23.getText(),jt24.getText(),jt25.getText(),jt26.getText(),jt27.getText(),jt28.getText()};
					/*jt21.getText()商号2厂名3地址4联系方式5备注*/
					String[] str = {"学号","姓名","家庭住址","电话","微信","邮箱","QQ","个性语言"};
					
					
					String[][] str1 =makeSelect(a);///////查找提交
					
					new chaxunjieguo(str,str1).setVisible(true);
				
			}
		});
		chazhao.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jl21.setText("学号");
				jl22.setText("姓名");
				jl23.setText("家庭住址");
				jl24.setText("电话");
				jl25.setText("微信");
				jl26.setText("邮箱");
				jl27.setText("QQ");
				jl28.setText("个性语言");
				backgrounde.remove(xiugaitijiao);
				backgrounde.remove(xiugailiebiao);
				backgrounde.add(jl21);
				backgrounde.add(jl22);
				backgrounde.add(jl23);
				backgrounde.add(jl24);
				backgrounde.add(jl25);
				backgrounde.add(jl26);
				backgrounde.add(jl27);
				backgrounde.add(jl28);
				backgrounde.add(jt21);
				backgrounde.add(jt22);
				backgrounde.add(jt23);
				backgrounde.add(jt24);
				backgrounde.add(jt25);
				backgrounde.add(jt26);
				backgrounde.add(jt27);
				backgrounde.add(jt28);
				backgrounde.add(chazhaotijiao);
				backgrounde.add(chazhaoliebiao);
				backgrounde.remove(tianjialiebiao);
				backgrounde.remove(jl1);
				backgrounde.remove(jl2);
				backgrounde.remove(jl3);
				backgrounde.remove(jl4);
				backgrounde.remove(jl5);
				backgrounde.remove(jl6);
				backgrounde.remove(jl7);
				backgrounde.remove(jl8);
				backgrounde.remove(tijiaotianjia);
				backgrounde.remove(jt1);
				backgrounde.remove(jt2);
				backgrounde.remove(jt3);
				backgrounde.remove(jt4);
				backgrounde.remove(jt5);
				backgrounde.remove(jt6);
				backgrounde.remove(jt7);
				backgrounde.remove(jt8);
				backgrounde.remove(jt11);
				backgrounde.remove(jt12);
				backgrounde.remove(jt13);
				backgrounde.remove(jt14);
				backgrounde.remove(jt15);
				backgrounde.remove(jt16);
				backgrounde.remove(jt17);
				backgrounde.remove(jt18);
				backgrounde.remove(jl11);
				backgrounde.remove(jl12);
				backgrounde.remove(jl13);
				backgrounde.remove(jl14);
				backgrounde.remove(jl15);
				backgrounde.remove(jl16);
				backgrounde.remove(jl17);
				backgrounde.remove(jl18);
				backgrounde.remove(shanchuliebiao);
				backgrounde.remove(shanchutijiao);
				backgrounde.repaint();
			}
		});
		chazhaoliebiao.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==1){
					backgrounde.remove(jt21);
					backgrounde.remove(jt22);
					backgrounde.remove(jt23);
					backgrounde.remove(jt24);
					backgrounde.remove(jt25);
					backgrounde.remove(jt26);
					backgrounde.remove(jt27);
					backgrounde.remove(jt28);
					backgrounde.remove(jl21);
					backgrounde.remove(jl22);
					backgrounde.remove(jl23);
					backgrounde.remove(jl24);
					backgrounde.remove(jl25);
					backgrounde.remove(jl26);
					backgrounde.remove(jl27);
					backgrounde.remove(jl28);
					backgrounde.remove(chazhaotijiao);
					jt21.setText("");
					jt22.setText("");
					jt23.setText("");
					jt24.setText("");
					jt25.setText("");
					jt26.setText("");
					jt27.setText("");
					jt28.setText("");
					jl21.setText("学号");
					jl22.setText("姓名");
					jl23.setText("家庭住址");
					jl24.setText("电话");
					jl25.setText("微信");
					jl26.setText("邮箱");
					jl27.setText("QQ");
					jl28.setText("个性语言");
						backgrounde.add(jl21);
						backgrounde.add(jl22);
						backgrounde.add(jl23);
						backgrounde.add(jl24);
						backgrounde.add(jl25);
						backgrounde.add(jl26);
						backgrounde.add(jl27);
						backgrounde.add(jl28);
						backgrounde.add(jt21);
						backgrounde.add(jt22);
						backgrounde.add(jt23);
						backgrounde.add(jt24);
						backgrounde.add(jt25);
						backgrounde.add(jt26);
						backgrounde.add(jt27);
						backgrounde.add(jt28);
						backgrounde.add(chazhaotijiao);
						backgrounde.repaint();
					
				}
			}
		});
		
		
		backgrounde.add(xiugai);
		xiugaitijiao.setBounds(700, 400, 80, 30);
		xiugai.setBounds(950,30,80,30);
		
		xiugailiebiao.addItem("同学");
		xiugailiebiao.setBounds(700, 100, 80, 30);
		xiugailiebiao.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==1){
					backgrounde.remove(jt21);
					backgrounde.remove(jt22);
					backgrounde.remove(jt23);
					backgrounde.remove(jt24);
					backgrounde.remove(jt25);
					backgrounde.remove(jt26);
					backgrounde.remove(jt27);
					backgrounde.remove(jt28);
					backgrounde.remove(jl22);
					backgrounde.remove(jl23);
					backgrounde.remove(jl24);
					backgrounde.remove(jl25);
					backgrounde.remove(jl26);
					backgrounde.remove(jl27);
					backgrounde.remove(jl28);
					jt21.setText("");
					jt22.setText("");
					jt23.setText("");
					jt24.setText("");
					jt25.setText("");
					jt26.setText("");
					jt27.setText("");
					jt28.setText("");
					backgrounde.remove(jt1);
					backgrounde.remove(jt2);
					backgrounde.remove(jt3);
					backgrounde.remove(jt4);
					backgrounde.remove(jt5);
					backgrounde.remove(jt6);
					backgrounde.remove(jt7);
					backgrounde.remove(jt8);
					backgrounde.remove(jl1);
					backgrounde.remove(jl2);
					backgrounde.remove(jl3);
					backgrounde.remove(jl4);
					backgrounde.remove(jl5);
					backgrounde.remove(jl6);
					backgrounde.remove(jl7);
					backgrounde.remove(jl8);
					jl1.setText("");
					jl2.setText("");
					jl3.setText("");
					jl4.setText("");
					jl5.setText("");
					jl6.setText("");
					jl7.setText("");
					jl8.setText("");
					jt1.setText("");
					jt2.setText("");
					jt3.setText("");
					jt4.setText("");
					jt5.setText("");
					jt6.setText("");
					jt7.setText("");
					jt8.setText("");
						jl21.setText("学号");
						jl22.setText("姓名");
						jl23.setText("家庭住址");
						jl24.setText("电话");
						jl25.setText("微信");
						jl26.setText("邮箱");
						jl27.setText("QQ");
						jl28.setText("个性语言");
						backgrounde.add(jl21);
						backgrounde.add(jl22);
						backgrounde.add(jl23);
						backgrounde.add(jl24);
						backgrounde.add(jl25);
						backgrounde.add(jl26);
						backgrounde.add(jl27);
						backgrounde.add(jl28);
						backgrounde.add(jt21);
						backgrounde.add(jt22);
						backgrounde.add(jt23);
						backgrounde.add(jt24);
						backgrounde.add(jt25);
						backgrounde.add(jt26);
						backgrounde.add(jt27);
						backgrounde.add(jt28);
						jl1.setText("学号");
						jl2.setText("姓名");
						jl3.setText("家庭住址");
						jl4.setText("电话");
						jl5.setText("微信");
						jl6.setText("邮箱");
						jl7.setText("QQ");
						jl8.setText("个性语言");
						backgrounde.add(jl1);
						backgrounde.add(jl2);
						backgrounde.add(jl3);
						backgrounde.add(jl4);
						backgrounde.add(jl5);
						backgrounde.add(jl6);
						backgrounde.add(jl7);
						backgrounde.add(jl8);
						backgrounde.add(jt1);
						backgrounde.add(jt2);
						backgrounde.add(jt3);
						backgrounde.add(jt4);
						backgrounde.add(jt5);
						backgrounde.add(jt6);
						backgrounde.add(jt7);
						backgrounde.add(jt8);
						backgrounde.repaint();
				}
			}
		});
		xiugai.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				backgrounde.add(xiugailiebiao);
				jl21.setText("学号");
				jl22.setText("姓名");
				jl23.setText("家庭住址");
				jl24.setText("电话");
				jl25.setText("微信");
				jl26.setText("邮箱");
				jl27.setText("QQ");
				jl28.setText("个性语言");
				jl1.setText("学号");
				jl2.setText("姓名");
				jl3.setText("家庭住址");
				jl4.setText("电话");
				jl5.setText("微信");
				jl6.setText("邮箱");
				jl7.setText("QQ");
				jl8.setText("个性语言");
				backgrounde.add(jl21);
				backgrounde.add(jl22);
				backgrounde.add(jl23);
				backgrounde.add(jl24);
				backgrounde.add(jl25);
				backgrounde.add(jl26);
				backgrounde.add(jl27);
				backgrounde.add(jl28);
				backgrounde.add(jt21);
				backgrounde.add(jt22);
				backgrounde.add(jt23);
				backgrounde.add(jt24);
				backgrounde.add(jt25);
				backgrounde.add(jt26);
				backgrounde.add(jt27);
				backgrounde.add(jt28);
				backgrounde.remove(chazhaotijiao);
				backgrounde.remove(tianjialiebiao);
				backgrounde.remove(chazhaoliebiao);
				backgrounde.repaint();
				
				backgrounde.add(jl1);
				backgrounde.add(jl2);
				backgrounde.add(jl3);
				backgrounde.add(jl4);
				backgrounde.add(jl5);
				backgrounde.add(jl6);
				backgrounde.add(jl7);
				backgrounde.add(jl8);
				backgrounde.add(jt1);
				backgrounde.add(jt2);
				backgrounde.add(jt3);
				backgrounde.add(jt4);
				backgrounde.add(jt5);
				backgrounde.add(jt6);
				backgrounde.add(jt7);
				backgrounde.add(jt8);
				backgrounde.remove(tijiaotianjia);
				backgrounde.remove(chazhaotijiao);
				backgrounde.remove(jl11);
				backgrounde.remove(jl12);
				backgrounde.remove(jl13);
				backgrounde.remove(jt11);
				backgrounde.remove(jt12);
				backgrounde.remove(jt13);
				backgrounde.remove(shanchuliebiao);
				backgrounde.remove(shanchutijiao);
				backgrounde.add(xiugaitijiao);
				backgrounde.repaint();
			}
		});
		xiugaitijiao.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String i = "";
				if(jt21.getText()==i&&jt22.getText()==i&&jt23.getText()==i&&jt24.getText()==i&&jt25.getText()==i&&jt26.getText()==i&&jt27.getText()==i&&jt28.getText()==i);
				else{
						String[] a1={jt21.getText(),jt22.getText(),jt23.getText(),jt24.getText(),jt25.getText(),jt26.getText(),jt27.getText(),jt28.getText()};
						String[] a={jt1.getText(),jt2.getText(),jt3.getText(),jt4.getText(),jt5.getText(),jt6.getText(),jt7.getText(),jt8.getText()};
						
						/*String格式 jt1.getText()为商号，···2.···厂名，3 地址 4 联系方式5备注*/
						
						try {
							makeUpDate(a,a1);
						} catch (SQLException e1) {
							// TODO 自动生成的 catch 块
							e1.printStackTrace();
						}
						String[][] changshangshuju = getTable();
						
						
						changshangmodel.setDataVector(changshangshuju, changshangtou);
						changshangbiao.repaint();
					
				}
				
			}
		});
		setTitle("管理员模式");
		backgrounde.add(tianjia);
		setSize(1100,619);
	}
	
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
	public void makeUpDate(String[] a,String a1[]) throws SQLException
	{
		int sample=0;
		String[][] table= null;
		String[] attr1={"SNO=","SNAME=","ADRESS=","PHONE=","WECHAT=","EMAIL=","QQ=","WORDS="};
		String sql1= "update StuList set *1*2*3*4*5*6*7*8 where SNO like ?1 and SNAME like ?2 and ADRESS like ?3 and PHONE like ?4 and WECHAT like ?5 and EMAIL like ?6 and QQ like ?7 and WORDS like ?8";
		int k=8;
		Connection conn1=null;
		PreparedStatement pstmt1 = null;
		Statement stmt1=null;
		ResultSet rs1=null;
		String url ="jdbc:sqlite:./StudentList.db";
		String[] attr={"SNO","SNAME","ADRESS","PHONE","WECHAT","EMAIL","QQ","WORDS"};
		String sql= "select * from StuList where SNO like ?1 and SNAME like ?2 and ADRESS like ?3 and PHONE like ?4 and WECHAT like ?5 and EMAIL like ?6 and QQ like ?7 and WORDS like ?8";
		Connection conn=null;
		PreparedStatement pstmt = null;
		Statement stmt=null;
		ResultSet rs=null;
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
			System.out.println(tmp);
			pstmt=conn.prepareStatement(tmp);
			rs=pstmt.executeQuery();
		    while (rs.next())
		    {
		    	sample++;
		    }
		    int kt;
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
		try
		{
			try {
				Class.forName("org.sqlite.JDBC");
			} catch (ClassNotFoundException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			conn1 = DriverManager.getConnection(url);
			String tmp=sql1;
			for(int i=1;i<=k;i++)
			{
				String b="?"+i;
				if(i>=10) b="?"+(char)((int)('a')+i-10);
				if(a[i-1].equals("")) tmp=tmp.replace(b,"'%'");
				else
				tmp=tmp.replace(b,"'"+a[i-1]+"'");
			}
			int oip=0;
			for(int i=1;i<=k;i++)
			{
				String b="*"+i;
				String c;
				c=attr1[i-1]+a1[i-1];
				if(oip==0) ;
				else c=","+c;
				if(a1[i-1].equals("")) tmp=tmp.replace(b," ");
				else
				{tmp=tmp.replace(b,c);oip=1;}
			}
			System.out.println(tmp);
			pstmt1=conn1.prepareStatement(tmp);
			int rows = pstmt1.executeUpdate();
			System.out.println("Rows impacted : " + rows );
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
			System.out.println("数据库连接失败");
		}
		finally
		{
			try{
		         if(pstmt1!=null)
		            pstmt1.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
			try{
		         if(conn1!=null)
		            conn1.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
	}

}




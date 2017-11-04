package login;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
import javax.swing.JOptionPane;
 
//下面是和数据导出有关的包
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 
public class ExportExcel {
    public  ExportExcel(String[][] changshangshuju,String path){
        // 声明一个工作薄
        HSSFWorkbook wb = new HSSFWorkbook();
        //声明一个单子并命名
        HSSFSheet sheet = wb.createSheet("xueshengbiao");
        //给单子名称一个长度
        sheet.setDefaultColumnWidth((short)15);
        // 生成一个样式  
        HSSFCellStyle style = wb.createCellStyle();
        //创建第一行（也可以称为表头）
        HSSFRow row = sheet.createRow(0);
        //样式字体居中
        //style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        //给表头第一行一次创建单元格
        HSSFCell cell = row.createCell((short) 0);
        cell.setCellValue("姓名"); 
        cell.setCellStyle(style);
        cell = row.createCell( (short) 1);
        cell.setCellValue("学号");  
        cell.setCellStyle(style);  
        cell = row.createCell((short) 2); 
        cell.setCellValue("家庭住址");  
        cell.setCellStyle(style);  
        cell = row.createCell((short) 3);  
        cell.setCellValue("电话");  
        cell.setCellStyle(style);  
        cell = row.createCell((short) 4); 
        cell.setCellValue("微信");  
        cell.setCellStyle(style);  
        cell = row.createCell((short) 5);
        cell.setCellValue("邮箱");  
        cell.setCellStyle(style);  
        cell = row.createCell((short) 6);
        cell.setCellValue("QQ");  
        cell.setCellStyle(style);  
        cell = row.createCell((short) 7);
        cell.setCellValue("个性语言");  
        cell.setCellStyle(style); 
        
               //添加一些数据，这里先写死，大家可以换成自己的集合数据
               List<Student> list = new ArrayList<Student>();
               for (int i=0;i<changshangshuju.length;i++)
               {
            	   list.add(new Student(changshangshuju[i][0],changshangshuju[i][1],changshangshuju[i][2],changshangshuju[i][3],changshangshuju[i][4],changshangshuju[i][5],changshangshuju[i][6],changshangshuju[i][7]));
               }
 
               //向单元格里填充数据
               for (int i=0;i<changshangshuju.length;i++) 
               {
                row = sheet.createRow(i + 1);
                row.createCell(0).setCellValue(list.get(i).getName());
                row.createCell(1).setCellValue(list.get(i).getSno());
                row.createCell(2).setCellValue(list.get(i).getAddress());
                row.createCell(3).setCellValue(list.get(i).getPhone());
                row.createCell(4).setCellValue(list.get(i).getVx());
                row.createCell(5).setCellValue(list.get(i).getemail());
                row.createCell(6).setCellValue(list.get(i).getQQ());
                row.createCell(7).setCellValue(list.get(i).getText());
               }
         
               try {
            //默认导出到E盘下
            path+="\\output.xls";
            FileOutputStream out = new FileOutputStream(path);
            
            wb.write(out);
            out.close();
            wb.close();
            JOptionPane.showMessageDialog(null, "导出成功!");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "导出失败!");
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "导出失败!");
            e.printStackTrace();
        } 
              
    }
}
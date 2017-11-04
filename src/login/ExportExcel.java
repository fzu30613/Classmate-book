package login;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
import javax.swing.JOptionPane;
 
//�����Ǻ����ݵ����йصİ�
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 
public class ExportExcel {
    public  ExportExcel(String[][] changshangshuju,String path){
        // ����һ��������
        HSSFWorkbook wb = new HSSFWorkbook();
        //����һ�����Ӳ�����
        HSSFSheet sheet = wb.createSheet("xueshengbiao");
        //����������һ������
        sheet.setDefaultColumnWidth((short)15);
        // ����һ����ʽ  
        HSSFCellStyle style = wb.createCellStyle();
        //������һ�У�Ҳ���Գ�Ϊ��ͷ��
        HSSFRow row = sheet.createRow(0);
        //��ʽ�������
        //style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        //����ͷ��һ��һ�δ�����Ԫ��
        HSSFCell cell = row.createCell((short) 0);
        cell.setCellValue("����"); 
        cell.setCellStyle(style);
        cell = row.createCell( (short) 1);
        cell.setCellValue("ѧ��");  
        cell.setCellStyle(style);  
        cell = row.createCell((short) 2); 
        cell.setCellValue("��ͥסַ");  
        cell.setCellStyle(style);  
        cell = row.createCell((short) 3);  
        cell.setCellValue("�绰");  
        cell.setCellStyle(style);  
        cell = row.createCell((short) 4); 
        cell.setCellValue("΢��");  
        cell.setCellStyle(style);  
        cell = row.createCell((short) 5);
        cell.setCellValue("����");  
        cell.setCellStyle(style);  
        cell = row.createCell((short) 6);
        cell.setCellValue("QQ");  
        cell.setCellStyle(style);  
        cell = row.createCell((short) 7);
        cell.setCellValue("��������");  
        cell.setCellStyle(style); 
        
               //���һЩ���ݣ�������д������ҿ��Ի����Լ��ļ�������
               List<Student> list = new ArrayList<Student>();
               for (int i=0;i<changshangshuju.length;i++)
               {
            	   list.add(new Student(changshangshuju[i][0],changshangshuju[i][1],changshangshuju[i][2],changshangshuju[i][3],changshangshuju[i][4],changshangshuju[i][5],changshangshuju[i][6],changshangshuju[i][7]));
               }
 
               //��Ԫ�����������
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
            //Ĭ�ϵ�����E����
            path+="\\output.xls";
            FileOutputStream out = new FileOutputStream(path);
            
            wb.write(out);
            out.close();
            wb.close();
            JOptionPane.showMessageDialog(null, "�����ɹ�!");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "����ʧ��!");
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "����ʧ��!");
            e.printStackTrace();
        } 
              
    }
}
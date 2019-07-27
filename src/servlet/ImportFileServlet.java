package servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import service.StuService;
import serviceimpl.StuServiceImpl;



@WebServlet("/ImportFileServlet")
public class ImportFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ImportFileServlet() {}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		try{
             //1、创建一个DiskFileItemFactory工厂
             DiskFileItemFactory factory = new DiskFileItemFactory();
             //2、创建一个文件上传解析器
             ServletFileUpload upload = new ServletFileUpload(factory);
             //3.解决上传文件名的中文乱码
             upload.setHeaderEncoding("UTF-8"); 
             System.out.println(request);
             //4、使用ServletFileUpload解析器解析上传数据，解析结果返回的是一个List<FileItem>集合，每一个FileItem对应一个Form表单的输入项
             List<FileItem> list = upload.parseRequest(request);
             System.out.println(list);
            
             for(FileItem item : list){
                 if(item.isFormField()){
                     String name = item.getFieldName();
                     String value = item.getString("UTF-8");
                     System.out.println(name + "=" + value);
                 }else{
                     InputStream in = item.getInputStream();
                     List<List<String>> stus=upfile(in);
                     StuService stuService=new StuServiceImpl();
                     stuService.toDb(stus);                      
                     in.close();
                     item.delete();
                 }
             }
          }catch (Exception e) {
              e.printStackTrace();
              
          }
		
		request.getRequestDispatcher("dormManage/mainManage.jsp?warning=Import success!").forward(request, response);
	}
	private List<List<String>> upfile(InputStream in) throws IOException {
		Workbook workbook=new HSSFWorkbook(in);
		Sheet sheet=workbook.getSheetAt(5);
		int rows=sheet.getPhysicalNumberOfRows();
		int cols=sheet.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println(rows+":"+cols);
		List<List<String>> list=new ArrayList<List<String>>();
		for(int i=1;i<rows;i++) {
			Row row=sheet.getRow(i);
			if (row==null) {
				continue;
			}
			List<String> strings=new ArrayList<String>();
			for(int j=0;j<cols;j++) {
				org.apache.poi.ss.usermodel.Cell cell=row.getCell(j);
				String cellValue="";
				if (cell != null) {
					cell.setCellType(HSSFCell.CELL_TYPE_STRING); //把所有的Excel内容当做字符串处理
                    // 以下是判断数据的类型
                    switch (cell.getCellType()) {
                    case HSSFCell.CELL_TYPE_NUMERIC: // 数字
                        cellValue = cell.getNumericCellValue() + "";
                        break;

                    case HSSFCell.CELL_TYPE_STRING: // 字符串
                        cellValue = cell.getStringCellValue();
                        break;

                    case HSSFCell.CELL_TYPE_BOOLEAN: // Boolean
                        cellValue = cell.getBooleanCellValue() + "";
                        break;

                    case HSSFCell.CELL_TYPE_FORMULA: // 公式
                        cellValue = cell.getCellFormula() + "";
                        break;

                    case HSSFCell.CELL_TYPE_BLANK: // 空值
                        cellValue = "";
                        break;

                    case HSSFCell.CELL_TYPE_ERROR: // 故障
                        cellValue = "非法字符";
                        break;

                    default:
                        cellValue = "未知类型";
                        break;
                    }
				}
				strings.add(cellValue);
			}
			list.add(strings);
		}
		System.out.println(list);
		return list;
	}

}

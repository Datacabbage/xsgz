package cn.gdou.xsgz.admin.base.dao;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import cn.gdou.xsgz.admin.system.AdminAction;
import cn.gdou.xsgz.admin.system.dao.AdminDao;
import cn.gdou.xsgz.admin.system.service.AdminService;
import cn.gdou.xsgz.admin.workstudy.dao.WorkstudyDao;
import cn.gdou.xsgz.domain.Admin;
import cn.gdou.xsgz.domain.AllotInfo;
import flexjson.JSONSerializer;
import flexjson.transformer.DateTransformer;

/**
 * 测试GenericUtil
 * 
 * @author 李楚富
 * @version 2014-12-12
 */
public class AdminDaoTest {
//	@Test
//	public void test_showResult(){
//		WorkstudyDao dao = new WorkstudyDao();
//		List<AllotInfo> allot = dao.showAllotResult(1, 4);
//		for(AllotInfo allotinfo : allot){
//			System.out.println(allotinfo.getStudentName());
//		}
//	}
//	
//	@Test
//	public void test_queryAllAcademyAdmins() throws IOException{
//		AdminService service = new AdminService();
//		String str = service.queryAllAcademyAdmins();
//		System.out.println(str);
//	}
//	
//	@Test
//	public void test_listAllAdmins(){
//		AdminDao adminDao = new AdminDao();
//		Admin admin = new Admin();
//		admin.setSubjectId(2);
//		
//		List<Map<String, Object>> list =  adminDao.listMajorAdminsByAcademyId(admin.getSubjectId());
//		for(Map<String, Object> map : list){			
//			Integer majorId = (Integer) map.get("majorId");
//			String majorShortName = (String) map.get("majorShortName");
////			System.out.println("------ majorId:" +majorId+" , majorShortName:"+majorShortName);
//			System.out.println("------ map:" +map);
//		}
//		
//		JSONSerializer jsonRows = new JSONSerializer();
//		jsonRows.transform(new DateTransformer("yyyy-MM-dd HH:mm:ss"), new String[] {
//		"registerTime"});
//		jsonRows.transform(new DateTransformer("yyyy-MM-dd HH:mm:ss"), new String[] {
//		"lastTime"});
//        String  jsonStr =jsonRows.serialize(list);     
//		System.out.println("json = "+jsonStr);
//	}
//	
	
	@Test
	public void subStringtest(){
		
		String s = "E:\\apache-tomcat-7.0.62\\webapps\\xsgz\\file\\up\\word_1\\201111621314.docx";
		String s2 = s.replace("\\", "/");
		System.out.println(s2);
	}
	
}

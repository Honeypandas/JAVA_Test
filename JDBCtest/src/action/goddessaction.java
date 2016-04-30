package action;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import model.goddess;
import DAO.goddessDao;

public class goddessaction {

	
	public void add(goddess gs) throws SQLException {
	goddessDao dao=new goddessDao();
	dao.addgoddess(gs);
}
	
	public void del(Integer id) throws SQLException {
		goddessDao dao=new goddessDao();
		dao.delgoddess(id);
	}
	
	public void  get(Integer id) throws SQLException {
		goddessDao dao=new goddessDao();
		dao.getone(id);
		
	}
	public void  updete(goddess g) throws SQLException {
		goddessDao dao=new goddessDao();
		dao.updategoddess(g);
	}
	
	public List<goddess> query() {
		
	goddessDao dao=new goddessDao();
	return dao.query();
	}	
	public static void main(String[] args) throws SQLException {
		
		goddessDao g=new goddessDao();
	 
		/*goddess gs=new goddess();
		gs.setAge(20);
		gs.setEmail("5454");;
		gs.setId(3);
		gs.setMobile("12541542");
		gs.setUser_name("ywq");
		gs.setSex(1);
		gs.setIsdel(10);
		gs.setCreate_user("sad");*/
		
		//g.addgoddess(gs);
		g.delgoddess(1);
		
	}
	
	
	
	
	
}

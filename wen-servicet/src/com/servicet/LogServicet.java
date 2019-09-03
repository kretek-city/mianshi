package com.servicet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.pojo.Sall;
import com.jdbc.service.SallService;
import com.jdbc.service.SallServiceImpl;

/**
 * Servlet implementation class LogServicet
 */
@WebServlet("/LogServicet")
public class LogServicet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	SallService sallservice = new SallServiceImpl();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String type=request.getParameter("who");

		//新增
		if("Insert".equals(type)){
			Insert(request, response);
		}
		else if("update".equals(type)){
			update(request, response);
		} 
		else if("delete".equals(type)){
			delete(request, response);
		} 
		else if("queryAll".equals(type)){
			queryAll(request, response);
		}
		//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  id= request.getParameter("id");
		boolean  message=sallservice.delete(Integer.parseInt(id));
		if (message==true) { 
			queryAll(request, response); 
		}
		else {

			request.setAttribute("msg", "删除失败!!");
			request.getRequestDispatcher("/xxx").forward(request, response); 
		}

	}

	private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String BZ = request.getParameter("BZ");
		String DID = request.getParameter("DID");
		String FIELDTBL = request.getParameter("FIELDTBL");
		String TBLATTR = request.getParameter("TBLATTR");
		String TBLCHNAME = request.getParameter("TBLCHNAME");
		String TBLENNAME = request.getParameter("TBLENNAME");
		String TBLTYPE = request.getParameter("TBLTYPE");
		Sall sall = new Sall();
		sall.setBZ(BZ);
		sall.setDID(Integer.valueOf(DID));
		sall.setFIELDTBL(FIELDTBL);
		sall.setTBLATTR(Integer.valueOf(TBLATTR));
		sall.setTBLCHNAME(TBLCHNAME);
		sall.setTBLENNAME(TBLENNAME);
		sall.setTBLTYPE(Integer.valueOf(TBLTYPE));
		boolean b = sallservice.update(sall);
		if (b==true) { 
			queryAll(request, response); 
		}
		else { 
			request.setAttribute("msg", "修改失败!!");
			request.getRequestDispatcher("/xxx").forward(request, response); 
		}
	}

	private void Insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String BZ = request.getParameter("BZ");
		String FIELDTBL = request.getParameter("FIELDTBL");
		String TBLATTR = request.getParameter("TBLATTR");
		String TBLCHNAME = request.getParameter("TBLCHNAME");
		String TBLENNAME = request.getParameter("TBLENNAME");
		String TBLTYPE = request.getParameter("TBLTYPE");
		Sall sall = new Sall();
		sall.setBZ(BZ);
		sall.setFIELDTBL(FIELDTBL);
		sall.setTBLATTR(Integer.valueOf(TBLATTR));
		sall.setTBLCHNAME(TBLCHNAME);
		sall.setTBLENNAME(TBLENNAME);
		sall.setTBLTYPE(Integer.valueOf(TBLTYPE));
		String message=null; 
		if (sallservice.insertData(sall)==true) { 
			queryAll(request, response); 
		}
		else {
			message="新增失败!!!";
			request.setAttribute("msg", message);
			request.getRequestDispatcher("/xxx").forward(request, response); 
		}


	}

	private void queryAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Sall> lis=sallservice.queryAllData(); 
		request.setAttribute("list", lis);
		request.getRequestDispatcher("/xxx.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

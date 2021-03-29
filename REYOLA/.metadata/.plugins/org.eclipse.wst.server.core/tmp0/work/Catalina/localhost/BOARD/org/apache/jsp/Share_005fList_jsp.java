/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2018-06-21 14:25:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class Share_005fList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("java.sql.DriverManager");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
  final int ROWSIZE = 5; // 한페이지에 보일 게시물 수
	final int BLOCK = 5; // 아래에 보일 페이지 최대개수 1~5 / 6~10 / 11~15 식으로 5개로 고정
	int pg = 1; //기본 페이지값
	if(request.getParameter("pg")!=null) { //받아온 pg값이 있을때, 다른페이지일때
		pg = Integer.parseInt(request.getParameter("pg")); // pg값을 저장
		}
	int start = (pg*ROWSIZE) - (ROWSIZE-1); // 해당페이지에서 시작번호(step)
	int end = (pg*ROWSIZE); // 해당페이지에서 끝번호(step)
	
	int allPage = 0; // 전체 페이지수
	
	int startPage = ((pg-1)/BLOCK*BLOCK)+1; // 시작블럭숫자 (1~5페이지일경우 1, 6~10일경우 6)
	int endPage = ((pg-1)/BLOCK*BLOCK)+BLOCK; // 끝 블럭 숫자 (1~5일 경우 5, 6~10일경우 10)

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("\tbackground-image: url(\"img/bg.jpg\");\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<title>게시판</title>\r\n");
      out.write("<link href=\"css/Share_css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form name=writeform method=\"post\" action=\"search.jsp\">\r\n");
      out.write("\t<center>\r\n");
      out.write("\t<p></p>\r\n");
      out.write("\t\t<table cellspacing=0 align=\"center\">\r\n");
      out.write("\t\t\t<tr class=tr1 align=\"center\">\r\n");
      out.write("\t\t\t\t<td class=\"num\">번호</td>\r\n");
      out.write("\t\t\t\t<td class=\"tittle\">제목</td>\r\n");
      out.write("\t\t\t\t<td class=\"writer\">글쓴이</td>\r\n");
      out.write("\t\t\t\t<td class=\"date\">날짜</td>\r\n");
      out.write("\t\t\t\t<td class=\"read\">조회수</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				// 데이터베이스 접속을 위한 클래스
				Connection conn = null;
				// 접속 후 질의문을 실행시킬 클래스
				java.sql.Statement st = null;
				java.sql.Statement st2 = null;
				// 질의문에 대한 결과값이 있는 클래스
				ResultSet rs = null;
				int total = 0;
				String sql = "";
				try {
					Class.forName("com.mysql.jdbc.Driver");

					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306?useSSL=false", "root", "1234");
					st = conn.createStatement();
					st2 = conn.createStatement();
					st.execute("use yolo;"); // 사용할 DB를 선택한다..
					st2.execute("use yolo;"); // 사용할 DB를 선택한다.
					
					String sqlCount = "SELECT COUNT(*) FROM share";
					rs = st.executeQuery(sqlCount);
					
					if(rs.next()){
						total = rs.getInt(1);
					}
					
					rs.close();
					
					int sort=1;
					String sqlSort = "SELECT id from share";
					rs = st.executeQuery(sqlSort);
					
					while(rs.next()){
						int stepNum = rs.getInt(1);	
						sql = "UPDATE share SET step=" + sort + " where id=" +stepNum;
					 	st2.executeUpdate(sql);
					 	sort++;
					} 
					allPage = (int)Math.ceil(total/(double)ROWSIZE);
					
					if(endPage > allPage) {
						endPage = allPage;
					}
					
					String sqlList = "SELECT id, nickname, TITLE, TIME, HIT from share where step >="+start + " and step <= "+ end +" order by step asc";
					rs = st.executeQuery(sqlList);
					 
					rs.close();
					
					String SQL = "select count(*) from share";
					rs = st.executeQuery(SQL);
					
					if(rs.next()){
						total = rs.getInt(1);
					}
					
					rs.close();
					rs = st.executeQuery("SELECT * FROM share order by id desc");

					while (rs.next()) {
						int id = rs.getInt(1);
						String name = rs.getString(2);
						String title = rs.getString(4);
						String time = rs.getString(6);
						int hit = rs.getInt(7);	
						
						Date date = new Date();
						SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
						String year = (String)simpleDate.format(date);
						String yea = time.substring(0,10);

			
      out.write("\r\n");
      out.write("\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t\t<td class=\"num\">");
      out.print(id);
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td class=\"tittle2\"><a href=\"View.jsp?idx=");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(title);
      out.write("\r\n");
      out.write("\t\t\t\t</a> ");

					if(year.equals(yea)){
					
      out.write(" <img src='img/new.jpg' class=new /> ");
 }  
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td class=\"writer\">");
      out.print(name);
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td class=\"date\">");
      out.print(time);
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td class=\"read\">");
      out.print(hit);
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

					}
					
				} catch (Exception e) {
					e.printStackTrace();
					// try, catch 문 실행 완료 후 실행되는 데 사용객체들을 닫아준다.
				} finally {
					if (rs != null)
						rs.close();
					if (st != null)
						st.close();
					if (conn != null)
						conn.close();

				}
			
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=4><select name=\"s\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"제목\">제목</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"작성자\">작성자</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"제목+내용\">제목+내용</option>\r\n");
      out.write("\t\t\t\t</select> <input type=text name='se'> <input class=writting\r\n");
      out.write("\t\t\t\t\ttype=submit name='go' value=\"검색\"></td>\r\n");
      out.write("\t\t\t\t<td align=right><input type=button class=writting\r\n");
      out.write("\t\t\t\t\tname=\"writting\" value=\"글쓰기\" onclick=\"location='write.jsp'\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<input type=button class=main value=\"메인으로\" onclick=\"location='index.jsp'\">\r\n");
      out.write("\t</center>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
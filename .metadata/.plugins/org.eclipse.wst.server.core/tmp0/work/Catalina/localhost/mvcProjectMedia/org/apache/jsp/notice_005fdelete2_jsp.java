/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.64
 * Generated at: 2021-04-14 03:58:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class notice_005fdelete2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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

      out.write('\r');
      out.write('\n');

	String loginId = (String)session.getAttribute("userId");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html style=\"margin: 0px\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title>공지사항 삭제</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/style.css\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t\t<style>\r\n");
      out.write("\t\t\t.accordion {\r\n");
      out.write("\t\t\t\tbackground-color: black;\r\n");
      out.write("\t\t\t\tcolor: white;\r\n");
      out.write("\t\t\t\tcursor: pointer;\r\n");
      out.write("\t\t\t\tpadding: 5px 0px 5px 10px;\r\n");
      out.write("\t\t\t\twidth: 100%;\r\n");
      out.write("\t\t\t\tborder: none;\r\n");
      out.write("\t\t\t\ttext-align: left;\r\n");
      out.write("\t\t\t\toutline: none;\r\n");
      out.write("\t\t\t\tfont-size: 20px;\r\n");
      out.write("\t\t\t\ttransition: 0.4s;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.panel {\r\n");
      out.write("\t\t\t\tcolor: white;\r\n");
      out.write("\t\t\t\tfont-size: 15px;\r\n");
      out.write("\t\t\t\ttext-align: right;\r\n");
      out.write("\t\t\t\tdisplay: none;\r\n");
      out.write("\t\t\t\tbackground-color: black;\r\n");
      out.write("\t\t\t\toverflow: hidden;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#loginSession{\r\n");
      out.write("\t\t\t\tcolor: white;\r\n");
      out.write("\t\t\t\tbackground: #666666;\r\n");
      out.write("\t\t\t\tfont-size: 20px;\r\n");
      out.write("\t\t\t\tfont-family: bold;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body id=\"body\">\r\n");
      out.write("\t\t<nav id=\"top\">\r\n");
      out.write("\t\t\t<!-- 로고 이미지를 넣고, 로고를 눌렀을 경우 메인페이지로 이동이 되록 설정 -->\r\n");
      out.write("\t\t\t<div id=\"mainLogo\">\r\n");
      out.write("\t\t\t\t<a href=\"MainPage.jsp\">\r\n");
      out.write("\t\t\t\t\t<img src=\"resources/img/MainLogo.png\" width=\"90\" height=\"90\">\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<form action=\"\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"search\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"검색\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- 로그인을 하지 않았을 경우는 로그인을 하라는 문구가 출력이 되고,\r\n");
      out.write("\t\t\t\t  로그인을 했을 경우 세션이 설정이 되어서 로그인한 아이디님을 환영한다는 출력을 해줌\r\n");
      out.write("\t\t\t-->\r\n");
      out.write("\t\t\t<div id=\"loginSession\">\r\n");
      out.write("\t\t\t\t");
 if(session.getAttribute("userId") == null) {
      out.write("\r\n");
      out.write("\t\t\t\t\t로그인을 해주세요!\r\n");
      out.write("\t\t\t\t");
} else {
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("님 환영합니다.\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t<nav id=\"leftMenu\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t<a href=\"MainPage.jsp\">\r\n");
      out.write("\t\t\t\t\t\t메인페이지\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</h3>\r\n");
      out.write("\t\t\t</div><br>\r\n");
      out.write("\t\t\t<hr color=\"white\">\r\n");
      out.write("\t\t\t<!-- 처음에 매뉴가 접혀져있고 로그인 버튼을 누르면 아래 '로그인, 회원정보, 로그아웃' 메뉴가 아래로 펼쳐짐 -->\r\n");
      out.write("\t\t\t<button class=\"accordion\">로그인</button>\r\n");
      out.write("\t\t\t<div class=\"panel\">\t<!-- 펼쳐지는 메뉴가 들어가는 부분, style 설정 -->\r\n");
      out.write("\t\t\t\t<!-- 로그인 메뉴를 누를 경우 로그인 화면으로 넘어감 -->\r\n");
      out.write("\t\t\t\t<div id=\"loginFaded\" class=\"leftMenuContent\">\r\n");
      out.write("\t\t\t\t\t<a href=\"UserLogin.jsp\">\r\n");
      out.write("\t\t\t\t\t\t로그인\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- 로그인이 되지 않았을경우 로그인이 되지 않았음을 알리는 alert를 실행\r\n");
      out.write("\t\t\t\t\t 로그인이 되었을 경우 해당 아이디의 회원정보를 출력하는 페이지로 넘어감\r\n");
      out.write("\t\t\t\t -->\r\n");
      out.write("\t\t\t\t");
 if(session.getAttribute("userId") == null) {
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"leftMenuContent\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:notLogin();\">\r\n");
      out.write("\t\t\t\t\t\t\t회원정보\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
} else {
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- 로그인을 해서 회원정보를 눌렀을 경우 UserInformation2로 매핑을 해서 컨트롤러로 넘겨줌 -->\r\n");
      out.write("\t\t\t\t\t<div class=\"leftMenuContent\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"UserInformation2\">\r\n");
      out.write("\t\t\t\t\t\t\t회원정보\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t<!-- 세션을 끊어줌 -->\r\n");
      out.write("\t\t\t\t<div class=\"leftMenuContent\">\r\n");
      out.write("\t\t\t\t\t<a href=\"UserLogout.jsp\">\r\n");
      out.write("\t\t\t\t\t\t로그아웃\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<hr color=\"white\">\r\n");
      out.write("\t\t\t<button class=\"accordion\">미디어</button>\r\n");
      out.write("\t\t\t<div class=\"panel\">\r\n");
      out.write("\t\t\t\t<div class=\"leftMenuContent\">\r\n");
      out.write("\t\t\t\t\t<a href=\"all\">축구 영상</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
 if(session.getAttribute("userId") == null) {
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"leftMenuContent\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:notLogin();\">\r\n");
      out.write("\t\t\t\t\t\t\t내 동영상\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
} else {
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- 로그인을 해서 회원정보를 눌렀을 경우 UserInformation2로 매핑을 해서 컨트롤러로 넘겨줌 -->\r\n");
      out.write("\t\t\t\t\t<div class=\"leftMenuContent\">\r\n");
      out.write("\t\t\t\t\t\t<a href=myvideo?userid=");
      out.print(loginId);
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t내 동영상\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"leftMenuContent\">\r\n");
      out.write("\t\t\t\t\t<a href=\"VideoMain.jsp\">미디어 메뉴2</a> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<hr color=\"white\">\r\n");
      out.write("\t\t\t<button class=\"accordion\">쇼핑몰</button>\r\n");
      out.write("\t\t\t<div class=\"panel\">\r\n");
      out.write("\t\t\t\t<div class=\"leftMenuContent\">\r\n");
      out.write("\t\t\t\t\t<a href=\"sall\">전체 쇼핑몰</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"leftMenuContent\">\r\n");
      out.write("\t\t\t\t\t<a href=\"foot\">축구 쇼핑몰</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"leftMenuContent\">\r\n");
      out.write("\t\t\t\t\t<a href=\"base\">야구 쇼핑몰</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"leftMenuContent\">\r\n");
      out.write("\t\t\t\t\t<a href=\"basket\">농구 쇼핑몰</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"leftMenuContent\">\r\n");
      out.write("\t\t\t\t\t<a href=\"notice_all2.jsp\">공지사항</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"leftMenuContent\">\r\n");
      out.write("\t\t\t\t\t<a href=\"enquiries_all3.jsp\">문의 사항</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"leftMenuContent\">\r\n");
      out.write("\t\t\t\t\t<a href=\"cart_all4.jsp\">장바구니</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"leftMenuContent\">\r\n");
      out.write("\t\t\t\t\t<a href=\"payment_all5.jsp\">결제</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- 실질적으로 펼쳐지게 해주는 부분-->\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t    var acc = document.getElementsByClassName(\"accordion\");\r\n");
      out.write("\t\t\t    var i;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t    for (i = 0; i < acc.length; i++) {\r\n");
      out.write("\t\t\t      acc[i].addEventListener(\"click\", function() {\r\n");
      out.write("\t\t\t        this.classList.toggle(\"active\");\r\n");
      out.write("\t\t\t        var panel = this.nextElementSibling;\r\n");
      out.write("\t\t\t        if (panel.style.display === \"block\") {\r\n");
      out.write("\t\t\t          panel.style.display = \"none\";\r\n");
      out.write("\t\t\t        } else {\r\n");
      out.write("\t\t\t          panel.style.display = \"block\";\r\n");
      out.write("\t\t\t        }\r\n");
      out.write("\t\t\t      });\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t    </script>\r\n");
      out.write("\t\t\t<br>\t\t\t\r\n");
      out.write("\t\t</nav><!-- 복사 완료 -->\r\n");
      out.write("\t\t<div id=\"content\">\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<h3>공지사항 삭제</h3>\r\n");
      out.write("\t\t<hr color=\"red\">\r\n");
      out.write("\t\t<form action=\"noticeDelete2\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr><td>번호: <input type=\"text\" name=\"nnumber\" readonly></td></tr> \r\n");
      out.write("\t\t\t<tr><td>아이디: <input type=\"text\" name=\"userid\"></td></tr> \r\n");
      out.write("\t\t\t<tr><td>제목: <input type=\"text\" name=\"ntitle\"></td></tr> \r\n");
      out.write("\t\t\t<tr><td>날짜: <input type=\"text\" name=\"ndate\" readonly></td></tr> \r\n");
      out.write("\t\t\t<tr><td>내용: <input type=\"text\" name=\"ndetails\" readonly></td></tr> \r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<br>  \r\n");
      out.write("\t   \t <input type=\"submit\" value=\"공지사항 삭제\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
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

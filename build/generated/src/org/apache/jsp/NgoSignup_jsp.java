package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NgoSignup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Socioware/NgoSignUp</title>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/UserSignupScript.js\">\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("             #bd{\n");
      out.write("                margin-top: 5px;\n");
      out.write("                margin-left: -16px;\n");
      out.write("                background-color:#202503 ;\n");
      out.write("             }\n");
      out.write("             #main{\n");
      out.write("    position:absolute;\n");
      out.write("    margin-top: -10px;\n");
      out.write("    height: 1100px;\n");
      out.write("   }\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            #sign{\n");
      out.write("                position:absolute;\n");
      out.write("               top: 80px;\n");
      out.write("               left:320px;\n");
      out.write("               color: thistle;\n");
      out.write("               font: bold large cursive ;\n");
      out.write("               text-decoration: blink;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            #bridge{\n");
      out.write("                position: absolute;\n");
      out.write("                top: 700px;\n");
      out.write("                left:320px;\n");
      out.write("                width:650px;\n");
      out.write("                height: 25px;\n");
      out.write("                background-color:lightsteelblue;\n");
      out.write("                border: 1px silver solid;\n");
      out.write("                color: sienna;\n");
      out.write("                font-family: Castellar;\n");
      out.write("                font-weight: bolder;\n");
      out.write("                font-size: large;\n");
      out.write("                background-image: url(\"images/arrow-square.gif\");\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-position: right -51px;\n");
      out.write("}\n");
      out.write("#bridge0{\n");
      out.write("                position: absolute;\n");
      out.write("                top:121px;\n");
      out.write("                left:320px;\n");
      out.write("                width:650px;\n");
      out.write("                height: 25px;\n");
      out.write("                background-color: lightsteelblue;\n");
      out.write("                border: 1px silver solid;\n");
      out.write("                color: sienna;\n");
      out.write("                font-family: Castellar;\n");
      out.write("                font-weight: bolder;\n");
      out.write("                font-size: large;\n");
      out.write("                background-image: url(\"images/arrow-square.gif\");\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-position: right -51px;\n");
      out.write("}\n");
      out.write("#bridge:hover,#bridge0:hover{\n");
      out.write("                background-color:powderblue;\n");
      out.write("}\n");
      out.write("#bridge.active,#bridge0.active{\n");
      out.write("    background-position: right 10px;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            #div1{\n");
      out.write("                display:block;\n");
      out.write("                position: absolute;\n");
      out.write("                top:148px;\n");
      out.write("                left:320px;\n");
      out.write("                width: 650px;\n");
      out.write("                height: 550px;\n");
      out.write("                background-color: #556B2F;\n");
      out.write("                border: 1px turquoise solid;\n");
      out.write("}\n");
      out.write("#tbl{\n");
      out.write("    margin-top: -50px;\n");
      out.write("}\n");
      out.write(" #txt\n");
      out.write("        {\n");
      out.write("         color: darkgray;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            #div2{\n");
      out.write("              \n");
      out.write("                display: block;\n");
      out.write("                position: absolute;\n");
      out.write("                top:727px;\n");
      out.write("                left: 320px;\n");
      out.write("                width: 650px;\n");
      out.write("                height: 300px;\n");
      out.write("                background-color: #556B2F;\n");
      out.write("                border: 1px turquoise solid;\n");
      out.write("}\n");
      out.write("#div2_1{\n");
      out.write("                margin-top: 20px;\n");
      out.write("                margin-left: 25px;\n");
      out.write("                width:120px;\n");
      out.write("                height: 120px;\n");
      out.write("                background-color: #696969;\n");
      out.write("                border: 3px steelblue groove;\n");
      out.write("}\n");
      out.write("#div2_1_1{\n");
      out.write("               margin-top: 10px;\n");
      out.write("               margin-left: 10px;\n");
      out.write("               width: 120px;\n");
      out.write("               height: 120px;\n");
      out.write("               background-color: silver;\n");
      out.write("               border: 1px #1E90FF solid;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#div2_1_1:hover{\n");
      out.write("    margin-top: 0px;\n");
      out.write("    margin-left:0px;\n");
      out.write("}\n");
      out.write("#div2_1_2{\n");
      out.write("    margin-top: -130px;\n");
      out.write("    margin-left: 180px;\n");
      out.write("}\n");
      out.write("#div2_1_3{\n");
      out.write("    margin-top: -24px;\n");
      out.write("    margin-left: 410px;\n");
      out.write("}\n");
      out.write("#line1{\n");
      out.write("    margin-left: 180px;\n");
      out.write("    color: darkgray;\n");
      out.write("    font-family: Bell MT;\n");
      out.write("}\n");
      out.write("#div2_2{\n");
      out.write(" margin-top: 60px;\n");
      out.write("}\n");
      out.write("#msg{\n");
      out.write("    position:absolute;\n");
      out.write("    margin-top: 208px;\n");
      out.write("    margin-left:740px;\n");
      out.write("    z-index: +1;\n");
      out.write("    color:red;\n");
      out.write("    font-family: fantasy; \n");
      out.write("    font-style:normal;\n");
      out.write("    font-weight:bolder; \n");
      out.write("    font:large;\n");
      out.write("    text-decoration: blink;    \n");
      out.write("   }\n");
      out.write("   #msg1{\n");
      out.write("    color:red;\n");
      out.write("    font-family:  cursive;\n");
      out.write("    font-style:normal;\n");
      out.write("    font:  xx-large;\n");
      out.write("    position:absolute;\n");
      out.write("    margin-top: 75px;\n");
      out.write("    margin-left:450px;\n");
      out.write("   z-index: +1;    \n");
      out.write("   }\n");
      out.write(".spn{\n");
      out.write("    color: tomato;\n");
      out.write("    font-weight: bold;\n");
      out.write("   }\n");
      out.write("   .star{\n");
      out.write("       color:red;\n");
      out.write("   }\n");
      out.write("  \n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <script type=\"text/javascript\" src=\"jquery.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("           $(document).ready(function(){\n");
      out.write("                 $(\"#bridge0,#\").eq(2).addClass(\"active\");\n");
      out.write("    $(\".prc .dv\").eq(2).show();\n");
      out.write("\n");
      out.write("    $(\".prc h3\").click(function(){\n");
      out.write("          $(this).next(\".dv\").slideToggle(\"slow\")\n");
      out.write("           .siblings(\"p:visible\").slideUp(\"slow\");\n");
      out.write("           $(this).toggleClass(\"active\");\n");
      out.write("           $(this).sibling(\"h3\").removeClass(\"active\");\n");
      out.write("});\n");
      out.write("           });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"bd\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.html", out, false);
      out.write("\n");
      out.write("        <div id=\"main\">\n");
      out.write("            <div id=\"sign\">SignUpForm!</div>\n");
      out.write("            <span id='msg'></span>\n");
      out.write("            <div id=\"bridge0\" class=\"bridge\">&nbsp;&nbsp;&nbsp;Step 1</div>\n");
      out.write("            <div id=\"div1\">\n");
      out.write("                <form action=\"UserSignupServlet\" method=\"post\"> \n");
      out.write("                <table id=\"tbl\" cellspacing=\"0\" cellpadding=\"3\" margin=\"0\" >\n");
      out.write("               \n");
      out.write("                      <tr>\n");
      out.write("                          <th>Ngo Name   <span class=\"star\">*</span>    </th>\n");
      out.write("                         <td><input type=\"text\" id=\"t1\" value=\"Ngo Name\" class=\"txtarea\" name=\"fname\" onfocus=\"return invalid()\"/>\n");
      out.write("</tr>\n");
      out.write("                      <tr>\n");
      out.write("                         <th></th>\n");
      out.write("                         <td id=\"txt\">Please enter a valid name to be a member</td>\n");
      out.write("                     </tr>\n");
      out.write("                      <tr>\n");
      out.write("                         <th>Email-id <span class=\"star\">*</span></th>\n");
      out.write("                         <td><input type=\"text\" id=\"t4\" class=\"txtarea\" value=\"Ngo Id\" name=\"email\" onfocus=\"return invalid()\"/>\n");
      out.write("                         @\n");
      out.write("                           <select id=\"sel\" name=\"host\">\n");
      out.write("                              <option value=\"other\">Other</option>\n");
      out.write("                              <option value=\"gmail.com\" selected>gmail.com</option>\n");
      out.write("                              <option value=\"yahoo.com\">yahoo.com</option>\n");
      out.write("                              <option value=\"rediffmail.com\">rediffmail.com</option>\n");
      out.write("                              <option value=\"hotmail.com\">hotmail.com</option>\n");
      out.write("                           </select>\n");
      out.write("                        </td>\n");
      out.write("                        \n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                         <th></th>\n");
      out.write("                         <td id=\"txt\">Please select a valid user name to login</td>\n");
      out.write("                     </tr>\n");
      out.write("                      <tr>\n");
      out.write("                           <th>Password   <span class=\"star\">*</span></th>\n");
      out.write("                           <td><input type=\"password\" value=\"password\" class=\"txtarea\" id=\"p1\" name=\"pwd\"  onfocus=\"return invalid()\"/>\n");
      out.write("                           <span class=\"spn\" id=\"p\"></span>\n");
      out.write("                           </td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                         <th></th>\n");
      out.write("                         <td id=\"txt\">(minimum 6 words)<br/>\n");
      out.write("                             select a valid and unique password must use<br/>\n");
      out.write("                             combination of alphabets, digits and symbol\n");
      out.write("                         </td>\n");
      out.write("                     </tr>\n");
      out.write("                      <tr>\n");
      out.write("                           <th>Confirm Password<span class=\"star\">*</span>  </th>\n");
      out.write("                           <td><input type=\"password\" value=\"password\" class=\"txtarea\" id=\"p2\" name=\"cpwd\" onblur=\"return isValidPwd()\"  onfocus=\"return invalid()\"/>\n");
      out.write("                            <span class=\"spn\" id=\"cp\"></span></td>\n");
      out.write("                      \n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                         <th></th>\n");
      out.write("                         <td id=\"txt\">Confirm Password</td>\n");
      out.write("                     </tr>\n");
      out.write("                      <tr>\n");
      out.write("                           <th>Estd Date <span class=\"star\">*</span></th>\n");
      out.write("                           <td>\n");
      out.write("                               <select id=\"yyyy\" name=\"yyyy\" onchange=\"return changeOnSelect()\">\n");
      out.write("                                   <option value=\"Year\" selected>Year</option>\n");
      out.write("                                   <option value=\"2012\">2012</option>\n");
      out.write("                                   <option value=\"2011\">2011</option>\n");
      out.write("                                   <option value=\"2010\">2010</option>\n");
      out.write("                                   <option value=\"2009\">2009</option>\n");
      out.write("                                   <option value=\"2008\">2008</option>\n");
      out.write("                                   <option value=\"2007\">2007</option>\n");
      out.write("                                   <option value=\"2006\">2006</option>\n");
      out.write("                                   <option value=\"2005\">2005</option>\n");
      out.write("                                   <option value=\"2004\">2004</option>\n");
      out.write("                                   <option value=\"2003\">2003</option>\n");
      out.write("                                   <option value=\"2002\">2002</option>\n");
      out.write("                                   <option value=\"2001\">2001</option>\n");
      out.write("                                   <option value=\"2000\">2000</option>\n");
      out.write("                                   <option value=\"1999\">1999</option>\n");
      out.write("                                   <option value=\"1998\">1998</option>\n");
      out.write("                                   <option value=\"1997\">1997</option>\n");
      out.write("                                   <option value=\"1996\">1996</option>\n");
      out.write("                                   <option value=\"1995\">1995</option>\n");
      out.write("                                   <option value=\"1994\">1994</option>\n");
      out.write("                                   <option value=\"1993\">1993</option>\n");
      out.write("                                   <option value=\"1992\">1992</option>\n");
      out.write("                                   <option value=\"1991\">1991</option>\n");
      out.write("                                   <option value=\"1990\">1990</option>\n");
      out.write("                                   <option value=\"1989\">1989</option>\n");
      out.write("                                   <option value=\"1988\">1988</option>\n");
      out.write("                                   <option value=\"1987\">1987</option>\n");
      out.write("                                   <option value=\"1986\">1986</option>\n");
      out.write("                                   <option value=\"1985\">1985</option>\n");
      out.write("                                   <option value=\"1984\">1984</option>\n");
      out.write("                                   <option value=\"1983\">1983</option>\n");
      out.write("                                   <option value=\"1982\">1982</option>\n");
      out.write("                               </select>\n");
      out.write("                               <span class=\"spn\" id=\"dob\"></span>\n");
      out.write("                           </td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                         <th></th>\n");
      out.write("                         <td id=\"txt\">fill your Established year</td>\n");
      out.write("                     </tr>\n");
      out.write("                       <tr>\n");
      out.write("                           <th>Gender <span class=\"star\">*</span></th>\n");
      out.write("                           <td>\n");
      out.write("                               <select id=\"gen\" name=\"gndr\" onchange=\"return changeOnSelect()\">\n");
      out.write("                                   <option value=\"Gender\" selected>Gender</option>\n");
      out.write("                                   <option value=\"male\">Mr.</option>\n");
      out.write("                                   <option value=\"female\">Miss.</option>\n");
      out.write("                               </select>\n");
      out.write("                               <span class=\"spn\" id=\"gndr\"></span>\n");
      out.write("                           </td>\n");
      out.write("                       </tr>\n");
      out.write("                       <tr>\n");
      out.write("                           <th>Habitate  <span class=\"star\">*</span></th>\n");
      out.write("                           <td>\n");
      out.write("                               <select id=\"habi\" name=\"cntry\" onchange=\"return changeOnSelect()\">\n");
      out.write("                                   <option selected>Country</option>\n");
      out.write("                                   <option>India</option>\n");
      out.write("                                   <option>Austrailla</option>\n");
      out.write("                                   <option>US</option>\n");
      out.write("                                   <option>Britain</option>\n");
      out.write("                                   <option>America</option>\n");
      out.write("                                   <option>Pakistan</option>\n");
      out.write("                                   <option>Iran</option>\n");
      out.write("                                   <option>Srilanka</option>\n");
      out.write("                                   <option>Nepal</option>\n");
      out.write("                                   <option>China</option>\n");
      out.write("                                   <option>Japan</option>\n");
      out.write("                                   <option>France</option>\n");
      out.write("                                   <option>Russ</option>\n");
      out.write("                                   <option>Iraq</option>\n");
      out.write("                                   <option>Taibaan</option>\n");
      out.write("                                   <option>England</option>\n");
      out.write("\n");
      out.write("                               </select>\n");
      out.write("                               <span class=\"spn\" id=\"city\"></span>\n");
      out.write("                           </td>\n");
      out.write("                       </tr>\n");
      out.write("                       <tr>\n");
      out.write("                         <th></th>\n");
      out.write("                         <td id=\"txt\">Choose your native</td>\n");
      out.write("                     </tr>\n");
      out.write("                       <tr>\n");
      out.write("                           <th>Alternate Email </th>\n");
      out.write("                            <td><input type=\"text\" id=\"t5\" class=\"txtarea\" value=\"Email-Id\" name=\"remail\" onfocus=\"return invalid()\"/>\n");
      out.write("                         @\n");
      out.write("                           <select id=\"sel\" name=\"rhost\">\n");
      out.write("                              <option value=\"other\">Other</option>\n");
      out.write("                              <option value=\"gmail.com\" selected>gmail.com</option>\n");
      out.write("                              <option value=\"yahoo.com\">yahoo.com</option>\n");
      out.write("                              <option value=\"rediffmail.com\">rediffmail.com</option>\n");
      out.write("                              <option value=\"hotmail.com\">hotmail.com</option>\n");
      out.write("                           </select>\n");
      out.write("                        </td>\n");
      out.write("                       </tr>\n");
      out.write("                       <tr>\n");
      out.write("                         <th></th>\n");
      out.write("                         <td id=\"txt\">(recommended)<br/>\n");
      out.write("                             fill this box with a valid Email-Id which we use<br/>\n");
      out.write("                             in case to damage to your regular Email-Id<br/><br/>\n");
      out.write("                             \n");
      out.write("                         </td>\n");
      out.write("                     </tr>\n");
      out.write("                       \n");
      out.write("                    </table>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"bridge\" class=\"bridge\">&nbsp;&nbsp;&nbsp;step 2</div>\n");
      out.write("            <div id=\"div2\">\n");
      out.write("               \n");
      out.write("                                   <table id=\"tbl2\"  cellspacing=\"1\" cellpadding=\"8\" margin=\"0\" width=\"550\">\n");
      out.write("                           \n");
      out.write("                           <tr>\n");
      out.write("                               <th>City</th>\n");
      out.write("                               <td><input name=\"city\" type=\"text\" id=\"t6\" value=\"Where U Live?\" title=\"Enter your city\" onfocus=\"return invalid()\"/></td>\n");
      out.write("                               <td colspan=\"2\" align=\"right\"><span class=\"spn\" id=\"bmsg\"></span></td>    \n");
      out.write("                           </tr>\n");
      out.write("                           <tr>\n");
      out.write("                               <th>Call Me</th>\n");
      out.write("                           \n");
      out.write("                         \n");
      out.write("                               <td><input type=\"text\" id=\"t7\" name=\"cno\" value=\"Your number\" title=\"Call me At\" onblur=\"return isValidNo()\"  onfocus=\"return invalid()\"/></td>\n");
      out.write("                               <th align=\"left\">Blood Group  <span class=\"star\">*</span></th>\n");
      out.write("                               <td>\n");
      out.write("                                   <select name=\"bg\" id=\"bg\" title=\"Pick your Blood Group\" onchange=\"return changeOnSelect()\">\n");
      out.write("                                       <option name=\"\">Select</option>\n");
      out.write("                                       <option name=\"A+\">A+</option>\n");
      out.write("                                       <option name=\"B+\">B+</option>\n");
      out.write("                                       <option name=\"O+\">O+</option>\n");
      out.write("                                       <option name=\"AB+\">AB+</option>\n");
      out.write("                                       <option name=\"A-\">A-</option>\n");
      out.write("                                       <option name=\"B-\">B-</option>\n");
      out.write("                                       <option name=\"O-\">O-</option>\n");
      out.write("                                       <option name=\"AB-\">AB-</option>\n");
      out.write("                                   </select> \n");
      out.write("                                  \n");
      out.write("                               </td>\n");
      out.write("                           </tr>\n");
      out.write("                       \n");
      out.write("                          \n");
      out.write("                           <tr>\n");
      out.write("                               <th>\n");
      out.write("                                   Ouestions N<span class=\"star\">*</span> Answers  \n");
      out.write("                               </th>\n");
      out.write("                               <td>\n");
      out.write("                                   <Select  id=\"sq1\" name=\"sq1\" onchange=\"return changeOnSelect()\">\n");
      out.write("                                       <option>Select your Security Question</option>\n");
      out.write("                                       <option>Write your own Question</option>\n");
      out.write("                                       <option>Who is your best Friend?</option>\n");
      out.write("                                       <option>Who is your first teacher?</option>\n");
      out.write("                                       <option>Which is your favourite color?</option>\n");
      out.write("                                       <option>Who do you like most?</option>\n");
      out.write("                                       <option>what is your father,s name?</option>\n");
      out.write("                                       <option>what is your mother's name?</option>\n");
      out.write("                                       <option>Who is your favourite animal?</option>\n");
      out.write("                                       <option>Which is your first School?</option>\n");
      out.write("                                   </Select>\n");
      out.write("                                 \n");
      out.write("                                    <span class=\"spn\" id=\"sqm1\"></span>\n");
      out.write("                               </td>\n");
      out.write("\n");
      out.write("                               <td><input type=\"text\"  id=\"t8\" disabled value=\"Your Question\" title=\"Write your own Question\" onfocus=\"return invalid()\"/></td>\n");
      out.write("\n");
      out.write("                               <td><input name=\"ans1\" type=\"text\" id=\"t9\"  value=\"your Answer\" title=\"Write your Question\" onfocus=\"return invalid()\"/></td>\n");
      out.write("                          \n");
      out.write("                           </tr>\n");
      out.write("                           \n");
      out.write("                           <tr>\n");
      out.write("                               <th>\n");
      out.write("                                   Ouestions N<span class=\"star\">*</span>  Answers \n");
      out.write("                               </th>\n");
      out.write("                               <td>\n");
      out.write("                                   <Select  id=\"sq2\" name=\"sq2\" onchange=\"return changeOnSelect()\">\n");
      out.write("                                       <option>Select your Security Question</option>\n");
      out.write("                                       <option>Write your own Question</option>\n");
      out.write("                                       <option>Who is your best Friend?</option>\n");
      out.write("                                       <option>Who is your first teacher?</option>\n");
      out.write("                                       <option>Which is your favourite color?</option>\n");
      out.write("                                       <option>Who do you like most?</option>\n");
      out.write("                                       <option>what is your father,s name?</option>\n");
      out.write("                                       <option>what is your mother's name?</option>\n");
      out.write("                                       <option>Who is your favourite animal?</option>\n");
      out.write("                                       <option>Which is your first School?</option>\n");
      out.write("                                   </Select>\n");
      out.write("                                   <span class=\"spn\" id=\"sqm2\"></span>\n");
      out.write("                               </td>\n");
      out.write("\n");
      out.write("                               <td><input type=\"text\"  id=\"t10\" disabled value=\"Your Question\" title=\"Write your own Question\" onfocus=\"return invalid()\"/></td>\n");
      out.write("\n");
      out.write("                               <td><input name=\"ans2\" type=\"text\" id=\"t11\"  value=\"your Answer\" title=\"Write your Question\" onfocus=\"return invalid()\"/></td>\n");
      out.write("                           </tr>\n");
      out.write("                           <tr>\n");
      out.write("                               <td></td>\n");
      out.write("                               <td align=\"center\"><input type=\"submit\" value=\"Submit\"  title=\"Click to register your self\" onclick=\"return isEmptyField()\"/></td>\n");
      out.write("                               <td align=\"center\"><input type=\"reset\" id=\"r1\" value=\"Re-fill\" title=\"Re-fill the form\" name=\"reset\"></td>\n");
      out.write("                       </tr>\n");
      out.write("                           \n");
      out.write("                                   </table>\n");
      out.write("                </div>\n");
      out.write("                 \n");
      out.write("                    </form>\n");
      out.write("            </div><br/><br/>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.html", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

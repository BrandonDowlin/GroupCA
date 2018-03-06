
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employeeForm: Form[models.Employee], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Employee",user)/*4.27*/ {_display_(Seq[Any](format.raw/*4.29*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new Employee</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addEmployeeSubmit(), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*9.39*/ {_display_(Seq[Any](format.raw/*9.41*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),_display_(/*13.10*/inputText(employeeForm("fname"), '_label -> "Forename", 'class -> "form-control")),format.raw/*13.91*/("""
        """),_display_(/*14.10*/inputText(employeeForm("lname"), '_label -> "Surname", 'class -> "form-control")),format.raw/*14.90*/("""

        """),_display_(/*16.10*/select(
            employeeForm("department.id"),
            options(Department.options),
            '_label -> "Department", '_default -> "-- Choose a department --",
            '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*21.10*/("""
        """),format.raw/*22.9*/("""<label>Projects</label><br>
        """),_display_(/*23.10*/for((value,name) <- Project.options) yield /*23.46*/{_display_(Seq[Any](format.raw/*23.47*/("""
            """),format.raw/*24.13*/("""<input type = "checkbox" name="projSelect[]" value=""""),_display_(/*24.66*/value),format.raw/*24.71*/(""""

            /> """),_display_(/*26.17*/name),format.raw/*26.21*/("""<br>
        """)))}),format.raw/*27.10*/("""
        

        """),_display_(/*30.10*/inputText(employeeForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*30.75*/("""
        
        """),format.raw/*32.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br><br>
        <div class="actions">
            <input type="submit" value="Add Employee" class="btn btn-primary">
            <a href=""""),_display_(/*37.23*/routes/*37.29*/.HomeController.index(0)),format.raw/*37.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*41.6*/("""
""")))}))
      }
    }
  }

  def render(employeeForm:Form[models.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm,user)

  def f:((Form[models.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm,user) => apply(employeeForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 06 16:51:34 GMT 2018
                  SOURCE: /home/wdd/GroupCA/GroupCA/app/views/addEmployee.scala.html
                  HASH: dfd7142d41679a9735a93f8bccabd9b361f3051a
                  MATRIX: 987->1|1122->65|1167->63|1194->81|1221->83|1254->108|1293->110|1324->115|1393->159|1550->308|1589->310|1626->347|1663->357|1676->361|1707->371|1745->382|1847->463|1884->473|1985->553|2023->564|2289->809|2325->818|2389->855|2441->891|2480->892|2521->905|2601->958|2627->963|2673->982|2698->986|2743->1000|2790->1020|2876->1085|2921->1103|3193->1348|3208->1354|3253->1378|3401->1496
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|41->9|41->9|42->10|43->11|43->11|43->11|45->13|45->13|46->14|46->14|48->16|53->21|54->22|55->23|55->23|55->23|56->24|56->24|56->24|58->26|58->26|59->27|62->30|62->30|64->32|69->37|69->37|69->37|73->41
                  -- GENERATED --
              */
          
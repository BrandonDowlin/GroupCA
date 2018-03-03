
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
                  DATE: Wed Feb 28 18:40:04 GMT 2018
                  SOURCE: C:/Users/brand/Documents/GroupCA/GroupCA/app/views/addEmployee.scala.html
                  HASH: 9364888ea41c7ab4b70dade35226b9ccff4ee0a4
                  MATRIX: 987->1|1122->66|1167->63|1195->83|1223->86|1256->111|1295->113|1327->119|1397->164|1557->316|1596->318|1634->356|1672->367|1685->371|1716->381|1756->394|1858->475|1896->486|1997->566|2037->579|2308->829|2345->839|2410->877|2462->913|2501->914|2543->928|2623->981|2649->986|2697->1007|2722->1011|2768->1026|2818->1049|2904->1114|2951->1134|3228->1384|3243->1390|3288->1414|3440->1536
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|41->9|41->9|42->10|43->11|43->11|43->11|45->13|45->13|46->14|46->14|48->16|53->21|54->22|55->23|55->23|55->23|56->24|56->24|56->24|58->26|58->26|59->27|62->30|62->30|64->32|69->37|69->37|69->37|73->41
                  -- GENERATED --
              */
          
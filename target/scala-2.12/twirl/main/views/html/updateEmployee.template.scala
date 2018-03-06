
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

object updateEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[models.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateEmployeeForm: Form[models.Employee], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.80*/("""
"""),_display_(/*3.2*/main("Update employee", user)/*3.31*/{_display_(Seq[Any](format.raw/*3.32*/("""
"""),format.raw/*4.1*/("""<p class="lead"> Update Employee</p>

"""),_display_(/*6.2*/form(action=routes.HomeController.updateEmployeeSubmit(id), 'class -> "form-horizontal", 
'role -> "form",'enctype -> "multipart/form-data")/*7.51*/ {_display_(Seq[Any](format.raw/*7.53*/("""
    """),format.raw/*8.33*/("""
    """),_display_(/*9.6*/CSRF/*9.10*/.formField),format.raw/*9.20*/("""

    """),_display_(/*11.6*/inputText(updateEmployeeForm("fname"), '_label -> "Forename", 'class -> "form-control")),format.raw/*11.93*/("""
        """),_display_(/*12.10*/inputText(updateEmployeeForm("lname"), '_label -> "Surname", 'class -> "form-control")),format.raw/*12.96*/("""

        """),_display_(/*14.10*/select(
            updateEmployeeForm("department.id"),
            options(Department.options),
            '_label -> "Department", '_default -> "-- Choose a department --",
            '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*19.10*/("""
        """),format.raw/*20.9*/("""<label>Projects</label><br>
        """),_display_(/*21.10*/for((value,name) <- Project.options) yield /*21.46*/{_display_(Seq[Any](format.raw/*21.47*/("""
            """),format.raw/*22.13*/("""<input type = "checkbox" name="projSelect[]" value=""""),_display_(/*22.66*/value),format.raw/*22.71*/(""""
            """),_display_(/*23.14*/if(Project.inProject(value.toLong, id))/*23.53*/ {_display_(Seq[Any](format.raw/*23.55*/("""
                """),format.raw/*24.17*/("""checked
            """)))}),format.raw/*25.14*/("""
            """),format.raw/*26.13*/("""/> """),_display_(/*26.17*/name),format.raw/*26.21*/("""<br>
        """)))}),format.raw/*27.10*/("""
        
    
    """),format.raw/*30.5*/("""<label>Image </label>
    <input class = "btn-sm btn-default" type="file" name="upload">
    <br><br>

    <div class="actions">
        <input type="submit" value="Update Employee" class="btn btn-primary">
        <a href=""""),_display_(/*36.19*/routes/*36.25*/.HomeController.index(0)),format.raw/*36.49*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*40.3*/("""
""")))}),format.raw/*41.2*/("""
"""))
      }
    }
  }

  def render(id:Long,updateEmployeeForm:Form[models.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateEmployeeForm,user)

  def f:((Long,Form[models.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateEmployeeForm,user) => apply(id,updateEmployeeForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 06 16:51:34 GMT 2018
                  SOURCE: /home/wdd/GroupCA/GroupCA/app/views/updateEmployee.scala.html
                  HASH: 3a150ca1c760fb39afe0d52e10216000b799b6be
                  MATRIX: 995->1|1146->81|1191->79|1218->98|1255->127|1293->128|1320->129|1384->168|1532->308|1571->310|1603->343|1634->349|1646->353|1676->363|1709->370|1817->457|1854->467|1961->553|1999->564|2271->815|2307->824|2371->861|2423->897|2462->898|2503->911|2583->964|2609->969|2651->984|2699->1023|2739->1025|2784->1042|2836->1063|2877->1076|2908->1080|2933->1084|2978->1098|3024->1117|3276->1342|3291->1348|3336->1372|3469->1475|3501->1477
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|38->6|39->7|39->7|40->8|41->9|41->9|41->9|43->11|43->11|44->12|44->12|46->14|51->19|52->20|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|56->24|57->25|58->26|58->26|58->26|59->27|62->30|68->36|68->36|68->36|72->40|73->41
                  -- GENERATED --
              */
          
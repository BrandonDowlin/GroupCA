
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Employee],List[models.Project],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.Employee], projects: List[models.Project], user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.119*/("""

"""),_display_(/*3.2*/main("employees",user)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""

"""),format.raw/*5.1*/("""<p class="lead">Employee Catalogue</p>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Projects</h4>
    <div class="list-group">
      <a href=""""),_display_(/*11.17*/routes/*11.23*/.HomeController.index(0)),format.raw/*11.47*/("""" class="list-group-item">All projects</a>
      """),_display_(/*12.8*/for(p <- projects) yield /*12.26*/ {_display_(Seq[Any](format.raw/*12.28*/("""
        """),format.raw/*13.9*/("""<a href=""""),_display_(/*13.19*/routes/*13.25*/.HomeController.index(p.getId)),format.raw/*13.55*/("""" class="list-group-item">"""),_display_(/*13.82*/p/*13.83*/.getName),format.raw/*13.91*/("""
          """),format.raw/*14.11*/("""<span class="badge">"""),_display_(/*14.32*/p/*14.33*/.getEmployees.size()),format.raw/*14.53*/("""</span>
        </a>
      """)))}),format.raw/*16.8*/("""
    """),format.raw/*17.5*/("""</div>
  </div>
  <div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*21.8*/if(flash.containsKey("success"))/*21.40*/ {_display_(Seq[Any](format.raw/*21.42*/("""
        """),format.raw/*22.9*/("""<div class="alert alert-success">
          """),_display_(/*23.12*/flash/*23.17*/.get("success")),format.raw/*23.32*/("""
        """),format.raw/*24.9*/("""</div>
      """)))}),format.raw/*25.8*/("""
      """),format.raw/*26.7*/("""<thead>
        <tr>
          <th></th>
          <th>ID</th>
          <th>Surname</th>
          <th>Forename</th>
          <th>Department</th>
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*38.10*/for(p<-employees) yield /*38.27*/ {_display_(Seq[Any](format.raw/*38.29*/("""
          """),format.raw/*39.11*/("""<tr>
              """),_display_(/*40.16*/if(env.resource("public/images/employeeImages/thumbnails/" + p.getId + ".jpg").isDefined)/*40.105*/ {_display_(Seq[Any](format.raw/*40.107*/("""
                """),format.raw/*41.17*/("""<td><img src="/assets/images/employeeImages/thumbnails/"""),_display_(/*41.73*/(p.getId + ".jpg")),format.raw/*41.91*/(""""/></td>
            """)))}/*42.15*/else/*42.20*/{_display_(Seq[Any](format.raw/*42.21*/("""
                """),format.raw/*43.17*/("""<td><img src="/assets/images/employeeImages/thumbnails/noImage.jpg"/></td>
            """)))}),format.raw/*44.14*/("""
            """),format.raw/*45.13*/("""<td class="numeric">"""),_display_(/*45.34*/p/*45.35*/.getId),format.raw/*45.41*/("""</td>
            <td>"""),_display_(/*46.18*/p/*46.19*/.getLname),format.raw/*46.28*/("""</td>
               <td>"""),_display_(/*47.21*/p/*47.22*/.getFname),format.raw/*47.31*/("""</td>
                  
            <td>"""),_display_(/*49.18*/p/*49.19*/.getDepartment.getName),format.raw/*49.41*/("""</td>
            <td>
              <a href=""""),_display_(/*51.25*/routes/*51.31*/.HomeController.updateEmployee(p.getId)),format.raw/*51.70*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*55.25*/routes/*55.31*/.HomeController.deleteEmployee(p.getId)),format.raw/*55.70*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>
        """)))}),format.raw/*60.10*/("""
      """),format.raw/*61.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*66.17*/routes/*66.23*/.HomeController.addEmployee()),format.raw/*66.52*/("""">
        <button class="btn btn-primary">Add an Employee</button>
      </a>
    </p>
  </div>
</div>
""")))}),format.raw/*72.2*/("""
"""))
      }
    }
  }

  def render(employees:List[models.Employee],projects:List[models.Project],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employees,projects,user,env)

  def f:((List[models.Employee],List[models.Project],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employees,projects,user,env) => apply(employees,projects,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 06 16:51:34 GMT 2018
                  SOURCE: /home/wdd/GroupCA/GroupCA/app/views/index.scala.html
                  HASH: f6778cb77d7fd4e0e33718753d96a39ee33637a6
                  MATRIX: 1023->1|1236->118|1264->121|1294->143|1333->145|1361->147|1542->301|1557->307|1602->331|1678->381|1712->399|1752->401|1788->410|1825->420|1840->426|1891->456|1945->483|1955->484|1984->492|2023->503|2071->524|2081->525|2122->545|2180->573|2212->578|2356->696|2397->728|2437->730|2473->739|2545->784|2559->789|2595->804|2631->813|2675->827|2709->834|2975->1073|3008->1090|3048->1092|3087->1103|3134->1123|3233->1212|3274->1214|3319->1231|3402->1287|3441->1305|3482->1328|3495->1333|3534->1334|3579->1351|3698->1439|3739->1452|3787->1473|3797->1474|3824->1480|3874->1503|3884->1504|3914->1513|3967->1539|3977->1540|4007->1549|4076->1591|4086->1592|4129->1614|4203->1661|4218->1667|4278->1706|4475->1876|4490->1882|4550->1921|4770->2110|4804->2117|4879->2165|4894->2171|4944->2200|5079->2305
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|70->38|70->38|70->38|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|76->44|77->45|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|79->47|81->49|81->49|81->49|83->51|83->51|83->51|87->55|87->55|87->55|92->60|93->61|98->66|98->66|98->66|104->72
                  -- GENERATED --
              */
          
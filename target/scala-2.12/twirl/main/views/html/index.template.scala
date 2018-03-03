
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
                  DATE: Wed Feb 28 15:56:36 GMT 2018
                  SOURCE: C:/Users/brand/Documents/GroupCA/GroupCA/app/views/index.scala.html
                  HASH: e06f63f88a5d9d13e92419ff4beabfd44ce59c4a
                  MATRIX: 1023->1|1236->118|1266->123|1296->145|1335->147|1365->151|1552->311|1567->317|1612->341|1689->392|1723->410|1763->412|1800->422|1837->432|1852->438|1903->468|1957->495|1967->496|1996->504|2036->516|2084->537|2094->538|2135->558|2195->588|2228->594|2376->716|2417->748|2457->750|2494->760|2567->806|2581->811|2617->826|2654->836|2699->851|2734->859|3012->1110|3045->1127|3085->1129|3125->1141|3173->1162|3272->1251|3313->1253|3359->1271|3442->1327|3481->1345|3523->1369|3536->1374|3575->1375|3621->1393|3741->1482|3783->1496|3831->1517|3841->1518|3868->1524|3919->1548|3929->1549|3959->1558|4013->1585|4023->1586|4053->1595|4124->1639|4134->1640|4177->1662|4253->1711|4268->1717|4328->1756|4529->1930|4544->1936|4604->1975|4829->2169|4864->2177|4944->2230|4959->2236|5009->2265|5150->2376
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|70->38|70->38|70->38|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|76->44|77->45|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|79->47|81->49|81->49|81->49|83->51|83->51|83->51|87->55|87->55|87->55|92->60|93->61|98->66|98->66|98->66|104->72
                  -- GENERATED --
              */
          

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

object employeeDetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.Employee,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(p: models.Employee,user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.72*/("""

"""),_display_(/*3.2*/main("Full Image", user)/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""

  """),format.raw/*5.3*/("""<div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*7.8*/if(flash.containsKey("success"))/*7.40*/ {_display_(Seq[Any](format.raw/*7.42*/("""
        """),format.raw/*8.9*/("""<div class="alert alert-success">
          """),_display_(/*9.12*/flash/*9.17*/.get("success")),format.raw/*9.32*/("""
        """),format.raw/*10.9*/("""</div>
      """)))}),format.raw/*11.8*/("""
      """),format.raw/*12.7*/("""<thead>
        <tr>
          <th>Image</th> 
          <th>ID</th> 
        </tr>
      </thead>

      <tbody>

          <tr>
              """),_display_(/*22.16*/if(env.resource("public/images/employeeImages/" + p.getId + ".jpg").isDefined)/*22.94*/ {_display_(Seq[Any](format.raw/*22.96*/("""
                """),format.raw/*23.17*/("""<td><img src="/assets/images/employeeImages/"""),_display_(/*23.62*/(p.getId + ".jpg")),format.raw/*23.80*/(""""/></td>
            """)))}/*24.15*/else/*24.20*/{_display_(Seq[Any](format.raw/*24.21*/("""
                """),format.raw/*25.17*/("""<td><img src="/assets/images/employeeImages/noImage.jpg"/></td>
            """)))}),format.raw/*26.14*/("""
            """),format.raw/*27.13*/("""<td class="numeric">"""),_display_(/*27.34*/p/*27.35*/.getId),format.raw/*27.41*/("""</td>
            
          </tr>
        
      </tbody>

    </table>

    
  </div>
</div>
""")))}),format.raw/*38.2*/("""
"""))
      }
    }
  }

  def render(p:models.Employee,user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(p,user,env)

  def f:((models.Employee,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (p,user,env) => apply(p,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 28 14:59:44 GMT 2018
                  SOURCE: C:/Users/brand/Documents/GroupCA/GroupCA/app/views/employeeDetails.scala.html
                  HASH: a76643bcd87a6e25a51883f1f2dbdb94812ab906
                  MATRIX: 1006->1|1171->71|1201->76|1233->100|1272->102|1304->108|1431->210|1471->242|1510->244|1546->254|1618->300|1631->305|1666->320|1703->330|1748->345|1783->353|1965->508|2052->586|2092->588|2138->606|2210->651|2249->669|2291->693|2304->698|2343->699|2389->717|2498->795|2540->809|2588->830|2598->831|2625->837|2762->944
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|44->12|54->22|54->22|54->22|55->23|55->23|55->23|56->24|56->24|56->24|57->25|58->26|59->27|59->27|59->27|59->27|70->38
                  -- GENERATED --
              */
          
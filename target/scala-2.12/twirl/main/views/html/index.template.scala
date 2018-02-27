
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Product],List[models.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.120*/("""

"""),_display_(/*3.2*/main("Products",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

"""),format.raw/*5.1*/("""<p class="lead">Product Catalogue</p>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Categories</h4>
    <div class="list-group">
      <a href=""""),_display_(/*11.17*/routes/*11.23*/.HomeController.index(0)),format.raw/*11.47*/("""" class="list-group-item">All Categories</a>
      """),_display_(/*12.8*/for(c <- categories) yield /*12.28*/ {_display_(Seq[Any](format.raw/*12.30*/("""
        """),format.raw/*13.9*/("""<a href=""""),_display_(/*13.19*/routes/*13.25*/.HomeController.index(c.getId)),format.raw/*13.55*/("""" class="list-group-item">"""),_display_(/*13.82*/c/*13.83*/.getName),format.raw/*13.91*/("""
          """),format.raw/*14.11*/("""<span class="badge">"""),_display_(/*14.32*/c/*14.33*/.getProducts.size()),format.raw/*14.52*/("""</span>
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
          <th>ID</th>
          <th>Name</th>
          
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*39.10*/for(p<-products) yield /*39.26*/ {_display_(Seq[Any](format.raw/*39.28*/("""
          """),format.raw/*40.11*/("""<tr>
              """),_display_(/*41.16*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*41.104*/ {_display_(Seq[Any](format.raw/*41.106*/("""
                """),format.raw/*42.17*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*42.72*/(p.getId + ".jpg")),format.raw/*42.90*/(""""/></td>
            """)))}/*43.15*/else/*43.20*/{_display_(Seq[Any](format.raw/*43.21*/("""
                """),format.raw/*44.17*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.jpg"/></td>
            """)))}),format.raw/*45.14*/("""
            """),format.raw/*46.13*/("""<td class="numeric">"""),_display_(/*46.34*/p/*46.35*/.getId),format.raw/*46.41*/("""</td>
            <td><a href=""""),_display_(/*47.27*/routes/*47.33*/.HomeController.productDetails(p.getId)),format.raw/*47.72*/("""">
                """),_display_(/*48.18*/p/*48.19*/.getName),format.raw/*48.27*/("""</td>
               </a>
                  
            <td>"""),_display_(/*51.18*/p/*51.19*/.getDescription),format.raw/*51.34*/("""</td>
            <td  class="numeric">"""),_display_(/*52.35*/p/*52.36*/.getStock),format.raw/*52.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*53.37*/("%.2f".format(p.getPrice))),format.raw/*53.64*/("""</td>
            <td>
              <a href=""""),_display_(/*55.25*/routes/*55.31*/.HomeController.updateProduct(p.getId)),format.raw/*55.69*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*59.25*/routes/*59.31*/.HomeController.deleteProduct(p.getId)),format.raw/*59.69*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>
        """)))}),format.raw/*64.10*/("""
      """),format.raw/*65.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*70.17*/routes/*70.23*/.HomeController.addProduct()),format.raw/*70.51*/("""">
        <button class="btn btn-primary">Add a product</button>
      </a>
    </p>
  </div>
</div>
""")))}),format.raw/*76.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[models.Product],List[models.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 27 15:00:29 GMT 2018
                  SOURCE: /home/wdd/webapps/lab2/lab2/app/views/index.scala.html
                  HASH: 79d1b62fb8d49ccf4feeb944d93a86a89b245e33
                  MATRIX: 1023->1|1237->119|1265->122|1294->143|1333->145|1361->147|1543->302|1558->308|1603->332|1681->384|1717->404|1757->406|1793->415|1830->425|1845->431|1896->461|1950->488|1960->489|1989->497|2028->508|2076->529|2086->530|2126->549|2184->577|2216->582|2360->700|2401->732|2441->734|2477->743|2549->788|2563->793|2599->808|2635->817|2679->831|2713->838|2990->1088|3022->1104|3062->1106|3101->1117|3148->1137|3246->1225|3287->1227|3332->1244|3414->1299|3453->1317|3494->1340|3507->1345|3546->1346|3591->1363|3709->1450|3750->1463|3798->1484|3808->1485|3835->1491|3894->1523|3909->1529|3969->1568|4016->1588|4026->1589|4055->1597|4144->1659|4154->1660|4190->1675|4257->1715|4267->1716|4297->1725|4366->1767|4414->1794|4488->1841|4503->1847|4562->1885|4759->2055|4774->2061|4833->2099|5053->2288|5087->2295|5162->2343|5177->2349|5226->2377|5359->2480
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|71->39|71->39|71->39|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|77->45|78->46|78->46|78->46|78->46|79->47|79->47|79->47|80->48|80->48|80->48|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|87->55|87->55|87->55|91->59|91->59|91->59|96->64|97->65|102->70|102->70|102->70|108->76
                  -- GENERATED --
              */
          
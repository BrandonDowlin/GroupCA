
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Product",user)/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new product</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addProductSubmit(), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*9.39*/ {_display_(Seq[Any](format.raw/*9.41*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),_display_(/*13.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.85*/("""
        """),_display_(/*14.10*/for((value,name) <- Category.options) yield /*14.47*/{_display_(Seq[Any](format.raw/*14.48*/("""
            """),format.raw/*15.13*/("""<input type = "checkbox" name="catSelect[]" value=""""),_display_(/*15.65*/value),format.raw/*15.70*/(""""

            />"""),_display_(/*17.16*/name),format.raw/*17.20*/("""<br>
        """)))}),format.raw/*18.10*/("""
        """),_display_(/*19.10*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*19.99*/("""
        """),_display_(/*20.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*20.87*/("""
        """),_display_(/*21.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*21.87*/("""

        """),_display_(/*23.10*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*23.74*/("""
        
        """),format.raw/*25.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br><br>
        <div class="actions">
            <input type="submit" value="Add Product" class="btn btn-primary">
            <a href=""""),_display_(/*30.23*/routes/*30.29*/.HomeController.index(0)),format.raw/*30.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*34.6*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 27 15:08:32 GMT 2018
                  SOURCE: /home/wdd/webapps/lab2/lab2/app/views/addProduct.scala.html
                  HASH: 14fce962164fa0b49089fb91e948de6db520284b
                  MATRIX: 985->1|1118->63|1163->61|1190->79|1217->81|1249->105|1288->107|1319->112|1387->155|1543->303|1582->305|1619->342|1656->352|1669->356|1700->366|1738->377|1834->452|1871->462|1924->499|1963->500|2004->513|2083->565|2109->570|2154->588|2179->592|2224->606|2261->616|2371->705|2408->715|2506->792|2543->802|2641->879|2679->890|2764->954|2809->972|3080->1216|3095->1222|3140->1246|3288->1364
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|41->9|41->9|42->10|43->11|43->11|43->11|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|49->17|49->17|50->18|51->19|51->19|52->20|52->20|53->21|53->21|55->23|55->23|57->25|62->30|62->30|62->30|66->34
                  -- GENERATED --
              */
          
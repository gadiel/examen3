
package views.html.fomulario

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object form extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,play.api.mvc.Call,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, action: play.api.mvc.Call)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.59*/("""
<form action=""""),_display_(Seq[Any](/*2.16*/action)),format.raw/*2.22*/("""" method="POST">
"""),_display_(Seq[Any](/*3.2*/title)),format.raw/*3.7*/("""
"""),_display_(Seq[Any](/*4.2*/content)),format.raw/*4.9*/("""
</form>
"""))}
    }
    
    def render(title:String,action:play.api.mvc.Call,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,action)(content)
    
    def f:((String,play.api.mvc.Call) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,action) => (content) => apply(title,action)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 15 22:27:59 CST 2013
                    SOURCE: C:/Users/Gadiel/Documents/examen3/releases/ModuloExamen/app/views/fomulario/form.scala.html
                    HASH: 67e622af5c83d2c591f5c92208f2b9d33bb16535
                    MATRIX: 588->1|739->58|790->74|817->80|869->98|894->103|930->105|957->112
                    LINES: 19->1|22->1|23->2|23->2|24->3|24->3|25->4|25->4
                    -- GENERATED --
                */
            
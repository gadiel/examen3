
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
object textbox extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(name: String, default: String = ""):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.38*/("""
<input type="text" name=""""),_display_(Seq[Any](/*2.27*/name)),format.raw/*2.31*/("""" value = """"),_display_(Seq[Any](/*2.43*/default)),format.raw/*2.50*/("""">
"""))}
    }
    
    def render(name:String,default:String): play.api.templates.HtmlFormat.Appendable = apply(name,default)
    
    def f:((String,String) => play.api.templates.HtmlFormat.Appendable) = (name,default) => apply(name,default)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 15 22:28:00 CST 2013
                    SOURCE: C:/Users/Gadiel/Documents/examen3/releases/ModuloExamen/app/views/fomulario/textbox.scala.html
                    HASH: 8d8e4ff7921c4fb9cc21bdd89833ed6349ccd31b
                    MATRIX: 575->1|705->37|767->64|792->68|839->80|867->87
                    LINES: 19->1|22->1|23->2|23->2|23->2|23->2
                    -- GENERATED --
                */
            
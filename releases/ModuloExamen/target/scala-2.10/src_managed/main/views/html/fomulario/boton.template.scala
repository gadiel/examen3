
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
object boton extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(value: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""
<input type="submit" value = """"),_display_(Seq[Any](/*2.32*/value)),format.raw/*2.37*/("""">"""))}
    }
    
    def render(value:String): play.api.templates.HtmlFormat.Appendable = apply(value)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (value) => apply(value)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 15 22:27:59 CST 2013
                    SOURCE: C:/Users/Gadiel/Documents/examen3/releases/ModuloExamen/app/views/fomulario/boton.scala.html
                    HASH: 7bd616aa74a27e6b729fd2cbffba3abff1f2dac8
                    MATRIX: 566->1|675->16|742->48|768->53
                    LINES: 19->1|22->1|23->2|23->2
                    -- GENERATED --
                */
            

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
object dropdown extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[scala.Tuple2[String, String]],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(name: String, valores: List[(String, String)]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.49*/("""
<select name=""""),_display_(Seq[Any](/*2.16*/name)),format.raw/*2.20*/("""">
"""),_display_(Seq[Any](/*3.2*/for((valor, texto) <- valores) yield /*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""
	<option value=""""),_display_(Seq[Any](/*4.18*/valor)),format.raw/*4.23*/("""">"""),_display_(Seq[Any](/*4.26*/texto)),format.raw/*4.31*/("""</option>
""")))})),format.raw/*5.2*/("""
</select>"""))}
    }
    
    def render(name:String,valores:List[scala.Tuple2[String, String]]): play.api.templates.HtmlFormat.Appendable = apply(name,valores)
    
    def f:((String,List[scala.Tuple2[String, String]]) => play.api.templates.HtmlFormat.Appendable) = (name,valores) => apply(name,valores)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 15 22:27:59 CST 2013
                    SOURCE: C:/Users/Gadiel/Documents/examen3/releases/ModuloExamen/app/views/fomulario/dropdown.scala.html
                    HASH: 4bad8737f8418399e46a738a1eb60bebc4f1d9ef
                    MATRIX: 604->1|745->48|796->64|821->68|859->72|904->102|943->104|996->122|1022->127|1060->130|1086->135|1127->146
                    LINES: 19->1|22->1|23->2|23->2|24->3|24->3|24->3|25->4|25->4|25->4|25->4|26->5
                    -- GENERATED --
                */
            
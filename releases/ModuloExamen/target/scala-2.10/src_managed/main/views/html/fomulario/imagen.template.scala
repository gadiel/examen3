
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
object imagen extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,play.api.mvc.Call,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(name: String, source: play.api.mvc.Call):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.43*/("""
<input type="image" name=""""),_display_(Seq[Any](/*2.28*/name)),format.raw/*2.32*/("""" src = """"),_display_(Seq[Any](/*2.42*/source)),format.raw/*2.48*/("""">"""))}
    }
    
    def render(name:String,source:play.api.mvc.Call): play.api.templates.HtmlFormat.Appendable = apply(name,source)
    
    def f:((String,play.api.mvc.Call) => play.api.templates.HtmlFormat.Appendable) = (name,source) => apply(name,source)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 15 22:28:00 CST 2013
                    SOURCE: C:/Users/Gadiel/Documents/examen3/releases/ModuloExamen/app/views/fomulario/imagen.scala.html
                    HASH: 23e34cf6eb17e5a5b742da2a47cf679e7088bb8a
                    MATRIX: 585->1|720->42|783->70|808->74|853->84|880->90
                    LINES: 19->1|22->1|23->2|23->2|23->2|23->2
                    -- GENERATED --
                */
            